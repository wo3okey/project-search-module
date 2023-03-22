package com.wookey.project.search.blog.adapter.rest

import com.wookey.project.client.blog.application.BlogClientResponse
import com.wookey.project.commons.annotation.Adapter
import com.wookey.project.commons.dto.PageResponse
import com.wookey.project.commons.dto.Response
import com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest
import com.wookey.project.search.blog.application.port.BlogSearchUseCase
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.api.annotations.ParameterObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid
import javax.validation.constraints.Max

@Adapter
@RestController
@Tag(name = "blog-search-controller", description = "블로그 검색 관련 기능을 지원한다.")
class BlogSearchController(
    val blogSearchUseCase: BlogSearchUseCase
) {
    @GetMapping("/v1/search/blogs")
    @Operation(summary = "블로그 검색")
    fun search(
        @ParameterObject @Valid
        searchRequest: BlogSearchRequest,
        @ParameterObject @Valid
        pageRequest: BlogSearchPageRequest
    ): PageResponse<BlogClientResponse> {
        return blogSearchUseCase.search(searchRequest, pageRequest)
    }

    @GetMapping("/v1/search/blogs/keywords")
    @Operation(
        summary = "블로그 검색어(키워드) 목록 조회",
        parameters = [
            Parameter(name = "top", description = "키워드 최대 노출 갯수, 최대10"),
            Parameter(name = "condition", description = "키워드 조회 조건, POPULAR(인기순), DATE(최신순), 기본 값 POPULAR")
        ]
    )
    fun getKeywords(
        @RequestParam(value = "top", required = false, defaultValue = "10")
        @Max(10)
        top: Int,

        @RequestParam(value = "condition", required = false, defaultValue = "POPULAR")
        condition: SearchKeywordCondition
    ): Response<List<BlogKeywordsResponse>> {
        return Response.of(blogSearchUseCase.getKeywords(top, condition))
    }
}
