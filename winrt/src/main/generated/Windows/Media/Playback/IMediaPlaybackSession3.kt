package Windows.Media.Playback

import Windows.Media.MediaProperties.MediaRotation
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

@ABIMarker(IMediaPlaybackSession3.ABI::class)
@Signature("{7ba2b41a-a3e2-405f-b77b-a4812c238b66}")
@Guid("7ba2b41aa3e2405fb77ba4812c238b66")
@WinRTInterface("7ba2b41aa3e2405fb77ba4812c238b66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSession3.ByReference::class)
public interface IMediaPlaybackSession3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaybackRotation(): MediaRotation?

  @InterfaceMethod(1)
  public fun put_PlaybackRotation(value: MediaRotation?): Unit

  @InterfaceMethod(2)
  public fun GetOutputDegradationPolicyState(): MediaPlaybackSessionOutputDegradationPolicyState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSession3> {
    public override fun getValue() = ABI.makeIMediaPlaybackSession3(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSession3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSession3 {
    public val __1704647395_Ptr: Pointer?

    public val _1704647395_VtblPtr: Pointer?
      get() = __1704647395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackRotation(): MediaRotation? {
      val fnPtr = _1704647395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRotation>()
      val hr = fn.invokeHR(arrayOf(__1704647395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlaybackRotation(value: MediaRotation?): Unit {
      val fnPtr = _1704647395_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetOutputDegradationPolicyState():
        MediaPlaybackSessionOutputDegradationPolicyState? {
      val fnPtr = _1704647395_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackSessionOutputDegradationPolicyState>()
      val hr = fn.invokeHR(arrayOf(__1704647395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackSessionOutputDegradationPolicyState>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackSession3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1704647395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSession3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ba2b41aa3e2405fb77ba4812c238b66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSession3(ptr: Pointer?): WithDefault =
        IMediaPlaybackSession3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackSession3 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSession3(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSession3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1704647395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSession3): Array<IMediaPlaybackSession3?> =
        (elements as
        Array<IMediaPlaybackSession3?>).castToImpl<IMediaPlaybackSession3,IMediaPlaybackSession3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackSession3?> =
        arrayOfNulls<IMediaPlaybackSession3_Impl>(size) as Array<IMediaPlaybackSession3?>
  }
}
