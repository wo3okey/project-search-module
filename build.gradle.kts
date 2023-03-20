import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

version = "1.0.0"

plugins {
    val kotlinVersion = "1.7.22"

    id("org.springframework.boot") version "2.7.7"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.jmailen.kotlinter") version "3.13.0"

    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion apply false
    kotlin("plugin.jpa") version kotlinVersion apply false
    kotlin("kapt") version kotlinVersion apply false
}

allprojects {
    group = "com.wookey"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring") // all open
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jmailen.kotlinter")

    dependencies {
        // kotlin
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        // test
        testImplementation("io.mockk:mockk:1.12.0")
        testImplementation("io.kotest:kotest-runner-junit5:4.6.3")
        testImplementation("io.kotest:kotest-assertions-core:4.6.3")
        testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.7.22")

        // springdoc
        implementation("org.springdoc:springdoc-openapi-kotlin:1.6.15")
        implementation("org.springdoc:springdoc-openapi-ui:1.6.15")

        // etc
        implementation("io.github.microutils:kotlin-logging:2.0.10")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("com.google.code.gson:gson")
    }

    java.sourceCompatibility = JavaVersion.VERSION_17

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}

// projects dependency
project(":project-search-api") {
    dependencies {
        implementation(project(":project-external-client"))
    }
}

project(":project-search-api") {
    dependencies {
        implementation(project(":project-commons"))
    }
}

project(":project-external-client") {
    dependencies {
        implementation(project(":project-commons"))
    }
}

// projects jar
project(":project-search-api") {
    val jar: Jar by tasks
    val bootJar: BootJar by tasks

    bootJar.enabled = true
    jar.enabled = true
}

project(":project-external-client") {
    val jar: Jar by tasks
    val bootJar: BootJar by tasks

    bootJar.enabled = false
    jar.enabled = true
}

project(":project-commons") {
    val jar: Jar by tasks
    val bootJar: BootJar by tasks

    bootJar.enabled = false
    jar.enabled = true
}