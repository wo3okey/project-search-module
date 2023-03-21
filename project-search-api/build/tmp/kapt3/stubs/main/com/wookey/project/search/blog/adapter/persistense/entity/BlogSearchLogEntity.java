package com.wookey.project.search.blog.adapter.persistense.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/entity/BlogSearchLogEntity;", "", "id", "", "query", "", "userId", "createdAt", "Ljava/time/LocalDateTime;", "(JLjava/lang/String;JLjava/time/LocalDateTime;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getId", "()J", "getQuery", "()Ljava/lang/String;", "getUserId", "project-search-api"})
@javax.persistence.Table(name = "blog_search_log")
@javax.persistence.Entity
public class BlogSearchLogEntity {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "query", nullable = false)
    private final java.lang.String query = null;
    @javax.persistence.Column(name = "user_id", nullable = false)
    private final long userId = 0L;
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.CreatedDate
    @javax.persistence.Column(name = "created_at", nullable = false)
    private final java.time.LocalDateTime createdAt = null;
    
    public BlogSearchLogEntity() {
        super();
    }
    
    public BlogSearchLogEntity(long id, @org.jetbrains.annotations.NotNull
    java.lang.String query, long userId, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime createdAt) {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQuery() {
        return null;
    }
    
    public long getUserId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
}