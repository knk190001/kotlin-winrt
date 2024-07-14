package com.github.knk190001.winrtbinding.runtime

import Windows.Foundation.*
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.platform.win32.Guid.GUID
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

object AnyABI: IABI<Any?, MemorySegment> {
    override fun fromNative(obj: MemorySegment): Any? {
        if (obj.address() == 0L) {
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
    override fun toNative(obj: Any?): MemorySegment {
        return when (obj) {
            is Unit -> PropertyValue<Unit>(obj).pointer.toMemorySegment()
            is UByte -> PropertyValue<UByte>(obj).pointer.toMemorySegment()
            is Short -> PropertyValue<Short>(obj).pointer.toMemorySegment()
            is UShort -> PropertyValue<UShort>(obj).pointer.toMemorySegment()
            is Int -> PropertyValue<Int>(obj).pointer.toMemorySegment()
            is UInt -> PropertyValue<UInt>(obj).pointer.toMemorySegment()
            is Long -> PropertyValue<Long>(obj).pointer.toMemorySegment()
            is ULong -> PropertyValue<ULong>(obj).pointer.toMemorySegment()
            is Float -> PropertyValue<Float>(obj).pointer.toMemorySegment()
            is Double -> PropertyValue<Double>(obj).pointer.toMemorySegment()
            is Char -> PropertyValue<Char>(obj).pointer.toMemorySegment()
            is Boolean -> PropertyValue<Boolean>(obj).pointer.toMemorySegment()
            is String -> PropertyValue<String>(obj).pointer.toMemorySegment()
            is IInspectable -> obj.iUnknown_Ptr.toMemorySegment()
            is DateTime -> PropertyValue<DateTime>(obj).pointer.toMemorySegment()
            is TimeSpan -> PropertyValue<TimeSpan>(obj).pointer.toMemorySegment()
            is GUID -> PropertyValue<GUID>(obj).pointer.toMemorySegment()
            is Point -> PropertyValue<Point>(obj).pointer.toMemorySegment()
            is Size -> PropertyValue<Size>(obj).pointer.toMemorySegment()
            is Rect -> PropertyValue<Rect>(obj).pointer.toMemorySegment()
            is Array<*> -> {
                when (obj::class.java.componentType.kotlin) {
                    UByte::class -> PropertyValue<Array<UByte>>(obj as Array<UByte>).pointer.toMemorySegment()
                    Short::class -> PropertyValue<Array<Short>>(obj as Array<Short>).pointer.toMemorySegment()
                    UShort::class -> PropertyValue<Array<UShort>>(obj as Array<UShort>).pointer.toMemorySegment()
                    Int::class -> PropertyValue<Array<Int>>(obj as Array<Int>).pointer.toMemorySegment()
                    UInt::class -> PropertyValue<Array<UInt>>(obj as Array<UInt>).pointer.toMemorySegment()
                    Long::class -> PropertyValue<Array<Long>>(obj as Array<Long>).pointer.toMemorySegment()
                    ULong::class -> PropertyValue<Array<ULong>>(obj as Array<ULong>).pointer.toMemorySegment()
                    Float::class -> PropertyValue<Array<Float>>(obj as Array<Float>).pointer.toMemorySegment()
                    Double::class -> PropertyValue<Array<Double>>(obj as Array<Double>).pointer.toMemorySegment()
                    Char::class -> PropertyValue<Array<Char>>(obj as Array<Char>).pointer.toMemorySegment()
                    Boolean::class -> PropertyValue<Array<Boolean>>(obj as Array<Boolean>).pointer.toMemorySegment()
                    String::class -> PropertyValue<Array<String>>(obj as Array<String>).pointer.toMemorySegment()
                    IInspectable::class -> PropertyValue<Array<IInspectable>>(obj as Array<IInspectable>).pointer.toMemorySegment()
                    DateTime::class -> PropertyValue<Array<DateTime>>(obj as Array<DateTime>).pointer.toMemorySegment()
                    TimeSpan::class -> PropertyValue<Array<TimeSpan>>(obj as Array<TimeSpan>).pointer.toMemorySegment()
                    GUID::class -> PropertyValue<Array<GUID>>(obj as Array<GUID>).pointer.toMemorySegment()
                    Point::class -> PropertyValue<Array<Point>>(obj as Array<Point>).pointer.toMemorySegment()
                    Size::class -> PropertyValue<Array<Size>>(obj as Array<Size>).pointer.toMemorySegment()
                    Rect::class -> PropertyValue<Array<Rect>>(obj as Array<Rect>).pointer.toMemorySegment()
                    else -> throw IllegalArgumentException("Unsupported array type")
                }
            }
            else -> throw IllegalArgumentException("Unsupported type")
        }
    }

}