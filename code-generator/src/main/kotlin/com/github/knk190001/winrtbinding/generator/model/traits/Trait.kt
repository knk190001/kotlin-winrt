package com.github.knk190001.winrtbinding.generator.model.traits

import com.beust.klaxon.Json
import com.beust.klaxon.TypeAdapter
import com.beust.klaxon.TypeFor
import kotlin.reflect.KClass

@TypeFor("traitType", TraitAdapter::class)
open class Trait(
    @Json("TraitType")
    val traitType: String
)

class TraitAdapter : TypeAdapter<Trait> {
    override fun classFor(type: Any): KClass<out Trait> {
        return when (type as String) {
            "DirectActivation" -> DirectActivationTrait::class
            "FactoryActivation" -> FactoryActivationTrait::class
            "Static" -> StaticTrait::class
            "ValueType" -> ValueTypeTrait::class
            "DefaultInterface" -> DefaultInterfaceTrait::class
            "FlagEnum" -> FlagTrait::class
            "CompositionActivation" -> CompositionActivationTrait::class
            "Superclass" -> SuperclassTrait::class
            "Subclass" -> SubclassTrait::class
            "ContentProperty" -> ContentPropertyTrait::class
            else -> {
                throw NotImplementedError("Trait $type has not been implemented")
            }
        }
    }

}