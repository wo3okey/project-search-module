package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.domain.BlogSource
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.types.shouldBeInstanceOf
import io.mockk.mockk

class BlogClientFactoryTest {
    val blogClientFactory = BlogClientFactory(mockk(), mockk())
}

internal class GetTargetClient : BehaviorSpec({
    val mocks = BlogClientFactoryTest()

    Given("source 정보가 주어지면") {
        var source: BlogSource

        When("source가 kakao일 때") {
            source = BlogSource.KAKAO

            Then("kakao blog client 객체를 반환한다.") {
                val result = mocks.blogClientFactory.getTargetClient(source)
                result.shouldBeInstanceOf<KakaoBlogClient>()
            }
        }

        When("source가 naver일 때") {
            source = BlogSource.NAVER

            Then("naver blog client 객체를 반환한다.") {
                val result = mocks.blogClientFactory.getTargetClient(source)
                result.shouldBeInstanceOf<NaverBlogClient>()
            }
        }
    }
})
