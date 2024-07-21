package com.github.knk190001.winrtbinding.generator.model.entities

interface IParameterizable<T : IParameterizable<T>> : IParameterizableNamedEntity {
    val guid: String
    val genericParameters: List<SparseGenericParameter>?

    fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): T

    val isGeneric
        get() = genericParameters != null

    override fun asTypeReference(): SparseTypeReference {
        return SparseTypeReference(
            originalName = name,
            namespace = namespace,
            genericParameters = genericParameters
        )
    }
}