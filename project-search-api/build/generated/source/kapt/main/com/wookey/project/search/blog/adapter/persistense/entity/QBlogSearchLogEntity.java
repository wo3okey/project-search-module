package com.wookey.project.search.blog.adapter.persistense.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBlogSearchLogEntity is a Querydsl query type for BlogSearchLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBlogSearchLogEntity extends EntityPathBase<BlogSearchLogEntity> {

    private static final long serialVersionUID = 92441764L;

    public static final QBlogSearchLogEntity blogSearchLogEntity = new QBlogSearchLogEntity("blogSearchLogEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath query = createString("query");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QBlogSearchLogEntity(String variable) {
        super(BlogSearchLogEntity.class, forVariable(variable));
    }

    public QBlogSearchLogEntity(Path<? extends BlogSearchLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlogSearchLogEntity(PathMetadata metadata) {
        super(BlogSearchLogEntity.class, metadata);
    }

}

