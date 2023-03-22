package com.wookey.project.search.blog.adapter.persistense

import com.google.gson.Gson
import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.search.blog.adapter.persistense.entity.BlogSearchLogEntity
import com.wookey.project.search.blog.adapter.persistense.jpa.BlogSearchLogJpaRepository
import com.wookey.project.search.blog.application.port.BlogSearchLogRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Repository
class BlogSearchLogPersistence(
    val blogSearchLogJpaRepository: BlogSearchLogJpaRepository
) : BlogSearchLogRepository {
    private val gson = Gson()

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    override fun save(request: BlogRequest) {
        blogSearchLogJpaRepository.save(
            BlogSearchLogEntity(
                query = gson.toJson(request)
            )
        )
    }
}
