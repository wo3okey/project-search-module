package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.application.port.BlogClientUseCase
import com.wookey.project.commons.exception.ClientException
import org.springframework.stereotype.Service

@Service
class BlogClientService(
    val blogClientFactory: BlogClientFactory
) : BlogClientUseCase {
    override fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long> {
        val client = blogClientFactory.getTargetClient(request.source)
        val contents = client.getBlogContents(request)

        if (contents.first.isEmpty()) {
            throw ClientException("검색 결과가 없습니다.")
        }

        val totalPages = request.getTotalPages(contents.second)
        if (totalPages < request.page) {
            throw ClientException("더이상 페이지가 존재하지 않습니다.")
        }

        return contents
    }
}
