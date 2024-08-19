package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseField
import com.github.knk190001.winrtbinding.generator.model.entities.SparseStruct
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.lang.foreign.Arena
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.invoke.MethodHandle
import java.lang.invoke.VarHandle

fun generateStruct(sparseStruct: SparseStruct): FileSpec {
    return FileSpec.builder(sparseStruct.namespace, sparseStruct.name).apply {
        indent("    ")
        addImports()
        val typeSpec = TypeSpec.classBuilder(sparseStruct.name).apply {
            addAnnotations(sparseStruct)
            addConstructor()
            addAllocatingConstructor()
            addProperties(sparseStruct)
            addSegmentProperty()
            addABI(sparseStruct)
        }.build()
        addType(typeSpec)
    }.build()
}

private fun TypeSpec.Builder.addAnnotations(sparseStruct: SparseStruct) {
    val abiAnnotationSpec = AnnotationSpec.builder(ABIMarker::class).apply {
        addMember("%T::class", sparseStruct.abiClassName())
    }.build()
    addAnnotation(abiAnnotationSpec)

    val signatureAnnotationSpec = AnnotationSpec.builder(Signature::class).apply {
        addMember("%S", GuidGenerator.getSignature(sparseStruct.asTypeReference(), lookUpTypeReference))
    }.build()
    addAnnotation(signatureAnnotationSpec)
}

private fun TypeSpec.Builder.addAllocatingConstructor() {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        callThisConstructor(CodeBlock.of("%T.ofAuto().allocate(ABI.layout.byteSize())", Arena::class))
    }.build()
    addFunction(constructorSpec)
}

private fun FileSpec.Builder.addImports() {
    addImport(
        "com.github.knk190001.winrtbinding.runtime",
        "structLayoutWithPadding"
    )
    addImport("kotlin.reflect", "typeOf")
}

private fun TypeSpec.Builder.addABI(sparseStruct: SparseStruct) {
    val abiSpec = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseStruct.asTypeName(), MemorySegment::class.asTypeName()
            )
        )
        addLayout(sparseStruct)
        addPropertyHandles(sparseStruct)
        addFromNative(sparseStruct)
        addToNative(sparseStruct)
    }.build()
    addType(abiSpec)
}

private fun TypeSpec.Builder.addToNative(sparseStruct: SparseStruct) {
    val toNativeSpec = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseStruct.asTypeName())
        returns(MemorySegment::class)
        addStatement("return obj.segment")
    }.build()
    addFunction(toNativeSpec)
}

private fun TypeSpec.Builder.addFromNative(sparseStruct: SparseStruct) {
    val fromNativeSpec = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("segment", MemorySegment::class)
        returns(sparseStruct.asTypeName())
        addStatement("return %T(segment)", sparseStruct.asTypeName())
    }.build()
    addFunction(fromNativeSpec)
}

private fun TypeSpec.Builder.addPropertyHandles(sparseStruct: SparseStruct) {
    sparseStruct.fields.forEach {
        val handleType = when (lookupTypeReferenceSafe(it.type)) {
            is SparseStruct -> MethodHandle::class
            else -> VarHandle::class
        }

        val handleMethod = when (lookupTypeReferenceSafe(it.type)) {
            is SparseStruct -> "sliceHandle"
            else -> "varHandle"
        }

        val handleSpec = PropertySpec.builder("${it.name}_Handle", handleType, KModifier.INTERNAL).apply {
            initializer(buildCodeBlock {
                addStatement("layout.$handleMethod(")
                indent()
                addStatement("%T.groupElement(%S)", MemoryLayout.PathElement::class, it.name)
                unindent()
                add(")")
            })
        }.build()
        addProperty(handleSpec)
    }
}

private fun TypeSpec.Builder.addLayout(sparseDelegate: SparseStruct) {
    val layoutPropertySpec = PropertySpec.builder("layout", GroupLayout::class, KModifier.OVERRIDE).apply {
        initializer(buildCodeBlock {
            addStatement("structLayoutWithPadding(")
            indent()
            sparseDelegate.fields.forEach {
                add(it.type.valueLayout())
                addStatement(".withName(%S),", it.name)
            }
            unindent()
            addStatement(")")
        })
    }.build()
    addProperty(layoutPropertySpec)
}

private fun TypeSpec.Builder.addSegmentProperty() {
    val segmentPropertySpec = PropertySpec.builder("segment", MemorySegment::class).apply {
        initializer("segment.reinterpret(ABI.layout.byteSize())")
    }.build()
    addProperty(segmentPropertySpec)
}

private fun TypeSpec.Builder.addProperties(sparseStruct: SparseStruct) {
    sparseStruct.fields.forEach {
        val propertySpec = PropertySpec.builder(it.name, it.type.asTypeName()).apply {
            mutable()
            when (lookupTypeReferenceSafe(it.type)) {
                is SparseStruct -> addStructProperty(sparseStruct, it)
                else -> if (it.type.fullName() == "Windows.Foundation.IReference") {
                    addReferenceProperty(it)
                } else {
                    addNormalProperty(sparseStruct, it)
                }
            }
        }.build()
        addProperty(propertySpec)
    }
}

private fun PropertySpec.Builder.addReferenceProperty(it: SparseField) {
    val getterSpec = FunSpec.getterBuilder().apply {
        addStatement(
            "return %T.fromNative(typeOf<%T>(), ABI.${it.name}_Handle.get(segment, 0L) as %T) as %T",
            it.type.abiClassName(),
            it.type.asTypeName(nullable = it.type.isNullable()),
            it.type.foreignType(),
            it.type.asTypeName()
        )
    }.build()
    getter(getterSpec)

    val setterSpec = FunSpec.setterBuilder().apply {
        addParameter("value", it.type.asTypeName())
        addStatement("ABI.${it.name}_Handle.set(segment, 0L, %T.toNative(value))", it.type.abiClassName())
    }.build()
    setter(setterSpec)
}

private fun ClassName.fullyQualifiedIfConflictsWithField(sparseStruct: SparseStruct): ClassName {
    if (sparseStruct.fields.any { field -> field.name == simpleNames.last { it != "ABI" } }) {
        return fullyQualified()
    }
    return this
}

private fun PropertySpec.Builder.addNormalProperty(sparseStruct: SparseStruct, it: SparseField) {
    val abiClassName = it.type.abiClassName().fullyQualifiedIfConflictsWithField(sparseStruct)
    val getterSpec = FunSpec.getterBuilder().apply {
        addStatement(
            "return %T.fromNative(ABI.${it.name}_Handle.get(segment, 0L) as %T)",
            abiClassName,
            it.type.foreignType()
        )
    }.build()
    getter(getterSpec)

    val setterSpec = FunSpec.setterBuilder().apply {
        addParameter("value", it.type.asTypeName())
        addStatement("ABI.${it.name}_Handle.set(segment, 0L, %T.toNative(value))", abiClassName)
    }.build()
    setter(setterSpec)
}

private fun PropertySpec.Builder.addStructProperty(sparseStruct: SparseStruct, it: SparseField) {
    val abiClassName = it.type.abiClassName().fullyQualifiedIfConflictsWithField(sparseStruct)
    val getterSpec = FunSpec.getterBuilder().apply {
        addStatement(
            "return %T.fromNative(ABI.${it.name}_Handle.invoke(segment, 0L) as %T)",
            abiClassName,
            it.type.foreignType()
        )
    }.build()
    getter(getterSpec)

    val setterSpec = FunSpec.setterBuilder().apply {
        addParameter("value", it.type.asTypeName())
        addStatement(
            "%T.copyTo(value, ABI.${it.name}_Handle.invoke(segment, 0L) as %T)",
            abiClassName,
            it.type.foreignType()
        )
    }.build()
    setter(setterSpec)
}

private fun TypeSpec.Builder.addConstructor() {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        addModifiers(KModifier.PRIVATE)
        addParameter("segment", MemorySegment::class)
    }.build()
    primaryConstructor(constructorSpec)
}

