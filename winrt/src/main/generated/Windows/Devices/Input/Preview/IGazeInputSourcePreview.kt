package Windows.Devices.Input.Preview

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGazeInputSourcePreview.ABI::class)
@Signature("{e79e7ee8-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7ee8b38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7ee8b38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeInputSourcePreview.ByReference::class)
public interface IGazeInputSourcePreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_GazeMoved(handler: TypedEventHandler<GazeInputSourcePreview?,
      GazeMovedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_GazeMoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_GazeEntered(handler: TypedEventHandler<GazeInputSourcePreview?,
      GazeEnteredPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_GazeEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_GazeExited(handler: TypedEventHandler<GazeInputSourcePreview?,
      GazeExitedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_GazeExited(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeInputSourcePreview> {
    public override fun getValue() = ABI.makeIGazeInputSourcePreview(pointer.getPointer(0))

    public fun setValue(value: IGazeInputSourcePreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeInputSourcePreview {
    public val __576828393_Ptr: Pointer?

    public val _576828393_VtblPtr: Pointer?
      get() = __576828393_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_GazeMoved(handler: TypedEventHandler<GazeInputSourcePreview?,
        GazeMovedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _576828393_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_GazeMoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _576828393_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_GazeEntered(handler: TypedEventHandler<GazeInputSourcePreview?,
        GazeEnteredPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _576828393_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_GazeEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _576828393_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_GazeExited(handler: TypedEventHandler<GazeInputSourcePreview?,
        GazeExitedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _576828393_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_GazeExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _576828393_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576828393_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGazeInputSourcePreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576828393_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeInputSourcePreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7ee8b38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeInputSourcePreview(ptr: Pointer?): WithDefault =
        IGazeInputSourcePreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeInputSourcePreview {
      val address = segment.toRawLongValue()
      return makeIGazeInputSourcePreview(Pointer(address))
    }

    public override fun toNative(obj: IGazeInputSourcePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576828393_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeInputSourcePreview): Array<IGazeInputSourcePreview?>
        = (elements as
        Array<IGazeInputSourcePreview?>).castToImpl<IGazeInputSourcePreview,IGazeInputSourcePreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeInputSourcePreview?> =
        arrayOfNulls<IGazeInputSourcePreview_Impl>(size) as Array<IGazeInputSourcePreview?>
  }
}
