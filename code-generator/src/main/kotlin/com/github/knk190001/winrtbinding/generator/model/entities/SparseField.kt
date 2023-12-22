package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseField(
    @Json("Name")
    val name: String,
    @Json("Index")
    val index: Int,
    @Json("Type")
    val type: SparseTypeReference
)
