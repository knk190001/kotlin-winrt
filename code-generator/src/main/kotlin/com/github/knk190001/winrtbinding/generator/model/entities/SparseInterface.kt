package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json
import com.github.knk190001.winrtbinding.generator.lookUpTypeReference
import com.github.knk190001.winrtbinding.generator.model.traits.Trait

data class SparseInterface(
    @Json("Name")
    override val name:String,
    @Json("Namespace")
    override val namespace: String,
    @Json("Guid")
    override val guid: String,
    @Json("Methods")
    val methods: List<SparseMethod>,
    @Json("SuperInterfaces")
    val superInterfaces: List<SparseTypeReference>,
    @Json("GenericParameters")
    override val genericParameters: List<SparseGenericParameter>?,
    @Json("Traits")
    val traits: List<Trait>
): SparseEntity("Interface"), IDirectProjectable<SparseInterface>{
    override fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseInterface {
        return this.copy(
            methods = methods.map { it.projectType(typeVariable, newTypeReference) },
            superInterfaces = superInterfaces.map { it.projectType(typeVariable, newTypeReference) },
            genericParameters = genericParameters!!.map { it.projectType(typeVariable, newTypeReference) }
        )
    }

    override fun withName(newName: String): SparseInterface {
        return copy(name = newName)
    }

    override fun withProjectedName(): SparseInterface {
        return withName(asTypeReference().getProjectedName())
    }

    override fun asTypeReference(): SparseTypeReference {
        return SparseTypeReference(
            name,
            namespace,
            genericParameters
        )
    }

    fun sparseSuperInterfaces(): List<SparseInterface> {
        return superInterfaces
            .map(lookUpTypeReference)
            .filterIsInstance<SparseInterface>()
    }

    fun projectAll() : SparseInterface {
        val projectedInterface = genericParameters?.fold(this) { acc, sparseGenericParameter ->
            acc.projectType(sparseGenericParameter.name, sparseGenericParameter.type!!)
        }?.withProjectedName()
        if (projectedInterface != null) {
            return projectedInterface
        }
        return this
    }
}

