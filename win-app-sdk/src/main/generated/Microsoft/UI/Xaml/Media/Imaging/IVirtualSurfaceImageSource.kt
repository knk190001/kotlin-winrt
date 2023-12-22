package Microsoft.UI.Xaml.Media.Imaging

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

@ABIMarker(IVirtualSurfaceImageSource.ABI::class)
@Signature("{e4ff96a6-fede-589c-a007-4178b53b6739}")
@Guid("e4ff96a6fede589ca0074178b53b6739")
@WinRTInterface("e4ff96a6fede589ca0074178b53b6739")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualSurfaceImageSource.ByReference::class)
public interface IVirtualSurfaceImageSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualSurfaceImageSource> {
    public override fun getValue() = ABI.makeIVirtualSurfaceImageSource(pointer.getPointer(0))

    public fun setValue(value: IVirtualSurfaceImageSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualSurfaceImageSource {
    public val __1905693555_Ptr: Pointer?

    public val _1905693555_VtblPtr: Pointer?
      get() = __1905693555_Ptr?.getPointer(0)
  }

  public class IVirtualSurfaceImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1905693555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualSurfaceImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4ff96a6fede589ca0074178b53b6739")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualSurfaceImageSource(ptr: Pointer?): WithDefault =
        IVirtualSurfaceImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualSurfaceImageSource {
      val address = segment.toRawLongValue()
      return makeIVirtualSurfaceImageSource(Pointer(address))
    }

    public override fun toNative(obj: IVirtualSurfaceImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1905693555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualSurfaceImageSource):
        Array<IVirtualSurfaceImageSource?> = (elements as
        Array<IVirtualSurfaceImageSource?>).castToImpl<IVirtualSurfaceImageSource,IVirtualSurfaceImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualSurfaceImageSource?> =
        arrayOfNulls<IVirtualSurfaceImageSource_Impl>(size) as Array<IVirtualSurfaceImageSource?>
  }
}
