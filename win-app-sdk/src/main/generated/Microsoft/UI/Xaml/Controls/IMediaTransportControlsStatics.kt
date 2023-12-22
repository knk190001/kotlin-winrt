package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IMediaTransportControlsStatics.ABI::class)
@Signature("{f497067e-7c41-5083-96c5-b6881d88b187}")
@Guid("f497067e7c41508396c5b6881d88b187")
@WinRTInterface("f497067e7c41508396c5b6881d88b187")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsStatics.ByReference::class)
public interface IMediaTransportControlsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsZoomButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsZoomEnabledProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsFastForwardButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsFastForwardEnabledProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsFastRewindButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsFastRewindEnabledProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsStopButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsStopEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_IsVolumeButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_IsVolumeEnabledProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_IsPlaybackRateButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_IsPlaybackRateEnabledProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_IsSeekBarVisibleProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_IsSeekEnabledProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_IsCompactProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_IsSkipForwardButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_IsSkipForwardEnabledProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_IsSkipBackwardButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_IsSkipBackwardEnabledProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_IsNextTrackButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_IsPreviousTrackButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_FastPlayFallbackBehaviourProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_ShowAndHideAutomaticallyProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_IsRepeatEnabledProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_IsRepeatButtonVisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsStatics> {
    public override fun getValue() = ABI.makeIMediaTransportControlsStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsStatics {
    public val __724581021_Ptr: Pointer?

    public val _724581021_VtblPtr: Pointer?
      get() = __724581021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsZoomButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsZoomEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsFastForwardButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsFastForwardEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsFastRewindButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsFastRewindEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsStopButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsStopEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsVolumeButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsVolumeEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsPlaybackRateButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsPlaybackRateEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsSeekBarVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IsSeekEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IsCompactProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_IsSkipForwardButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_IsSkipForwardEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_IsSkipBackwardButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_IsSkipBackwardEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_IsNextTrackButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_IsPreviousTrackButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_FastPlayFallbackBehaviourProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_ShowAndHideAutomaticallyProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_IsRepeatEnabledProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_IsRepeatButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _724581021_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__724581021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTransportControlsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __724581021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f497067e7c41508396c5b6881d88b187")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsStatics(ptr: Pointer?): WithDefault =
        IMediaTransportControlsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControlsStatics {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__724581021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsStatics):
        Array<IMediaTransportControlsStatics?> = (elements as
        Array<IMediaTransportControlsStatics?>).castToImpl<IMediaTransportControlsStatics,IMediaTransportControlsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsStatics?> =
        arrayOfNulls<IMediaTransportControlsStatics_Impl>(size) as
        Array<IMediaTransportControlsStatics?>
  }
}
