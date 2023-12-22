package com.github.knk190001.winrtbinding.generator.model.entities

interface INamedEntity {
    val name:String
    val namespace:String

    fun fullName()= "$namespace.$name"

    fun asTypeReference(): SparseTypeReference {
        return SparseTypeReference(name, namespace, null, false, false)
    }
}