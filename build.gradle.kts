plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
}

group = "com.github.knk190001"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

java {
    withSourcesJar()
}