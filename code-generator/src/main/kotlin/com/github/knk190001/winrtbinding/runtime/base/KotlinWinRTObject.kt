package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.annotations.ReceiveArray
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.jvmErasure

open class KotlinWinRTObject : PointerType() {
    private val vtbls = mutableListOf<Memory>()

    fun initObj() {
        val annotation = this::class.findAnnotation<ObjectImplements>()!!
        val interfaces = annotation.interfaces.associate {
            val abi = abiOf(it)
            val (type, handles) = when (abi) {
                is IParameterizedABI<*, *> -> getTypeAndHandlesFromParameterizedABI(abi)
                is INativeHandleProvider -> it.createType() to abi.handles
                else -> throw IllegalArgumentException("Interface is neither parameterized or a handle provider")
            }

            guidOf(type) as Guid.GUID to generateInterfaceVtbl(it, type, handles)
        }

        val (objPtr, baseVtbl) = generateIInspectable(this, interfaces)

        interfaces.values.forEach {
            backFillIInspectable(baseVtbl, it)
        }

        this.pointer = objPtr
    }

    private fun getTypeAndHandlesFromParameterizedABI(abi: IBaseABI<*, *>) =
        if (abi is IParameterizedNativeHandleProvider) {
            @Suppress("UNCHECKED_CAST")
            (abi as IParameterizedABI<Any?, Any?>).getType(this) to abi.handles
        } else {
            throw IllegalArgumentException("Parameterized interface ABI doesn't implement IParameterizedNativeHandleProvider")
        }

    private fun generateInterfaceVtbl(
        kClass: KClass<*>,
        kType: KType,
        handles: Map<Int, MethodHandle>
    ): Memory {
        val bufferSize = (handles.size + 6) * 8L
        val vtbl = Memory(bufferSize)
        vtbls += vtbl
        val ptrToVtbl = Memory(Native.POINTER_SIZE.toLong())
        ptrToVtbl.setPointer(0, vtbl)

        val linker = Linker.nativeLinker()

        val indexMethodMap = kClass.functionsAndProperties().filter {
            it.hasAnnotation<InterfaceMethod>()
        }.associateBy { it.findAnnotation<InterfaceMethod>()!!.methodIndex }

        val indexMethodNameMap = kClass.functionsAndProperties().filter {
            it.hasAnnotation<InterfaceMethod>()
        }.associate {
            it.findAnnotation<InterfaceMethod>()!!.methodIndex to it.name
        }

        handles
            .mapValues { (index, handle) ->
                val (typeBound, descriptor) = transformParameterizedHandle(kType, indexMethodMap[index]!!, handle)
                val thisBound = typeBound.bindTo(this)
                val upcallStub = linker.upcallStub(thisBound, descriptor, MemorySession.global())
                println("${indexMethodNameMap[index]}: ${upcallStub.address().toPointer()}")
                upcallStub
            }
            .map { (index: Int, stub: MemorySegment) -> (index + 6) * 8L to stub.address().toPointer() }
            .forEach { (offset, fnPtr) -> vtbl.setPointer(offset, fnPtr) }

        return ptrToVtbl
    }

    private fun transformParameterizedHandle(
        kType: KType,
        fn: KFunction<*>,
        handle: MethodHandle
    ): Pair<MethodHandle, FunctionDescriptor> {
        val kClass = kType.jvmErasure
        val reifiedTypeParameters = kType.arguments.map { it.type }
        val reifiedTypeMap = kClass.typeParameters.zip(reifiedTypeParameters).associate { (typeParam, reifiedType) ->
            typeParam.name to reifiedType
        }

        val reifiedParameters = fn.parameters.flatMap {
            val paramType = it.type
            when (paramType.classifier) {
                is KTypeParameter -> listOf(reifiedTypeMap[(it.type.classifier as KTypeParameter).name]!!)
                else -> {
                    if (paramType.jvmErasure == Array::class) listOf(typeOf<Int>(), typeOf<MemoryAddress>())
                    else if (paramType.jvmErasure == MutableList::class && it.hasAnnotation<ReceiveArray>()) listOf(
                        typeOf<MemoryAddress>(),
                        typeOf<MemoryAddress>()
                    )
                    else listOf(it.type)
                }
            }
        }.drop(1)
        val reifiedReturnType = if (fn.returnType != typeOf<Unit>()) {
            val returnType = fn.returnType
            when (returnType.classifier) {
                is KTypeParameter -> reifiedTypeMap[(returnType.classifier as KTypeParameter).name]
                else -> returnType
            }!!.javaForeignType()
        } else Void.TYPE

        val descriptorReturnParam =
            if (reifiedReturnType == Void.TYPE) listOf<Class<*>>() else listOf(MemoryAddress::class.java)
        val handleTypes = reifiedParameters.map { it.javaForeignType() }

        val descriptorMethodType =
            MethodType.methodType(
                Int::class.javaPrimitiveType,
                kClass.java,
                MemoryAddress::class.java,
                *(handleTypes + descriptorReturnParam).toTypedArray()
            )

        val mhClass = MethodHandles.lookup().revealDirect(handle).declaringClass
        val bound = if (mhClass.kotlin.isSubclassOf(IParameterizedNativeHandleProvider::class)) {
            handle.bindTo(kType)
        } else {
            handle
        }

        return MethodHandles.explicitCastArguments(bound, descriptorMethodType) to
                descriptorMethodType.toFunctionDescriptor(promoteReturnToParameter = false, addThisObjParam = false)
    }
}

private fun KClass<*>.functionsAndProperties(): List<KFunction<*>> {
    return declaredFunctions + declaredMemberProperties.flatMap {
        listOfNotNull(it.getter, (it as? KMutableProperty<*>)?.setter)
    }
}