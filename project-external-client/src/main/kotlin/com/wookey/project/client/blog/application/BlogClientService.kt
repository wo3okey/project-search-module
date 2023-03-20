package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.application.port.BlogClientUseCase
import org.springframework.stereotype.Service

@Service
class BlogClientService(
    val blogClientFactory: BlogClientFactory
) : BlogClientUseCase {
    override fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long> {
        val client = blogClientFactory.getTargetClient(request.source)
        return client.getBlogContents(request)
    }
}
