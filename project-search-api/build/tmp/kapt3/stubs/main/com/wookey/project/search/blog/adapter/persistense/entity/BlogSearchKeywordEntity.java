package com.wookey.project.search.blog.adapter.persistense.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lcom/wookey/project/search/blog/adapter/persistense/entity/BlogSearchKeywordEntity;", "", "id", "", "keyword", "", "searchCount", "createdAt", "Ljava/time/LocalDateTime;", "modifiedAt", "(JLjava/lang/String;JLjava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getId", "()J", "getKeyword", "()Ljava/lang/String;", "getModifiedAt", "<set-?>", "getSearchCount", "setSearchCount", "(J)V", "incSearchCount", "", "project-search-api"})
@org.hibernate.annotations.DynamicUpdate
@javax.persistence.Table(name = "blog_search_keyword", indexes = {@javax.persistence.Index(columnList = "keyword", unique = true, name = "udx_keyword"), @javax.persistence.Index(columnList = "search_count", name = "idx_search_count"), @javax.persistence.Index(columnList = "modified_at", name = "idx_modified_at")})
@javax.persistence.Entity
public class BlogSearchKeywordEntity {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "keyword", nullable = false)
    private final java.lang.String keyword = null;
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.CreatedDate
    @javax.persistence.Column(name = "created_at", nullable = false, updatable = false)
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.annotations.UpdateTimestamp
    @javax.persistence.Column(name = "modified_at", nullable = false)
    private final java.time.LocalDateTime modifiedAt = null;
    @javax.persistence.Column(name = "search_count", nullable = false)
    private long searchCount;
    
    public BlogSearchKeywordEntity() {
        super();
    }
    
    public BlogSearchKeywordEntity(long id, @org.jetbrains.annotations.NotNull
    java.lang.String keyword, long searchCount, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime modifiedAt) {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getKeyword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getModifiedAt() {
        return null;
    }
    
    public long getSearchCount() {
        return 0L;
    }
    
    protected void setSearchCount(long p0) {
    }
    
    public void incSearchCount() {
    }
}