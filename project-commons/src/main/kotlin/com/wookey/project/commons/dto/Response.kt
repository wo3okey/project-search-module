package com.wookey.project.commons.dto

import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

interface Response<T> {
    val data: T

    companion object {
        fun <T> of(data: T): Response<T> = DefaultResponse(data)

        fun <T> ofPage(pagedData: Page<T>): PageResponse<T> = PageResponse(
            pagedData.pageable.pageNumber,
            pagedData.pageable.pageSize,
            pagedData.totalPages,
            pagedData.totalElements,
            pagedData.content
        )
    }
}

class DefaultResponse<T>(override val data: T) : Response<T>

class PageResponse<T>(val page: Int, val size: Int, val totalPages: Int, val totalElements: Long, override val data: List<T>) : Response<List<T>>

data class ExceptionResponse(
    val error: HttpStatus,
    val status: Int,
    val message: String? = ""
) {
    fun toResponseEntity(): ResponseEntity<ExceptionResponse> = ResponseEntity
        .status(status)
        .body(this)
}
