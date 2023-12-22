package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowPresentationConfigurationFactory.ABI::class)
@Signature("{fd3606a6-7875-5de8-84ff-6351ee13dd0d}")
@Guid("fd3606a678755de884ff6351ee13dd0d")
@WinRTInterface("fd3606a678755de884ff6351ee13dd0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowPresentationConfigurationFactory.ByReference::class)
public interface IAppWindowPresentationConfigurationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowPresentationConfigurationFactory> {
    public override fun getValue() =
        ABI.makeIAppWindowPresentationConfigurationFactory(pointer.getPointer(0))

    public fun setValue(value: IAppWindowPresentationConfigurationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowPresentationConfigurationFactory {
    public val __1318439608_Ptr: Pointer?

    public val _1318439608_VtblPtr: Pointer?
      get() = __1318439608_Ptr?.getPointer(0)
  }

  public class IAppWindowPresentationConfigurationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318439608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowPresentationConfigurationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd3606a678755de884ff6351ee13dd0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowPresentationConfigurationFactory(ptr: Pointer?): WithDefault =
        IAppWindowPresentationConfigurationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppWindowPresentationConfigurationFactory {
      val address = segment.toRawLongValue()
      return makeIAppWindowPresentationConfigurationFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowPresentationConfigurationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318439608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowPresentationConfigurationFactory):
        Array<IAppWindowPresentationConfigurationFactory?> = (elements as
        Array<IAppWindowPresentationConfigurationFactory?>).castToImpl<IAppWindowPresentationConfigurationFactory,IAppWindowPresentationConfigurationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowPresentationConfigurationFactory?> =
        arrayOfNulls<IAppWindowPresentationConfigurationFactory_Impl>(size) as
        Array<IAppWindowPresentationConfigurationFactory?>
  }
}
