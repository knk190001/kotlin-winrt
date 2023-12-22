package Windows.Media.Miracast

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMiracastReceiverGameControllerDevice.ABI::class)
@Signature("{2d7171e8-bed4-5118-a058-e2477eb5888d}")
@Guid("2d7171e8bed45118a058e2477eb5888d")
@WinRTInterface("2d7171e8bed45118a058e2477eb5888d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverGameControllerDevice.ByReference::class)
public interface IMiracastReceiverGameControllerDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransmitInput(): Boolean

  @InterfaceMethod(1)
  public fun put_TransmitInput(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsRequestedByTransmitter(): Boolean

  @InterfaceMethod(3)
  public fun get_IsTransmittingInput(): Boolean

  @InterfaceMethod(4)
  public fun get_Mode(): MiracastReceiverGameControllerDeviceUsageMode?

  @InterfaceMethod(5)
  public fun put_Mode(value: MiracastReceiverGameControllerDeviceUsageMode?): Unit

  @InterfaceMethod(6)
  public fun add_Changed(handler: TypedEventHandler<MiracastReceiverGameControllerDevice?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverGameControllerDevice> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverGameControllerDevice(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverGameControllerDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverGameControllerDevice {
    public val __1939210201_Ptr: Pointer?

    public val _1939210201_VtblPtr: Pointer?
      get() = __1939210201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransmitInput(): Boolean {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TransmitInput(value: Boolean): Unit {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsRequestedByTransmitter(): Boolean {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsTransmittingInput(): Boolean {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Mode(): MiracastReceiverGameControllerDeviceUsageMode? {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverGameControllerDeviceUsageMode>()
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MiracastReceiverGameControllerDeviceUsageMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Mode(value: MiracastReceiverGameControllerDeviceUsageMode?): Unit {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_Changed(handler: TypedEventHandler<MiracastReceiverGameControllerDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1939210201_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939210201_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverGameControllerDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939210201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverGameControllerDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d7171e8bed45118a058e2477eb5888d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverGameControllerDevice(ptr: Pointer?): WithDefault =
        IMiracastReceiverGameControllerDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverGameControllerDevice {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverGameControllerDevice(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverGameControllerDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939210201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverGameControllerDevice):
        Array<IMiracastReceiverGameControllerDevice?> = (elements as
        Array<IMiracastReceiverGameControllerDevice?>).castToImpl<IMiracastReceiverGameControllerDevice,IMiracastReceiverGameControllerDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverGameControllerDevice?> =
        arrayOfNulls<IMiracastReceiverGameControllerDevice_Impl>(size) as
        Array<IMiracastReceiverGameControllerDevice?>
  }
}
