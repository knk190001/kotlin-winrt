package Windows.Media.Control

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.MediaPlaybackAutoRepeatMode
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGlobalSystemMediaTransportControlsSession.ABI::class)
@Signature("{7148c835-9b14-5ae2-ab85-dc9b1c14e1a8}")
@Guid("7148c8359b145ae2ab85dc9b1c14e1a8")
@WinRTInterface("7148c8359b145ae2ab85dc9b1c14e1a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlobalSystemMediaTransportControlsSession.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceAppUserModelId(): String?

  @InterfaceMethod(1)
  public fun TryGetMediaPropertiesAsync():
      IAsyncOperation<GlobalSystemMediaTransportControlsSessionMediaProperties?>?

  @InterfaceMethod(2)
  public fun GetTimelineProperties(): GlobalSystemMediaTransportControlsSessionTimelineProperties?

  @InterfaceMethod(3)
  public fun GetPlaybackInfo(): GlobalSystemMediaTransportControlsSessionPlaybackInfo?

  @InterfaceMethod(4)
  public fun TryPlayAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun TryPauseAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun TryStopAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun TryRecordAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun TryFastForwardAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(9)
  public fun TryRewindAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(10)
  public fun TrySkipNextAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(11)
  public fun TrySkipPreviousAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(12)
  public fun TryChangeChannelUpAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun TryChangeChannelDownAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(14)
  public fun TryTogglePlayPauseAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun TryChangeAutoRepeatModeAsync(requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(16)
  public fun TryChangePlaybackRateAsync(requestedPlaybackRate: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(17)
  public fun TryChangeShuffleActiveAsync(requestedShuffleState: Boolean): IAsyncOperation<Boolean>?

  @InterfaceMethod(18)
  public fun TryChangePlaybackPositionAsync(requestedPlaybackPosition: Long):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(19)
  public
      fun add_TimelinePropertiesChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
      TimelinePropertiesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_TimelinePropertiesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public
      fun add_PlaybackInfoChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
      PlaybackInfoChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_PlaybackInfoChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public
      fun add_MediaPropertiesChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
      MediaPropertiesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_MediaPropertiesChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSession> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSession(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSession {
    public val __717736312_Ptr: Pointer?

    public val _717736312_VtblPtr: Pointer?
      get() = __717736312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceAppUserModelId(): String? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetMediaPropertiesAsync():
        IAsyncOperation<GlobalSystemMediaTransportControlsSessionMediaProperties?>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<GlobalSystemMediaTransportControlsSessionMediaProperties?>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GlobalSystemMediaTransportControlsSessionMediaProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetTimelineProperties():
        GlobalSystemMediaTransportControlsSessionTimelineProperties? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<GlobalSystemMediaTransportControlsSessionTimelineProperties>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<GlobalSystemMediaTransportControlsSessionTimelineProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetPlaybackInfo(): GlobalSystemMediaTransportControlsSessionPlaybackInfo? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GlobalSystemMediaTransportControlsSessionPlaybackInfo>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<GlobalSystemMediaTransportControlsSessionPlaybackInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryPlayAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryPauseAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryStopAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryRecordAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryFastForwardAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TryRewindAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TrySkipNextAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TrySkipPreviousAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun TryChangeChannelUpAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun TryChangeChannelDownAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun TryTogglePlayPauseAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override
        fun TryChangeAutoRepeatModeAsync(requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(requestedAutoRepeatMode),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun TryChangePlaybackRateAsync(requestedPlaybackRate: Double):
        IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, requestedPlaybackRate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun TryChangeShuffleActiveAsync(requestedShuffleState: Boolean):
        IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, requestedShuffleState, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun TryChangePlaybackPositionAsync(requestedPlaybackPosition: Long):
        IAsyncOperation<Boolean>? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, requestedPlaybackPosition, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override
        fun add_TimelinePropertiesChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
        TimelinePropertiesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_TimelinePropertiesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _717736312_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override
        fun add_PlaybackInfoChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
        PlaybackInfoChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_PlaybackInfoChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _717736312_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override
        fun add_MediaPropertiesChanged(handler: TypedEventHandler<GlobalSystemMediaTransportControlsSession?,
        MediaPropertiesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _717736312_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_MediaPropertiesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _717736312_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__717736312_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGlobalSystemMediaTransportControlsSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __717736312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7148c8359b145ae2ab85dc9b1c14e1a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSession(ptr: Pointer?): WithDefault =
        IGlobalSystemMediaTransportControlsSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSession {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSession(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__717736312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlobalSystemMediaTransportControlsSession):
        Array<IGlobalSystemMediaTransportControlsSession?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSession?>).castToImpl<IGlobalSystemMediaTransportControlsSession,IGlobalSystemMediaTransportControlsSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlobalSystemMediaTransportControlsSession?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSession_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSession?>
  }
}
