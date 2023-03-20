package com.wookey.project.search.blog.adapter.persistense.entity

import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "blog_search_log")
class BlogSearchLogEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "query", nullable = false)
    val query: String = "",

    @Column(name = "user_id", nullable = false)
    val userId: Long = 0,

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now()
)
