import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "com.github.knk190001"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("com.squareup:kotlinpoet:1.12.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    api("org.jetbrains.kotlin:kotlin-reflect:1.8.21")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    api("net.java.dev.jna:jna:5.12.1")
    api("net.java.dev.jna:jna-platform:5.12.1")
    implementation("com.47deg:memeid:0.7.0")
    implementation("com.beust:klaxon:5.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(22)
    compilerOptions.freeCompilerArgs.set(
        listOf("-Xjvm-default=all", "-Xlambdas=indy"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.github.knk190001"
            artifactId = "kotlin-winrt"
            version = "1.0"
        }
    }
}

java {
    withSourcesJar()
}