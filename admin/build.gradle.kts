plugins {
    id("buildsrc.convention.kotlin-jvm")
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDependencyManagement)
    alias(libs.plugins.kotlinSpring)
}

group = "com.lbty"
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
    compileOnly(libs.lombokMapstructBinding)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    annotationProcessor(libs.springBootConfigurationProcessor)
}
