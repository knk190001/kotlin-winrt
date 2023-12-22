package Microsoft.UI.Xaml.Media

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

@ABIMarker(IImageSource.ABI::class)
@Signature("{6c2038f6-d6d5-55e9-9b9e-082f12dbff60}")
@Guid("6c2038f6d6d555e99b9e082f12dbff60")
@WinRTInterface("6c2038f6d6d555e99b9e082f12dbff60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageSource.ByReference::class)
public interface IImageSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageSource> {
    public override fun getValue() = ABI.makeIImageSource(pointer.getPointer(0))

    public fun setValue(value: IImageSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageSource {
    public val __521665669_Ptr: Pointer?

    public val _521665669_VtblPtr: Pointer?
      get() = __521665669_Ptr?.getPointer(0)
  }

  public class IImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __521665669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c2038f6d6d555e99b9e082f12dbff60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageSource(ptr: Pointer?): WithDefault = IImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageSource {
      val address = segment.toRawLongValue()
      return makeIImageSource(Pointer(address))
    }

    public override fun toNative(obj: IImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__521665669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageSource): Array<IImageSource?> = (elements as
        Array<IImageSource?>).castToImpl<IImageSource,IImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageSource?> =
        arrayOfNulls<IImageSource_Impl>(size) as Array<IImageSource?>
  }
}
