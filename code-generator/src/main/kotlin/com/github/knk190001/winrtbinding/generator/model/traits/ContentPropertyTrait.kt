package com.github.knk190001.winrtbinding.generator.model.traits

import com.beust.klaxon.Json

data class ContentPropertyTrait(
    @Json("Property")
    val property: String
): Trait("ContentProperty")