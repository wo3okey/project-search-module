package com.wookey.project.search.blog.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/wookey/project/search/blog/application/BlogSearchService;", "Lcom/wookey/project/search/blog/application/port/BlogSearchUseCase;", "blogClientUseCase", "Lcom/wookey/project/client/blog/application/port/BlogClientUseCase;", "blogSearchKeywordRepository", "Lcom/wookey/project/search/blog/application/port/BlogSearchKeywordRepository;", "blogSearchLogRepository", "Lcom/wookey/project/search/blog/application/port/BlogSearchLogRepository;", "(Lcom/wookey/project/client/blog/application/port/BlogClientUseCase;Lcom/wookey/project/search/blog/application/port/BlogSearchKeywordRepository;Lcom/wookey/project/search/blog/application/port/BlogSearchLogRepository;)V", "getBlogClientUseCase", "()Lcom/wookey/project/client/blog/application/port/BlogClientUseCase;", "getBlogSearchKeywordRepository", "()Lcom/wookey/project/search/blog/application/port/BlogSearchKeywordRepository;", "getBlogSearchLogRepository", "()Lcom/wookey/project/search/blog/application/port/BlogSearchLogRepository;", "logger", "Lmu/KLogger;", "getBlogContents", "Lkotlin/Pair;", "", "Lcom/wookey/project/client/blog/application/BlogClientResponse;", "", "blogRequest", "Lcom/wookey/project/client/blog/application/BlogRequest;", "getKeywords", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogKeywordsResponse;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "search", "Lorg/springframework/data/domain/Page;", "searchRequest", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogSearchRequest;", "pageRequest", "Lcom/wookey/project/search/blog/adapter/rest/dto/BlogSearchPageRequest;", "project-search-api"})
@org.springframework.stereotype.Service
public class BlogSearchService implements com.wookey.project.search.blog.application.port.BlogSearchUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.client.blog.application.port.BlogClientUseCase blogClientUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository blogSearchKeywordRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.search.blog.application.port.BlogSearchLogRepository blogSearchLogRepository = null;
    private final mu.KLogger logger = null;
    
    public BlogSearchService(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.port.BlogClientUseCase blogClientUseCase, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository blogSearchKeywordRepository, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.application.port.BlogSearchLogRepository blogSearchLogRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.client.blog.application.port.BlogClientUseCase getBlogClientUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository getBlogSearchKeywordRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.search.blog.application.port.BlogSearchLogRepository getBlogSearchLogRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public org.springframework.data.domain.Page<com.wookey.project.client.blog.application.BlogClientResponse> search(@org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest searchRequest, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest pageRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public kotlin.Pair<java.util.List<com.wookey.project.client.blog.application.BlogClientResponse>, java.lang.Long> getBlogContents(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.BlogRequest blogRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.wookey.project.search.blog.adapter.rest.dto.BlogKeywordsResponse> getKeywords(int top, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition) {
        return null;
    }
}