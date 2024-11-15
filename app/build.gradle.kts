/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    implementation(libs.guice)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation( "io.javalin:javalin:6.3.0")

    implementation("io.avaje:avaje-http-api:2.7")
    annotationProcessor("io.avaje:avaje-http-javalin-generator:2.7")
}

// This doesn't seem to have any affect.
sourceSets["main"].java.srcDir(file("build/generated/sources/annotationProcessor/java/main"))

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.App"
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.register("sourceSets") {
    doLast {
        sourceSets.forEach {
            println(it)
            it.allSource.forEach {
                println(it)
            }
        }
    }
}
