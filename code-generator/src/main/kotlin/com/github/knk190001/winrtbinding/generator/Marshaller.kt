@file:Suppress("DuplicatedCode")

package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.SparseParameter
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.asClassName
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT.HANDLE
import kotlin.reflect.KClass

object Marshaller {
    val default: IMarshalGenerator = IdentityMarshalGenerator

    val marshals = mapOf(
        String::class to StringMarshalGenerator,
        Boolean::class to BooleanMarshalGenerator,
    )

    val marshalsEx = mapOf(
        String::class to StringMarshalGenerator,
        Boolean::class to BooleanMarshalGenerator,
        WinRTInterface::class to InterfaceMarshalGenerator,
        WinRTClass::class to ClassMarshalGenerator,
        WinRTGenericInterface::class to InterfaceMarshalGenerator,
        WinRTDelegate::class to DelegateMarshalGenerator,
        WinRTGenericDelegate::class to GenericDelegateMarshalGenerator,
        Nothing::class to IdentityMarshalGenerator
    )



    fun marshalVariablesFromNative(parameters: List<SparseParameter>, codeBlock: CodeBlock.Builder): List<String> =
        with(codeBlock) {
            val variableNames = parameters.map(SparseParameter::name)
            val types = parameters.map(SparseParameter::type)

            val marshals = types
                .map(SparseTypeReference::asKClass)
                .map { kClass ->
                    marshalsEx[kClass] ?: default
                }


            val (names, codeBlocks) = marshals.zip(variableNames)
                .zip(types) { (marshal, varName), type ->
                    Triple(marshal, varName, type)
                }
                .map {
                    val (marshal, varName, type) = it
                    marshal.generateFromNativeMarshalCode(varName, type)
                }.unzip()

            codeBlocks.forEach(::add)

            return names
        }

    fun marshalVariablesToNative(parameters: List<SparseParameter>, codeBlock: CodeBlock.Builder): List<String> =
        with(codeBlock) {
            val variableNames = parameters.map(SparseParameter::name)
            val types = parameters.map(SparseParameter::type)

            val marshals = types
                .map(SparseTypeReference::asKClass)
                .map { kClass ->
                    marshalsEx[kClass] ?: default
                }


            val (names, codeBlocks) = marshals.zip(variableNames)
                .zip(types) { (marshal, varName), type ->
                    Triple(marshal, varName, type)
                }
                .map {
                    val (marshal, varName, type) = it
                    marshal.generateToNativeMarshalCode(varName, type)
                }.unzip()

            codeBlocks.forEach(::add)

            return names
        }
}

interface IMarshalGenerator {
    fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference? = null): Pair<String, CodeBlock>
    fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference? = null): Pair<String, CodeBlock>

    val nativeType: ClassName
    val managedType: KClass<*>
}

object StringMarshalGenerator : IMarshalGenerator {
    override val nativeType = HANDLE::class.asClassName()
    override val managedType = String::class
    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        val cb = CodeBlock.builder()
        cb.apply {
            addStatement("val ${varName}_Native = $varName!!.toHandle()")
        }
        return "${varName}_Native" to cb.build()
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        val cb = CodeBlock.builder()
        cb.apply {
            addStatement("val ${varName}_Managed = $varName.handleToString()")
        }
        return "${varName}_Managed" to cb.build()
    }

}


object BooleanMarshalGenerator : IMarshalGenerator {
    override val nativeType = Byte::class.asClassName()
    override val managedType = Boolean::class
    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        val cb = CodeBlock.builder()
        cb.apply {
            addStatement("val ${varName}_Native: Byte = if($varName) 1 else 0 ")
        }
        return "${varName}_Native" to cb.build()
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        val cb = CodeBlock.builder()
        cb.apply {
            addStatement("val ${varName}_Managed = $varName != 0.toByte()")
        }
        return "${varName}_Managed" to cb.build()
    }

}

object IdentityMarshalGenerator : IMarshalGenerator {
    override val managedType = Any::class
    override val nativeType = Any::class.asClassName()

    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        return varName to CodeBlock.of("")
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        return varName to CodeBlock.of("")
    }

}

interface IPtrMarshalGenerator: IMarshalGenerator

object InterfaceMarshalGenerator : IPtrMarshalGenerator {
    override val nativeType = Pointer::class.asClassName()
    override val managedType = Any::class

    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Native"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = ${varName}!!.toNative() as Pointer")
        }.build()
        return newVariableName to cb
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Managed"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = %T.ABI.make%T($varName)", type.asClassName(),type.asGenericTypeParameter())
        }.build()

        return newVariableName to cb
    }

}

object ClassMarshalGenerator : IPtrMarshalGenerator {
    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Native"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = ${varName}.toNative() as Pointer")
        }.build()
        return newVariableName to cb
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Managed"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = %T($varName)", type.asClassName())
        }.build()

        return newVariableName to cb
    }

    override val nativeType: ClassName = Pointer::class.asClassName()
    override val managedType: KClass<*> = Any::class
}

object DelegateMarshalGenerator : IPtrMarshalGenerator {
    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        return varName to CodeBlock.of("")
    }

    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Managed"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = %T($varName)", type.asClassName())
        }.build()
        return newVariableName to cb
    }

    override val nativeType: ClassName = Pointer::class.asClassName()
    override val managedType: KClass<*> = Any::class
}

object GenericDelegateMarshalGenerator : IPtrMarshalGenerator {
    override fun generateToNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        return varName to CodeBlock.of("")
    }
    override fun generateFromNativeMarshalCode(varName: String, type: SparseTypeReference?): Pair<String, CodeBlock> {
        if (type == null) return varName to CodeBlock.of("")
        val newVariableName = "${varName}_Managed"
        val cb = CodeBlock.builder().apply {
            addStatement("val $newVariableName = %T(typeOf<%T>(),$varName)", type.asClassName(), type.asGenericTypeParameter())
        }.build()
        return newVariableName to cb
    }

    override val nativeType: ClassName = Pointer::class.asClassName()
    override val managedType: KClass<*> = Any::class
}



object WinRTInterface
object WinRTClass
object WinRTGenericInterface
object WinRTDelegate
object WinRTGenericDelegate
object WinRTTypeVariable
object WinRTStruct
object WinRTEnum