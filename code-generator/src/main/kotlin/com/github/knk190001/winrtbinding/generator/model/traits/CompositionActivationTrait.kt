package com.github.knk190001.winrtbinding.generator.model.traits

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference

data class CompositionActivationTrait(
    @Json("CompositionFactoryTypes")
    val compositionFactoryTypes: List<SparseTypeReference>
):Trait("CompositionActivation")