package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.*
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.platform.win32.Guid
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.full.createType
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.typeOf


@Suppress("UNCHECKED_CAST")
@ObjectImplements([IReference::class, IPropertyValue::class])
class Reference<T>(override val _Windows_FoundationIReference_Type: KType? = null, override val Value: T) :
    KotlinWinRTObject(), IReference<T> {

    @Suppress("UNCHECKED_CAST")
    constructor() : this(null, null as T)

    init {
        if (_Windows_FoundationIReference_Type != null) {
            initObj()
        }
    }

    companion object {
        inline operator fun <reified T> invoke(value: T): Reference<T> {
            return Reference(
                IReference::class.createType(listOf(KTypeProjection(KVariance.INVARIANT, typeOf<T>()))),
                value
            )
        }

        private fun propertyTypeOf(type: KType): PropertyType {
            val clazz = type.jvmErasure
            return when (clazz) {
                Unit::class -> PropertyType.Empty
                UByte::class -> PropertyType.UInt8
                Short::class -> PropertyType.Int16
                UShort::class -> PropertyType.UInt16
                Int::class -> PropertyType.Int32
                UInt::class -> PropertyType.UInt32
                Long::class -> PropertyType.Int64
                ULong::class -> PropertyType.UInt64
                Float::class -> PropertyType.Single
                Double::class -> PropertyType.Double
                Char::class -> PropertyType.Char16
                Boolean::class -> PropertyType.Boolean
                String::class -> PropertyType.String
                DateTime::class -> PropertyType.DateTime
                TimeSpan::class -> PropertyType.TimeSpan
                Guid.GUID::class -> PropertyType.Guid
                Point::class -> PropertyType.Point
                Size::class -> PropertyType.Size
                Rect::class -> PropertyType.Rect
                Array::class -> propertyTypeOf(type.arguments[0].type!!)
                else -> if (type.isSubtypeOf(typeOf<Delegate>())) {
                    PropertyType.OtherType
                } else {
                    PropertyType.Inspectable
                }
            }
        }
    }

    override val Type: PropertyType
        get() = propertyTypeOf(_Windows_FoundationIReference_Type!!.arguments[0].type!!)

    override val IsNumericScalar: Boolean
        get() = when (Type) {
            PropertyType.UInt8, PropertyType.Int16, PropertyType.UInt16, PropertyType.Int32, PropertyType.UInt32,
            PropertyType.Int64, PropertyType.UInt64, PropertyType.Single, PropertyType.Double -> true
            else -> false
        }

    override fun GetUInt8(): Byte {
        if (Type != PropertyType.UInt8) throw IllegalStateException()
        return Value as Byte
    }


    override fun GetInt16(): Short {
        if (Type != PropertyType.Int16) throw IllegalStateException()
        return Value as Short
    }

    override fun GetUInt16(): UShort {
        if (Type != PropertyType.UInt16) throw IllegalStateException()
        return Value as UShort
    }

    override fun GetInt32(): Int {
        if (Type != PropertyType.Int32) throw IllegalStateException()
        return Value as Int
    }

    override fun GetUInt32(): UInt {
        if (Type != PropertyType.UInt32) throw IllegalStateException()
        return Value as UInt
    }

    override fun GetInt64(): Long {
        if (Type != PropertyType.Int64) throw IllegalStateException()
        return Value as Long
    }

    override fun GetUInt64(): ULong {
        if (Type != PropertyType.UInt64) throw IllegalStateException()
        return Value as ULong
    }

    override fun GetSingle(): Float {
        if (Type != PropertyType.Single) throw IllegalStateException()
        return Value as Float
    }

    override fun GetDouble(): Double {
        if (Type != PropertyType.Double) throw IllegalStateException()
        return Value as Double
    }

    override fun GetChar16(): Char {
        if (Type != PropertyType.Char16) throw IllegalStateException()
        return Value as Char
    }

    override fun GetBoolean(): Boolean {
        if (Type != PropertyType.Boolean) throw IllegalStateException()
        return Value as Boolean
    }

    override fun GetString(): String {
        if (Type != PropertyType.String) throw IllegalStateException()
        return Value as String
    }

    override fun GetGuid(): Guid.GUID {
        if (Type != PropertyType.Guid) throw IllegalStateException()
        return Value as Guid.GUID
    }

    override fun GetDateTime(): DateTime {
        if (Type != PropertyType.DateTime) throw IllegalStateException()
        return Value as DateTime
    }

    override fun GetTimeSpan(): TimeSpan {
        if (Type != PropertyType.TimeSpan) throw IllegalStateException()
        return Value as TimeSpan
    }

    override fun GetPoint(): Point {
        if (Type != PropertyType.Point) throw IllegalStateException()
        return Value as Point
    }

    override fun GetSize(): Size {
        if (Type != PropertyType.Size) throw IllegalStateException()
        return Value as Size
    }

    override fun GetRect(): Rect {
        if (Type != PropertyType.Rect) throw IllegalStateException()
        return Value as Rect
    }

    override fun GetUInt8Array(value: MutableList<Byte>) {
        if (Type != PropertyType.UInt8Array) throw IllegalStateException()
        value.addAll(Value as List<Byte>)
    }

    override fun GetInt16Array(value: MutableList<Short>) {
if (Type != PropertyType.Int16Array) throw IllegalStateException()
        value.addAll(Value as List<Short>)
    }

    override fun GetUInt16Array(value: MutableList<UShort>) {
        if (Type != PropertyType.UInt16Array) throw IllegalStateException()
        value.addAll(Value as List<UShort>)
    }

    override fun GetInt32Array(value: MutableList<Int>) {
        if (Type != PropertyType.Int32Array) throw IllegalStateException()
        value.addAll(Value as List<Int>)
    }

    override fun GetUInt32Array(value: MutableList<UInt>) {
        if (Type != PropertyType.UInt32Array) throw IllegalStateException()
        value.addAll(Value as List<UInt>)
    }

    override fun GetInt64Array(value: MutableList<Long>) {
        if (Type != PropertyType.Int64Array) throw IllegalStateException()
        value.addAll(Value as List<Long>)
    }

    override fun GetUInt64Array(value: MutableList<ULong>) {
        if (Type != PropertyType.UInt64Array) throw IllegalStateException()
        value.addAll(Value as List<ULong>)
    }

    override fun GetSingleArray(value: MutableList<Float>) {
        if (Type != PropertyType.SingleArray) throw IllegalStateException()
        value.addAll(Value as List<Float>)
    }

    override fun GetDoubleArray(value: MutableList<Double>) {
        if (Type != PropertyType.DoubleArray) throw IllegalStateException()
        value.addAll(Value as List<Double>)
    }

    override fun GetChar16Array(value: MutableList<Char>) {
        if (Type != PropertyType.Char16Array) throw IllegalStateException()
        value.addAll(Value as List<Char>)
    }

    override fun GetBooleanArray(value: MutableList<Boolean>) {
        if (Type != PropertyType.BooleanArray) throw IllegalStateException()
        value.addAll(Value as List<Boolean>)
    }

    override fun GetStringArray(value: MutableList<String?>) {
        if (Type != PropertyType.StringArray) throw IllegalStateException()
        value.addAll(Value as List<String?>)
    }

    override fun GetInspectableArray(value: MutableList<IUnknown?>) {
        if (Type != PropertyType.InspectableArray) throw IllegalStateException()
        value.addAll(Value as List<IUnknown?>)
    }

    override fun GetGuidArray(value: MutableList<Guid.GUID?>) {
        if (Type != PropertyType.GuidArray) throw IllegalStateException()
        value.addAll(Value as List<Guid.GUID?>)
    }

    override fun GetDateTimeArray(value: MutableList<DateTime?>) {
        if (Type != PropertyType.DateTimeArray) throw IllegalStateException()
        value.addAll(Value as List<DateTime?>)
    }

    override fun GetTimeSpanArray(value: MutableList<TimeSpan?>) {
        if (Type != PropertyType.TimeSpanArray) throw IllegalStateException()
        value.addAll(Value as List<TimeSpan?>)
    }

    override fun GetPointArray(value: MutableList<Point?>) {
        if (Type != PropertyType.PointArray) throw IllegalStateException()
        value.addAll(Value as List<Point?>)
    }

    override fun GetSizeArray(value: MutableList<Size?>) {
        if (Type != PropertyType.SizeArray) throw IllegalStateException()
        value.addAll(Value as List<Size?>)
    }

    override fun GetRectArray(value: MutableList<Rect?>) {
        if (Type != PropertyType.RectArray) throw IllegalStateException()
        value.addAll(Value as List<Rect?>)
    }
}