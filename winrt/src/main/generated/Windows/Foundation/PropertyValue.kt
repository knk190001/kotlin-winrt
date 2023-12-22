package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PropertyValue.ABI::class)
@WinRTByReference(brClass = PropertyValue.ByReference::class)
public class PropertyValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PropertyValue>
      {
    public override fun getValue() = PropertyValue(pointer.getPointer(0))

    public fun setValue(value: PropertyValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PropertyValue, MemoryAddress> {
    public val IPropertyValueStatics_Instance: IPropertyValueStatics by lazy {
      createIPropertyValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPropertyValueStatics(): IPropertyValueStatics {
      val refiid = Guid.REFIID(IPropertyValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.PropertyValue".toHandle(),refiid,interfacePtr)
      val result = IPropertyValueStatics.ABI.makeIPropertyValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PropertyValue {
      val address = segment.toRawLongValue()
      return PropertyValue(Pointer(address))
    }

    public override fun toNative(obj: PropertyValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateEmpty() = ABI.IPropertyValueStatics_Instance.CreateEmpty()

    public fun CreateUInt8(value: Byte) = ABI.IPropertyValueStatics_Instance.CreateUInt8(value)

    public fun CreateInt16(value: Short) = ABI.IPropertyValueStatics_Instance.CreateInt16(value)

    public fun CreateUInt16(value: WinDef.USHORT) =
        ABI.IPropertyValueStatics_Instance.CreateUInt16(value)

    public fun CreateInt32(value: Int) = ABI.IPropertyValueStatics_Instance.CreateInt32(value)

    public fun CreateUInt32(value: WinDef.UINT) =
        ABI.IPropertyValueStatics_Instance.CreateUInt32(value)

    public fun CreateInt64(value: Long) = ABI.IPropertyValueStatics_Instance.CreateInt64(value)

    public fun CreateUInt64(value: WinDef.ULONG) =
        ABI.IPropertyValueStatics_Instance.CreateUInt64(value)

    public fun CreateSingle(value: Float) = ABI.IPropertyValueStatics_Instance.CreateSingle(value)

    public fun CreateDouble(value: Double) = ABI.IPropertyValueStatics_Instance.CreateDouble(value)

    public fun CreateChar16(value: Char) = ABI.IPropertyValueStatics_Instance.CreateChar16(value)

    public fun CreateBoolean(value: Boolean) =
        ABI.IPropertyValueStatics_Instance.CreateBoolean(value)

    public fun CreateString(value: String) = ABI.IPropertyValueStatics_Instance.CreateString(value)

    public fun CreateInspectable(value: IUnknown) =
        ABI.IPropertyValueStatics_Instance.CreateInspectable(value)

    public fun CreateGuid(value: Guid.GUID) = ABI.IPropertyValueStatics_Instance.CreateGuid(value)

    public fun CreateDateTime(value: DateTime) =
        ABI.IPropertyValueStatics_Instance.CreateDateTime(value)

    public fun CreateTimeSpan(value: TimeSpan) =
        ABI.IPropertyValueStatics_Instance.CreateTimeSpan(value)

    public fun CreatePoint(value: Point) = ABI.IPropertyValueStatics_Instance.CreatePoint(value)

    public fun CreateSize(value: Size) = ABI.IPropertyValueStatics_Instance.CreateSize(value)

    public fun CreateRect(value: Rect) = ABI.IPropertyValueStatics_Instance.CreateRect(value)

    public fun CreateUInt8Array(value: Array<Byte>) =
        ABI.IPropertyValueStatics_Instance.CreateUInt8Array(value)

    public fun CreateInt16Array(value: Array<Short>) =
        ABI.IPropertyValueStatics_Instance.CreateInt16Array(value)

    public fun CreateUInt16Array(value: Array<WinDef.USHORT>) =
        ABI.IPropertyValueStatics_Instance.CreateUInt16Array(value)

    public fun CreateInt32Array(value: Array<Int>) =
        ABI.IPropertyValueStatics_Instance.CreateInt32Array(value)

    public fun CreateUInt32Array(value: Array<WinDef.UINT>) =
        ABI.IPropertyValueStatics_Instance.CreateUInt32Array(value)

    public fun CreateInt64Array(value: Array<Long>) =
        ABI.IPropertyValueStatics_Instance.CreateInt64Array(value)

    public fun CreateUInt64Array(value: Array<WinDef.ULONG>) =
        ABI.IPropertyValueStatics_Instance.CreateUInt64Array(value)

    public fun CreateSingleArray(value: Array<Float>) =
        ABI.IPropertyValueStatics_Instance.CreateSingleArray(value)

    public fun CreateDoubleArray(value: Array<Double>) =
        ABI.IPropertyValueStatics_Instance.CreateDoubleArray(value)

    public fun CreateChar16Array(value: Array<Char>) =
        ABI.IPropertyValueStatics_Instance.CreateChar16Array(value)

    public fun CreateBooleanArray(value: Array<Boolean>) =
        ABI.IPropertyValueStatics_Instance.CreateBooleanArray(value)

    public fun CreateStringArray(value: Array<String?>) =
        ABI.IPropertyValueStatics_Instance.CreateStringArray(value)

    public fun CreateInspectableArray(value: Array<IUnknown?>) =
        ABI.IPropertyValueStatics_Instance.CreateInspectableArray(value)

    public fun CreateGuidArray(value: Array<Guid.GUID?>) =
        ABI.IPropertyValueStatics_Instance.CreateGuidArray(value)

    public fun CreateDateTimeArray(value: Array<DateTime?>) =
        ABI.IPropertyValueStatics_Instance.CreateDateTimeArray(value)

    public fun CreateTimeSpanArray(value: Array<TimeSpan?>) =
        ABI.IPropertyValueStatics_Instance.CreateTimeSpanArray(value)

    public fun CreatePointArray(value: Array<Point?>) =
        ABI.IPropertyValueStatics_Instance.CreatePointArray(value)

    public fun CreateSizeArray(value: Array<Size?>) =
        ABI.IPropertyValueStatics_Instance.CreateSizeArray(value)

    public fun CreateRectArray(value: Array<Rect?>) =
        ABI.IPropertyValueStatics_Instance.CreateRectArray(value)
  }
}
