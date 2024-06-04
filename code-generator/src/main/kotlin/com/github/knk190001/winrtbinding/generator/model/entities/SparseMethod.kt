package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseMethod(
    @Json("Name")
    val name: String,
    @Json("Parameters")
    val parameters: List<SparseParameter>,
    @Json("ReturnType")
    val returnType: SparseTypeReference
) {
    fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseMethod {
        return copy(
            parameters = parameters.map { it.projectType(typeVariable, newTypeReference) }.toCollection(ArrayList()),
            returnType = returnType.projectType(typeVariable, newTypeReference)
        )
    }

    fun isEventComponent(): Boolean {
        return name.startsWith("add_") || name.startsWith("remove_")
    }

    fun isAddEvent(): Boolean {
        return name.startsWith("add_")
    }
}
