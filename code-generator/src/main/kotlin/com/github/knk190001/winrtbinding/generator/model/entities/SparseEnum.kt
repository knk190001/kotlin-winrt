package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.model.traits.Trait

data class SparseEnum(
    @Json("Name")
    override val name: String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Values")
    val values: Map<String, Int>,
    @Json("Traits")
    val traits: List<Trait>
): SparseEntity("Enum"), INamedEntity {

    val isFlagEnum by lazy {
        traits.any { it.traitType == "FlagEnum"}
    }
}
