package Windows.UI.Xaml.Media.Imaging

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
@Signature("{62f7d416-c714-4c4c-8273-f839bc58135c}")
@Guid("62f7d416c7144c4c8273f839bc58135c")
@WinRTInterface("62f7d416c7144c4c8273f839bc58135c")
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
    public val __1980786395_Ptr: Pointer?

    public val _1980786395_VtblPtr: Pointer?
      get() = __1980786395_Ptr?.getPointer(0)
  }

  public class ISurfaceImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980786395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISurfaceImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62f7d416c7144c4c8273f839bc58135c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISurfaceImageSource(ptr: Pointer?): WithDefault = ISurfaceImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISurfaceImageSource {
      val address = segment.toRawLongValue()
      return makeISurfaceImageSource(Pointer(address))
    }

    public override fun toNative(obj: ISurfaceImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980786395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISurfaceImageSource): Array<ISurfaceImageSource?> =
        (elements as
        Array<ISurfaceImageSource?>).castToImpl<ISurfaceImageSource,ISurfaceImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISurfaceImageSource?> =
        arrayOfNulls<ISurfaceImageSource_Impl>(size) as Array<ISurfaceImageSource?>
  }
}
