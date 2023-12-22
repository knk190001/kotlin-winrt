package Windows.Media.Playback

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

@ABIMarker(IMediaPlaybackCommandManager.ABI::class)
@Signature("{5acee5a6-5cb6-4a5a-8521-cc86b1c1ed37}")
@Guid("5acee5a65cb64a5a8521cc86b1c1ed37")
@WinRTInterface("5acee5a65cb64a5a8521cc86b1c1ed37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackCommandManager.ByReference::class)
public interface IMediaPlaybackCommandManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_MediaPlayer(): MediaPlayer?

  @InterfaceMethod(3)
  public fun get_PlayBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(4)
  public fun get_PauseBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(5)
  public fun get_NextBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(6)
  public fun get_PreviousBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(7)
  public fun get_FastForwardBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(8)
  public fun get_RewindBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(9)
  public fun get_ShuffleBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(10)
  public fun get_AutoRepeatModeBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(11)
  public fun get_PositionBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(12)
  public fun get_RateBehavior(): MediaPlaybackCommandManagerCommandBehavior?

  @InterfaceMethod(13)
  public fun add_PlayReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerPlayReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_PlayReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_PauseReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerPauseReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_PauseReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_NextReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerNextReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_NextReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_PreviousReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerPreviousReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_PreviousReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_FastForwardReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerFastForwardReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_FastForwardReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_RewindReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerRewindReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_RewindReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_ShuffleReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerShuffleReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_ShuffleReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_AutoRepeatModeReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_AutoRepeatModeReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_PositionReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerPositionReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_PositionReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_RateReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
      MediaPlaybackCommandManagerRateReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_RateReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackCommandManager> {
    public override fun getValue() = ABI.makeIMediaPlaybackCommandManager(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackCommandManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackCommandManager {
    public val __1908827160_Ptr: Pointer?

    public val _1908827160_VtblPtr: Pointer?
      get() = __1908827160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MediaPlayer(): MediaPlayer? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayer>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PlayBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PauseBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NextBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PreviousBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_FastForwardBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_RewindBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ShuffleBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_AutoRepeatModeBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_PositionBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_RateBehavior(): MediaPlaybackCommandManagerCommandBehavior? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackCommandManagerCommandBehavior>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackCommandManagerCommandBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun add_PlayReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerPlayReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_PlayReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_PauseReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerPauseReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_PauseReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_NextReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerNextReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_NextReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override
        fun add_PreviousReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerPreviousReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_PreviousReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override
        fun add_FastForwardReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerFastForwardReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_FastForwardReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_RewindReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerRewindReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_RewindReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_ShuffleReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerShuffleReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_ShuffleReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override
        fun add_AutoRepeatModeReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_AutoRepeatModeReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override
        fun add_PositionReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerPositionReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_PositionReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_RateReceived(handler: TypedEventHandler<MediaPlaybackCommandManager?,
        MediaPlaybackCommandManagerRateReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_RateReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908827160_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908827160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackCommandManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1908827160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackCommandManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5acee5a65cb64a5a8521cc86b1c1ed37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackCommandManager(ptr: Pointer?): WithDefault =
        IMediaPlaybackCommandManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackCommandManager {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackCommandManager(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackCommandManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1908827160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackCommandManager):
        Array<IMediaPlaybackCommandManager?> = (elements as
        Array<IMediaPlaybackCommandManager?>).castToImpl<IMediaPlaybackCommandManager,IMediaPlaybackCommandManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackCommandManager?> =
        arrayOfNulls<IMediaPlaybackCommandManager_Impl>(size) as
        Array<IMediaPlaybackCommandManager?>
  }
}
