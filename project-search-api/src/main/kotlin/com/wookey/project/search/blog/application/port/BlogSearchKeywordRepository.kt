package com.wookey.project.search.blog.application.port

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.commons.annotation.Port
import com.wookey.project.search.blog.domain.SearchKeyword
import com.wookey.project.search.blog.domain.SearchKeywordCondition

@Port(direction = Port.Direction.OUT)
interface BlogSearchKeywordRepository {
    fun save(request: BlogRequest)

    fun getKeywords(top: Int, condition: SearchKeywordCondition): List<SearchKeyword>
}
