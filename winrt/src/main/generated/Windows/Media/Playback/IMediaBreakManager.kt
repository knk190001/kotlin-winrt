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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaBreakManager.ABI::class)
@Signature("{a854ddb1-feb4-4d9b-9d97-0fdbe58e5e39}")
@Guid("a854ddb1feb44d9b9d970fdbe58e5e39")
@WinRTInterface("a854ddb1feb44d9b9d970fdbe58e5e39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakManager.ByReference::class)
public interface IMediaBreakManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BreaksSeekedOver(handler: TypedEventHandler<MediaBreakManager?,
      MediaBreakSeekedOverEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BreaksSeekedOver(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_BreakStarted(handler: TypedEventHandler<MediaBreakManager?,
      MediaBreakStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_BreakStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_BreakEnded(handler: TypedEventHandler<MediaBreakManager?,
      MediaBreakEndedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_BreakEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_BreakSkipped(handler: TypedEventHandler<MediaBreakManager?,
      MediaBreakSkippedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_BreakSkipped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_CurrentBreak(): MediaBreak?

  @InterfaceMethod(9)
  public fun get_PlaybackSession(): MediaPlaybackSession?

  @InterfaceMethod(10)
  public fun PlayBreak(value: MediaBreak?): Unit

  @InterfaceMethod(11)
  public fun SkipCurrentBreak(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakManager> {
    public override fun getValue() = ABI.makeIMediaBreakManager(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakManager {
    public val __978552199_Ptr: Pointer?

    public val _978552199_VtblPtr: Pointer?
      get() = __978552199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BreaksSeekedOver(handler: TypedEventHandler<MediaBreakManager?,
        MediaBreakSeekedOverEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BreaksSeekedOver(token: EventRegistrationToken?): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_BreakStarted(handler: TypedEventHandler<MediaBreakManager?,
        MediaBreakStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_BreakStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_BreakEnded(handler: TypedEventHandler<MediaBreakManager?,
        MediaBreakEndedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_BreakEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_BreakSkipped(handler: TypedEventHandler<MediaBreakManager?,
        MediaBreakSkippedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_BreakSkipped(token: EventRegistrationToken?): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CurrentBreak(): MediaBreak? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PlaybackSession(): MediaPlaybackSession? {
      val fnPtr = _978552199_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackSession>()
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun PlayBreak(value: MediaBreak?): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SkipCurrentBreak(): Unit {
      val fnPtr = _978552199_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978552199_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaBreakManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __978552199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a854ddb1feb44d9b9d970fdbe58e5e39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakManager(ptr: Pointer?): WithDefault = IMediaBreakManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakManager {
      val address = segment.toRawLongValue()
      return makeIMediaBreakManager(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__978552199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakManager): Array<IMediaBreakManager?> =
        (elements as
        Array<IMediaBreakManager?>).castToImpl<IMediaBreakManager,IMediaBreakManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakManager?> =
        arrayOfNulls<IMediaBreakManager_Impl>(size) as Array<IMediaBreakManager?>
  }
}
