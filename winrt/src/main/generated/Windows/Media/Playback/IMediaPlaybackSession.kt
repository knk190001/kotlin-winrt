package Windows.Media.Playback

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.MediaProperties.StereoscopicVideoPackingMode
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaPlaybackSession.ABI::class)
@Signature("{c32b683d-0407-41ba-8946-8b345a5a5435}")
@Guid("c32b683d040741ba89468b345a5a5435")
@WinRTInterface("c32b683d040741ba89468b345a5a5435")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSession.ByReference::class)
public interface IMediaPlaybackSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PlaybackStateChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PlaybackStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PlaybackRateChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PlaybackRateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SeekCompleted(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SeekCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_BufferingStarted(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_BufferingStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_BufferingEnded(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_BufferingEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_BufferingProgressChanged(value: TypedEventHandler<MediaPlaybackSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_BufferingProgressChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_DownloadProgressChanged(value: TypedEventHandler<MediaPlaybackSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_DownloadProgressChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_NaturalDurationChanged(value: TypedEventHandler<MediaPlaybackSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_NaturalDurationChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_PositionChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_PositionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_NaturalVideoSizeChanged(value: TypedEventHandler<MediaPlaybackSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_NaturalVideoSizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun get_MediaPlayer(): MediaPlayer?

  @InterfaceMethod(21)
  public fun get_NaturalDuration(): TimeSpan?

  @InterfaceMethod(22)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(23)
  public fun put_Position(value: TimeSpan?): Unit

  @InterfaceMethod(24)
  public fun get_PlaybackState(): MediaPlaybackState?

  @InterfaceMethod(25)
  public fun get_CanSeek(): Boolean

  @InterfaceMethod(26)
  public fun get_CanPause(): Boolean

  @InterfaceMethod(27)
  public fun get_IsProtected(): Boolean

  @InterfaceMethod(28)
  public fun get_PlaybackRate(): Double

  @InterfaceMethod(29)
  public fun put_PlaybackRate(value: Double): Unit

  @InterfaceMethod(30)
  public fun get_BufferingProgress(): Double

  @InterfaceMethod(31)
  public fun get_DownloadProgress(): Double

  @InterfaceMethod(32)
  public fun get_NaturalVideoHeight(): WinDef.UINT

  @InterfaceMethod(33)
  public fun get_NaturalVideoWidth(): WinDef.UINT

  @InterfaceMethod(34)
  public fun get_NormalizedSourceRect(): Rect?

  @InterfaceMethod(35)
  public fun put_NormalizedSourceRect(value: Rect?): Unit

  @InterfaceMethod(36)
  public fun get_StereoscopicVideoPackingMode(): StereoscopicVideoPackingMode?

  @InterfaceMethod(37)
  public fun put_StereoscopicVideoPackingMode(value: StereoscopicVideoPackingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSession> {
    public override fun getValue() = ABI.makeIMediaPlaybackSession(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSession {
    public val __54988624_Ptr: Pointer?

    public val _54988624_VtblPtr: Pointer?
      get() = __54988624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PlaybackStateChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PlaybackStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PlaybackRateChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PlaybackRateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SeekCompleted(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SeekCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_BufferingStarted(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_BufferingStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_BufferingEnded(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_BufferingEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_BufferingProgressChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_BufferingProgressChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_DownloadProgressChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_DownloadProgressChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_NaturalDurationChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_NaturalDurationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_PositionChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_PositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_NaturalVideoSizeChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_NaturalVideoSizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_MediaPlayer(): MediaPlayer? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayer>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_NaturalDuration(): TimeSpan? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Position(value: TimeSpan?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_PlaybackState(): MediaPlaybackState? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackState>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_CanSeek(): Boolean {
      val fnPtr = _54988624_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun get_CanPause(): Boolean {
      val fnPtr = _54988624_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun get_IsProtected(): Boolean {
      val fnPtr = _54988624_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun get_PlaybackRate(): Double {
      val fnPtr = _54988624_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_PlaybackRate(value: Double): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_BufferingProgress(): Double {
      val fnPtr = _54988624_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun get_DownloadProgress(): Double {
      val fnPtr = _54988624_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun get_NaturalVideoHeight(): WinDef.UINT {
      val fnPtr = _54988624_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun get_NaturalVideoWidth(): WinDef.UINT {
      val fnPtr = _54988624_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun get_NormalizedSourceRect(): Rect? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_NormalizedSourceRect(value: Rect?): Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_StereoscopicVideoPackingMode(): StereoscopicVideoPackingMode? {
      val fnPtr = _54988624_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StereoscopicVideoPackingMode>()
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StereoscopicVideoPackingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_StereoscopicVideoPackingMode(value: StereoscopicVideoPackingMode?):
        Unit {
      val fnPtr = _54988624_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__54988624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __54988624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c32b683d040741ba89468b345a5a5435")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSession(ptr: Pointer?): WithDefault =
        IMediaPlaybackSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackSession {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSession(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__54988624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSession): Array<IMediaPlaybackSession?> =
        (elements as
        Array<IMediaPlaybackSession?>).castToImpl<IMediaPlaybackSession,IMediaPlaybackSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackSession?> =
        arrayOfNulls<IMediaPlaybackSession_Impl>(size) as Array<IMediaPlaybackSession?>
  }
}
