package com.wookey.project.client.blog.adapter

interface BlogContents

class KakaoBlogContents(
    val meta: Meta,
    val documents: List<Documents>
) : BlogContents {
    class Meta(
        val total_count: Long,
        val pageable_count: Long,
        val is_end: Boolean
    )

    class Documents(
        val title: String,
        val contents: String,
        val url: String,
        val blogname: String,
        val thumbnail: String? = null,
        val datetime: String? = null
    )
}

class NaverBlogContents(
    val lastBuildDate: String,
    val total: Long,
    val start: Long,
    val display: Long,
    val items: List<Item>
) : BlogContents {
    class Item(
        val title: String,
        val link: String,
        val description: String,
        val bloggername: String,
        val bloggerlink: String,
        val postdate: String? = null
    )
}
