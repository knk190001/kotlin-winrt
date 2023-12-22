package Windows.UI.Xaml.Controls

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

@ABIMarker(INavigationViewItemBaseFactory.ABI::class)
@Signature("{eb014cef-7890-4ebb-8245-02e8510f321d}")
@Guid("eb014cef78904ebb824502e8510f321d")
@WinRTInterface("eb014cef78904ebb824502e8510f321d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemBaseFactory.ByReference::class)
public interface INavigationViewItemBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemBaseFactory> {
    public override fun getValue() = ABI.makeINavigationViewItemBaseFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemBaseFactory {
    public val __757228239_Ptr: Pointer?

    public val _757228239_VtblPtr: Pointer?
      get() = __757228239_Ptr?.getPointer(0)
  }

  public class INavigationViewItemBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __757228239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb014cef78904ebb824502e8510f321d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemBaseFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemBaseFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__757228239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemBaseFactory):
        Array<INavigationViewItemBaseFactory?> = (elements as
        Array<INavigationViewItemBaseFactory?>).castToImpl<INavigationViewItemBaseFactory,INavigationViewItemBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemBaseFactory?> =
        arrayOfNulls<INavigationViewItemBaseFactory_Impl>(size) as
        Array<INavigationViewItemBaseFactory?>
  }
}
