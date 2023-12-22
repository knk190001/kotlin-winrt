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

@ABIMarker(IContentSiteEnvironmentViewFactory.ABI::class)
@Signature("{c901edf2-f184-5a64-8d58-8cf8efa8b678}")
@Guid("c901edf2f1845a648d588cf8efa8b678")
@WinRTInterface("c901edf2f1845a648d588cf8efa8b678")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteEnvironmentViewFactory.ByReference::class)
public interface IContentSiteEnvironmentViewFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteEnvironmentViewFactory> {
    public override fun getValue() =
        ABI.makeIContentSiteEnvironmentViewFactory(pointer.getPointer(0))

    public fun setValue(value: IContentSiteEnvironmentViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteEnvironmentViewFactory {
    public val __269211432_Ptr: Pointer?

    public val _269211432_VtblPtr: Pointer?
      get() = __269211432_Ptr?.getPointer(0)
  }

  public class IContentSiteEnvironmentViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __269211432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteEnvironmentViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c901edf2f1845a648d588cf8efa8b678")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteEnvironmentViewFactory(ptr: Pointer?): WithDefault =
        IContentSiteEnvironmentViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteEnvironmentViewFactory {
      val address = segment.toRawLongValue()
      return makeIContentSiteEnvironmentViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteEnvironmentViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__269211432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteEnvironmentViewFactory):
        Array<IContentSiteEnvironmentViewFactory?> = (elements as
        Array<IContentSiteEnvironmentViewFactory?>).castToImpl<IContentSiteEnvironmentViewFactory,IContentSiteEnvironmentViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteEnvironmentViewFactory?> =
        arrayOfNulls<IContentSiteEnvironmentViewFactory_Impl>(size) as
        Array<IContentSiteEnvironmentViewFactory?>
  }
}
