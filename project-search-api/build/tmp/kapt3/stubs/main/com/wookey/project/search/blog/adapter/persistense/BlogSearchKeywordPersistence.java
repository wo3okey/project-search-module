package com.wookey.project.search.blog.adapter.persistense;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/BlogSearchKeywordPersistence;", "Lcom/wookey/project/search/blog/application/port/BlogSearchKeywordRepository;", "blogSearchKeywordJpaRepository", "Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordJpaRepository;", "(Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordJpaRepository;)V", "getBlogSearchKeywordJpaRepository", "()Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordJpaRepository;", "getKeywords", "", "Lcom/wookey/project/search/blog/domain/SearchKeyword;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "save", "", "request", "Lcom/wookey/project/client/blog/application/BlogRequest;", "project-search-api"})
@org.springframework.stereotype.Repository
public class BlogSearchKeywordPersistence implements com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository {
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchKeywordJpaRepository blogSearchKeywordJpaRepository = null;
    
    public BlogSearchKeywordPersistence(@org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchKeywordJpaRepository blogSearchKeywordJpaRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchKeywordJpaRepository getBlogSearchKeywordJpaRepository() {
        return null;
    }
    
    @java.lang.Override
    public void save(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.BlogRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.wookey.project.search.blog.domain.SearchKeyword> getKeywords(int top, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition) {
        return null;
    }
}