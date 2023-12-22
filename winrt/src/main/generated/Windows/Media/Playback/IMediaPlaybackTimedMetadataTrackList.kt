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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaPlaybackTimedMetadataTrackList.ABI::class)
@Signature("{72b41319-bbfb-46a3-9372-9c9c744b9438}")
@Guid("72b41319bbfb46a393729c9c744b9438")
@WinRTInterface("72b41319bbfb46a393729c9c744b9438")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackTimedMetadataTrackList.ByReference::class)
public interface IMediaPlaybackTimedMetadataTrackList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_PresentationModeChanged(handler: TypedEventHandler<MediaPlaybackTimedMetadataTrackList?,
      TimedMetadataPresentationModeChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PresentationModeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetPresentationMode(index: WinDef.UINT): TimedMetadataTrackPresentationMode?

  @InterfaceMethod(3)
  public fun SetPresentationMode(index: WinDef.UINT, value: TimedMetadataTrackPresentationMode?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackTimedMetadataTrackList> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackTimedMetadataTrackList(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackTimedMetadataTrackList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackTimedMetadataTrackList {
    public val __871819351_Ptr: Pointer?

    public val _871819351_VtblPtr: Pointer?
      get() = __871819351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_PresentationModeChanged(handler: TypedEventHandler<MediaPlaybackTimedMetadataTrackList?,
        TimedMetadataPresentationModeChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _871819351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__871819351_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PresentationModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _871819351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__871819351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetPresentationMode(index: WinDef.UINT):
        TimedMetadataTrackPresentationMode? {
      val fnPtr = _871819351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataTrackPresentationMode>()
      val hr = fn.invokeHR(arrayOf(__871819351_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataTrackPresentationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetPresentationMode(index: WinDef.UINT,
        value: TimedMetadataTrackPresentationMode?): Unit {
      val fnPtr = _871819351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__871819351_Ptr, index, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackTimedMetadataTrackList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __871819351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackTimedMetadataTrackList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72b41319bbfb46a393729c9c744b9438")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackTimedMetadataTrackList(ptr: Pointer?): WithDefault =
        IMediaPlaybackTimedMetadataTrackList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackTimedMetadataTrackList {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackTimedMetadataTrackList(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackTimedMetadataTrackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__871819351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackTimedMetadataTrackList):
        Array<IMediaPlaybackTimedMetadataTrackList?> = (elements as
        Array<IMediaPlaybackTimedMetadataTrackList?>).castToImpl<IMediaPlaybackTimedMetadataTrackList,IMediaPlaybackTimedMetadataTrackList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackTimedMetadataTrackList?> =
        arrayOfNulls<IMediaPlaybackTimedMetadataTrackList_Impl>(size) as
        Array<IMediaPlaybackTimedMetadataTrackList?>
  }
}
