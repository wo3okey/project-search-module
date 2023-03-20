package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.adapter.KakaoBlogContents
import com.wookey.project.client.blog.adapter.NaverBlogContents
import com.wookey.project.client.blog.application.port.KaKaoBlogClientPort
import com.wookey.project.client.blog.application.port.NaverBlogClientPort
import com.wookey.project.client.blog.domain.Blog
import com.wookey.project.client.blog.domain.BlogSource
import com.wookey.project.client.blog.domain.Contents
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class BlogClientFactory(
    private val kakaoBlogClient: KakaoBlogClient,
    private val naverBlogClient: NaverBlogClient
) {
    fun getTargetClient(source: BlogSource): BlogClient {
        return when (source) {
            BlogSource.KAKAO -> kakaoBlogClient
            BlogSource.NAVER -> naverBlogClient
        }
    }
}

interface BlogClient {
    fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long>
}

@Component
class KakaoBlogClient(
    val kaKaoBlogClientPort: KaKaoBlogClientPort
) : BlogClient {
    override fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long> {
        val result = kaKaoBlogClientPort.getBlogContents(request) as KakaoBlogContents
        val total = result.meta.total_count
        val response = result.documents.map {
            BlogClientResponse(
                Blog(it.blogname),
                Contents(it.url, it.title, it.thumbnail, it.printTime)
            )
        }
        return Pair(response, total)
    }
}

@Component
class NaverBlogClient(
    val naverBlogClientPort: NaverBlogClientPort
) : BlogClient {
    override fun getBlogContents(request: BlogRequest): Pair<List<BlogClientResponse>, Long> {
        val result = naverBlogClientPort.getBlogContents(request) as NaverBlogContents
        val total = result.total
        val response = result.items.map {
            BlogClientResponse(
                Blog(it.bloggername, it.bloggerlink),
                Contents(it.link, it.title, null, it.postdate)
            )
        }
        return Pair(response, total)
    }
}
