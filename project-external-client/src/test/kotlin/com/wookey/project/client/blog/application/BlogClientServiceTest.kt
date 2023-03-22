package com.wookey.project.client.blog.application

import com.wookey.project.client.blog.application.port.KaKaoBlogClientPort
import com.wookey.project.commons.exception.ClientException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.mockk.every
import io.mockk.mockk

class BlogClientServiceTest {
    val blogClientFactory: BlogClientFactory = mockk()
    val blogClientService = BlogClientService(blogClientFactory)
}

internal class GetBlogContents : BehaviorSpec({
    val mocks = BlogClientServiceTest()

    Given("블로그 정보를 얻기위한 request 정보가 주어지면") {
        val request = BlogRequest(query = "하남 맛집", page = 1)

        When("특정 source의 client 정보를 가져올 때") {
            val port = mockk<KaKaoBlogClientPort>()
            every { mocks.blogClientFactory.getTargetClient(any()) } returns KakaoBlogClient(port)

            When("contents 결과값이 있을 때") {
                val client = mockk<KakaoBlogClient>()
                every { port.getBlogContents(any()) } returns BlogClientTestFactory.getKakaoBlogResponse()
                every { client.getBlogContents(any()) } returns BlogClientTestFactory.getBlogResponse()

                Then("블로그 컨텐츠 정보를 반환한다.") {
                    val result = mocks.blogClientService.getBlogContents(request)
                    result.shouldNotBeNull()
                }
            }

            When("contents 결과값이 없을 때") {
                val client = mockk<KakaoBlogClient>()
                every { port.getBlogContents(any()) } returns BlogClientTestFactory.getEmptyKakaoBlogResponse()
                every { client.getBlogContents(any()) } returns Pair(emptyList(), 0L)

                Then("ClientException이 발생한다") {
                    shouldThrow<ClientException> { mocks.blogClientService.getBlogContents(request) }
                }
            }
        }
    }

    Given("블로그 정보를 얻기위한 request 정보에 page가 크게 주어지면") {
        val request = BlogRequest(query = "하남 맛집", page = 500)

        When("특정 source의 client 정보를 가져올 때") {
            val port = mockk<KaKaoBlogClientPort>()
            every { mocks.blogClientFactory.getTargetClient(any()) } returns KakaoBlogClient(port)

            When("페이지 요청 갯수가 결과 페이지 갯수를 넘어갈 때") {
                val client = mockk<KakaoBlogClient>()
                every { port.getBlogContents(any()) } returns BlogClientTestFactory.getKakaoBlogResponse()
                every { client.getBlogContents(any()) } returns BlogClientTestFactory.getBlogResponse()

                Then("ClientException이 발생한다") {
                    shouldThrow<ClientException> { mocks.blogClientService.getBlogContents(request) }
                }
            }
        }
    }
})
