package com.github.knk190001.winrtbinding.generator.model.traits

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference

data class DefaultInterfaceTrait(
    @Json("DefaultInterface")
    val defaultInterface: SparseTypeReference
): Trait("DefaultInterface")
