package Microsoft.UI.Content

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

@ABIMarker(IContentSiteViewFactory.ABI::class)
@Signature("{9efd72f0-63ef-5b6a-a50c-5685bd8100f1}")
@Guid("9efd72f063ef5b6aa50c5685bd8100f1")
@WinRTInterface("9efd72f063ef5b6aa50c5685bd8100f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteViewFactory.ByReference::class)
public interface IContentSiteViewFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteViewFactory> {
    public override fun getValue() = ABI.makeIContentSiteViewFactory(pointer.getPointer(0))

    public fun setValue(value: IContentSiteViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteViewFactory {
    public val __366582735_Ptr: Pointer?

    public val _366582735_VtblPtr: Pointer?
      get() = __366582735_Ptr?.getPointer(0)
  }

  public class IContentSiteViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __366582735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9efd72f063ef5b6aa50c5685bd8100f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteViewFactory(ptr: Pointer?): WithDefault =
        IContentSiteViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteViewFactory {
      val address = segment.toRawLongValue()
      return makeIContentSiteViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__366582735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteViewFactory): Array<IContentSiteViewFactory?>
        = (elements as
        Array<IContentSiteViewFactory?>).castToImpl<IContentSiteViewFactory,IContentSiteViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteViewFactory?> =
        arrayOfNulls<IContentSiteViewFactory_Impl>(size) as Array<IContentSiteViewFactory?>
  }
}
