package com.wookey.project.search.blog.adapter.persistense.mapper

import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchKeywordEntity
import com.wookey.project.search.blog.domain.SearchKeyword

object BlogSearchKeywordMapper {
    fun toDomain(entity: BlogSearchKeywordEntity) = with(entity) {
        SearchKeyword(
            id = id,
            keyword = keyword,
            searchCount = searchCount,
            createdAt = createdAt,
            modifiedAt = modifiedAt
        )
    }

    fun toEntity(domain: SearchKeyword) = with(domain) {
        BlogSearchKeywordEntity(
            id = id,
            keyword = keyword,
            searchCount = searchCount,
            createdAt = createdAt,
            modifiedAt = modifiedAt
        )
    }
}
