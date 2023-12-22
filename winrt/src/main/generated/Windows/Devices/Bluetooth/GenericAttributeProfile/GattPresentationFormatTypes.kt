package Windows.Devices.Bluetooth.GenericAttributeProfile

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattPresentationFormatTypes.ABI::class)
@WinRTByReference(brClass = GattPresentationFormatTypes.ByReference::class)
public class GattPresentationFormatTypes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattPresentationFormatTypes> {
    public override fun getValue() = GattPresentationFormatTypes(pointer.getPointer(0))

    public fun setValue(value: GattPresentationFormatTypes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattPresentationFormatTypes, MemoryAddress> {
    public val IGattPresentationFormatTypesStatics_Instance: IGattPresentationFormatTypesStatics by
        lazy {
      createIGattPresentationFormatTypesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattPresentationFormatTypesStatics(): IGattPresentationFormatTypesStatics {
      val refiid = Guid.REFIID(IGattPresentationFormatTypesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormatTypes".toHandle(),refiid,interfacePtr)
      val result =
          IGattPresentationFormatTypesStatics.ABI.makeIGattPresentationFormatTypesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattPresentationFormatTypes {
      val address = segment.toRawLongValue()
      return GattPresentationFormatTypes(Pointer(address))
    }

    public override fun toNative(obj: GattPresentationFormatTypes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Boolean() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Boolean()

    public fun get_Bit2() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Bit2()

    public fun get_Nibble() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Nibble()

    public fun get_UInt8() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt8()

    public fun get_UInt12() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt12()

    public fun get_UInt16() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt16()

    public fun get_UInt24() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt24()

    public fun get_UInt32() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt32()

    public fun get_UInt48() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt48()

    public fun get_UInt64() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt64()

    public fun get_UInt128() = ABI.IGattPresentationFormatTypesStatics_Instance.get_UInt128()

    public fun get_SInt8() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt8()

    public fun get_SInt12() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt12()

    public fun get_SInt16() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt16()

    public fun get_SInt24() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt24()

    public fun get_SInt32() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt32()

    public fun get_SInt48() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt48()

    public fun get_SInt64() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt64()

    public fun get_SInt128() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SInt128()

    public fun get_Float32() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Float32()

    public fun get_Float64() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Float64()

    public fun get_SFloat() = ABI.IGattPresentationFormatTypesStatics_Instance.get_SFloat()

    public fun get_Float() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Float()

    public fun get_DUInt16() = ABI.IGattPresentationFormatTypesStatics_Instance.get_DUInt16()

    public fun get_Utf8() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Utf8()

    public fun get_Utf16() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Utf16()

    public fun get_Struct() = ABI.IGattPresentationFormatTypesStatics_Instance.get_Struct()
  }
}
