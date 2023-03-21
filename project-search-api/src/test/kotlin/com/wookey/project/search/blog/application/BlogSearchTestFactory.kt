package com.wookey.project.search.blog.application

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.client.blog.domain.Blog
import com.wookey.project.client.blog.domain.Contents
import com.wookey.project.search.blog.domain.SearchKeyword
import java.time.LocalDateTime

object BlogSearchTestFactory {
    fun getBlogResponse(): Pair<List<BlogClientResponse>, Long> {
        return Pair(
            listOf(
                BlogClientResponse(
                    Blog("wookey 블로그", "https://wo3okey.github.io/"),
                    Contents(
                        "https://wo3okey.github.io/elasticsearch/2023/01/30/elasticsearch-change-shard.html",
                        "그래서 elasticsearch shard 값은 왜 변경이 불가할까?"
                    )
                )
            ),
            1L
        )
    }

    fun getKeywords() = listOf(
        SearchKeyword(1, "하남맛집", 1, LocalDateTime.now(), LocalDateTime.now()),
        SearchKeyword(2, "서울맛집", 2, LocalDateTime.now(), LocalDateTime.now()),
        SearchKeyword(3, "대구맛집", 3, LocalDateTime.now(), LocalDateTime.now())
    )
}
