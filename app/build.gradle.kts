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

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.springBootStarter)
    implementation(libs.bundles.data)
    implementation(libs.kotlinReflect)
    implementation(libs.springBootStarterSessionJdbc)
    runtimeOnly(libs.bundles.jdbcDriver)
    annotationProcessor(libs.springBootConfigurationProcessor)
    developmentOnly(libs.springBootDevtools)
    testImplementation(libs.bundles.springBootTest)
    testImplementation(libs.kotlinTestJunit5)
    testRuntimeOnly(libs.junitPlatformLauncher)
}