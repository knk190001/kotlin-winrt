package com.github.knk190001.winrtbinding.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import com.sun.jna.ptr.ByReference
import com.github.knk190001.winrtbinding.generator.model.entities.SparseEnum
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.squareup.kotlinpoet.MemberName.Companion.member
import java.lang.foreign.ValueLayout

fun generateEnum(sEnum : SparseEnum): FileSpec {
    val fileSpec = FileSpec.builder(sEnum.namespace, sEnum.name)
    val type = TypeSpec.enumBuilder(sEnum.name).apply {
        addABIAnnotation(sEnum.asTypeReference().asClassName())
        addSignatureAnnotation(sEnum)
        addSuperinterface(NativeMapped::class)
        primaryConstructor(
            FunSpec.constructorBuilder().apply {
                addParameter("value",Int::class)
            }.build()
        )

        sEnum.values.entries.map {
            it.key to TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter(it.value.toString())
                .build()
        }.forEach {
            addEnumConstant(it.first,it.second)
        }

        val fromNativeSpec = FunSpec.builder("fromNative").apply {
            addModifiers(KModifier.OVERRIDE)
            addParameter("nativeValue", ClassName("","kotlin.Any").copy(true))
            addParameter("context", FromNativeContext::class.asClassName().copy(true))
            returns(ClassName(sEnum.namespace, sEnum.name))

            val cb = CodeBlock.builder().apply {
                addStatement("if (nativeValue !is Int) throw %T()", IllegalArgumentException::class)
                beginControlFlow("return when(nativeValue) ")
                sEnum.values.entries.forEach {
                    addStatement("${it.value} -> ${it.key}")
                }
                addStatement("else -> throw %T()", IllegalArgumentException::class)
                endControlFlow()
            }.build()

            addCode(cb)
        }.build()

        val toNativeSpec = FunSpec.builder("toNative").apply {
            addModifiers(KModifier.OVERRIDE)
            returns(Int::class)
            addCode(CodeBlock.of("return this.value"))
        }.build()



        val nativeTypeSpec = FunSpec.builder("nativeType").apply {
            addModifiers(KModifier.OVERRIDE)
            returns(ClassName("","java.lang.Class").parameterizedBy(STAR))
            addCode("return %T::class.java",Integer::class.java)
        }.build()

        val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
            .addMember("brClass = %L.ByReference::class", sEnum.name)
            .build()
        addAnnotation(brAnnotationSpec)

        val byRefSpec = TypeSpec.classBuilder("ByReference").apply {
            superclass(ByReference::class)
            addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("",sEnum.name)))
            addSuperclassConstructorParameter("4")
            val setValueSpec = FunSpec.builder("setValue").apply {
                addParameter("newValue",ClassName(sEnum.namespace,sEnum.name))
                addCode("pointer.setInt(0, newValue.value)")
            }.build()

            val getValueSpec = FunSpec.builder("getValue").apply {
                addModifiers(KModifier.OVERRIDE)
                returns(ClassName(sEnum.namespace,sEnum.name))
                addCode("return ${sEnum.name}.values()[0].fromNative(this.pointer.getInt(0), null)")
            }.build()

            addFunction(setValueSpec)
            addFunction(getValueSpec)
        }.build()

        addFunction(fromNativeSpec)
        addFunction(toNativeSpec)
        addFunction(nativeTypeSpec)
        addProperty(PropertySpec.builder("value",Int::class).initializer("value").build())
        addType(byRefSpec)
        generateABI(sEnum)
    }.build()
    fileSpec.addType(type)
    return fileSpec.build()
}

private fun TypeSpec.Builder.generateABI(sparseEnum: SparseEnum) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseEnum.asTypeReference().asClassName(),
                Int::class.asClassName()
            )
        )
        addFromNative(sparseEnum)
        addLayoutProperty()
        addToNative(sparseEnum)
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.addToNative(sparseEnum: SparseEnum) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", sparseEnum.asTypeReference().asClassName())
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
    val fromNative = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("value", Int::class)
        addStatement("return ${sparseEnum.name}.values()[0].fromNative(value, null)".fixSpaces())
        returns(sparseEnum.asTypeReference().asClassName())
    }.build()
    addFunction(fromNative)
}
