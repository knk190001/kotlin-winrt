package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseEnum
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.lang.foreign.ValueLayout

fun generateEnum(sEnum : SparseEnum): FileSpec {
    return sEnum.fileSpec {
        val type = TypeSpec.enumBuilder(sEnum.name).apply {
            addABIAnnotation(sEnum.asClassName())
            addSignatureAnnotation(sEnum)
            addPrimaryConstructor()
            addEnumValues(sEnum)
            addValueProperty()
            generateABI(sEnum)
        }.build()
        addType(type)
    }
}

private fun TypeSpec.Builder.addPrimaryConstructor() {
    val ctor = FunSpec.constructorBuilder().apply {
        addParameter("value", Int::class)
    }.build()
    primaryConstructor(ctor)
}

private fun TypeSpec.Builder.addValueProperty() {
    val valueProperty = PropertySpec.builder("value", Int::class)
        .initializer("value")
        .build()
    addProperty(valueProperty)
}

private fun TypeSpec.Builder.addEnumValues(sEnum: SparseEnum) {
    sEnum.values.entries.map {
        it.key to TypeSpec.anonymousClassBuilder()
            .addSuperclassConstructorParameter(it.value.toString())
            .build()
    }.forEach {
        addEnumConstant(it.first, it.second)
    }
}

private fun TypeSpec.Builder.generateABI(sparseEnum: SparseEnum) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseEnum.asClassName(),
                Int::class.asClassName()
            )
        )
        addFromNative(sparseEnum)
        addLayoutProperty()
        addParameterToNative(sparseEnum)
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.addParameterToNative(sparseEnum: SparseEnum) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseEnum.asClassName())
        returns(Int::class)
        addStatement("return obj.value")
    }.build()
    addFunction(toNative)
}

private fun TypeSpec.Builder.addLayoutProperty() {
    val layoutProperty  = PropertySpec.builder("layout", ValueLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%M", ValueLayout::class.asClassName().member("JAVA_INT"))
    }.build()
    addProperty(layoutProperty)
}

private fun TypeSpec.Builder.addFromNative(sparseEnum: SparseEnum) {
    val fromNativeSpec = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", INT)
        returns(ClassName(sparseEnum.namespace, sparseEnum.name))

        val cb = CodeBlock.builder().apply {
            beginControlFlow("return when(obj) ")
            sparseEnum.values.entries.forEach {
                addStatement("${it.value} -> ${it.key}")
            }
            addStatement("else -> throw %T()", IllegalArgumentException::class)
            endControlFlow()
        }.build()

        addCode(cb)
    }.build()
    addFunction(fromNativeSpec)
}
