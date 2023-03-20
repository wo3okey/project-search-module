package com.wookey.project.client.blog.adapter

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.client.blog.application.BlogSearchSort
import com.wookey.project.client.blog.application.port.NaverBlogClientPort
import com.wookey.project.commons.annotation.Adapter
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Adapter
class NaverBlogHttpClient : NaverBlogClientPort {
    val url = "https://openapi.naver.com"
    val clientId = "TYsW65fH5pJDAzoEUYgS" // setting just for this project
    val clientSecret = "Xt2H7UrWMr" // setting just for this project

    private val client = WebClient.builder()
        .baseUrl(url)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader("X-Naver-Client-Id", clientId)
        .defaultHeader("X-Naver-Client-Secret", clientSecret)
        .build()

    override fun getBlogContents(request: BlogRequest): BlogContents {
        return client.get()
            .uri {
                it.path("/v1/search/blog.json")
                    .queryParam("query", request.query)
                    .queryParam("start", request.page)
                    .queryParam("display", request.size)
                    .queryParam(
                        "sort",
                        when (request.sort) {
                            BlogSearchSort.RECENCY -> "date"
                            BlogSearchSort.ACCURACY -> "sim"
                            else -> null
                        }
                    )
                    .build()
            }
            .retrieve()
            .bodyToMono(NaverBlogContents::class.java)
            .block()!!
    }
}
