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

@ABIMarker(IBluetoothLEAppearanceSubcategoriesStatics.ABI::class)
@Signature("{e57ba606-2144-415a-8312-71ccf291f8d1}")
@Guid("e57ba6062144415a831271ccf291f8d1")
@WinRTInterface("e57ba6062144415a831271ccf291f8d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAppearanceSubcategoriesStatics.ByReference::class)
public interface IBluetoothLEAppearanceSubcategoriesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Generic(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_SportsWatch(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_ThermometerEar(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_HeartRateBelt(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_BloodPressureArm(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_BloodPressureWrist(): WinDef.USHORT

  @InterfaceMethod(6)
  public fun get_Keyboard(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun get_Mouse(): WinDef.USHORT

  @InterfaceMethod(8)
  public fun get_Joystick(): WinDef.USHORT

  @InterfaceMethod(9)
  public fun get_Gamepad(): WinDef.USHORT

  @InterfaceMethod(10)
  public fun get_DigitizerTablet(): WinDef.USHORT

  @InterfaceMethod(11)
  public fun get_CardReader(): WinDef.USHORT

  @InterfaceMethod(12)
  public fun get_DigitalPen(): WinDef.USHORT

  @InterfaceMethod(13)
  public fun get_BarcodeScanner(): WinDef.USHORT

  @InterfaceMethod(14)
  public fun get_RunningWalkingInShoe(): WinDef.USHORT

  @InterfaceMethod(15)
  public fun get_RunningWalkingOnShoe(): WinDef.USHORT

  @InterfaceMethod(16)
  public fun get_RunningWalkingOnHip(): WinDef.USHORT

  @InterfaceMethod(17)
  public fun get_CyclingComputer(): WinDef.USHORT

  @InterfaceMethod(18)
  public fun get_CyclingSpeedSensor(): WinDef.USHORT

  @InterfaceMethod(19)
  public fun get_CyclingCadenceSensor(): WinDef.USHORT

  @InterfaceMethod(20)
  public fun get_CyclingPowerSensor(): WinDef.USHORT

  @InterfaceMethod(21)
  public fun get_CyclingSpeedCadenceSensor(): WinDef.USHORT

  @InterfaceMethod(22)
  public fun get_OximeterFingertip(): WinDef.USHORT

  @InterfaceMethod(23)
  public fun get_OximeterWristWorn(): WinDef.USHORT

  @InterfaceMethod(24)
  public fun get_LocationDisplay(): WinDef.USHORT

  @InterfaceMethod(25)
  public fun get_LocationNavigationDisplay(): WinDef.USHORT

  @InterfaceMethod(26)
  public fun get_LocationPod(): WinDef.USHORT

  @InterfaceMethod(27)
  public fun get_LocationNavigationPod(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAppearanceSubcategoriesStatics> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAppearanceSubcategoriesStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAppearanceSubcategoriesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAppearanceSubcategoriesStatics {
    public val __1503812573_Ptr: Pointer?

    public val _1503812573_VtblPtr: Pointer?
      get() = __1503812573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Generic(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SportsWatch(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ThermometerEar(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_HeartRateBelt(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_BloodPressureArm(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_BloodPressureWrist(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Keyboard(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Mouse(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Joystick(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Gamepad(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_DigitizerTablet(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_CardReader(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_DigitalPen(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_BarcodeScanner(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_RunningWalkingInShoe(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_RunningWalkingOnShoe(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_RunningWalkingOnHip(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_CyclingComputer(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_CyclingSpeedSensor(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_CyclingCadenceSensor(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_CyclingPowerSensor(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_CyclingSpeedCadenceSensor(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun get_OximeterFingertip(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun get_OximeterWristWorn(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun get_LocationDisplay(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_LocationNavigationDisplay(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun get_LocationPod(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun get_LocationNavigationPod(): WinDef.USHORT {
      val fnPtr = _1503812573_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1503812573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEAppearanceSubcategoriesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503812573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAppearanceSubcategoriesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e57ba6062144415a831271ccf291f8d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAppearanceSubcategoriesStatics(ptr: Pointer?): WithDefault =
        IBluetoothLEAppearanceSubcategoriesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAppearanceSubcategoriesStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAppearanceSubcategoriesStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAppearanceSubcategoriesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503812573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAppearanceSubcategoriesStatics):
        Array<IBluetoothLEAppearanceSubcategoriesStatics?> = (elements as
        Array<IBluetoothLEAppearanceSubcategoriesStatics?>).castToImpl<IBluetoothLEAppearanceSubcategoriesStatics,IBluetoothLEAppearanceSubcategoriesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAppearanceSubcategoriesStatics?> =
        arrayOfNulls<IBluetoothLEAppearanceSubcategoriesStatics_Impl>(size) as
        Array<IBluetoothLEAppearanceSubcategoriesStatics?>
  }
}
