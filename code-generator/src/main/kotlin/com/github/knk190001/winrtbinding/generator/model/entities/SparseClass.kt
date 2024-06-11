package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.lookUpTypeReference
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

    private fun methodsRecursive(): List<Pair<SparseInterface, SparseMethod>>{
        val methods = interfaces.map { lookUpTypeReference(it) as SparseInterface }
            .flatMap { it.methodsRecursive() }

        val superclassMethods = if(hasSuperclass) {
            (lookUpTypeReference(superclass) as SparseClass).methodsRecursive()
        } else {
            emptyList()
        }
        return methods + superclassMethods
    }

    fun collisions(): List<SparseInterface> {
        if(!hasSuperclass) return emptyList()
        val resolvedInterfaces = interfaces.map { lookUpTypeReference(it) as SparseInterface }
        val methods = resolvedInterfaces.flatMap { it.methodsRecursive() }

        val parentClassMethodMap = (lookUpTypeReference(superclass) as SparseClass)
            .methodsRecursive()
            .filterNot { (sparseInterface, _) -> resolvedInterfaces.contains(sparseInterface) }
            .associateByName()

         return methods
            .filter { parentClassMethodMap.checkForCollision(it) }
            .map { it.first }
            .distinct()
    }

    fun nonCollidingInterfaces(): List<SparseTypeReference> {
        val collisions = collisions()
        return interfaces
            .filterNot { collisions.contains(lookUpTypeReference(it)) }
    }

    fun propertyCollisions(): List<Pair<Pair<SparseMethod, SparseInterface>, Pair<SparseMethod, SparseInterface>>> {
        val getters = nonCollidingInterfaces()
            .asSequence()
            .map { lookUpTypeReference(it) as SparseInterface }
            .flatMap { it.properties().map { prop -> prop to it}}
            .filter { (it, _) -> it.first != null && it.second == null}
            .map { (it, sparseInterface) -> it.first!! to sparseInterface }
            .associateBy { (it, _) -> it.name.substringAfter('_') }

        val setters = nonCollidingInterfaces()
            .asSequence()
            .map { lookUpTypeReference(it) as SparseInterface }
            .flatMap { it.properties().map { prop -> prop to it}}
            .filter { (it, _) -> it.first == null && it.second != null }
            .map { (it, sparseInterface) -> it.second!!  to sparseInterface}
            .associateBy { (it, _) -> it.name.substringAfter('_') }

        return getters.keys.intersect(setters.keys)
            .map { key -> Pair(getters[key]!!, setters[key]!!) }
            .toList()
    }
}

private fun SparseInterface.methodsRecursive(): List<Pair<SparseInterface, SparseMethod>> {
    val methods = this.methods.map { this to it }
    val superInterfaces = this.superInterfaces
    val superInterfaceMethods = superInterfaces
        .map { lookUpTypeReference(it) as SparseInterface }
        .flatMap { it.methodsRecursive() }
    return methods + superInterfaceMethods
}

private fun SparseMethod.collidesWith(other: SparseMethod): Boolean {
    val b1 = this.name == other.name && this.parameters.size == other.parameters.size &&
            this.parameters.zip(other.parameters).all { (a, b) -> a.type == b.type }
    return b1
}

private fun List<Pair<SparseInterface, SparseMethod>>.associateByName(): Map<String, Set<Pair<SparseInterface, SparseMethod>>> {
    return this.groupBy { (_, method) -> method.name }.mapValues { it.value.toSet() }
}

private fun Map<String, Set<Pair<SparseInterface,SparseMethod>>>.checkForCollision(method: Pair<SparseInterface, SparseMethod>): Boolean {
    return this[method.second.name]?.any { ( _, it) -> it.collidesWith(method.second) } ?: false
}