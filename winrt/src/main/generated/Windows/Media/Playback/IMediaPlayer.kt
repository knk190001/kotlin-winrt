package Windows.Media.Playback

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
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

@ABIMarker(IMediaPlayer.ABI::class)
@Signature("{381a83cb-6fff-499b-8d64-2885dfc1249e}")
@Guid("381a83cb6fff499b8d642885dfc1249e")
@WinRTInterface("381a83cb6fff499b8d642885dfc1249e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer.ByReference::class)
public interface IMediaPlayer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(1)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_NaturalDuration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(4)
  public fun put_Position(value: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_BufferingProgress(): Double

  @InterfaceMethod(6)
  public fun get_CurrentState(): MediaPlayerState?

  @InterfaceMethod(7)
  public fun get_CanSeek(): Boolean

  @InterfaceMethod(8)
  public fun get_CanPause(): Boolean

  @InterfaceMethod(9)
  public fun get_IsLoopingEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_IsLoopingEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_IsProtected(): Boolean

  @InterfaceMethod(12)
  public fun get_IsMuted(): Boolean

  @InterfaceMethod(13)
  public fun put_IsMuted(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_PlaybackRate(): Double

  @InterfaceMethod(15)
  public fun put_PlaybackRate(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_Volume(): Double

  @InterfaceMethod(17)
  public fun put_Volume(value: Double): Unit

  @InterfaceMethod(18)
  public fun get_PlaybackMediaMarkers(): PlaybackMediaMarkerSequence?

  @InterfaceMethod(19)
  public fun add_MediaOpened(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_MediaOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_MediaEnded(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_MediaEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_MediaFailed(value: TypedEventHandler<MediaPlayer?, MediaPlayerFailedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_MediaFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_CurrentStateChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_PlaybackMediaMarkerReached(value: TypedEventHandler<MediaPlayer?,
      PlaybackMediaMarkerReachedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_PlaybackMediaMarkerReached(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_MediaPlayerRateChanged(value: TypedEventHandler<MediaPlayer?,
      MediaPlayerRateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_MediaPlayerRateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_VolumeChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_VolumeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_SeekCompleted(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_SeekCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun add_BufferingStarted(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_BufferingStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun add_BufferingEnded(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_BufferingEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun Play(): Unit

  @InterfaceMethod(40)
  public fun Pause(): Unit

  @InterfaceMethod(41)
  public fun SetUriSource(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer> {
    public override fun getValue() = ABI.makeIMediaPlayer(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer {
    public val __1982052372_Ptr: Pointer?

    public val _1982052372_VtblPtr: Pointer?
      get() = __1982052372_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NaturalDuration(): TimeSpan? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Position(value: TimeSpan?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_BufferingProgress(): Double {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CurrentState(): MediaPlayerState? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerState>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CanSeek(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_CanPause(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsLoopingEnabled(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsLoopingEnabled(value: Boolean): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_IsProtected(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_IsMuted(): Boolean {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsMuted(value: Boolean): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PlaybackRate(): Double {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_PlaybackRate(value: Double): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Volume(): Double {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PlaybackMediaMarkers(): PlaybackMediaMarkerSequence? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackMediaMarkerSequence>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackMediaMarkerSequence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun add_MediaOpened(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_MediaOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_MediaEnded(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_MediaEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_MediaFailed(value: TypedEventHandler<MediaPlayer?,
        MediaPlayerFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_MediaFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_CurrentStateChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_PlaybackMediaMarkerReached(value: TypedEventHandler<MediaPlayer?,
        PlaybackMediaMarkerReachedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_PlaybackMediaMarkerReached(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_MediaPlayerRateChanged(value: TypedEventHandler<MediaPlayer?,
        MediaPlayerRateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_MediaPlayerRateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_VolumeChanged(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_VolumeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_SeekCompleted(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_SeekCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun add_BufferingStarted(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_BufferingStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun add_BufferingEnded(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_BufferingEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun Play(): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun Pause(): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun SetUriSource(value: Uri?): Unit {
      val fnPtr = _1982052372_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982052372_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1982052372_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("381a83cb6fff499b8d642885dfc1249e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer(ptr: Pointer?): WithDefault = IMediaPlayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1982052372_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer): Array<IMediaPlayer?> = (elements as
        Array<IMediaPlayer?>).castToImpl<IMediaPlayer,IMediaPlayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer?> =
        arrayOfNulls<IMediaPlayer_Impl>(size) as Array<IMediaPlayer?>
  }
}
