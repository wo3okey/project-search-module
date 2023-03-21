package com.wookey.project.search.blog.application.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/wookey/project/search/blog/application/port/BlogSearchKeywordRepository;", "", "getKeywords", "", "Lcom/wookey/project/search/blog/domain/SearchKeyword;", "top", "", "condition", "Lcom/wookey/project/search/blog/domain/SearchKeywordCondition;", "save", "", "request", "Lcom/wookey/project/client/blog/application/BlogRequest;", "project-search-api"})
@com.wookey.project.commons.annotation.Port(direction = com.wookey.project.commons.annotation.Port.Direction.OUT)
public abstract interface BlogSearchKeywordRepository {
    
    public abstract void save(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.BlogRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.wookey.project.search.blog.domain.SearchKeyword> getKeywords(int top, @org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.domain.SearchKeywordCondition condition);
}