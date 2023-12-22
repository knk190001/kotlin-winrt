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

@ABIMarker(ISurfaceImageSource.ABI::class)
@Signature("{ac078d9c-d0e0-5ff9-b73e-98e82e4c8d36}")
@Guid("ac078d9cd0e05ff9b73e98e82e4c8d36")
@WinRTInterface("ac078d9cd0e05ff9b73e98e82e4c8d36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISurfaceImageSource.ByReference::class)
public interface ISurfaceImageSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISurfaceImageSource> {
    public override fun getValue() = ABI.makeISurfaceImageSource(pointer.getPointer(0))

    public fun setValue(value: ISurfaceImageSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISurfaceImageSource {
    public val __1665287376_Ptr: Pointer?

    public val _1665287376_VtblPtr: Pointer?
      get() = __1665287376_Ptr?.getPointer(0)
  }

  public class ISurfaceImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1665287376_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISurfaceImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac078d9cd0e05ff9b73e98e82e4c8d36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISurfaceImageSource(ptr: Pointer?): WithDefault = ISurfaceImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISurfaceImageSource {
      val address = segment.toRawLongValue()
      return makeISurfaceImageSource(Pointer(address))
    }

    public override fun toNative(obj: ISurfaceImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1665287376_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISurfaceImageSource): Array<ISurfaceImageSource?> =
        (elements as
        Array<ISurfaceImageSource?>).castToImpl<ISurfaceImageSource,ISurfaceImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISurfaceImageSource?> =
        arrayOfNulls<ISurfaceImageSource_Impl>(size) as Array<ISurfaceImageSource?>
  }
}
