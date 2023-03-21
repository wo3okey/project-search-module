package com.wookey.project.search.blog.application.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/wookey/project/search/blog/application/port/BlogSearchLogRepository;", "", "save", "", "request", "Lcom/wookey/project/client/blog/application/BlogRequest;", "project-search-api"})
@com.wookey.project.commons.annotation.Port(direction = com.wookey.project.commons.annotation.Port.Direction.OUT)
public abstract interface BlogSearchLogRepository {
    
    public abstract void save(@org.jetbrains.annotations.NotNull
    com.wookey.project.client.blog.application.BlogRequest request);
}