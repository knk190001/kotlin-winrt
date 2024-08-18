package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.abi.IBaseABI
import com.github.knk190001.winrtbinding.runtime.abi.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.abiOf
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.delegate.DelegateVtbl
import com.github.knk190001.winrtbinding.runtime.delegate.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.layoutOf
import com.github.knk190001.winrtbinding.runtime.objects.IInspectableVtbl
import com.github.knk190001.winrtbinding.runtime.objects.Vtbl
import com.github.knk190001.winrtbinding.runtime.readLayout
import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.full.createType
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.typeOf

@ABIMarker(PointerTo.ABI::class)
class PointerTo<out T>(val type: KType, segment: MemorySegment) {
    val abi = if (isValidType()) abiOf(type.arguments[0].type!!.jvmErasure) as IBaseABI<Any?, Any> else null
    val segment: MemorySegment = segment.reinterpret(abi?.layout?.byteSize() ?: 0)

    var value: @UnsafeVariance T
        get() = getValue(type, abi!!, segment) as T
        set(value) {
            setValue(abi!!, segment, value)
        }

    private fun isValidType() = type.arguments[0].type != null && type.arguments[0].type != nothingType

    companion object {
        private val nothingType = Nothing::class.createType()

        inline fun <reified T> createType(): KType {
            return PointerTo::class.createType(listOf(KTypeProjection(KVariance.INVARIANT, typeOf<T>())))
        }

        fun createType(componentType: KType): KType {
            return PointerTo::class.createType(listOf(KTypeProjection(KVariance.INVARIANT, componentType)))
        }

        inline operator fun <reified T> invoke(segment: MemorySegment): PointerTo<T> {
            return PointerTo(createType<T>(), segment)
        }

        inline operator fun <reified T : Any> invoke(value: T): PointerTo<T> {
            val segment = Arena.global().allocate(layoutOf<T>())
            setValue(abiOf<T>() as IBaseABI<Any?, Any>, segment, value)
            return PointerTo(createType<T>(), segment)
        }

        inline operator fun <reified T : Any> invoke(): PointerTo<T> {
            val segment = Arena.global().allocate(layoutOf<T>())
            return PointerTo(createType<T>(), segment)
        }

        operator fun <T> invoke(type: KType): PointerTo<T> {
            val segment = Arena.global().allocate(layoutOf(type.jvmErasure))
            return PointerTo(createType(type), segment)
        }

        fun getValue(type: KType, abi: IBaseABI<Any?, Any>, segment: MemorySegment): Any? {
            val layout = abi.layout
            return when (abi) {
                is IABI<*, *> -> (abi as IABI<Any?, Any>).fromNative(
                    readLayout(layout, segment)
                )

                is IParameterizedABI<*, *> -> {
                    (abi as IParameterizedABI<Any?, Any>).fromNative(
                        type.arguments[0].type!!,
                        readLayout(layout, segment)
                    )
                }
            }
        }

        fun setValue(abi: IBaseABI<Any?, Any>, segment: MemorySegment, value: Any?) {
            abi.copyTo(value, segment)
        }
    }

    object ABI : IParameterizedABI<PointerTo<*>, MemorySegment> {
        override fun fromNative(kType: KType, obj: MemorySegment): PointerTo<*> {
            return PointerTo<Any?>(kType, obj)
        }

        override fun getType(obj: PointerTo<*>): KType {
            return obj.type
        }

        override val layout: MemoryLayout
            get() = ValueLayout.ADDRESS


        override fun toNative(obj: PointerTo<*>): MemorySegment {
            return obj.segment
        }

    }
}

typealias ObjectPtr = PointerTo<Vtbl>

val ObjectPtr.vtbl
    get() = value

fun ObjectPtr(segment: MemorySegment): ObjectPtr {
    return PointerTo<Vtbl>(segment)
}

typealias IUnknownPtr = PointerTo<IUnknownVtbl>

val IUnknownPtr.vtbl
    get() = value

typealias IInspectablePtr = PointerTo<IInspectableVtbl>

val IInspectablePtr.vtbl
    get() = value

typealias DelegatePtr = PointerTo<DelegateVtbl>

val DelegatePtr.vtbl
    get() = value

fun DelegatePtr(segment: MemorySegment): DelegatePtr {
    return PointerTo<DelegateVtbl>(segment)
}

fun <T> PointerTo<T>.setNull() {
    segment[ValueLayout.ADDRESS, 0] = MemorySegment.NULL
}