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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGazeDeviceWatcherPreview.ABI::class)
@Signature("{e79e7ee7-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7ee7b38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7ee7b38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeDeviceWatcherPreview.ByReference::class)
public interface IGazeDeviceWatcherPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Added(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
      GazeDeviceWatcherAddedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Removed(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
      GazeDeviceWatcherRemovedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Updated(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
      GazeDeviceWatcherUpdatedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun Start(): Unit

  @InterfaceMethod(9)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeDeviceWatcherPreview> {
    public override fun getValue() = ABI.makeIGazeDeviceWatcherPreview(pointer.getPointer(0))

    public fun setValue(value: IGazeDeviceWatcherPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeDeviceWatcherPreview {
    public val __1656661320_Ptr: Pointer?

    public val _1656661320_VtblPtr: Pointer?
      get() = __1656661320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Added(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
        GazeDeviceWatcherAddedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Removed(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
        GazeDeviceWatcherRemovedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Updated(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
        GazeDeviceWatcherUpdatedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<GazeDeviceWatcherPreview?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Start(): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Stop(): Unit {
      val fnPtr = _1656661320_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656661320_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGazeDeviceWatcherPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1656661320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeDeviceWatcherPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7ee7b38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeDeviceWatcherPreview(ptr: Pointer?): WithDefault =
        IGazeDeviceWatcherPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeDeviceWatcherPreview {
      val address = segment.toRawLongValue()
      return makeIGazeDeviceWatcherPreview(Pointer(address))
    }

    public override fun toNative(obj: IGazeDeviceWatcherPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656661320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeDeviceWatcherPreview):
        Array<IGazeDeviceWatcherPreview?> = (elements as
        Array<IGazeDeviceWatcherPreview?>).castToImpl<IGazeDeviceWatcherPreview,IGazeDeviceWatcherPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeDeviceWatcherPreview?> =
        arrayOfNulls<IGazeDeviceWatcherPreview_Impl>(size) as Array<IGazeDeviceWatcherPreview?>
  }
}
