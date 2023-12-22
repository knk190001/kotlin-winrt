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

@ABIMarker(IContentSiteEnvironmentFactory.ABI::class)
@Signature("{0befa998-cb15-5f16-a4a5-c0ed1674e186}")
@Guid("0befa998cb155f16a4a5c0ed1674e186")
@WinRTInterface("0befa998cb155f16a4a5c0ed1674e186")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteEnvironmentFactory.ByReference::class)
public interface IContentSiteEnvironmentFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteEnvironmentFactory> {
    public override fun getValue() = ABI.makeIContentSiteEnvironmentFactory(pointer.getPointer(0))

    public fun setValue(value: IContentSiteEnvironmentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteEnvironmentFactory {
    public val __1643215091_Ptr: Pointer?

    public val _1643215091_VtblPtr: Pointer?
      get() = __1643215091_Ptr?.getPointer(0)
  }

  public class IContentSiteEnvironmentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1643215091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteEnvironmentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0befa998cb155f16a4a5c0ed1674e186")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteEnvironmentFactory(ptr: Pointer?): WithDefault =
        IContentSiteEnvironmentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteEnvironmentFactory {
      val address = segment.toRawLongValue()
      return makeIContentSiteEnvironmentFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteEnvironmentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1643215091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteEnvironmentFactory):
        Array<IContentSiteEnvironmentFactory?> = (elements as
        Array<IContentSiteEnvironmentFactory?>).castToImpl<IContentSiteEnvironmentFactory,IContentSiteEnvironmentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteEnvironmentFactory?> =
        arrayOfNulls<IContentSiteEnvironmentFactory_Impl>(size) as
        Array<IContentSiteEnvironmentFactory?>
  }
}
