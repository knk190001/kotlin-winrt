package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseDelegate(
    @Json("Name")
    override val originalName: String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Guid")
    override val guid: String,
    @Json("Parameters")
    val parameters: List<SparseParameter>,
    @Json("ReturnType")
    val returnType: SparseTypeReference,
    @Json("GenericParameters")
    override val genericParameters: List<SparseGenericParameter>? = null
) : SparseEntity("Delegate"), IParameterizable<SparseDelegate> {

    override fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseDelegate {
        if (!isGeneric) return this
        return copy(
            parameters = parameters.map { it.projectType(typeVariable, newTypeReference) },
            returnType = returnType.projectType(typeVariable, newTypeReference),
            genericParameters = genericParameters!!.map { it.projectType(typeVariable, newTypeReference) }
        )
    }
}
