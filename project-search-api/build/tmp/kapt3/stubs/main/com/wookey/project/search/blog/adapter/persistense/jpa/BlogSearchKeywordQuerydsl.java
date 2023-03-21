package com.wookey.project.search.blog.adapter.persistense.jpa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchKeywordQuerydsl;", "", "getKeywords", "", "Lcom/wookey/project/search/blog/adapter/persistense/entity/BlogSearchKeywordEntity;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "project-search-api"})
public abstract interface BlogSearchKeywordQuerydsl {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchKeywordEntity> getKeywords(int top, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition);
}