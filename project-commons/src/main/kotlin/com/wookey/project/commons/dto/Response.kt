package com.wookey.project.commons.dto

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@JsonInclude(JsonInclude.Include.NON_NULL)
interface Response<T> {
    val data: T

    companion object {
        fun <T> of(data: T): Response<T> = DefaultResponse(data)
    }
}

class DefaultResponse<T>(override val data: T) : Response<T>

open class PageResponse<T>(
    open val page: Int,
    open val size: Int,
    open val totalPages: Int,
    open val totalElements: Long,
    override val data: List<T>
) : Response<List<T>>

data class ExceptionResponse(
    val error: HttpStatus,
    val status: Int,
    val message: String? = ""
) {
    fun toResponseEntity(): ResponseEntity<ExceptionResponse> = ResponseEntity
        .status(status)
        .body(this)
}
