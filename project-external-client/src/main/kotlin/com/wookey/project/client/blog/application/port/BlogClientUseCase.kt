package com.wookey.project.client.blog.application.port

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.commons.annotation.Port

@Port(direction = Port.Direction.OUT)
interface BlogClientUseCase {
    fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long>
}
