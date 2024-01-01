pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
}

rootProject.name = "kotlin-winrt"
include("code-generator")
include("winrt")
include("win-app-sdk")
include("metadata")
include("example")
