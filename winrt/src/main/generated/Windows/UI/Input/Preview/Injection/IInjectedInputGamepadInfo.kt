package Windows.UI.Input.Preview.Injection

import Windows.Gaming.Input.GamepadButtons
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInjectedInputGamepadInfo.ABI::class)
@Signature("{20ae9a3f-df11-4572-a9ab-d75b8a5e48ad}")
@Guid("20ae9a3fdf114572a9abd75b8a5e48ad")
@WinRTInterface("20ae9a3fdf114572a9abd75b8a5e48ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputGamepadInfo.ByReference::class)
public interface IInjectedInputGamepadInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Buttons(): GamepadButtons?

  @InterfaceMethod(1)
  public fun put_Buttons(value: GamepadButtons?): Unit

  @InterfaceMethod(2)
  public fun get_LeftThumbstickX(): Double

  @InterfaceMethod(3)
  public fun put_LeftThumbstickX(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_LeftThumbstickY(): Double

  @InterfaceMethod(5)
  public fun put_LeftThumbstickY(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_LeftTrigger(): Double

  @InterfaceMethod(7)
  public fun put_LeftTrigger(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_RightThumbstickX(): Double

  @InterfaceMethod(9)
  public fun put_RightThumbstickX(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_RightThumbstickY(): Double

  @InterfaceMethod(11)
  public fun put_RightThumbstickY(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_RightTrigger(): Double

  @InterfaceMethod(13)
  public fun put_RightTrigger(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputGamepadInfo> {
    public override fun getValue() = ABI.makeIInjectedInputGamepadInfo(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputGamepadInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputGamepadInfo {
    public val __126227712_Ptr: Pointer?

    public val _126227712_VtblPtr: Pointer?
      get() = __126227712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Buttons(): GamepadButtons? {
      val fnPtr = _126227712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GamepadButtons>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GamepadButtons>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Buttons(value: GamepadButtons?): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LeftThumbstickX(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_LeftThumbstickX(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LeftThumbstickY(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_LeftThumbstickY(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LeftTrigger(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_LeftTrigger(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RightThumbstickX(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_RightThumbstickX(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RightThumbstickY(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_RightThumbstickY(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_RightTrigger(): Double {
      val fnPtr = _126227712_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_RightTrigger(value: Double): Unit {
      val fnPtr = _126227712_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126227712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInjectedInputGamepadInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __126227712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputGamepadInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20ae9a3fdf114572a9abd75b8a5e48ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputGamepadInfo(ptr: Pointer?): WithDefault =
        IInjectedInputGamepadInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputGamepadInfo {
      val address = segment.toRawLongValue()
      return makeIInjectedInputGamepadInfo(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputGamepadInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__126227712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputGamepadInfo):
        Array<IInjectedInputGamepadInfo?> = (elements as
        Array<IInjectedInputGamepadInfo?>).castToImpl<IInjectedInputGamepadInfo,IInjectedInputGamepadInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputGamepadInfo?> =
        arrayOfNulls<IInjectedInputGamepadInfo_Impl>(size) as Array<IInjectedInputGamepadInfo?>
  }
}
