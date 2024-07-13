package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.annotations.AggregateImplements
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Pointer
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.functions
import kotlin.reflect.full.hasAnnotation

interface IKotlinWinRTAggregate: ICompositionPointer {
    fun initAggregate(): Pointer{
        val thisClass = this::class
        val aggregateAnnotation = thisClass.findAnnotation<AggregateImplements>()!!
        val interfaces = aggregateAnnotation.interfaces.map {
            it to abiOf(it) as INativeHandleProvider
        }.associate {(kClass, handleProvider) ->
            handleProvider.guid to generateInterface(kClass, handleProvider)
        }

        val (objPtr, baseVtbl) = generateIInspectable(this, interfaces)
        vtbl = baseVtbl

        interfaces.values.forEach {
            backFillIInspectable(baseVtbl, it)
        }

        return objPtr
    }

    private fun generateInterface(kClass: KClass<*>, handleProvider: INativeHandleProvider): Pointer {
        val bufferSize = (handleProvider.handles.size + 6) * 8L
        val vtbl = Memory(bufferSize)
        interfacePointers += vtbl

        val ptrToVtbl = Memory(Native.POINTER_SIZE.toLong())
        ptrToVtbl.setPointer(0, vtbl)

        val linker = Linker.nativeLinker()

        val indexMethodMap = kClass.functions.filter {
            it.hasAnnotation<InterfaceMethod>()
        }.associateBy { it.findAnnotation<InterfaceMethod>()!!.methodIndex }

        val indexMethodNameMap = kClass.functions.filter {
            it.hasAnnotation<InterfaceMethod>()
        }.associate {
            it.findAnnotation<InterfaceMethod>()!!.methodIndex to it.name
        }

        handleProvider.handles
            .mapValues { (index, handle) ->
                val bound = handle.bindTo(this)
                val upcallStub = linker.upcallStub(
                    bound, indexMethodMap[index]!!.toFunctionDescriptor(), MemorySession.global()
                )
                println("${indexMethodNameMap[index]}: ${upcallStub.address().toPointer()}")
                upcallStub
            }
            .map { (index: Int, stub: MemorySegment) -> (index + 6) * 8L to stub.address().toPointer() }
            .forEach { (offset, fnPtr) -> vtbl.setPointer(offset, fnPtr) }

        return ptrToVtbl
    }

}