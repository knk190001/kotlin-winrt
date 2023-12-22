package Windows.UI.Xaml.Media

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
@Signature("{737ef309-ea41-4d96-a71c-98e98efcab07}")
@Guid("737ef309ea414d96a71c98e98efcab07")
@WinRTInterface("737ef309ea414d96a71c98e98efcab07")
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
    public val __328820186_Ptr: Pointer?

    public val _328820186_VtblPtr: Pointer?
      get() = __328820186_Ptr?.getPointer(0)
  }

  public class IImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328820186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("737ef309ea414d96a71c98e98efcab07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageSource(ptr: Pointer?): WithDefault = IImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageSource {
      val address = segment.toRawLongValue()
      return makeIImageSource(Pointer(address))
    }

    public override fun toNative(obj: IImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328820186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageSource): Array<IImageSource?> = (elements as
        Array<IImageSource?>).castToImpl<IImageSource,IImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageSource?> =
        arrayOfNulls<IImageSource_Impl>(size) as Array<IImageSource?>
  }
}
