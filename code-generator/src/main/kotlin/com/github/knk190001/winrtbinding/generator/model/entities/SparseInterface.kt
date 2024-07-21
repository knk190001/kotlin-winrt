package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.model.traits.Trait

data class SparseInterface(
    @Json("Name")
    override val originalName:String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Guid")
    override val guid: String,
    @Json("Methods")
    val methods: List<SparseMethod>,
    @Json("SuperInterfaces")
    val superInterfaces: List<SparseTypeReference>,
    @Json("GenericParameters")
    override val genericParameters: List<SparseGenericParameter>?,
    @Json("Traits")
    val traits: List<Trait>,
    @Json("ContractVersion")
    val contractVersion: Long?
): SparseEntity("Interface"), IParameterizable<SparseInterface>{
    override fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseInterface {
        return this.copy(
            methods = methods.map { it.projectType(typeVariable, newTypeReference) },
            superInterfaces = superInterfaces.map { it.projectType(typeVariable, newTypeReference) },
            genericParameters = genericParameters!!.map { it.projectType(typeVariable, newTypeReference) }
        )
    }

    fun events(): List<Pair<SparseMethod,SparseMethod>> {
        return methods
            .filter { it.name.startsWith("add_") }
            .mapNotNull { addMethod ->
                val removeMethod = methods.find { it.name == addMethod.name.replace("add_", "remove_") }
                if (removeMethod != null) {
                    Pair(addMethod, removeMethod)
                } else {
                    null
                }
            }
    }

    fun properties(): List<Pair<SparseMethod?, SparseMethod?>> {
        return methods
            .filter { it.name.startsWith("get_") || it.name.startsWith("put_") }
            .groupBy { it.name.substringAfter("_") }
            .entries
            .map { (_ ,methods) ->
                val getMethod = methods.find { it.name.startsWith("get_") }
                val putMethod = methods.find { it.name.startsWith("put_") }
                getMethod to putMethod
            }
    }
}

