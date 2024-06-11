package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseField
import com.github.knk190001.winrtbinding.generator.model.entities.SparseStruct
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IStructABI
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmField
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.*

fun generateStruct(sparseStruct: SparseStruct) = FileSpec.builder(sparseStruct.namespace, sparseStruct.name).apply {
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    val type = TypeSpec.classBuilder(sparseStruct.name).apply {
        addModifiers(KModifier.OPEN)
        addABIAnnotation(sparseStruct.asTypeReference().asClassName(false))
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

        val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
            .addMember("brClass = %L.ByReference::class", sparseStruct.name)
            .build()
        addAnnotation(brAnnotationSpec)

        addByReferenceType(sparseStruct, ptrParameterSpec)
        addByValueType(sparseStruct, ptrParameterSpec)

        primaryConstructor(constructor)
        addSuperclassConstructorParameter("ptr")

        addABI(sparseStruct)
    }.build()
    addType(type)
}.build()

private fun TypeSpec.Builder.addByValueType(
    sparseStruct: SparseStruct,
    ptrParameterSpec: ParameterSpec
) {
    val byValue = TypeSpec.classBuilder("ByValue").apply {
        superclass(ClassName(sparseStruct.namespace, sparseStruct.name))
        addSuperinterface(Structure.ByValue::class)
        val constructorSpec = FunSpec.constructorBuilder().apply {
            addParameter(ptrParameterSpec)
        }.build()
        primaryConstructor(constructorSpec)
        addSuperclassConstructorParameter("ptr")
    }.build()
    addType(byValue)
}

private fun TypeSpec.Builder.addByReferenceType(
    sparseStruct: SparseStruct,
    ptrParameterSpec: ParameterSpec
) {
    val byReference = TypeSpec.classBuilder("ByReference").apply {
        superclass(sparseStruct.asTypeReference().asClassName(false))
        addSuperinterface(Structure.ByReference::class)
        addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("", sparseStruct.name)))
        val constructorSpec = FunSpec.constructorBuilder().apply {
            addParameter(ptrParameterSpec)
        }.build()
        primaryConstructor(constructorSpec)
        addSuperclassConstructorParameter("ptr")


        val getValueFn = FunSpec.builder("getValue").apply {
            addModifiers(KModifier.OVERRIDE)
            addCode("return this")
            returns(ClassName(sparseStruct.namespace, sparseStruct.name))
        }.build()
        addFunction(getValueFn)
    }.build()
    addType(byReference)
}

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
    else it.type.asTypeName(nullable = it.type.isNullable())
    return PropertySpec.builder(it.name, type).apply {
        if (it.type.isUnsigned()) {
            getter(FunSpec.getterBuilder().addStatement("return ${it.name}_Internal.${it.type.nativeToManagedUnsigned()}").build())
            setter(FunSpec.setterBuilder().apply {
                addParameter("value", it.type.foreignType())
                addStatement("${it.name}_Internal = value.${it.type.managedToNativeUnsigned()}")
            }.build())
        }  else {
            jvmField()
            initializer(it.type.defaultValue())
        }
        mutable()
    }.build()
}

private fun SparseTypeReference.isString() = isSystemType() && name == "String"

private fun SparseTypeReference.isUnsigned() = isSystemType() && name.startsWith("UInt")

private fun SparseTypeReference.defaultValue() = when (name) {
    "Boolean" -> "false"
    "Char" -> "'\\0'"
    "Byte", "Int16", "Int32", "Int64" -> "0"
    "Double" -> "0.0"
    "Single" -> "0.0f"
    else -> "null"
}

private fun SparseTypeReference.nativeToManagedUnsigned() = when (name) {
    "UInt8" -> "toUByte()"
    "UInt16" -> "toUShort()"
    "UInt32" -> "toUInt()"
    "UInt64" -> "toULong()"
    else -> throw IllegalArgumentException("Unsupported unsigned type $name")
}

private fun SparseTypeReference.managedToNativeUnsigned() = when (name) {
    "UInt8" -> "toByte()"
    "UInt16" -> "toShort()"
    "UInt32" -> "toInt()"
    "UInt64" -> "toLong()"
    else -> throw IllegalArgumentException("Unsupported unsigned type $name")
}

private fun TypeSpec.Builder.addABI(sparseStruct: SparseStruct) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IStructABI::class.asClassName().parameterizedBy(
                sparseStruct.asTypeReference().asClassName(false)
            )
        )
        addByValue(sparseStruct)
        addFromNative(sparseStruct)
        addToNative(sparseStruct)
        addLayout(sparseStruct)
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.addByValue(sparseStruct: SparseStruct) {
    val byValue = FunSpec.builder("byValue").apply {
        addModifiers(KModifier.OVERRIDE)
        val type = sparseStruct.asTypeReference().asClassName(structByValue = false)
        addParameter("struct", type)
        addCode(buildCodeBlock {
            addStatement("return ByValue(struct.pointer)")
        })
        returns(type)
    }.build()
    addFunction(byValue)
}

private fun TypeSpec.Builder.addToNative(sparseStruct: SparseStruct) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseStruct.asTypeReference().asClassName(structByValue = false))
        returns(MemorySegment::class)
        addStatement("obj.write()")
        addStatement("val address  = %T.ofLong(Pointer.nativeValue(obj.pointer))", MemoryAddress::class)
        addStatement("return %T.ofAddress(address, layout.byteSize(), %T.global())", MemorySegment::class, MemorySession::class)
    }.build()
    addFunction(toNative)
}
private fun TypeSpec.Builder.addLayout(sparseStruct: SparseStruct) {
    val layout = PropertySpec.builder("layout", GroupLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        val initializerCb = CodeBlock.builder().apply {
            addStatement("%T.structLayout(", MemoryLayout::class)
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
        val className = sparseStruct.asTypeReference().asClassName(structByValue = false)
        returns(className)
        addStatement("val address = segment.address().toRawLongValue()")
        addStatement("val struct = %T(%T(address))".fixSpaces(), className, Pointer::class)
        addStatement("struct.read()")
        addStatement("return struct ")
    }.build()
    addFunction(fromNative)
}
