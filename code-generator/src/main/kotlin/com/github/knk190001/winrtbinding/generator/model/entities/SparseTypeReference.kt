package com.github.knk190001.winrtbinding.generator.model.entities

import com.beust.klaxon.Json

data class SparseTypeReference(
    @Json("Name")
    override val originalName : String,
    @Json("Namespace")
    override val namespace: String,
    @Json("GenericParameters")
    val genericParameters: List<SparseGenericParameter>? = null,
    @Json("IsArray")
    val isArray: Boolean = false,
    @Json("IsReference")
    val isReference: Boolean = false
): IParameterizableNamedEntity {
    val isGeneric = genericParameters != null

    fun projectType(typeVariable: String, newTypeReference: SparseTypeReference): SparseTypeReference {
        if (name == typeVariable) {
            return newTypeReference.copy(isArray = isArray, isReference = isReference)
        }
        return copy(genericParameters = genericParameters?.map {
            it.projectType(typeVariable, newTypeReference)
        })
    }

    fun isClosed(): Boolean {
        return !isGeneric || genericParameters!!.all {
            it.type != null && !it.type.isTypeParameter() && it.type.isClosed()
        }
    }

    fun hasActualizedGenericParameter(): Boolean {
        if (!isGeneric) return false
        return genericParameters!!.none {
            it.type == null || it.type.namespace == ""
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is INamedEntity) {
            return false
        }
        return name == other.name && namespace == other.namespace
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + namespace.hashCode()
        result = 31 * result + (genericParameters?.hashCode() ?: 0)
        return result
    }

    fun isSystemType(): Boolean {
        return namespace == "System" && name != "Object"
    }
    fun isSystemTypeOrObject(): Boolean {
        return namespace == "System"
    }

    fun isPrimitiveSystemType(): Boolean {
        return isSystemType() && name != "String" && name != "Guid" && !isArray
    }

    fun isTypeParameter(): Boolean {
        return namespace.isEmpty()
    }

    fun hasTypeParameter(): Boolean {
        return isTypeParameter() || (genericParameters?.any { it.type?.hasTypeParameter() == true } == true)
    }

    override fun asTypeReference() = this
}
