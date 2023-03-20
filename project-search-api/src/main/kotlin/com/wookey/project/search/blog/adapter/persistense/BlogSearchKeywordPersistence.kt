package com.wookey.project.search.blog.adapter.persistense

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchKeywordEntity
import com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchKeywordJpaRepository
import com.wookey.project.search.blog.adapter.persistense.mapper.BlogSearchKeywordMapper
import com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository
import com.wookey.project.search.blog.domain.SearchKeyword
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import org.springframework.stereotype.Repository

@Repository
class BlogSearchKeywordPersistence(
    val jpaRepository: BlogSearchKeywordJpaRepository
) : BlogSearchKeywordRepository {
    override fun save(request: BlogRequest) {
        val entity = jpaRepository.findByKeyword(keyword = request.query)
        if (entity != null) {
            entity.incSearchCount()
            return
        }
        jpaRepository.save(BlogSearchKeywordEntity(keyword = request.query))
    }

    override fun getKeywords(top: Int, condition: SearchKeywordCondition): List<SearchKeyword> {
        val entities = jpaRepository.getKeywords(top, condition)
        return entities.map { BlogSearchKeywordMapper.toDomain(it) }
    }
}
