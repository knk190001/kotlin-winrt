package com.github.knk190001.kotlinwinrt.metadata

import java.net.URI
import java.nio.file.FileSystems
import java.nio.file.Files
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.Path
import kotlin.io.path.walk
import kotlin.streams.asStream

object Metadata {
    val winrtMetadata: List<String> by lazy {
        getAllJsonFromJar(Metadata::class.java.protectionDomain.codeSource.location.path.drop(1), "winrt")
    }

    val winAppSdkMetadata: List<String> by lazy {
        getAllJsonFromJar(Metadata::class.java.protectionDomain.codeSource.location.path.drop(1), "win-app-sdk")
    }


    @OptIn(ExperimentalPathApi::class)
    fun getAllJsonFromJar(path: String, subDirectory: String): List<String> {
        val fs = FileSystems.newFileSystem(Path(path))
        return fs.getPath("/${subDirectory}").walk()
            .asStream()
            .parallel()
            .filter { it.fileName.toString().endsWith(".json") }
            .map(Files::readString).toList()
    }
}