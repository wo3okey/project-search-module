package com.wookey.project.search.blog.application

import com.wookey.project.client.blog.application.BlogRequest
import com.wookey.project.client.blog.application.port.BlogClientUseCase
import com.wookey.project.client.blog.domain.BlogSource
import com.wookey.project.commons.exception.ClientException
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchPageRequest
import com.wookey.project.search.blog.adapter.rest.dto.BlogSearchRequest
import com.wookey.project.search.blog.application.port.BlogSearchKeywordRepository
import com.wookey.project.search.blog.application.port.BlogSearchLogRepository
import com.wookey.project.search.blog.domain.SearchKeywordCondition
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs

class BlogSearchServiceTest {
    val blogClientUseCase: BlogClientUseCase = mockk()
    val blogSearchKeywordRepository: BlogSearchKeywordRepository = mockk()
    val blogSearchLogRepository: BlogSearchLogRepository = mockk()
    val blogSearchService = BlogSearchService(blogClientUseCase, blogSearchKeywordRepository, blogSearchLogRepository)
}

internal class SearchTest : BehaviorSpec({
    val mocks = BlogSearchServiceTest()

    Given("블로그 검색 및 페이징 정보가 주어지면") {
        val searchRequest = BlogSearchRequest("wookey")
        val pageRequest = BlogSearchPageRequest()

        When("블로그 client를 통해 정보를 가져올 때") {
            every { mocks.blogSearchLogRepository.save(any()) } just runs

            every { mocks.blogSearchKeywordRepository.save(any()) } just runs

            every {
                mocks.blogClientUseCase.getBlogContents(any())
            } returns BlogSearchTestFactory.getBlogResponse()

            Then("블로그 검색 정보를 반환한다.") {
                val result = mocks.blogSearchService.search(searchRequest, pageRequest)
                result.data.shouldNotBeEmpty()
            }
        }
    }
})

internal class GetBlogContentsTest : BehaviorSpec({
    val mocks = BlogSearchServiceTest()

    Given("블로그 조회 정보가 주어지면") {
        val request = BlogRequest("wookey")

        BlogSource.values().forEach {
            When("블로그 조회가 정상적일 때") {
                every {
                    mocks.blogClientUseCase.getBlogContents(any())
                } returns BlogSearchTestFactory.getBlogResponse()

                And("검색 로그를 저장하고") {
                    every { mocks.blogSearchLogRepository.save(any()) } just runs

                    And("검색 키워드 정보를 저장하고") {
                        every { mocks.blogSearchKeywordRepository.save(any()) } just runs

                        Then("컨텐츠 결과값을 반환한다.") {
                            val result = mocks.blogSearchService.getBlogContents(request)
                            result.shouldNotBeNull()
                        }
                    }
                }
            }

            When("블로그 조회간에 오류가 있을 때") {
                every { mocks.blogClientUseCase.getBlogContents(any()) } throws RuntimeException()

                Then("ClientException이 발생한다.") {
                    shouldThrow<ClientException> { mocks.blogSearchService.getBlogContents(request) }
                }
            }
        }
    }
})

internal class GetKeywordsTest : BehaviorSpec({
    val mocks = BlogSearchServiceTest()

    Given("top 갯수 및 키워드 조회 컨디션 정보가 주어지면") {
        val top = 10
        val condition = SearchKeywordCondition.POPULAR

        When("조건에 맞는 키워드 리스트를 가져올때") {
            every {
                mocks.blogSearchKeywordRepository.getKeywords(any(), any())
            } returns BlogSearchTestFactory.getKeywords()

            Then("블로그 검색 정보를 반환한다.") {
                val result = mocks.blogSearchService.getKeywords(top, condition)
                result.shouldNotBeEmpty()
            }
        }
    }
})
