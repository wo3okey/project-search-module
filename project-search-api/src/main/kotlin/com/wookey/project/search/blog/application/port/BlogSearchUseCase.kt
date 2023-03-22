package com.wookey.project.search.blog.application.port

import com.wookey.project.commons.annotation.Port
import com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest
import com.wookey.project.search.blog.domain.SearchKeywordCondition

@Port(direction = Port.Direction.IN)
interface BlogSearchUseCase {
    fun search(searchRequest: BlogSearchRequest, pageRequest: BlogSearchPageRequest): BlogSearchPageResponse

    fun getKeywords(top: Int, condition: SearchKeywordCondition): List<BlogKeywordsResponse>
}
