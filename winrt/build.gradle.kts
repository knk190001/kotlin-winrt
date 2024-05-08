import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

apply(plugin = "com.github.knk190001.gradle-code-generator-kotlin")


group = "com.github.knk190001"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    maven("https://jitpack.io")
}


val generatingSourceSet = sourceSets["mainGenerator"]!!
val generatingConfig = configurations[generatingSourceSet.implementationConfigurationName]!!
dependencies {
    api(project(":code-generator"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    generatingConfig(project(":code-generator"))
    generatingConfig(project(":metadata"))
}

tasks.test {
    useJUnitPlatform()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "19"
    freeCompilerArgs += "-Xjvm-default=all"
    freeCompilerArgs += "-Xlambdas=indy"
    suppressWarnings = true
}

kotlin {
    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

buildscript {
    dependencies {
        classpath("com.github.knk190001:GradleCodeGenerator:1.1.1")
    }
}

tasks.withType<org.gradle.jvm.tasks.Jar> {
    this.isZip64 = true
}

java {
    toolchain {
        vendor.set(JvmVendorSpec.ADOPTIUM)
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}

val codeGeneratorBuild = rootProject.project(":code-generator").tasks.named("build")

tasks.named("generateMain") {
    dependsOn(codeGeneratorBuild)
}