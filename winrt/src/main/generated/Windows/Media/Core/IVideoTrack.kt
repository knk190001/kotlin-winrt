package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.MediaProperties.VideoEncodingProperties
import Windows.Media.Playback.MediaPlaybackItem
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVideoTrack.ABI::class)
@Signature("{99f3b7f3-e298-4396-bb6a-a51be6a2a20a}")
@Guid("99f3b7f3e2984396bb6aa51be6a2a20a")
@WinRTInterface("99f3b7f3e2984396bb6aa51be6a2a20a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoTrack.ByReference::class)
public interface IVideoTrack : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_OpenFailed(handler: TypedEventHandler<VideoTrack?,
      VideoTrackOpenFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_OpenFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetEncodingProperties(): VideoEncodingProperties?

  @InterfaceMethod(3)
  public fun get_PlaybackItem(): MediaPlaybackItem?

  @InterfaceMethod(4)
  public fun get_Name(): String?

  @InterfaceMethod(5)
  public fun get_SupportInfo(): VideoTrackSupportInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVideoTrack> {
    public override fun getValue() = ABI.makeIVideoTrack(pointer.getPointer(0))

    public fun setValue(value: IVideoTrack_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoTrack {
    public val __1720872411_Ptr: Pointer?

    public val _1720872411_VtblPtr: Pointer?
      get() = __1720872411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_OpenFailed(handler: TypedEventHandler<VideoTrack?,
        VideoTrackOpenFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_OpenFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetEncodingProperties(): VideoEncodingProperties? {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PlaybackItem(): MediaPlaybackItem? {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Name(): String? {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SupportInfo(): VideoTrackSupportInfo? {
      val fnPtr = _1720872411_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoTrackSupportInfo>()
      val hr = fn.invokeHR(arrayOf(__1720872411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoTrackSupportInfo>(result.getValue())
      return resultValue
    }
  }

  public class IVideoTrack_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1720872411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoTrack, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99f3b7f3e2984396bb6aa51be6a2a20a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoTrack(ptr: Pointer?): WithDefault = IVideoTrack_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoTrack {
      val address = segment.toRawLongValue()
      return makeIVideoTrack(Pointer(address))
    }

    public override fun toNative(obj: IVideoTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1720872411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoTrack): Array<IVideoTrack?> = (elements as
        Array<IVideoTrack?>).castToImpl<IVideoTrack,IVideoTrack_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoTrack?> =
        arrayOfNulls<IVideoTrack_Impl>(size) as Array<IVideoTrack?>
  }
}
