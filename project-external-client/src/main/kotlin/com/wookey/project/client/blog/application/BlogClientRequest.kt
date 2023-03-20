package com.wookey.project.client.blog.application

import com.fasterxml.jackson.annotation.JsonIgnore
import com.wookey.project.client.blog.domain.BlogSource

data class BlogRequest(
    val query: String,
    val page: Int = 1,
    val size: Int = 10,
    val sort: BlogSearchSort? = BlogSearchSort.RECENCY,

    @JsonIgnore
    var source: BlogSource = BlogSource.KAKAO
)

enum class BlogSearchSort(val value: String) {
    RECENCY("recency"), // 최신순
    ACCURACY("accuracy"); // 정확도순

    companion object {
        fun findOrDefault(findSort: String?): BlogSearchSort {
            return findSort?.let { values().find { it.value == findSort } } ?: RECENCY
        }
    }
}
