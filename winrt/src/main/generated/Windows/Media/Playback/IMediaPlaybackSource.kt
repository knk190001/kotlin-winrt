package Windows.Media.Playback

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackSource.ABI::class)
@Signature("{ef9dc2bc-9317-4696-b051-2bad643177b5}")
@Guid("ef9dc2bc93174696b0512bad643177b5")
@WinRTInterface("ef9dc2bc93174696b0512bad643177b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSource.ByReference::class)
public interface IMediaPlaybackSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSource> {
    public override fun getValue() = ABI.makeIMediaPlaybackSource(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSource {
    public val __1097311199_Ptr: Pointer?

    public val _1097311199_VtblPtr: Pointer?
      get() = __1097311199_Ptr?.getPointer(0)
  }

  public class IMediaPlaybackSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1097311199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef9dc2bc93174696b0512bad643177b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSource(ptr: Pointer?): WithDefault = IMediaPlaybackSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackSource {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSource(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1097311199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSource): Array<IMediaPlaybackSource?> =
        (elements as
        Array<IMediaPlaybackSource?>).castToImpl<IMediaPlaybackSource,IMediaPlaybackSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackSource?> =
        arrayOfNulls<IMediaPlaybackSource_Impl>(size) as Array<IMediaPlaybackSource?>
  }
}
