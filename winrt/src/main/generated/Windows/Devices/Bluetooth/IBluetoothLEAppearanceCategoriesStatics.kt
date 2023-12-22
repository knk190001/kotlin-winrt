package Windows.Devices.Bluetooth

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAppearanceCategoriesStatics.ABI::class)
@Signature("{6d4d54fe-046a-4185-aab6-824cf0610861}")
@Guid("6d4d54fe046a4185aab6824cf0610861")
@WinRTInterface("6d4d54fe046a4185aab6824cf0610861")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAppearanceCategoriesStatics.ByReference::class)
public interface IBluetoothLEAppearanceCategoriesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uncategorized(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Phone(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_Computer(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_Watch(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_Clock(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_Display(): WinDef.USHORT

  @InterfaceMethod(6)
  public fun get_RemoteControl(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun get_EyeGlasses(): WinDef.USHORT

  @InterfaceMethod(8)
  public fun get_Tag(): WinDef.USHORT

  @InterfaceMethod(9)
  public fun get_Keyring(): WinDef.USHORT

  @InterfaceMethod(10)
  public fun get_MediaPlayer(): WinDef.USHORT

  @InterfaceMethod(11)
  public fun get_BarcodeScanner(): WinDef.USHORT

  @InterfaceMethod(12)
  public fun get_Thermometer(): WinDef.USHORT

  @InterfaceMethod(13)
  public fun get_HeartRate(): WinDef.USHORT

  @InterfaceMethod(14)
  public fun get_BloodPressure(): WinDef.USHORT

  @InterfaceMethod(15)
  public fun get_HumanInterfaceDevice(): WinDef.USHORT

  @InterfaceMethod(16)
  public fun get_GlucoseMeter(): WinDef.USHORT

  @InterfaceMethod(17)
  public fun get_RunningWalking(): WinDef.USHORT

  @InterfaceMethod(18)
  public fun get_Cycling(): WinDef.USHORT

  @InterfaceMethod(19)
  public fun get_PulseOximeter(): WinDef.USHORT

  @InterfaceMethod(20)
  public fun get_WeightScale(): WinDef.USHORT

  @InterfaceMethod(21)
  public fun get_OutdoorSportActivity(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAppearanceCategoriesStatics> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAppearanceCategoriesStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAppearanceCategoriesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAppearanceCategoriesStatics {
    public val __2088224139_Ptr: Pointer?

    public val _2088224139_VtblPtr: Pointer?
      get() = __2088224139_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uncategorized(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Phone(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Computer(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Watch(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Clock(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Display(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_RemoteControl(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_EyeGlasses(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Tag(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Keyring(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_MediaPlayer(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_BarcodeScanner(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_Thermometer(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_HeartRate(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_BloodPressure(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_HumanInterfaceDevice(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_GlucoseMeter(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_RunningWalking(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_Cycling(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_PulseOximeter(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_WeightScale(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_OutdoorSportActivity(): WinDef.USHORT {
      val fnPtr = _2088224139_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2088224139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEAppearanceCategoriesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2088224139_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAppearanceCategoriesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d4d54fe046a4185aab6824cf0610861")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAppearanceCategoriesStatics(ptr: Pointer?): WithDefault =
        IBluetoothLEAppearanceCategoriesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAppearanceCategoriesStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAppearanceCategoriesStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAppearanceCategoriesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2088224139_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAppearanceCategoriesStatics):
        Array<IBluetoothLEAppearanceCategoriesStatics?> = (elements as
        Array<IBluetoothLEAppearanceCategoriesStatics?>).castToImpl<IBluetoothLEAppearanceCategoriesStatics,IBluetoothLEAppearanceCategoriesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAppearanceCategoriesStatics?> =
        arrayOfNulls<IBluetoothLEAppearanceCategoriesStatics_Impl>(size) as
        Array<IBluetoothLEAppearanceCategoriesStatics?>
  }
}
