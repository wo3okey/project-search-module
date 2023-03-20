package com.wookey.project.commons.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.SpringDocUtils
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebSession
import java.util.Optional

@Component
@Configuration
class SwaggerConfig {
    init {
        SpringDocUtils.getConfig()
            .addResponseWrapperToIgnore(Optional::class.java)
            .addRequestWrapperToIgnore(
                WebSession::class.java,
                ServerHttpRequest::class.java,
                ServerHttpResponse::class.java,
                ServerWebExchange::class.java
            )
    }

    /**
     * connect: host/swagger-ui/index.html
     */
    @Bean
    fun openAPI(): OpenAPI {
        val info = Info()
            .title("project-search-module")
            .version("1.0.0")

        return OpenAPI().info(info)
    }
}
