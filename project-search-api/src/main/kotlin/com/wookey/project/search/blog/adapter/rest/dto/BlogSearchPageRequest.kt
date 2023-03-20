package com.wookey.project.search.blog.adapter.rest.dto

import com.wookey.project.client.blog.application.BlogSearchSort
import com.wookey.project.commons.exception.BadRequestException
import io.swagger.v3.oas.annotations.Parameter
import org.springframework.data.domain.PageRequest
import javax.validation.constraints.Max
import javax.validation.constraints.Positive

class BlogSearchPageRequest(
    @field:Positive
    @field:Max(100, message = "page는 100 이하여야 합니다.")
    @field:Parameter(
        required = false,
        description = "결과 페이지 번호, 1~100 사이의 값, 기본 값 1"
    )
    val page: Int = 1,

    @field:Positive
    @field:Max(100, message = "size는 100 이하여야 합니다.")
    @field:Parameter(
        required = false,
        description = "한 페이지에 보여질 문서 수, 1~100 사이의 값, 기본 값 10"
    )
    val size: Int = 10,

    @field:Parameter(
        example = "accuracy",
        required = false,
        description = "결과 문서 정렬 방식, accuracy(정확도순) 또는 recency(최신순), 기본 값 accuracy"
    )
    val sort: String = BlogSearchSort.ACCURACY.value
) {
    init {
        BlogSearchSort.values().find { it.value == sort } ?: throw BadRequestException("sort 조건 겂이 잘못 되었습니다.")
    }

    fun toPage(): PageRequest {
        return PageRequest.of(page, size)
    }
}
