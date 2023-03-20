package com.wookey.project.commons.annotation

import org.springframework.stereotype.Component
import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Target(AnnotationTarget.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
annotation class Port(
    val target: String = "",
    val direction: Direction
) {
    enum class Direction {
        IN, OUT
    }
}
