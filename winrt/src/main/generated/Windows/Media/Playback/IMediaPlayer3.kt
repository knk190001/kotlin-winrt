package Windows.Media.Playback

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Casting.CastingSource
import Windows.Media.MediaTimelineController
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlayer3.ABI::class)
@Signature("{ee0660da-031b-4feb-bd9b-92e0a0a8d299}")
@Guid("ee0660da031b4febbd9b92e0a0a8d299")
@WinRTInterface("ee0660da031b4febbd9b92e0a0a8d299")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer3.ByReference::class)
public interface IMediaPlayer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_IsMutedChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_IsMutedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_AudioBalance(): Double

  @InterfaceMethod(5)
  public fun put_AudioBalance(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_RealTimePlayback(): Boolean

  @InterfaceMethod(7)
  public fun put_RealTimePlayback(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_StereoscopicVideoRenderMode(): StereoscopicVideoRenderMode?

  @InterfaceMethod(9)
  public fun put_StereoscopicVideoRenderMode(value: StereoscopicVideoRenderMode?): Unit

  @InterfaceMethod(10)
  public fun get_BreakManager(): MediaBreakManager?

  @InterfaceMethod(11)
  public fun get_CommandManager(): MediaPlaybackCommandManager?

  @InterfaceMethod(12)
  public fun get_AudioDevice(): DeviceInformation?

  @InterfaceMethod(13)
  public fun put_AudioDevice(value: DeviceInformation?): Unit

  @InterfaceMethod(14)
  public fun get_TimelineController(): MediaTimelineController?

  @InterfaceMethod(15)
  public fun put_TimelineController(value: MediaTimelineController?): Unit

  @InterfaceMethod(16)
  public fun get_TimelineControllerPositionOffset(): TimeSpan?

  @InterfaceMethod(17)
  public fun put_TimelineControllerPositionOffset(value: TimeSpan?): Unit

  @InterfaceMethod(18)
  public fun get_PlaybackSession(): MediaPlaybackSession?

  @InterfaceMethod(19)
  public fun StepForwardOneFrame(): Unit

  @InterfaceMethod(20)
  public fun StepBackwardOneFrame(): Unit

  @InterfaceMethod(21)
  public fun GetAsCastingSource(): CastingSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer3>
      {
    public override fun getValue() = ABI.makeIMediaPlayer3(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer3 {
    public val __1314081337_Ptr: Pointer?

    public val _1314081337_VtblPtr: Pointer?
      get() = __1314081337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_IsMutedChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_IsMutedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SourceChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AudioBalance(): Double {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AudioBalance(value: Double): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RealTimePlayback(): Boolean {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RealTimePlayback(value: Boolean): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_StereoscopicVideoRenderMode(): StereoscopicVideoRenderMode? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StereoscopicVideoRenderMode>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StereoscopicVideoRenderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_StereoscopicVideoRenderMode(value: StereoscopicVideoRenderMode?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BreakManager(): MediaBreakManager? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreakManager>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreakManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CommandManager(): MediaPlaybackCommandManager? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManager>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackCommandManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_AudioDevice(): DeviceInformation? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_AudioDevice(value: DeviceInformation?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TimelineController(): MediaTimelineController? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTimelineController>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTimelineController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TimelineController(value: MediaTimelineController?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TimelineControllerPositionOffset(): TimeSpan? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TimelineControllerPositionOffset(value: TimeSpan?): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PlaybackSession(): MediaPlaybackSession? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackSession>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun StepForwardOneFrame(): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun StepBackwardOneFrame(): Unit {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun GetAsCastingSource(): CastingSource? {
      val fnPtr = _1314081337_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingSource>()
      val hr = fn.invokeHR(arrayOf(__1314081337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee0660da031b4febbd9b92e0a0a8d299")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer3(ptr: Pointer?): WithDefault = IMediaPlayer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer3 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer3(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer3): Array<IMediaPlayer3?> = (elements as
        Array<IMediaPlayer3?>).castToImpl<IMediaPlayer3,IMediaPlayer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer3?> =
        arrayOfNulls<IMediaPlayer3_Impl>(size) as Array<IMediaPlayer3?>
  }
}
