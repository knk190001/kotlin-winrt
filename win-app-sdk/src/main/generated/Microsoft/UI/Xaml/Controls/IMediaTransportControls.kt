package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.FastPlayFallbackBehaviour
import Microsoft.UI.Xaml.Media.MediaTransportControlsThumbnailRequestedEventArgs
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTransportControls.ABI::class)
@Signature("{c99c110b-9dee-5a6b-bb9e-61bfcaaafa3e}")
@Guid("c99c110b9dee5a6bbb9e61bfcaaafa3e")
@WinRTInterface("c99c110b9dee5a6bbb9e61bfcaaafa3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControls.ByReference::class)
public interface IMediaTransportControls : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsZoomButtonVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsZoomButtonVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsZoomEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsZoomEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsFastForwardButtonVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsFastForwardButtonVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsFastForwardEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsFastForwardEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsFastRewindButtonVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_IsFastRewindButtonVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsFastRewindEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsFastRewindEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsStopButtonVisible(): Boolean

  @InterfaceMethod(13)
  public fun put_IsStopButtonVisible(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsStopEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsStopEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsVolumeButtonVisible(): Boolean

  @InterfaceMethod(17)
  public fun put_IsVolumeButtonVisible(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_IsVolumeEnabled(): Boolean

  @InterfaceMethod(19)
  public fun put_IsVolumeEnabled(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsPlaybackRateButtonVisible(): Boolean

  @InterfaceMethod(21)
  public fun put_IsPlaybackRateButtonVisible(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_IsPlaybackRateEnabled(): Boolean

  @InterfaceMethod(23)
  public fun put_IsPlaybackRateEnabled(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_IsSeekBarVisible(): Boolean

  @InterfaceMethod(25)
  public fun put_IsSeekBarVisible(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_IsSeekEnabled(): Boolean

  @InterfaceMethod(27)
  public fun put_IsSeekEnabled(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_IsCompact(): Boolean

  @InterfaceMethod(29)
  public fun put_IsCompact(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_IsSkipForwardButtonVisible(): Boolean

  @InterfaceMethod(31)
  public fun put_IsSkipForwardButtonVisible(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_IsSkipForwardEnabled(): Boolean

  @InterfaceMethod(33)
  public fun put_IsSkipForwardEnabled(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_IsSkipBackwardButtonVisible(): Boolean

  @InterfaceMethod(35)
  public fun put_IsSkipBackwardButtonVisible(value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_IsSkipBackwardEnabled(): Boolean

  @InterfaceMethod(37)
  public fun put_IsSkipBackwardEnabled(value: Boolean): Unit

  @InterfaceMethod(38)
  public fun get_IsNextTrackButtonVisible(): Boolean

  @InterfaceMethod(39)
  public fun put_IsNextTrackButtonVisible(value: Boolean): Unit

  @InterfaceMethod(40)
  public fun get_IsPreviousTrackButtonVisible(): Boolean

  @InterfaceMethod(41)
  public fun put_IsPreviousTrackButtonVisible(value: Boolean): Unit

  @InterfaceMethod(42)
  public fun get_FastPlayFallbackBehaviour(): FastPlayFallbackBehaviour?

  @InterfaceMethod(43)
  public fun put_FastPlayFallbackBehaviour(value: FastPlayFallbackBehaviour?): Unit

  @InterfaceMethod(44)
  public fun get_ShowAndHideAutomatically(): Boolean

  @InterfaceMethod(45)
  public fun put_ShowAndHideAutomatically(value: Boolean): Unit

  @InterfaceMethod(46)
  public fun get_IsRepeatEnabled(): Boolean

  @InterfaceMethod(47)
  public fun put_IsRepeatEnabled(value: Boolean): Unit

  @InterfaceMethod(48)
  public fun get_IsRepeatButtonVisible(): Boolean

  @InterfaceMethod(49)
  public fun put_IsRepeatButtonVisible(value: Boolean): Unit

  @InterfaceMethod(50)
  public fun add_ThumbnailRequested(handler: TypedEventHandler<MediaTransportControls?,
      MediaTransportControlsThumbnailRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_ThumbnailRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(52)
  public fun Show(): Unit

  @InterfaceMethod(53)
  public fun Hide(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControls> {
    public override fun getValue() = ABI.makeIMediaTransportControls(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControls_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControls {
    public val __1016966146_Ptr: Pointer?

    public val _1016966146_VtblPtr: Pointer?
      get() = __1016966146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsZoomButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsZoomButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsZoomEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsZoomEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsFastForwardButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsFastForwardButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsFastForwardEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsFastForwardEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsFastRewindButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsFastRewindButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsFastRewindEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsFastRewindEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsStopButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsStopButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsStopEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsStopEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsVolumeButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsVolumeButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsVolumeEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsVolumeEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsPlaybackRateButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsPlaybackRateButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IsPlaybackRateEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsPlaybackRateEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsSeekBarVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsSeekBarVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsSeekEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_IsSeekEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_IsCompact(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_IsCompact(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsSkipForwardButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_IsSkipForwardButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_IsSkipForwardEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_IsSkipForwardEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_IsSkipBackwardButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_IsSkipBackwardButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_IsSkipBackwardEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun put_IsSkipBackwardEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_IsNextTrackButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun put_IsNextTrackButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_IsPreviousTrackButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun put_IsPreviousTrackButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_FastPlayFallbackBehaviour(): FastPlayFallbackBehaviour? {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FastPlayFallbackBehaviour>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FastPlayFallbackBehaviour>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_FastPlayFallbackBehaviour(value: FastPlayFallbackBehaviour?): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_ShowAndHideAutomatically(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun put_ShowAndHideAutomatically(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_IsRepeatEnabled(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_IsRepeatEnabled(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_IsRepeatButtonVisible(): Boolean {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun put_IsRepeatButtonVisible(value: Boolean): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun add_ThumbnailRequested(handler: TypedEventHandler<MediaTransportControls?,
        MediaTransportControlsThumbnailRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_ThumbnailRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun Show(): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun Hide(): Unit {
      val fnPtr = _1016966146_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016966146_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTransportControls_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016966146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControls, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c99c110b9dee5a6bbb9e61bfcaaafa3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControls(ptr: Pointer?): WithDefault =
        IMediaTransportControls_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControls {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControls(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControls): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016966146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControls): Array<IMediaTransportControls?>
        = (elements as
        Array<IMediaTransportControls?>).castToImpl<IMediaTransportControls,IMediaTransportControls_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControls?> =
        arrayOfNulls<IMediaTransportControls_Impl>(size) as Array<IMediaTransportControls?>
  }
}
