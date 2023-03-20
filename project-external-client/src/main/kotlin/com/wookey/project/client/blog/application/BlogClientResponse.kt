package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.domain.Blog
import com.wookey.project.client.blog.domain.Contents

class BlogClientResponse(
    val blog: Blog,
    val contents: Contents
)
