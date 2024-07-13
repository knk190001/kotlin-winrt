plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "com.github.knk190001"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.github.knk190001"
            artifactId = "winrt-metadata"
            version = "1.0"
        }
    }
}

java {
    withSourcesJar()
}