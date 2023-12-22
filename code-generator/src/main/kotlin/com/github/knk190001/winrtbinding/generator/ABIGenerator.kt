package com.github.knk190001.winrtbinding.generator

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Klaxon
import com.beust.klaxon.Parser
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.squareup.kotlinpoet.FileSpec
import kotlinx.coroutines.*
import kotlin.synchronized
import java.io.InvalidObjectException
import java.nio.file.Path
import java.util.stream.Collectors
import kotlin.io.path.Path
import kotlin.io.path.forEachDirectoryEntry
import kotlin.io.path.inputStream
import kotlin.io.path.isDirectory
import kotlin.streams.toList

typealias LookUp = (SparseTypeReference) -> SparseEntity

lateinit var lookUpTypeReference: LookUp


fun generateProjection(serializedMetadata: List<String>, serializedReferenceMetadata: List<List<String>>): Collection<FileSpec> {
    val entities = serializedMetadata.parallelStream().map {
        val result = Klaxon().parse<SparseEntity>(it)
        println("Parsed: " + result!!.name)
        result
    }.toList()

    val referenceEntities = serializedReferenceMetadata.parallelStream().flatMap {
        it.parallelStream().map { json ->
            val result = Klaxon().parse<SparseEntity>(json)
            println("Parsed: " + result!!.name)
            result
        }
    }.toList()

    val entityMap = entities.associateBy { it.fullName() }
    val referenceEntityMap = referenceEntities.associateBy { it.fullName() }

    val lookUp: LookUp = { typeReference ->
        val tr = typeReference.normalize()
        val result = entityMap.getOrDefault(tr.fullName(), referenceEntityMap[tr.fullName()])
        if (result == null) {
            println("Not found: ${tr.fullName()}")
            throw IllegalArgumentException("Entity not found: ${tr.fullName()}")
        }
        result
    }
    lookUpTypeReference = lookUp

    return entities .map {
        println("Generating: " + it.fullName())
        when (it) {
            is SparseClass -> generateClass(it, lookUp)
            is SparseInterface -> generateInterface(it, lookUp)
            is SparseEnum -> generateEnum(it)
            is SparseStruct -> generateStruct(it)
            is SparseDelegate -> generateDelegate(it)
            else -> throw InvalidObjectException("Object is not of type sparse class or sparse interface.")
        }
    }.toList()
}

fun String.fixSpaces(): String {
    return this.replace(" ", nbsp)
}