package com.wookey.project.search.blog.adapter.persistense;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/BlogSearchLogPersistence;", "Lcom/wookey/project/search/blog/application/port/BlogSearchLogRepository;", "blogSearchLogJpaRepository", "Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchLogJpaRepository;", "(Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchLogJpaRepository;)V", "getBlogSearchLogJpaRepository", "()Lcom/wookey/project/search/blog/adapter/persistense/jpa/BlogSearchLogJpaRepository;", "gson", "Lcom/google/gson/Gson;", "save", "", "request", "Lcom/wookey/project/client/blog/application/BlogRequest;", "project-search-api"})
@org.springframework.stereotype.Repository
public class BlogSearchLogPersistence implements com.wookey.project.search.blog.application.port.BlogSearchLogRepository {
    @org.jetbrains.annotations.NotNull
    private final com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchLogJpaRepository blogSearchLogJpaRepository = null;
    private final com.google.gson.Gson gson = null;
    
    public BlogSearchLogPersistence(@org.jetbrains.annotations.NotNull
    com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchLogJpaRepository blogSearchLogJpaRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchLogJpaRepository getBlogSearchLogJpaRepository() {
        return null;
    }
    
    @java.lang.Override
    public void save(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.BlogRequest request) {
    }
}