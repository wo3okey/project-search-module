package com.wookey.project.search

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.wookey.project"])
class ProjectSearchApiApplication

fun main(args: Array<String>) {
    runApplication<ProjectSearchApiApplication>(*args)
}
