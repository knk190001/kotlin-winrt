package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Media.FastPlayFallbackBehaviour
import Windows.UI.Xaml.Media.MediaTransportControlsThumbnailRequestedEventArgs
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

@ABIMarker(IMediaTransportControls2.ABI::class)
@Signature("{2b89efec-1bea-451e-8bcd-cfe2d9423262}")
@Guid("2b89efec1bea451e8bcdcfe2d9423262")
@WinRTInterface("2b89efec1bea451e8bcdcfe2d9423262")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControls2.ByReference::class)
public interface IMediaTransportControls2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSkipForwardButtonVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSkipForwardButtonVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsSkipForwardEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsSkipForwardEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsSkipBackwardButtonVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsSkipBackwardButtonVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsSkipBackwardEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsSkipBackwardEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsNextTrackButtonVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_IsNextTrackButtonVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsPreviousTrackButtonVisible(): Boolean

  @InterfaceMethod(11)
  public fun put_IsPreviousTrackButtonVisible(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_FastPlayFallbackBehaviour(): FastPlayFallbackBehaviour?

  @InterfaceMethod(13)
  public fun put_FastPlayFallbackBehaviour(value: FastPlayFallbackBehaviour?): Unit

  @InterfaceMethod(14)
  public fun add_ThumbnailRequested(handler: TypedEventHandler<MediaTransportControls?,
      MediaTransportControlsThumbnailRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_ThumbnailRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControls2> {
    public override fun getValue() = ABI.makeIMediaTransportControls2(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControls2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControls2 {
    public val __1776678523_Ptr: Pointer?

    public val _1776678523_VtblPtr: Pointer?
      get() = __1776678523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSkipForwardButtonVisible(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSkipForwardButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsSkipForwardEnabled(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsSkipForwardEnabled(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsSkipBackwardButtonVisible(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsSkipBackwardButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsSkipBackwardEnabled(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsSkipBackwardEnabled(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsNextTrackButtonVisible(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsNextTrackButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsPreviousTrackButtonVisible(): Boolean {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsPreviousTrackButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_FastPlayFallbackBehaviour(): FastPlayFallbackBehaviour? {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FastPlayFallbackBehaviour>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FastPlayFallbackBehaviour>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FastPlayFallbackBehaviour(value: FastPlayFallbackBehaviour?): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_ThumbnailRequested(handler: TypedEventHandler<MediaTransportControls?,
        MediaTransportControlsThumbnailRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_ThumbnailRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1776678523_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTransportControls2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1776678523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControls2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b89efec1bea451e8bcdcfe2d9423262")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControls2(ptr: Pointer?): WithDefault =
        IMediaTransportControls2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControls2 {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControls2(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControls2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1776678523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControls2):
        Array<IMediaTransportControls2?> = (elements as
        Array<IMediaTransportControls2?>).castToImpl<IMediaTransportControls2,IMediaTransportControls2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControls2?> =
        arrayOfNulls<IMediaTransportControls2_Impl>(size) as Array<IMediaTransportControls2?>
  }
}
