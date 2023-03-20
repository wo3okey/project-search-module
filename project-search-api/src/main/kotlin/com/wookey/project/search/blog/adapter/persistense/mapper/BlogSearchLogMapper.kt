package com.wookey.project.search.blog.adapter.persistense.mapper

import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchLogEntity
import com.wookey.project.search.blog.domain.SearchLog

object BlogSearchLogMapper {
    fun toDomain(entity: BlogSearchLogEntity) = with(entity) { SearchLog() }
    fun toEntity(domain: SearchLog) = with(domain) { BlogSearchLogEntity() }
}
