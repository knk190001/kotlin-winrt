package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseField
import com.github.knk190001.winrtbinding.generator.model.entities.SparseStruct
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmField
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

fun generateStruct(sparseStruct: SparseStruct) = FileSpec.builder(sparseStruct.namespace, sparseStruct.name).apply {
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    val type = TypeSpec.classBuilder(sparseStruct.name).apply {
        addModifiers(KModifier.OPEN)
        addABIAnnotation(sparseStruct.asTypeReference().asClassName(false))
        addSignatureAnnotation(sparseStruct)

        val fields = sparseStruct.fields.sortedBy {
            it.index
        }

        val fieldOrderAnnotation = AnnotationSpec.builder(FieldOrder::class).apply {
            addMember("%S", fields.joinToString { it.name })
        }.build()
        addAnnotation(fieldOrderAnnotation)


        fields.map {
            PropertySpec.builder(it.name, it.type.asGenericTypeParameter().copy(true))
                .jvmField()
                .initializer("null")
                .mutable()
                .build()
        }.forEach(::addProperty)

        superclass(Structure::class)
        val ptrParameterSpec = ParameterSpec.builder("ptr", Pointer::class.asClassName().copy(true))
            .defaultValue("%T.NULL", Pointer::class)
            .build()
        val constructor = FunSpec.constructorBuilder()
            .addParameter(ptrParameterSpec)
            .build()

        val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
            .addMember("brClass = %L.ByReference::class", sparseStruct.name)
            .build()
        addAnnotation(brAnnotationSpec)

        val byReference = TypeSpec.classBuilder("ByReference").apply {
            superclass(ClassName(sparseStruct.namespace,sparseStruct.name))
            addSuperinterface(Structure.ByReference::class)
            addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("",sparseStruct.name)))


            val getValueFn = FunSpec.builder("getValue").apply {
                addModifiers(KModifier.OVERRIDE)
                addCode("return this")
                returns(ClassName(sparseStruct.namespace,sparseStruct.name))
            }.build()
            addFunction(getValueFn)
        }.build()

        val byValue = TypeSpec.classBuilder("ByValue").apply {
            superclass(ClassName(sparseStruct.namespace,sparseStruct.name))
            addSuperinterface(Structure.ByValue::class)
            val constructorSpec = FunSpec.constructorBuilder().apply {
                addParameter(ptrParameterSpec)
            }.build()
            primaryConstructor(constructorSpec)
            addSuperclassConstructorParameter("ptr")
        }.build()

        addType(byReference)
        addType(byValue)
        primaryConstructor(constructor)
        addSuperclassConstructorParameter("ptr")

        addABI(sparseStruct)
    }.build()
    addType(type)
}.build()

private fun TypeSpec.Builder.addABI(sparseStruct: SparseStruct) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseStruct.asTypeReference().asClassName(),
                MemorySegment::class.asClassName()
            )
        )
        addFromNative(sparseStruct)
        addToNative(sparseStruct)
        addLayout(sparseStruct)
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.addToNative(sparseStruct: SparseStruct) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseStruct.asTypeReference().asClassName())
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
        val className = sparseStruct.asTypeReference().asClassName()
        returns(className)
        addStatement("val address = segment.address().toRawLongValue()")
        addStatement("return %T(%T(address))".fixSpaces(), className, Pointer::class)
    }.build()
    addFunction(fromNative)

    val fromNativeProperty = PropertySpec.builder("fromNativeHandle", MethodHandle::class).apply {
        val initializerCb = CodeBlock.builder().apply {
            addStatement("%T.lookup().findStatic(%T::class.java, %S, %T.methodType(%T::class.java, %T::class.java))",
                MethodHandles::class, ClassName("",sparseStruct.name), "fromNative", MethodType::class, sparseStruct.asTypeReference().asClassName() ,MemorySegment::class)
        }.build()
        initializer(initializerCb)
    }.build()
    addProperty(fromNativeProperty)
}
