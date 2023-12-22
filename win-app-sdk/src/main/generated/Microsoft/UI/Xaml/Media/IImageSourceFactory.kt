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

@ABIMarker(IImageSourceFactory.ABI::class)
@Signature("{0b1e64a3-e353-5901-b84b-ae9842aea5cd}")
@Guid("0b1e64a3e3535901b84bae9842aea5cd")
@WinRTInterface("0b1e64a3e3535901b84bae9842aea5cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageSourceFactory.ByReference::class)
public interface IImageSourceFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageSourceFactory> {
    public override fun getValue() = ABI.makeIImageSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IImageSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageSourceFactory {
    public val __883647291_Ptr: Pointer?

    public val _883647291_VtblPtr: Pointer?
      get() = __883647291_Ptr?.getPointer(0)
  }

  public class IImageSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883647291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b1e64a3e3535901b84bae9842aea5cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageSourceFactory(ptr: Pointer?): WithDefault = IImageSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageSourceFactory {
      val address = segment.toRawLongValue()
      return makeIImageSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IImageSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883647291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageSourceFactory): Array<IImageSourceFactory?> =
        (elements as
        Array<IImageSourceFactory?>).castToImpl<IImageSourceFactory,IImageSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageSourceFactory?> =
        arrayOfNulls<IImageSourceFactory_Impl>(size) as Array<IImageSourceFactory?>
  }
}
