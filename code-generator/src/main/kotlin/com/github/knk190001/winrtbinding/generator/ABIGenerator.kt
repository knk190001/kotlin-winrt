package com.github.knk190001.winrtbinding.generator

import com.beust.klaxon.Klaxon
import com.github.knk190001.winrtbinding.generator.TestUnsigned.Companion.test
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.squareup.kotlinpoet.FileSpec
import java.io.InvalidObjectException

typealias LookUp = (SparseTypeReference) -> SparseEntity

lateinit var lookUpTypeReference: LookUp


fun generateProjection(serializedMetadata: List<String>, serializedReferenceMetadata: List<List<String>>): Collection<FileSpec> {
    val entities = parseMetadata(listOf(serializedMetadata))
    val referenceEntities = parseMetadata(serializedReferenceMetadata)

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
        when (it) {
            is SparseClass -> generateClass(it, lookUp)
            is SparseInterface -> generateInterface(it)
            is SparseEnum -> generateEnum(it)
            is SparseStruct -> generateStruct(it)
            is SparseDelegate -> generateDelegate(it)
            else -> throw InvalidObjectException("Object is not of type sparse class or sparse interface.")
        }
    }.toList()
}

private fun parseMetadata(serializedReferenceMetadata: List<List<String>>): MutableList<SparseEntity> =
    serializedReferenceMetadata.parallelStream().flatMap {
        it.parallelStream().map { json ->
            val result = Klaxon().parse<SparseEntity>(json)
//            println("Parsed: " + result!!.name)
            result!!
        }
    }.toList()

fun String.fixSpaces(): String {
    test(1u, 1u)
    return this.replace(" ", nbsp)
}


class TestUnsigned {
    companion object {
        @JvmStatic
        fun test(uInt: UInt, uLong: ULong): ULong {
            return uInt + uLong
        }
    }
}
