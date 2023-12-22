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

@ABIMarker(IContentLinkProvider.ABI::class)
@Signature("{730587fd-bfdc-4cb3-904d-b65ab339bbf5}")
@Guid("730587fdbfdc4cb3904db65ab339bbf5")
@WinRTInterface("730587fdbfdc4cb3904db65ab339bbf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLinkProvider.ByReference::class)
public interface IContentLinkProvider : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentLinkProvider> {
    public override fun getValue() = ABI.makeIContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: IContentLinkProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLinkProvider {
    public val __710845436_Ptr: Pointer?

    public val _710845436_VtblPtr: Pointer?
      get() = __710845436_Ptr?.getPointer(0)
  }

  public class IContentLinkProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __710845436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLinkProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("730587fdbfdc4cb3904db65ab339bbf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLinkProvider(ptr: Pointer?): WithDefault = IContentLinkProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLinkProvider {
      val address = segment.toRawLongValue()
      return makeIContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: IContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__710845436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLinkProvider): Array<IContentLinkProvider?> =
        (elements as
        Array<IContentLinkProvider?>).castToImpl<IContentLinkProvider,IContentLinkProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLinkProvider?> =
        arrayOfNulls<IContentLinkProvider_Impl>(size) as Array<IContentLinkProvider?>
  }
}
