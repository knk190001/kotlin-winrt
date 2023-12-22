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

@ABIMarker(IMiracastReceiverKeyboardDevice.ABI::class)
@Signature("{beb67272-06c0-54ff-ac96-217464ff2501}")
@Guid("beb6727206c054ffac96217464ff2501")
@WinRTInterface("beb6727206c054ffac96217464ff2501")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverKeyboardDevice.ByReference::class)
public interface IMiracastReceiverKeyboardDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransmitInput(): Boolean

  @InterfaceMethod(1)
  public fun put_TransmitInput(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsRequestedByTransmitter(): Boolean

  @InterfaceMethod(3)
  public fun get_IsTransmittingInput(): Boolean

  @InterfaceMethod(4)
  public fun add_Changed(handler: TypedEventHandler<MiracastReceiverKeyboardDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverKeyboardDevice> {
    public override fun getValue() = ABI.makeIMiracastReceiverKeyboardDevice(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverKeyboardDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverKeyboardDevice {
    public val __166707616_Ptr: Pointer?

    public val _166707616_VtblPtr: Pointer?
      get() = __166707616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransmitInput(): Boolean {
      val fnPtr = _166707616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TransmitInput(value: Boolean): Unit {
      val fnPtr = _166707616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsRequestedByTransmitter(): Boolean {
      val fnPtr = _166707616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsTransmittingInput(): Boolean {
      val fnPtr = _166707616_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_Changed(handler: TypedEventHandler<MiracastReceiverKeyboardDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _166707616_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _166707616_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__166707616_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverKeyboardDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __166707616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverKeyboardDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("beb6727206c054ffac96217464ff2501")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverKeyboardDevice(ptr: Pointer?): WithDefault =
        IMiracastReceiverKeyboardDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverKeyboardDevice {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverKeyboardDevice(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverKeyboardDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__166707616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverKeyboardDevice):
        Array<IMiracastReceiverKeyboardDevice?> = (elements as
        Array<IMiracastReceiverKeyboardDevice?>).castToImpl<IMiracastReceiverKeyboardDevice,IMiracastReceiverKeyboardDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverKeyboardDevice?> =
        arrayOfNulls<IMiracastReceiverKeyboardDevice_Impl>(size) as
        Array<IMiracastReceiverKeyboardDevice?>
  }
}
