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
    implementation(libs.bundles.springBootStarter)
    implementation(libs.bundles.exposedData)
    implementation(libs.kotlinReflect)
    runtimeOnly(libs.bundles.jdbcDriver)
    annotationProcessor(libs.springBootConfigurationProcessor)
    developmentOnly(libs.springBootDevtools)
    testImplementation(libs.kotlinTestJunit5)
    testRuntimeOnly(libs.junitPlatformLauncher)
}