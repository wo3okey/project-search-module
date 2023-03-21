package com.wookey.project.client.blog.adapter

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.client.blog.application.BlogSearchSort
import com.wookey.project.client.blog.application.port.NaverBlogClientPort
import com.wookey.project.commons.annotation.Adapter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Adapter
@PropertySource("classpath:application-ignore.yml")
class NaverBlogHttpClient(
    @Value("\${client.naver.url}") url: String,
    @Value("\${client.naver.client-id}") clientId: String,
    @Value("\${client.naver.client-secret}") clientSecret: String
) : NaverBlogClientPort {

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
