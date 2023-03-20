package com.wookey.project.search.blog.domain

import java.time.LocalDateTime

class SearchKeyword(
    val id: Long,
    val keyword: String,
    val searchCount: Long,
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime
)
