package Windows.Media.PlayTo

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayToReceiver.ABI::class)
@Signature("{ac15cf47-a162-4aa6-af1b-3aa35f3b9069}")
@Guid("ac15cf47a1624aa6af1b3aa35f3b9069")
@WinRTInterface("ac15cf47a1624aa6af1b3aa35f3b9069")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToReceiver.ByReference::class)
public interface IPlayToReceiver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PlayRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PlayRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PauseRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PauseRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SourceChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
      SourceChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SourceChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PlaybackRateChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
      PlaybackRateChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PlaybackRateChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_CurrentTimeChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
      CurrentTimeChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_CurrentTimeChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_MuteChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
      MuteChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_MuteChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_VolumeChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
      VolumeChangeRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_VolumeChangeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_TimeUpdateRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_TimeUpdateRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_StopRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_StopRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun NotifyVolumeChange(volume: Double, mute: Boolean): Unit

  @InterfaceMethod(19)
  public fun NotifyRateChange(rate: Double): Unit

  @InterfaceMethod(20)
  public fun NotifyLoadedMetadata(): Unit

  @InterfaceMethod(21)
  public fun NotifyTimeUpdate(currentTime: TimeSpan?): Unit

  @InterfaceMethod(22)
  public fun NotifyDurationChange(duration: TimeSpan?): Unit

  @InterfaceMethod(23)
  public fun NotifySeeking(): Unit

  @InterfaceMethod(24)
  public fun NotifySeeked(): Unit

  @InterfaceMethod(25)
  public fun NotifyPaused(): Unit

  @InterfaceMethod(26)
  public fun NotifyPlaying(): Unit

  @InterfaceMethod(27)
  public fun NotifyEnded(): Unit

  @InterfaceMethod(28)
  public fun NotifyError(): Unit

  @InterfaceMethod(29)
  public fun NotifyStopped(): Unit

  @InterfaceMethod(30)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(31)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(32)
  public fun put_SupportsImage(value: Boolean): Unit

  @InterfaceMethod(33)
  public fun get_SupportsImage(): Boolean

  @InterfaceMethod(34)
  public fun put_SupportsAudio(value: Boolean): Unit

  @InterfaceMethod(35)
  public fun get_SupportsAudio(): Boolean

  @InterfaceMethod(36)
  public fun put_SupportsVideo(value: Boolean): Unit

  @InterfaceMethod(37)
  public fun get_SupportsVideo(): Boolean

  @InterfaceMethod(38)
  public fun get_Properties(): IPropertySet?

  @InterfaceMethod(39)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(40)
  public fun StopAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToReceiver> {
    public override fun getValue() = ABI.makeIPlayToReceiver(pointer.getPointer(0))

    public fun setValue(value: IPlayToReceiver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToReceiver {
    public val __371005437_Ptr: Pointer?

    public val _371005437_VtblPtr: Pointer?
      get() = __371005437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PlayRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PlayRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PauseRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PauseRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SourceChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
        SourceChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SourceChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PlaybackRateChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
        PlaybackRateChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PlaybackRateChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_CurrentTimeChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
        CurrentTimeChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_CurrentTimeChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_MuteChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
        MuteChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_MuteChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_VolumeChangeRequested(handler: TypedEventHandler<PlayToReceiver?,
        VolumeChangeRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_VolumeChangeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_TimeUpdateRequested(handler: TypedEventHandler<PlayToReceiver?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_TimeUpdateRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_StopRequested(handler: TypedEventHandler<PlayToReceiver?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_StopRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun NotifyVolumeChange(volume: Double, mute: Boolean): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, volume, mute,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun NotifyRateChange(rate: Double): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, rate,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun NotifyLoadedMetadata(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun NotifyTimeUpdate(currentTime: TimeSpan?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(currentTime),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun NotifyDurationChange(duration: TimeSpan?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(duration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun NotifySeeking(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun NotifySeeked(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun NotifyPaused(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun NotifyPlaying(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun NotifyEnded(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun NotifyError(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun NotifyStopped(): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun put_SupportsImage(value: Boolean): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_SupportsImage(): Boolean {
      val fnPtr = _371005437_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun put_SupportsAudio(value: Boolean): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_SupportsAudio(): Boolean {
      val fnPtr = _371005437_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun put_SupportsVideo(value: Boolean): Unit {
      val fnPtr = _371005437_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_SupportsVideo(): Boolean {
      val fnPtr = _371005437_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun StopAsync(): IAsyncAction? {
      val fnPtr = _371005437_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__371005437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPlayToReceiver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __371005437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToReceiver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac15cf47a1624aa6af1b3aa35f3b9069")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToReceiver(ptr: Pointer?): WithDefault = IPlayToReceiver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToReceiver {
      val address = segment.toRawLongValue()
      return makeIPlayToReceiver(Pointer(address))
    }

    public override fun toNative(obj: IPlayToReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__371005437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToReceiver): Array<IPlayToReceiver?> = (elements as
        Array<IPlayToReceiver?>).castToImpl<IPlayToReceiver,IPlayToReceiver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToReceiver?> =
        arrayOfNulls<IPlayToReceiver_Impl>(size) as Array<IPlayToReceiver?>
  }
}
