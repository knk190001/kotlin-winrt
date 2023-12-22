package Windows.Devices.Bluetooth.Advertisement

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementDataTypesStatics.ABI::class)
@Signature("{3bb6472f-0606-434b-a76e-74159f0684d3}")
@Guid("3bb6472f0606434ba76e74159f0684d3")
@WinRTInterface("3bb6472f0606434ba76e74159f0684d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementDataTypesStatics.ByReference::class)
public interface IBluetoothLEAdvertisementDataTypesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flags(): Byte

  @InterfaceMethod(1)
  public fun get_IncompleteService16BitUuids(): Byte

  @InterfaceMethod(2)
  public fun get_CompleteService16BitUuids(): Byte

  @InterfaceMethod(3)
  public fun get_IncompleteService32BitUuids(): Byte

  @InterfaceMethod(4)
  public fun get_CompleteService32BitUuids(): Byte

  @InterfaceMethod(5)
  public fun get_IncompleteService128BitUuids(): Byte

  @InterfaceMethod(6)
  public fun get_CompleteService128BitUuids(): Byte

  @InterfaceMethod(7)
  public fun get_ShortenedLocalName(): Byte

  @InterfaceMethod(8)
  public fun get_CompleteLocalName(): Byte

  @InterfaceMethod(9)
  public fun get_TxPowerLevel(): Byte

  @InterfaceMethod(10)
  public fun get_SlaveConnectionIntervalRange(): Byte

  @InterfaceMethod(11)
  public fun get_ServiceSolicitation16BitUuids(): Byte

  @InterfaceMethod(12)
  public fun get_ServiceSolicitation32BitUuids(): Byte

  @InterfaceMethod(13)
  public fun get_ServiceSolicitation128BitUuids(): Byte

  @InterfaceMethod(14)
  public fun get_ServiceData16BitUuids(): Byte

  @InterfaceMethod(15)
  public fun get_ServiceData32BitUuids(): Byte

  @InterfaceMethod(16)
  public fun get_ServiceData128BitUuids(): Byte

  @InterfaceMethod(17)
  public fun get_PublicTargetAddress(): Byte

  @InterfaceMethod(18)
  public fun get_RandomTargetAddress(): Byte

  @InterfaceMethod(19)
  public fun get_Appearance(): Byte

  @InterfaceMethod(20)
  public fun get_AdvertisingInterval(): Byte

  @InterfaceMethod(21)
  public fun get_ManufacturerSpecificData(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementDataTypesStatics> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementDataTypesStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementDataTypesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementDataTypesStatics {
    public val __41181356_Ptr: Pointer?

    public val _41181356_VtblPtr: Pointer?
      get() = __41181356_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flags(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IncompleteService16BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CompleteService16BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IncompleteService32BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CompleteService32BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IncompleteService128BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CompleteService128BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ShortenedLocalName(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_CompleteLocalName(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_TxPowerLevel(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_SlaveConnectionIntervalRange(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_ServiceSolicitation16BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_ServiceSolicitation32BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_ServiceSolicitation128BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_ServiceData16BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_ServiceData32BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_ServiceData128BitUuids(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_PublicTargetAddress(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_RandomTargetAddress(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_Appearance(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_AdvertisingInterval(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_ManufacturerSpecificData(): Byte {
      val fnPtr = _41181356_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__41181356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEAdvertisementDataTypesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __41181356_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementDataTypesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bb6472f0606434ba76e74159f0684d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementDataTypesStatics(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementDataTypesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementDataTypesStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementDataTypesStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementDataTypesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__41181356_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementDataTypesStatics):
        Array<IBluetoothLEAdvertisementDataTypesStatics?> = (elements as
        Array<IBluetoothLEAdvertisementDataTypesStatics?>).castToImpl<IBluetoothLEAdvertisementDataTypesStatics,IBluetoothLEAdvertisementDataTypesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementDataTypesStatics?> =
        arrayOfNulls<IBluetoothLEAdvertisementDataTypesStatics_Impl>(size) as
        Array<IBluetoothLEAdvertisementDataTypesStatics?>
  }
}
