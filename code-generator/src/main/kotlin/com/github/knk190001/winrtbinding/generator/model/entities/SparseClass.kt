package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.model.traits.*

data class SparseClass(
    @Json("Name")
    override val name: String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Interfaces")
    val interfaces: List<SparseTypeReference>,
    @Json("Traits")
    val traits: List<Trait>
) : SparseEntity("Class"), INamedEntity {

    val defaultInterface by lazy {
        (traits.single { it.traitType == "DefaultInterface" } as DefaultInterfaceTrait).defaultInterface
    }

    val hasFactoryActivator = traits.filterIsInstance<FactoryActivationTrait>().any()

    val isDirectlyActivatable = traits.filterIsInstance<DirectActivationTrait>().any()

    val hasStaticInterfaces
        get() = staticInterfaces.isNotEmpty()

    val staticInterfaces by lazy {
        traits.filterIsInstance<StaticTrait>().flatMap {
            it.interfaces
        }.map { SparseTypeReference(it.name, it.namespace) }
    }

    val factoryActivatorTypes by lazy {
        traits.filterIsInstance<FactoryActivationTrait>()
            .flatMap{ it.factoryTypes }
    }

    val hasCompositionActivator = traits.filterIsInstance<CompositionActivationTrait>().any()

    val compositionActivatorTrait by lazy {
        traits.filterIsInstance<CompositionActivationTrait>().single()
    }

    val hasSuperclass = traits.filterIsInstance<SuperclassTrait>().any()

    val superclass by lazy {
        (traits.single { it.traitType == "Superclass" } as SuperclassTrait).superclass
    }

    val hasSubclass = traits.filterIsInstance<SubclassTrait>().any()
}
