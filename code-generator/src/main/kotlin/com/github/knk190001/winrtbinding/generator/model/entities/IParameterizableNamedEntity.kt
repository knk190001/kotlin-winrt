package com.github.knk190001.winrtbinding.generator.model.entities

interface IParameterizableNamedEntity: INamedEntity {
    val originalName: String
    override val name: String
        get() = originalName.substringBefore("`")
}