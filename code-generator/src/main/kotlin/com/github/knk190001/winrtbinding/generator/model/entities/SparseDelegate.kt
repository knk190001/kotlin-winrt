package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseDelegate(
    @Json("Name")
    override val name: String,
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
) : SparseEntity("Delegate"), IDirectProjectable<SparseDelegate> {
    val parameterized
        get() = genericParameters != null

    override fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseDelegate {
        if (genericParameters == null) return this
        return copy(
            parameters = parameters.map { it.projectType(typeVariable, newTypeReference) },
            returnType = returnType.projectType(typeVariable, newTypeReference),
            genericParameters = genericParameters.map { it.projectType(typeVariable, newTypeReference) }
        )
    }

    override fun withName(newName: String): SparseDelegate {
        return copy(name = newName)
    }

    override fun withProjectedName(): SparseDelegate {
        return withName(asTypeReference().getProjectedName())
    }

    override fun asTypeReference(): SparseTypeReference {
        return SparseTypeReference(
            name,
            namespace,
            genericParameters
        )
    }
}
