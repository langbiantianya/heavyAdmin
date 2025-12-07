plugins {
    id("buildsrc.convention.kotlin-jvm")
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDependencyManagement)
    alias(libs.plugins.kotlinSpring)
}

group = "com.youlai.boot"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"



configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {
    implementation(libs.bundles.admin)
    implementation(libs.bundles.mybatisData)

    runtimeOnly(libs.bundles.jdbcDriver)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    compileOnly(libs.lombokMapstructBinding)
    annotationProcessor(libs.lombokMapstructBinding)

    annotationProcessor(libs.mapstructProcessor)
    annotationProcessor(libs.springBootConfigurationProcessor)
}
