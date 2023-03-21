package com.wookey.project.search.blog.adapter.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/wookey/project/search/blog/adapter/rest/BlogSearchController;", "", "blogSearchUseCase", "Lcom/wookey/project/search/blog/application/port/BlogSearchUseCase;", "(Lcom/wookey/project/search/blog/application/port/BlogSearchUseCase;)V", "getBlogSearchUseCase", "()Lcom/wookey/project/search/blog/application/port/BlogSearchUseCase;", "getKeywords", "Lcom/wookey/project/commons/dto/Response;", "", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogKeywordsResponse;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "search", "Lcom/wookey/project/commons/dto/PageResponse;", "Lcom/wookey/project/client/blog/application/BlogClientResponse;", "searchRequest", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogSearchRequest;", "pageRequest", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogSearchPageRequest;", "project-search-api"})
@io.swagger.v3.oas.annotations.tags.Tag(name = "blog-search-controller", description = "\ube14\ub85c\uadf8 \uac80\uc0c9 \uad00\ub828 \uae30\ub2a5\uc744 \uc9c0\uc6d0\ud55c\ub2e4.")
@org.springframework.web.bind.annotation.RestController
@com.wookey.project.commons.annotation.Adapter
public class BlogSearchController {
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.search.blog.application.port.BlogSearchUseCase blogSearchUseCase = null;
    
    public BlogSearchController(@org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.application.port.BlogSearchUseCase blogSearchUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.search.blog.application.port.BlogSearchUseCase getBlogSearchUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\ube14\ub85c\uadf8 \uac80\uc0c9")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/v1/search/blogs"})
    public com.wookey.project.commons.dto.PageResponse<com.wookey.project.client.blog.application.BlogClientResponse> search(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springdoc.api.annotations.ParameterObject
    com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest searchRequest, @org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springdoc.api.annotations.ParameterObject
    com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest pageRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\ube14\ub85c\uadf8 \uac80\uc0c9\uc5b4(\ud0a4\uc6cc\ub4dc) \ubaa9\ub85d \uc870\ud68c", parameters = {@io.swagger.v3.oas.annotations.Parameter(name = "top", description = "\ud0a4\uc6cc\ub4dc \ucd5c\ub300 \ub178\ucd9c \uac2f\uc218, \ucd5c\ub30010"), @io.swagger.v3.oas.annotations.Parameter(name = "condition", description = "\ud0a4\uc6cc\ub4dc \uc870\ud68c \uc870\uac74, POPULAR(\uc778\uae30\uc21c), DATE(\ucd5c\uc2e0\uc21c), \uae30\ubcf8 \uac12 POPULAR")})
    @org.springframework.web.bind.annotation.GetMapping(value = {"/v1/search/blogs/keywords"})
    public com.wookey.project.commons.dto.Response<java.util.List<com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse>> getKeywords(@javax.validation.constraints.Max(value = 10L)
    @org.springframework.web.bind.annotation.RequestParam(value = "top", required = false, defaultValue = "10")
    int top, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "condition", required = false, defaultValue = "POPULAR")
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition) {
        return null;
    }
}