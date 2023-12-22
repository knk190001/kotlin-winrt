package com.github.knk190001.winrtbinding.generator.model.entities

interface IDirectProjectable<T : IDirectProjectable<T>> : INamedEntity {
    val guid: String
    val genericParameters: List<SparseGenericParameter>?

    fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): T

    fun withName(newName: String): T
    fun withProjectedName(): T

}