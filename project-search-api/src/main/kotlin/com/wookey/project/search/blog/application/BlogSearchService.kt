package com.wookey.project.search.blog.application

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.client.blog.application.BlogSearchSort
import com.wookey.project.client.blog.application.port.BlogClientUseCase
import com.wookey.project.client.blog.domain.BlogSource
import com.wookey.project.commons.exception.ClientException
import com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest
import com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository
import com.wookey.project.search.blog.application.port.BlogSearchLogRepository
import com.wookey.project.search.blog.application.port.BlogSearchUseCase
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import mu.KotlinLogging
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BlogSearchService(
    val blogClientUseCase: BlogClientUseCase,
    val blogSearchKeywordRepository: BlogSearchKeywordRepository,
    val blogSearchLogRepository: BlogSearchLogRepository
) : BlogSearchUseCase {
    private val logger = KotlinLogging.logger { }

    override fun search(
        searchRequest: BlogSearchRequest,
        pageRequest: BlogSearchPageRequest
    ): BlogSearchPageResponse {
        val blogRequest = BlogRequest(
            searchRequest.query,
            pageRequest.page,
            pageRequest.size,
            BlogSearchSort.findOrDefault(pageRequest.sort)
        )

        val (blogContents, totalElements) = getBlogContentsAndSaveLog(blogRequest)

        return BlogSearchPageResponse(
            blogRequest.page,
            blogRequest.size,
            blogRequest.getTotalPages(totalElements),
            totalElements,
            blogContents
        )
    }

    @Transactional
    fun getBlogContentsAndSaveLog(blogRequest: BlogRequest): Pair<List<BlogClientResponse>, Long> {
        val sources = BlogSource.values().sortedBy { it.order }

        val contents = sources.firstNotNullOfOrNull { source ->
            try {
                blogRequest.source = source
                blogClientUseCase.getBlogContents(blogRequest)
            } catch (e: RuntimeException) {
                logger.error { "$source client error: ${e.message}" }
                null
            }
        }

        blogSearchLogRepository.save(blogRequest)
        blogSearchKeywordRepository.save(blogRequest)

        return contents ?: throw ClientException("요청 정보에 응답 가능한 blog client가 없습니다.")
    }

    override fun getKeywords(top: Int, condition: SearchKeywordCondition): List<BlogKeywordsResponse> {
        val keywords = blogSearchKeywordRepository.getKeywords(top, condition)
        return keywords.map {
            BlogKeywordsResponse(it.keyword, it.searchCount, it.createdAt, it.modifiedAt)
        }
    }
}
