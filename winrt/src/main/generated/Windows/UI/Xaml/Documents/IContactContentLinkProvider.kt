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

@ABIMarker(IContactContentLinkProvider.ABI::class)
@Signature("{f92fd29b-589b-4abd-9d37-35a1468f021e}")
@Guid("f92fd29b589b4abd9d3735a1468f021e")
@WinRTInterface("f92fd29b589b4abd9d3735a1468f021e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactContentLinkProvider.ByReference::class)
public interface IContactContentLinkProvider : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactContentLinkProvider> {
    public override fun getValue() = ABI.makeIContactContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: IContactContentLinkProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactContentLinkProvider {
    public val __589651724_Ptr: Pointer?

    public val _589651724_VtblPtr: Pointer?
      get() = __589651724_Ptr?.getPointer(0)
  }

  public class IContactContentLinkProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589651724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactContentLinkProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f92fd29b589b4abd9d3735a1468f021e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactContentLinkProvider(ptr: Pointer?): WithDefault =
        IContactContentLinkProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactContentLinkProvider {
      val address = segment.toRawLongValue()
      return makeIContactContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: IContactContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589651724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactContentLinkProvider):
        Array<IContactContentLinkProvider?> = (elements as
        Array<IContactContentLinkProvider?>).castToImpl<IContactContentLinkProvider,IContactContentLinkProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactContentLinkProvider?> =
        arrayOfNulls<IContactContentLinkProvider_Impl>(size) as Array<IContactContentLinkProvider?>
  }
}
