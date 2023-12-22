package Windows.Media.Playback

import Windows.Foundation.Collections.IVectorChangedEventArgs
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.MediaSource
import Windows.Media.Playback.IMediaPlaybackSource.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMediaPlaybackItem.ABI::class)
@Signature("{047097d2-e4af-48ab-b283-6929e674ece2}")
@Guid("047097d2e4af48abb2836929e674ece2")
@WinRTInterface("047097d2e4af48abb2836929e674ece2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItem.ByReference::class)
public interface IMediaPlaybackItem : NativeMapped, IWinRTInterface, IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun add_AudioTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
      IVectorChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AudioTracksChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_VideoTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
      IVectorChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_VideoTracksChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_TimedMetadataTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
      IVectorChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_TimedMetadataTracksChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Source(): MediaSource?

  @InterfaceMethod(7)
  public fun get_AudioTracks(): MediaPlaybackAudioTrackList?

  @InterfaceMethod(8)
  public fun get_VideoTracks(): MediaPlaybackVideoTrackList?

  @InterfaceMethod(9)
  public fun get_TimedMetadataTracks(): MediaPlaybackTimedMetadataTrackList?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItem> {
    public override fun getValue() = ABI.makeIMediaPlaybackItem(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItem, IMediaPlaybackSource.WithDefault {
    public val __1200797849_Ptr: Pointer?

    public val _1200797849_VtblPtr: Pointer?
      get() = __1200797849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AudioTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
        IVectorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AudioTracksChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_VideoTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
        IVectorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_VideoTracksChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_TimedMetadataTracksChanged(handler: TypedEventHandler<MediaPlaybackItem?,
        IVectorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_TimedMetadataTracksChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Source(): MediaSource? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AudioTracks(): MediaPlaybackAudioTrackList? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackAudioTrackList>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackAudioTrackList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_VideoTracks(): MediaPlaybackVideoTrackList? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackVideoTrackList>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackVideoTrackList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TimedMetadataTracks(): MediaPlaybackTimedMetadataTrackList? {
      val fnPtr = _1200797849_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackTimedMetadataTrackList>()
      val hr = fn.invokeHR(arrayOf(__1200797849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackTimedMetadataTrackList>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackSource {
    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1200797849_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1200797849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("047097d2e4af48abb2836929e674ece2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItem(ptr: Pointer?): WithDefault = IMediaPlaybackItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItem {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItem(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1200797849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItem): Array<IMediaPlaybackItem?> =
        (elements as
        Array<IMediaPlaybackItem?>).castToImpl<IMediaPlaybackItem,IMediaPlaybackItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItem?> =
        arrayOfNulls<IMediaPlaybackItem_Impl>(size) as Array<IMediaPlaybackItem?>
  }
}
