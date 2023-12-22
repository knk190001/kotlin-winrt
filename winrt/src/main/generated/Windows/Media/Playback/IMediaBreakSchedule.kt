package Windows.Media.Playback

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaBreakSchedule.ABI::class)
@Signature("{a19a5813-98b6-41d8-83da-f971d22b7bba}")
@Guid("a19a581398b641d883daf971d22b7bba")
@WinRTInterface("a19a581398b641d883daf971d22b7bba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakSchedule.ByReference::class)
public interface IMediaBreakSchedule : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ScheduleChanged(handler: TypedEventHandler<MediaBreakSchedule?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ScheduleChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun InsertMidrollBreak(mediaBreak: MediaBreak?): Unit

  @InterfaceMethod(3)
  public fun RemoveMidrollBreak(mediaBreak: MediaBreak?): Unit

  @InterfaceMethod(4)
  public fun get_MidrollBreaks(): IVectorView<MediaBreak?>?

  @InterfaceMethod(5)
  public fun put_PrerollBreak(value: MediaBreak?): Unit

  @InterfaceMethod(6)
  public fun get_PrerollBreak(): MediaBreak?

  @InterfaceMethod(7)
  public fun put_PostrollBreak(value: MediaBreak?): Unit

  @InterfaceMethod(8)
  public fun get_PostrollBreak(): MediaBreak?

  @InterfaceMethod(9)
  public fun get_PlaybackItem(): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakSchedule> {
    public override fun getValue() = ABI.makeIMediaBreakSchedule(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakSchedule_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakSchedule {
    public val __1091534517_Ptr: Pointer?

    public val _1091534517_VtblPtr: Pointer?
      get() = __1091534517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ScheduleChanged(handler: TypedEventHandler<MediaBreakSchedule?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ScheduleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InsertMidrollBreak(mediaBreak: MediaBreak?): Unit {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(mediaBreak),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveMidrollBreak(mediaBreak: MediaBreak?): Unit {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(mediaBreak),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MidrollBreaks(): IVectorView<MediaBreak?>? {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaBreak?>>()
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaBreak?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PrerollBreak(value: MediaBreak?): Unit {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PrerollBreak(): MediaBreak? {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PostrollBreak(value: MediaBreak?): Unit {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PostrollBreak(): MediaBreak? {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PlaybackItem(): MediaPlaybackItem? {
      val fnPtr = _1091534517_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1091534517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBreakSchedule_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1091534517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakSchedule, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a19a581398b641d883daf971d22b7bba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakSchedule(ptr: Pointer?): WithDefault = IMediaBreakSchedule_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakSchedule {
      val address = segment.toRawLongValue()
      return makeIMediaBreakSchedule(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakSchedule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1091534517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakSchedule): Array<IMediaBreakSchedule?> =
        (elements as
        Array<IMediaBreakSchedule?>).castToImpl<IMediaBreakSchedule,IMediaBreakSchedule_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakSchedule?> =
        arrayOfNulls<IMediaBreakSchedule_Impl>(size) as Array<IMediaBreakSchedule?>
  }
}
