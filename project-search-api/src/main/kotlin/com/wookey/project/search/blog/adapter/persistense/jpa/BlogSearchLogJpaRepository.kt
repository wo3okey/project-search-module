package com.wookey.project.search.blog.adapter.persistense.jpa

import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchLogEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BlogSearchLogJpaRepository : JpaRepository<BlogSearchLogEntity, Long>
