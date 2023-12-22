package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseGenericParameter(
    @Json("Name")
    val name: String,
    @Json("Position")
    val position:Int,
    @Json("Type")
    val type: SparseTypeReference?
){
    fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseGenericParameter {
        if (type == null && typeVariable == name) {
            return copy(type = newTypeReference)
        }
        return copy(
            type = type?.projectType(typeVariable,newTypeReference)
        )
    }
}