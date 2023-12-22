package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseStruct(
    @Json("Name")
    override val name: String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Fields")
    val fields: List<SparseField>
): SparseEntity("Struct"), INamedEntity
