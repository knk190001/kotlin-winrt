package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IAudioTrack.ABI::class)
@Signature("{f23b6e77-3ef7-40de-b943-068b1321701d}")
@Guid("f23b6e773ef740deb943068b1321701d")
@WinRTInterface("f23b6e773ef740deb943068b1321701d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioTrack.ByReference::class)
public interface IAudioTrack : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_OpenFailed(handler: TypedEventHandler<AudioTrack?,
      AudioTrackOpenFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_OpenFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetEncodingProperties(): AudioEncodingProperties?

  @InterfaceMethod(3)
  public fun get_PlaybackItem(): MediaPlaybackItem?

  @InterfaceMethod(4)
  public fun get_Name(): String?

  @InterfaceMethod(5)
  public fun get_SupportInfo(): AudioTrackSupportInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioTrack> {
    public override fun getValue() = ABI.makeIAudioTrack(pointer.getPointer(0))

    public fun setValue(value: IAudioTrack_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioTrack {
    public val __1446341546_Ptr: Pointer?

    public val _1446341546_VtblPtr: Pointer?
      get() = __1446341546_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_OpenFailed(handler: TypedEventHandler<AudioTrack?,
        AudioTrackOpenFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_OpenFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetEncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PlaybackItem(): MediaPlaybackItem? {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Name(): String? {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SupportInfo(): AudioTrackSupportInfo? {
      val fnPtr = _1446341546_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioTrackSupportInfo>()
      val hr = fn.invokeHR(arrayOf(__1446341546_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioTrackSupportInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAudioTrack_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1446341546_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioTrack, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f23b6e773ef740deb943068b1321701d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioTrack(ptr: Pointer?): WithDefault = IAudioTrack_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioTrack {
      val address = segment.toRawLongValue()
      return makeIAudioTrack(Pointer(address))
    }

    public override fun toNative(obj: IAudioTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1446341546_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioTrack): Array<IAudioTrack?> = (elements as
        Array<IAudioTrack?>).castToImpl<IAudioTrack,IAudioTrack_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioTrack?> =
        arrayOfNulls<IAudioTrack_Impl>(size) as Array<IAudioTrack?>
  }
}
