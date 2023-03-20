package com.wookey.project.search.blog.application.port

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.commons.annotation.Port
import com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import org.springframework.data.domain.Page

@Port(direction = Port.Direction.IN)
interface BlogSearchUseCase {
    fun search(searchRequest: BlogSearchRequest, pageRequest: BlogSearchPageRequest): Page<BlogClientResponse>

    fun getKeywords(top: Int, condition: SearchKeywordCondition): List<BlogKeywordsResponse>
}
