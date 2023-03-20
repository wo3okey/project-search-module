package com.wookey.project.search.blog.application.port

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.commons.annotation.Port

@Port(direction = Port.Direction.OUT)
interface BlogSearchLogRepository {
    fun save(request: BlogRequest)
}
