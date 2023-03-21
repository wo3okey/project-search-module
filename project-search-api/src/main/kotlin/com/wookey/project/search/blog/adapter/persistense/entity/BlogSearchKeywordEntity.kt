package com.wookey.project.search.blog.adapter.persistense.entity

import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Index
import javax.persistence.Table

@Entity
@Table(
    name = "blog_search_keyword",
    indexes = [
        Index(name = "idx_keyword", columnList = "keyword", unique = true),
        Index(name = "idx_search_count", columnList = "search_count"),
        Index(name = "idx_modified_at", columnList = "modified_at")
    ]
)
@DynamicUpdate
class BlogSearchKeywordEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "keyword", nullable = false)
    val keyword: String = "",

    searchCount: Long = 1,

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "modified_at", nullable = false)
    @UpdateTimestamp
    val modifiedAt: LocalDateTime = LocalDateTime.now()
) {
    @Column(name = "search_count", nullable = false)
    var searchCount: Long = searchCount
        protected set

    fun incSearchCount() {
        searchCount += 1
    }
}
