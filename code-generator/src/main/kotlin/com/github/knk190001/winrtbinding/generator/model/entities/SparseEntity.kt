package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.beust.klaxon.TypeAdapter
import com.beust.klaxon.TypeFor
import kotlin.reflect.KClass

@TypeFor(field = "type", EntityAdapter::class)
abstract class SparseEntity(
    @Json("Type")
    val type: String
): INamedEntity

class EntityAdapter : TypeAdapter<SparseEntity> {
    override fun classFor(type: Any): KClass<out SparseEntity> {
        return when (type as String) {
            "Class" -> SparseClass::class
            "Interface" -> SparseInterface::class
            "Enum" -> SparseEnum::class
            "Delegate" -> SparseDelegate::class
            "Struct" -> SparseStruct::class
            else -> throw IllegalArgumentException("type must be either \"Class\" or \"Interface\"")
        }
    }
}