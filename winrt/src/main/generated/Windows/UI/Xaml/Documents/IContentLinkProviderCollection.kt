package Windows.UI.Xaml.Documents

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

@ABIMarker(IContentLinkProviderCollection.ABI::class)
@Signature("{f5b84d0c-a9f4-4d1a-a13c-10def1843734}")
@Guid("f5b84d0ca9f44d1aa13c10def1843734")
@WinRTInterface("f5b84d0ca9f44d1aa13c10def1843734")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLinkProviderCollection.ByReference::class)
public interface IContentLinkProviderCollection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentLinkProviderCollection> {
    public override fun getValue() = ABI.makeIContentLinkProviderCollection(pointer.getPointer(0))

    public fun setValue(value: IContentLinkProviderCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLinkProviderCollection {
    public val __1965661254_Ptr: Pointer?

    public val _1965661254_VtblPtr: Pointer?
      get() = __1965661254_Ptr?.getPointer(0)
  }

  public class IContentLinkProviderCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1965661254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLinkProviderCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5b84d0ca9f44d1aa13c10def1843734")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLinkProviderCollection(ptr: Pointer?): WithDefault =
        IContentLinkProviderCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLinkProviderCollection {
      val address = segment.toRawLongValue()
      return makeIContentLinkProviderCollection(Pointer(address))
    }

    public override fun toNative(obj: IContentLinkProviderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1965661254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLinkProviderCollection):
        Array<IContentLinkProviderCollection?> = (elements as
        Array<IContentLinkProviderCollection?>).castToImpl<IContentLinkProviderCollection,IContentLinkProviderCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLinkProviderCollection?> =
        arrayOfNulls<IContentLinkProviderCollection_Impl>(size) as
        Array<IContentLinkProviderCollection?>
  }
}
