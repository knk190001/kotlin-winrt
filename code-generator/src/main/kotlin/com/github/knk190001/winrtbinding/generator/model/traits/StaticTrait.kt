package com.github.knk190001.winrtbinding.generator.model.traits

import com.beust.klaxon.Json

data class StaticTrait(
    @Json("Interfaces")
    val interfaces: List<StaticInterface>
): Trait("Static")

data class StaticInterface (
    @Json("Name")
    val name: String,
    @Json("Namespace")
    val namespace: String
)