package com.wookey.project.client.blog.application.port

import com.wookey.project.client.blog.adapter.BlogContents
import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.commons.annotation.Port

@Port(direction = Port.Direction.OUT)
interface KaKaoBlogClientPort {
    fun getBlogContents(request: BlogRequest): BlogContents
}
