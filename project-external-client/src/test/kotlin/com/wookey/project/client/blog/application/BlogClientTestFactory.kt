package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.adapter.BlogContents
import com.wookey.project.client.blog.adapter.KakaoBlogContents
import com.wookey.project.client.blog.adapter.NaverBlogContents
import com.wookey.project.client.blog.domain.Blog
import com.wookey.project.client.blog.domain.Contents

object BlogClientTestFactory {
    fun getBlogResponse(): Pair<List<BlogClientResponse>, Long> {
        return Pair(
            listOf(
                BlogClientResponse(
                    Blog("wookey 블로그", "https://wo3okey.github.io/"),
                    Contents(
                        "https://wo3okey.github.io/elasticsearch/2023/01/30/elasticsearch-change-shard.html",
                        "그래서 elasticsearch shard 값은 왜 변경이 불가할까?"
                    )
                )
            ),
            1L
        )
    }

    fun getKakaoBlogResponse(): BlogContents {
        return KakaoBlogContents(
            KakaoBlogContents.Meta(10, 10, false),
            listOf(
                KakaoBlogContents.Documents(
                    "서작가맛집7.하남돼지.체인점.김치찌개도 맛나요",
                    "",
                    "https://brunch.co.kr/@topasvga/405",
                    "topasvga",
                    ""
                ),
                KakaoBlogContents.Documents(
                    "<하남시 맛집> 마방집",
                    "",
                    "https://brunch.co.kr/@zzambong/84",
                    "ellead",
                    ""
                )
            )
        )
    }

    fun getEmptyKakaoBlogResponse(): BlogContents {
        return KakaoBlogContents(
            KakaoBlogContents.Meta(0, 0, true),
            listOf()
        )
    }

    fun getNaverBlogResponse(): BlogContents {
        return NaverBlogContents(
            "",
            10,
            1,
            1,
            listOf(
                NaverBlogContents.Item(
                    "미사 꽃집 분위기 좋은 미사 카페 아도라플라워 앤 카페",
                    "https://blog.naver.com/tladuddus2/223006277963",
                    "",
                    "SIMTONG",
                    "https://blog.naver.com/tladuddus2",
                    "20230318"
                ),
                NaverBlogContents.Item(
                    "송리단길 맛집 잠실 텐동 저스트텐동 잠실 내돈내산",
                    "https://blog.naver.com/tladuddus2/223039785344",
                    "",
                    "SIMTONG",
                    "https://blog.naver.com/tladuddus2",
                    "20230318"
                )
            )
        )
    }
}
