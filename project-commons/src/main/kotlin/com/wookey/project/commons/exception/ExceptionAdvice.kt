package com.wookey.project.commons.exception

import com.wookey.project.commons.dto.ExceptionResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ExceptionAdvice {

    @ExceptionHandler(NullPointerException::class)
    fun handleInternalServerException(e: NullPointerException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }

    @ExceptionHandler(BadRequestException::class)
    fun handleBadRequestException(e: BadRequestException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.BAD_REQUEST
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }

    @ExceptionHandler(ConstraintViolationException::class)
    fun handleConstraintViolationException(e: ConstraintViolationException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.BAD_REQUEST
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException::class)
    fun handleConstraintViolationException(e: MethodArgumentTypeMismatchException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.BAD_REQUEST
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }

    @ExceptionHandler(ClientException::class)
    fun handleClientException(e: ClientException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }

    @ExceptionHandler(BindException::class)
    fun handleMethodArgumentNotValidException(e: BindException): ResponseEntity<ExceptionResponse> {
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        return ExceptionResponse(status, status.value(), e.message).toResponseEntity()
    }
}
