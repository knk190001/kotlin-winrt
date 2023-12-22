package Windows.Media.Playback

import Windows.Media.Core.MediaSource
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

@ABIMarker(IMediaPlaybackItemStatics.ABI::class)
@Signature("{4b1be7f4-4345-403c-8a67-f5de91df4c86}")
@Guid("4b1be7f44345403c8a67f5de91df4c86")
@WinRTInterface("4b1be7f44345403c8a67f5de91df4c86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemStatics.ByReference::class)
public interface IMediaPlaybackItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindFromMediaSource(source: MediaSource?): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemStatics> {
    public override fun getValue() = ABI.makeIMediaPlaybackItemStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemStatics {
    public val __1344712940_Ptr: Pointer?

    public val _1344712940_VtblPtr: Pointer?
      get() = __1344712940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindFromMediaSource(source: MediaSource?): MediaPlaybackItem? {
      val fnPtr = _1344712940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1344712940_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344712940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b1be7f44345403c8a67f5de91df4c86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemStatics(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemStatics {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344712940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemStatics):
        Array<IMediaPlaybackItemStatics?> = (elements as
        Array<IMediaPlaybackItemStatics?>).castToImpl<IMediaPlaybackItemStatics,IMediaPlaybackItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemStatics?> =
        arrayOfNulls<IMediaPlaybackItemStatics_Impl>(size) as Array<IMediaPlaybackItemStatics?>
  }
}
