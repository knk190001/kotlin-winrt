package Windows.Devices.Input

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

@ABIMarker(IPenDockListener.ABI::class)
@Signature("{759f4d90-1dc0-55cb-ad18-b9101456f592}")
@Guid("759f4d901dc055cbad18b9101456f592")
@WinRTInterface("759f4d901dc055cbad18b9101456f592")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDockListener.ByReference::class)
public interface IPenDockListener : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun add_IsSupportedChanged(handler: TypedEventHandler<PenDockListener?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_IsSupportedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Docked(handler: TypedEventHandler<PenDockListener?, PenDockedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Docked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Undocked(handler: TypedEventHandler<PenDockListener?, PenUndockedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Undocked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenDockListener> {
    public override fun getValue() = ABI.makeIPenDockListener(pointer.getPointer(0))

    public fun setValue(value: IPenDockListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDockListener {
    public val __509652187_Ptr: Pointer?

    public val _509652187_VtblPtr: Pointer?
      get() = __509652187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _509652187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_IsSupportedChanged(handler: TypedEventHandler<PenDockListener?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _509652187_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_IsSupportedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _509652187_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Docked(handler: TypedEventHandler<PenDockListener?,
        PenDockedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _509652187_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Docked(token: EventRegistrationToken?): Unit {
      val fnPtr = _509652187_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Undocked(handler: TypedEventHandler<PenDockListener?,
        PenUndockedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _509652187_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Undocked(token: EventRegistrationToken?): Unit {
      val fnPtr = _509652187_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__509652187_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPenDockListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __509652187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDockListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("759f4d901dc055cbad18b9101456f592")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDockListener(ptr: Pointer?): WithDefault = IPenDockListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDockListener {
      val address = segment.toRawLongValue()
      return makeIPenDockListener(Pointer(address))
    }

    public override fun toNative(obj: IPenDockListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__509652187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDockListener): Array<IPenDockListener?> = (elements as
        Array<IPenDockListener?>).castToImpl<IPenDockListener,IPenDockListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDockListener?> =
        arrayOfNulls<IPenDockListener_Impl>(size) as Array<IPenDockListener?>
  }
}
