package com.wookey.project.search.blog.adapter.persistense.jpa

import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchKeywordEntity
import com.wookey.project.search.blog.adapter.persistense.entity.QBlogSearchKeywordEntity.blogSearchKeywordEntity
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface BlogSearchKeywordJpaRepository : JpaRepository<BlogSearchKeywordEntity, Long>, BlogSearchKeywordQuerydsl {
    fun findByKeyword(keyword: String): BlogSearchKeywordEntity?
}

interface BlogSearchKeywordQuerydsl {
    fun getKeywords(top: Int, condition: SearchKeywordCondition): List<BlogSearchKeywordEntity>
}

@Repository
class BlogSearchKeywordQuerydslImpl(
    private val q: JPAQueryFactory
) : BlogSearchKeywordQuerydsl {
    override fun getKeywords(top: Int, condition: SearchKeywordCondition): List<BlogSearchKeywordEntity> {
        return q.select(
            Projections.constructor(
                BlogSearchKeywordEntity::class.java,
                blogSearchKeywordEntity.id,
                blogSearchKeywordEntity.keyword,
                blogSearchKeywordEntity.searchCount,
                blogSearchKeywordEntity.createdAt,
                blogSearchKeywordEntity.modifiedAt
            )
        ).from(blogSearchKeywordEntity)
            .limit(top.toLong())
            .orderBy(
                when (condition) {
                    SearchKeywordCondition.POPULAR -> blogSearchKeywordEntity.searchCount.desc()
                    SearchKeywordCondition.DATE -> blogSearchKeywordEntity.modifiedAt.desc()
                }
            )
            .fetch()
    }
}
