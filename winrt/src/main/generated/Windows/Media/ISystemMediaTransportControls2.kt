package Windows.Media

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemMediaTransportControls2.ABI::class)
@Signature("{ea98d2f6-7f3c-4af2-a586-72889808efb1}")
@Guid("ea98d2f67f3c4af2a58672889808efb1")
@WinRTInterface("ea98d2f67f3c4af2a58672889808efb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControls2.ByReference::class)
public interface ISystemMediaTransportControls2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoRepeatMode(): MediaPlaybackAutoRepeatMode?

  @InterfaceMethod(1)
  public fun put_AutoRepeatMode(value: MediaPlaybackAutoRepeatMode?): Unit

  @InterfaceMethod(2)
  public fun get_ShuffleEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_ShuffleEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PlaybackRate(): Double

  @InterfaceMethod(5)
  public fun put_PlaybackRate(value: Double): Unit

  @InterfaceMethod(6)
  public
      fun UpdateTimelineProperties(timelineProperties: SystemMediaTransportControlsTimelineProperties?):
      Unit

  @InterfaceMethod(7)
  public
      fun add_PlaybackPositionChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
      PlaybackPositionChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PlaybackPositionChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public
      fun add_PlaybackRateChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
      PlaybackRateChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_PlaybackRateChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public
      fun add_ShuffleEnabledChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
      ShuffleEnabledChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_ShuffleEnabledChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public
      fun add_AutoRepeatModeChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
      AutoRepeatModeChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_AutoRepeatModeChangeRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControls2> {
    public override fun getValue() = ABI.makeISystemMediaTransportControls2(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControls2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControls2 {
    public val __902670808_Ptr: Pointer?

    public val _902670808_VtblPtr: Pointer?
      get() = __902670808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoRepeatMode(): MediaPlaybackAutoRepeatMode? {
      val fnPtr = _902670808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackAutoRepeatMode>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackAutoRepeatMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AutoRepeatMode(value: MediaPlaybackAutoRepeatMode?): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ShuffleEnabled(): Boolean {
      val fnPtr = _902670808_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ShuffleEnabled(value: Boolean): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PlaybackRate(): Double {
      val fnPtr = _902670808_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_PlaybackRate(value: Double): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun UpdateTimelineProperties(timelineProperties: SystemMediaTransportControlsTimelineProperties?):
        Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(timelineProperties),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override
        fun add_PlaybackPositionChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
        PlaybackPositionChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _902670808_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PlaybackPositionChangeRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun add_PlaybackRateChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
        PlaybackRateChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _902670808_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_PlaybackRateChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override
        fun add_ShuffleEnabledChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
        ShuffleEnabledChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _902670808_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_ShuffleEnabledChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override
        fun add_AutoRepeatModeChangeRequested(handler: TypedEventHandler<SystemMediaTransportControls?,
        AutoRepeatModeChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _902670808_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_AutoRepeatModeChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _902670808_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__902670808_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemMediaTransportControls2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __902670808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControls2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea98d2f67f3c4af2a58672889808efb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControls2(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControls2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMediaTransportControls2 {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControls2(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControls2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__902670808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControls2):
        Array<ISystemMediaTransportControls2?> = (elements as
        Array<ISystemMediaTransportControls2?>).castToImpl<ISystemMediaTransportControls2,ISystemMediaTransportControls2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaTransportControls2?> =
        arrayOfNulls<ISystemMediaTransportControls2_Impl>(size) as
        Array<ISystemMediaTransportControls2?>
  }
}
