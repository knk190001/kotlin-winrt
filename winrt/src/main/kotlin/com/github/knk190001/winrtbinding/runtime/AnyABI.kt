package com.github.knk190001.winrtbinding.runtime

import Windows.Foundation.*
import com.github.knk190001.winrtbinding.runtime.abi.IAnyABI
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.GUID
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout


object AnyABI: IAnyABI {
    override fun fromNative(obj: MemorySegment): Any? {
        if (obj.address() == 0L) {
            return null
        }
        val it = IUnknown.ABI.fromNative(obj)
        if (it.instanceOf<IPropertyValue>()) {
            val prop = it.cast<IPropertyValue>()
            return when (prop.Type) {
                PropertyType.Empty -> Unit
                PropertyType.UInt8 -> prop.GetUInt8()
                PropertyType.Int16 -> prop.GetInt16()
                PropertyType.UInt16 -> prop.GetUInt16()
                PropertyType.Int32 -> prop.GetInt32()
                PropertyType.UInt32 -> prop.GetUInt32()
                PropertyType.Int64 -> prop.GetInt64()
                PropertyType.UInt64 -> prop.GetUInt64()
                PropertyType.Single -> prop.GetSingle()
                PropertyType.Double -> prop.GetDouble()
                PropertyType.Char16 -> prop.GetChar16()
                PropertyType.Boolean -> prop.GetBoolean()
                PropertyType.String -> prop.GetString()!!
                PropertyType.Inspectable -> it
                PropertyType.DateTime -> prop.GetDateTime()
                PropertyType.TimeSpan -> prop.GetTimeSpan()
                PropertyType.Guid -> prop.GetGuid()
                PropertyType.Point -> prop.GetPoint()
                PropertyType.Size -> prop.GetSize()
                PropertyType.Rect -> prop.GetRect()
                PropertyType.OtherType -> throw IllegalArgumentException("OtherType is not supported")
                PropertyType.UInt8Array -> mutableListOf<UByte>().apply { prop.GetUInt8Array(this) }
                PropertyType.Int16Array -> mutableListOf<Short>().apply { prop.GetInt16Array(this) }
                PropertyType.UInt16Array -> mutableListOf<UShort>().apply { prop.GetUInt16Array(this) }
                PropertyType.Int32Array -> mutableListOf<Int>().apply { prop.GetInt32Array(this) }
                PropertyType.UInt32Array -> mutableListOf<UInt>().apply { prop.GetUInt32Array(this) }
                PropertyType.Int64Array -> mutableListOf<Long>().apply { prop.GetInt64Array(this) }
                PropertyType.UInt64Array -> mutableListOf<ULong>().apply { prop.GetUInt64Array(this) }
                PropertyType.SingleArray -> mutableListOf<Float>().apply { prop.GetSingleArray(this) }
                PropertyType.DoubleArray -> mutableListOf<Double>().apply { prop.GetDoubleArray(this) }
                PropertyType.Char16Array -> mutableListOf<Char>().apply { prop.GetChar16Array(this) }
                PropertyType.BooleanArray -> mutableListOf<Boolean>().apply { prop.GetBooleanArray(this) }
                PropertyType.StringArray -> mutableListOf<String?>().apply { prop.GetStringArray(this) }
                PropertyType.InspectableArray -> mutableListOf<Any?>().apply { prop.GetInspectableArray(this) }
                PropertyType.DateTimeArray -> mutableListOf<DateTime>().apply { prop.GetDateTimeArray(this) }
                PropertyType.TimeSpanArray -> mutableListOf<TimeSpan>().apply { prop.GetTimeSpanArray(this) }
                PropertyType.GuidArray -> mutableListOf<Guid.IID>().apply { prop.GetGuidArray(this) }
                PropertyType.PointArray -> mutableListOf<Point>().apply { prop.GetPointArray(this) }
                PropertyType.SizeArray -> mutableListOf<Size>().apply { prop.GetSizeArray(this) }
                PropertyType.RectArray -> mutableListOf<Rect>().apply { prop.GetRectArray(this) }
                PropertyType.OtherTypeArray -> throw IllegalArgumentException("OtherTypeArray is not supported")
            }
        }
        return it
    }

    override val layout: MemoryLayout
        get() = ValueLayout.ADDRESS

    @Suppress("UNCHECKED_CAST")
    override fun box(obj: Any?): IUnknown? {
        if (obj == null) return null
        return when (obj) {
            is Unit -> PropertyValue<Unit>(obj)
            is UByte -> PropertyValue<UByte>(obj)
            is Short -> PropertyValue<Short>(obj)
            is UShort -> PropertyValue<UShort>(obj)
            is Int -> PropertyValue<Int>(obj)
            is UInt -> PropertyValue<UInt>(obj)
            is Long -> PropertyValue<Long>(obj)
            is ULong -> PropertyValue<ULong>(obj)
            is Float -> PropertyValue<Float>(obj)
            is Double -> PropertyValue<Double>(obj)
            is Char -> PropertyValue<Char>(obj)
            is Boolean -> PropertyValue<Boolean>(obj)
            is String -> PropertyValue<String>(obj)
            is IInspectable -> obj
            is DateTime -> PropertyValue<DateTime>(obj)
            is TimeSpan -> PropertyValue<TimeSpan>(obj)
            is GUID -> PropertyValue<GUID>(obj)
            is Point -> PropertyValue<Point>(obj)
            is Size -> PropertyValue<Size>(obj)
            is Rect -> PropertyValue<Rect>(obj)
            is Array<*> -> {
                when (obj::class.java.componentType.kotlin) {
                    UByte::class -> PropertyValue<Array<UByte>>(obj as Array<UByte>)
                    Short::class -> PropertyValue<Array<Short>>(obj as Array<Short>)
                    UShort::class -> PropertyValue<Array<UShort>>(obj as Array<UShort>)
                    Int::class -> PropertyValue<Array<Int>>(obj as Array<Int>)
                    UInt::class -> PropertyValue<Array<UInt>>(obj as Array<UInt>)
                    Long::class -> PropertyValue<Array<Long>>(obj as Array<Long>)
                    ULong::class -> PropertyValue<Array<ULong>>(obj as Array<ULong>)
                    Float::class -> PropertyValue<Array<Float>>(obj as Array<Float>)
                    Double::class -> PropertyValue<Array<Double>>(obj as Array<Double>)
                    Char::class -> PropertyValue<Array<Char>>(obj as Array<Char>)
                    Boolean::class -> PropertyValue<Array<Boolean>>(obj as Array<Boolean>)
                    String::class -> PropertyValue<Array<String>>(obj as Array<String>)
                    IInspectable::class -> PropertyValue<Array<IInspectable>>(obj as Array<IInspectable>)
                    DateTime::class -> PropertyValue<Array<DateTime>>(obj as Array<DateTime>)
                    TimeSpan::class -> PropertyValue<Array<TimeSpan>>(obj as Array<TimeSpan>)
                    GUID::class -> PropertyValue<Array<GUID>>(obj as Array<GUID>)
                    Point::class -> PropertyValue<Array<Point>>(obj as Array<Point>)
                    Size::class -> PropertyValue<Array<Size>>(obj as Array<Size>)
                    Rect::class -> PropertyValue<Array<Rect>>(obj as Array<Rect>)
                    else -> throw IllegalArgumentException("Unsupported array type")
                }
            }
            else -> throw IllegalArgumentException("Unsupported type")
        }
    }

    override fun toNative(obj: Any?): MemorySegment {
        return box(obj)?.segment ?: MemorySegment.NULL
    }

}