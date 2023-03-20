package com.wookey.project.search.blog.adapter.rest.dto

import io.swagger.v3.oas.annotations.Parameter
import javax.validation.constraints.NotNull

class BlogSearchRequest(
    @field:Parameter(example = "고양이 골골송", required = true, allowEmptyValue = false, description = "검색어")
    @field:NotNull
    val query: String
)
