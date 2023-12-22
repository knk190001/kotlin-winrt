package Windows.Devices.Gpio

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGpioController.ABI::class)
@Signature("{284012e3-7461-469c-a8bc-61d69d08a53c}")
@Guid("284012e37461469ca8bc61d69d08a53c")
@WinRTInterface("284012e37461469ca8bc61d69d08a53c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioController.ByReference::class)
public interface IGpioController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinCount(): Int

  @InterfaceMethod(1)
  public fun OpenPin(pinNumber: Int): GpioPin?

  @InterfaceMethod(2)
  public fun OpenPin(pinNumber: Int, sharingMode: GpioSharingMode?): GpioPin?

  @InterfaceMethod(3)
  public fun TryOpenPin(
    pinNumber: Int,
    sharingMode: GpioSharingMode?,
    pin: Windows.Devices.Gpio.GpioPin.ByReference?,
    openStatus: Windows.Devices.Gpio.GpioOpenStatus.ByReference?
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioController> {
    public override fun getValue() = ABI.makeIGpioController(pointer.getPointer(0))

    public fun setValue(value: IGpioController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioController {
    public val __1425545751_Ptr: Pointer?

    public val _1425545751_VtblPtr: Pointer?
      get() = __1425545751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinCount(): Int {
      val fnPtr = _1425545751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1425545751_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun OpenPin(pinNumber: Int): GpioPin? {
      val fnPtr = _1425545751_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioPin>()
      val hr = fn.invokeHR(arrayOf(__1425545751_Ptr, pinNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioPin>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun OpenPin(pinNumber: Int, sharingMode: GpioSharingMode?): GpioPin? {
      val fnPtr = _1425545751_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioPin>()
      val hr = fn.invokeHR(arrayOf(__1425545751_Ptr, pinNumber, marshalToNative(sharingMode),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioPin>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryOpenPin(
      pinNumber: Int,
      sharingMode: GpioSharingMode?,
      pin: Windows.Devices.Gpio.GpioPin.ByReference?,
      openStatus: Windows.Devices.Gpio.GpioOpenStatus.ByReference?
    ): Boolean {
      val fnPtr = _1425545751_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1425545751_Ptr, pinNumber, marshalToNative(sharingMode),
          marshalToNative(pin), marshalToNative(openStatus), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGpioController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1425545751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("284012e37461469ca8bc61d69d08a53c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioController(ptr: Pointer?): WithDefault = IGpioController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioController {
      val address = segment.toRawLongValue()
      return makeIGpioController(Pointer(address))
    }

    public override fun toNative(obj: IGpioController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1425545751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioController): Array<IGpioController?> = (elements as
        Array<IGpioController?>).castToImpl<IGpioController,IGpioController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioController?> =
        arrayOfNulls<IGpioController_Impl>(size) as Array<IGpioController?>
  }
}
