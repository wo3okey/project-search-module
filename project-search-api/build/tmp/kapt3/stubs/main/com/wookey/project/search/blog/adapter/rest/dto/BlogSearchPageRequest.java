package com.wookey.project.search.blog.adapter.rest.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/wookey/project/search/blog/adapter/rest/dto/BlogSearchPageRequest;", "", "page", "", "size", "sort", "", "(IILjava/lang/String;)V", "getPage", "()I", "getSize", "getSort", "()Ljava/lang/String;", "toPage", "Lorg/springframework/data/domain/PageRequest;", "project-search-api"})
public final class BlogSearchPageRequest {
    @io.swagger.v3.oas.annotations.Parameter(required = false, description = "\uacb0\uacfc \ud398\uc774\uc9c0 \ubc88\ud638, 1~100 \uc0ac\uc774\uc758 \uac12, \uae30\ubcf8 \uac12 1")
    @javax.validation.constraints.Max(value = 100L, message = "page\ub294 100 \uc774\ud558\uc5ec\uc57c \ud569\ub2c8\ub2e4.")
    @javax.validation.constraints.Positive
    private final int page = 0;
    @io.swagger.v3.oas.annotations.Parameter(required = false, description = "\ud55c \ud398\uc774\uc9c0\uc5d0 \ubcf4\uc5ec\uc9c8 \ubb38\uc11c \uc218, 1~100 \uc0ac\uc774\uc758 \uac12, \uae30\ubcf8 \uac12 10")
    @javax.validation.constraints.Max(value = 100L, message = "size\ub294 100 \uc774\ud558\uc5ec\uc57c \ud569\ub2c8\ub2e4.")
    @javax.validation.constraints.Positive
    private final int size = 0;
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Parameter(example = "accuracy", required = false, description = "\uacb0\uacfc \ubb38\uc11c \uc815\ub82c \ubc29\uc2dd, accuracy(\uc815\ud655\ub3c4\uc21c) \ub610\ub294 recency(\ucd5c\uc2e0\uc21c), \uae30\ubcf8 \uac12 accuracy")
    private final java.lang.String sort = null;
    
    public BlogSearchPageRequest() {
        super();
    }
    
    public BlogSearchPageRequest(int page, int size, @org.jetbrains.annotations.NotNull
    java.lang.String sort) {
        super();
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.springframework.data.domain.PageRequest toPage() {
        return null;
    }
}