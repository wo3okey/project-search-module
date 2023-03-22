package com.wookey.project.search.blog.adapter.rest.dto

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.commons.dto.PageResponse

class BlogSearchPageResponse(
    override val page: Int,
    override val size: Int,
    override val totalPages: Int,
    override val totalElements: Long,
    override val data: List<BlogClientResponse>
) : PageResponse<BlogClientResponse>(page, size, totalPages, totalElements, data)
