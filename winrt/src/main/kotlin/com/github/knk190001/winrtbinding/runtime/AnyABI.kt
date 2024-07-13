package com.github.knk190001.winrtbinding.runtime

import Windows.Foundation.*
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid.GUID
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout

object AnyABI: IABI<Any?, MemoryAddress> {
    override fun fromNative(obj: MemoryAddress): Any? {
        if (obj == MemoryAddress.NULL) {
            return null
        }
        val it = IUnknown.ABI.makeIUnknown(obj.toPointer())
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
                PropertyType.DateTime -> prop.GetDateTime()!!
                PropertyType.TimeSpan -> prop.GetTimeSpan()!!
                PropertyType.Guid -> prop.GetGuid()!!
                PropertyType.Point -> prop.GetPoint()!!
                PropertyType.Size -> prop.GetSize()!!
                PropertyType.Rect -> prop.GetRect()!!
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
                PropertyType.DateTimeArray -> mutableListOf<DateTime?>().apply { prop.GetDateTimeArray(this) }
                PropertyType.TimeSpanArray -> mutableListOf<TimeSpan?>().apply { prop.GetTimeSpanArray(this) }
                PropertyType.GuidArray -> mutableListOf<GUID?>().apply { prop.GetGuidArray(this) }
                PropertyType.PointArray -> mutableListOf<Point?>().apply { prop.GetPointArray(this) }
                PropertyType.SizeArray -> mutableListOf<Size?>().apply { prop.GetSizeArray(this) }
                PropertyType.RectArray -> mutableListOf<Rect?>().apply { prop.GetRectArray(this) }
                PropertyType.OtherTypeArray -> throw IllegalArgumentException("OtherTypeArray is not supported")
                null -> throw NullPointerException("PropertyType is null")
            }
        }
        return it
    }

    override val layout: MemoryLayout
        get() = ValueLayout.ADDRESS

    @Suppress("UNCHECKED_CAST")
    override fun toNative(obj: Any?): MemoryAddress {
        return when (obj) {
            is Unit -> PropertyValue<Unit>(obj).pointer.toMemoryAddress()
            is UByte -> PropertyValue<UByte>(obj).pointer.toMemoryAddress()
            is Short -> PropertyValue<Short>(obj).pointer.toMemoryAddress()
            is UShort -> PropertyValue<UShort>(obj).pointer.toMemoryAddress()
            is Int -> PropertyValue<Int>(obj).pointer.toMemoryAddress()
            is UInt -> PropertyValue<UInt>(obj).pointer.toMemoryAddress()
            is Long -> PropertyValue<Long>(obj).pointer.toMemoryAddress()
            is ULong -> PropertyValue<ULong>(obj).pointer.toMemoryAddress()
            is Float -> PropertyValue<Float>(obj).pointer.toMemoryAddress()
            is Double -> PropertyValue<Double>(obj).pointer.toMemoryAddress()
            is Char -> PropertyValue<Char>(obj).pointer.toMemoryAddress()
            is Boolean -> PropertyValue<Boolean>(obj).pointer.toMemoryAddress()
            is String -> PropertyValue<String>(obj).pointer.toMemoryAddress()
            is IInspectable -> obj.iUnknown_Ptr.toMemoryAddress()
            is DateTime -> PropertyValue<DateTime>(obj).pointer.toMemoryAddress()
            is TimeSpan -> PropertyValue<TimeSpan>(obj).pointer.toMemoryAddress()
            is GUID -> PropertyValue<GUID>(obj).pointer.toMemoryAddress()
            is Point -> PropertyValue<Point>(obj).pointer.toMemoryAddress()
            is Size -> PropertyValue<Size>(obj).pointer.toMemoryAddress()
            is Rect -> PropertyValue<Rect>(obj).pointer.toMemoryAddress()
            is Array<*> -> {
                when (obj::class.java.componentType.kotlin) {
                    UByte::class -> PropertyValue<Array<UByte>>(obj as Array<UByte>).pointer.toMemoryAddress()
                    Short::class -> PropertyValue<Array<Short>>(obj as Array<Short>).pointer.toMemoryAddress()
                    UShort::class -> PropertyValue<Array<UShort>>(obj as Array<UShort>).pointer.toMemoryAddress()
                    Int::class -> PropertyValue<Array<Int>>(obj as Array<Int>).pointer.toMemoryAddress()
                    UInt::class -> PropertyValue<Array<UInt>>(obj as Array<UInt>).pointer.toMemoryAddress()
                    Long::class -> PropertyValue<Array<Long>>(obj as Array<Long>).pointer.toMemoryAddress()
                    ULong::class -> PropertyValue<Array<ULong>>(obj as Array<ULong>).pointer.toMemoryAddress()
                    Float::class -> PropertyValue<Array<Float>>(obj as Array<Float>).pointer.toMemoryAddress()
                    Double::class -> PropertyValue<Array<Double>>(obj as Array<Double>).pointer.toMemoryAddress()
                    Char::class -> PropertyValue<Array<Char>>(obj as Array<Char>).pointer.toMemoryAddress()
                    Boolean::class -> PropertyValue<Array<Boolean>>(obj as Array<Boolean>).pointer.toMemoryAddress()
                    String::class -> PropertyValue<Array<String>>(obj as Array<String>).pointer.toMemoryAddress()
                    IInspectable::class -> PropertyValue<Array<IInspectable>>(obj as Array<IInspectable>).pointer.toMemoryAddress()
                    DateTime::class -> PropertyValue<Array<DateTime>>(obj as Array<DateTime>).pointer.toMemoryAddress()
                    TimeSpan::class -> PropertyValue<Array<TimeSpan>>(obj as Array<TimeSpan>).pointer.toMemoryAddress()
                    GUID::class -> PropertyValue<Array<GUID>>(obj as Array<GUID>).pointer.toMemoryAddress()
                    Point::class -> PropertyValue<Array<Point>>(obj as Array<Point>).pointer.toMemoryAddress()
                    Size::class -> PropertyValue<Array<Size>>(obj as Array<Size>).pointer.toMemoryAddress()
                    Rect::class -> PropertyValue<Array<Rect>>(obj as Array<Rect>).pointer.toMemoryAddress()
                    else -> throw IllegalArgumentException("Unsupported array type")
                }
            }
            else -> throw IllegalArgumentException("Unsupported type")
        }
    }

}