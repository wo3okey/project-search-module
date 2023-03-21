package com.wookey.project.search.blog.adapter.persistense.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBlogSearchKeywordEntity is a Querydsl query type for BlogSearchKeywordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBlogSearchKeywordEntity extends EntityPathBase<BlogSearchKeywordEntity> {

    private static final long serialVersionUID = -1865989879L;

    public static final QBlogSearchKeywordEntity blogSearchKeywordEntity = new QBlogSearchKeywordEntity("blogSearchKeywordEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath keyword = createString("keyword");

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> searchCount = createNumber("searchCount", Long.class);

    public QBlogSearchKeywordEntity(String variable) {
        super(BlogSearchKeywordEntity.class, forVariable(variable));
    }

    public QBlogSearchKeywordEntity(Path<? extends BlogSearchKeywordEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlogSearchKeywordEntity(PathMetadata metadata) {
        super(BlogSearchKeywordEntity.class, metadata);
    }

}

