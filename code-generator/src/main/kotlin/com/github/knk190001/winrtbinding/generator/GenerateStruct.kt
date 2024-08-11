package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseField
import com.github.knk190001.winrtbinding.generator.model.entities.SparseStruct
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmField
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemorySegment

fun generateStruct(sparseStruct: SparseStruct) = FileSpec.builder(sparseStruct.namespace, sparseStruct.name).apply {
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    val type = TypeSpec.classBuilder(sparseStruct.name).apply {
        addModifiers(KModifier.OPEN)
        addABIAnnotation(sparseStruct.asClassName(false))
        addSignatureAnnotation(sparseStruct)

        val fields = sparseStruct.fields.sortedBy { it.index }
        addFieldOrderAnnotation(fields)
        fields
            .map(::generateFieldProperty)
            .forEach(::addProperty)
        fields
            .filter { it.type.isUnsigned() }
            .map(::generateUnsignedBackingFields)
            .forEach(::addProperty)

        superclass(Structure::class)
        val ptrParameterSpec = ParameterSpec.builder("ptr", nullablePtr)
            .defaultValue("%T.NULL", Pointer::class)
            .build()
        val constructor = FunSpec.constructorBuilder()
            .addParameter(ptrParameterSpec)
            .build()

        addABI(sparseStruct)

        primaryConstructor(constructor)
        addSuperclassConstructorParameter("ptr")
    }.build()
    addType(type)
}.build()

private fun TypeSpec.Builder.addFieldOrderAnnotation(fields: List<SparseField>) {
    val fieldOrderAnnotation = AnnotationSpec.builder(FieldOrder::class).apply {
        addMember(fields.map {
            if (it.type.isUnsigned()) {
                "${it.name}_Internal"
            } else {
                it.name
            }
        }.joinToString { "\"$it\"" })
    }.build()
    addAnnotation(fieldOrderAnnotation)
}

fun generateUnsignedBackingFields(sparseField: SparseField): PropertySpec {
    val spec = PropertySpec.builder("${sparseField.name}_Internal", sparseField.type.foreignType()).apply {
        jvmField()
        mutable()
        addModifiers(KModifier.INTERNAL)
        initializer("0")
    }.build()
    return spec
}

private fun generateFieldProperty(it: SparseField): PropertySpec {
    val type = if (it.type.isString()) HANDLE::class.asClassName().copy(true)
    else it.type.asTypeName(nullable = it.type.defaultValue() == "null" && !it.type.isUnsigned())
    return PropertySpec.builder(it.name, type).apply {
        if (it.type.isUnsigned()) {
            getter(
                FunSpec.getterBuilder().addStatement("return ${it.name}_Internal.${it.type.nativeToManagedUnsigned()}")
                    .build()
            )
            setter(FunSpec.setterBuilder().apply {
                addParameter("value", it.type.foreignType())
                addStatement("${it.name}_Internal = value.${it.type.managedToNativeUnsigned()}")
            }.build())
        } else {
            jvmField()
            initializer(it.type.defaultValue())
        }
        mutable()
    }.build()
}

private fun SparseTypeReference.isString() = isSystemType() && name == "String"

private fun SparseTypeReference.isUnsigned() = isSystemType() && name.startsWith("UInt") || name == "Byte"

private fun SparseTypeReference.defaultValue() = when (name) {
    "Boolean" -> "false"
    "Char" -> "'\\0'"
    "Byte", "Int16", "Int32", "Int64" -> "0"
    "Double" -> "0.0"
    "Single" -> "0.0f"
    else -> "null"
}

private fun SparseTypeReference.nativeToManagedUnsigned() = when (name) {
    "Byte" -> "toUByte()"
    "UInt16" -> "toUShort()"
    "UInt32" -> "toUInt()"
    "UInt64" -> "toULong()"
    else -> throw IllegalArgumentException("Unsupported unsigned type $name")
}

private fun SparseTypeReference.managedToNativeUnsigned() = when (name) {
    "Byte" -> "toByte()"
    "UInt16" -> "toShort()"
    "UInt32" -> "toInt()"
    "UInt64" -> "toLong()"
    else -> throw IllegalArgumentException("Unsupported unsigned type $name")
}

private fun TypeSpec.Builder.addABI(sparseStruct: SparseStruct) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseStruct.asClassName(false),
                MemorySegment::class.asClassName()
            )
        )
        addFromNative(sparseStruct)
        addParameterToNative(sparseStruct)
        addLayout(sparseStruct)
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.addParameterToNative(sparseStruct: SparseStruct) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseStruct.asClassName(structByValue = false))
        returns(MemorySegment::class)
        addStatement("obj.write()")
        addStatement("val address = %T.nativeValue(obj.pointer)", Pointer::class)
        addStatement("return %T.ofAddress(address).reinterpret(layout.byteSize())", MemorySegment::class)
    }.build()
    addFunction(toNative)
}

private fun TypeSpec.Builder.addLayout(sparseStruct: SparseStruct) {
    val layout = PropertySpec.builder("layout", GroupLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        val initializerCb = CodeBlock.builder().apply {
            val structLayoutWithPadding = MemberName(
                "com.github.knk190001.winrtbinding.runtime",
                "structLayoutWithPadding"
            )
            addStatement("%M(", structLayoutWithPadding)
            indent()
            sparseStruct.fields
                .map(SparseField::type)
                .forEach {
                    add(it.valueLayout())
                    addStatement(", ")
                }
            unindent()
            addStatement(")")
        }.build()
        initializer(initializerCb)
    }.build()
    addProperty(layout)
}

private fun TypeSpec.Builder.addFromNative(sparseStruct: SparseStruct) {
    val fromNative = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("segment", MemorySegment::class)
        val className = sparseStruct.asClassName(structByValue = false)
        returns(className)
        addStatement("val struct = %T(%T(segment.address()))".fixSpaces(), className, Pointer::class)
        addStatement("struct.read()")
        addStatement("return struct ")
    }.build()
    addFunction(fromNative)
}
