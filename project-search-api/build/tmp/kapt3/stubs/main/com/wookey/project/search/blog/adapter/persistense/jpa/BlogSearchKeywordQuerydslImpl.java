package com.wookey.project.search.blog.adapter.persistense.jpa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordQuerydslImpl;", "Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordQuerydsl;", "q", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "getKeywords", "", "Lcom/wookey/project/search/blog/adapter/persistense/entity/BlogSearchKeywordEntity;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "project-search-api"})
@org.springframework.stereotype.Repository
public class BlogSearchKeywordQuerydslImpl implements com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchKeywordQuerydsl {
    private final com.querydsl.jpa.impl.JPAQueryFactory q = null;
    
    public BlogSearchKeywordQuerydslImpl(@org.jetbrains.annotations.NotNull
    com.querydsl.jpa.impl.JPAQueryFactory q) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchKeywordEntity> getKeywords(int top, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition) {
        return null;
    }
}