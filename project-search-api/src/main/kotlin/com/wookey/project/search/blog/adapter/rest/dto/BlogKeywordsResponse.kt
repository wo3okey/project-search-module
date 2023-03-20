package com.wookey.project.search.blog.adapter.rest.dto

import java.time.LocalDateTime

class BlogKeywordsResponse(
    val keyword: String,
    val searchCount: Long,
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime
)
