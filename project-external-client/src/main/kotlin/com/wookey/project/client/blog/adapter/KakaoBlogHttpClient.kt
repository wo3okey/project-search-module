package com.wookey.project.client.blog.adapter

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.client.blog.application.BlogSearchSort
import com.wookey.project.client.blog.application.port.KaKaoBlogClientPort
import com.wookey.project.commons.annotation.Adapter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Adapter
@PropertySource("classpath:application-ignore.yml")
class KakaoBlogHttpClient(
    @Value("\${client.kakao.url}") url: String,
    @Value("\${client.kakao.rest-api-key}") restApiKey: String
) : KaKaoBlogClientPort {

    private val client = WebClient.builder()
        .baseUrl(url)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader("Authorization", "KakaoAK $restApiKey")
        .build()

    override fun getBlogContents(request: BlogRequest): BlogContents {
        return client.get()
            .uri {
                it.path("/v2/search/blog")
                    .queryParam("query", request.query)
                    .queryParam("page", request.page)
                    .queryParam("size", request.size)
                    .queryParam(
                        "sort",
                        when (request.sort) {
                            BlogSearchSort.RECENCY -> "recency"
                            BlogSearchSort.ACCURACY -> "accuracy"
                            else -> null
                        }
                    )
                    .build()
            }
            .retrieve()
            .bodyToMono(KakaoBlogContents::class.java)
            .block()!!
    }
}
