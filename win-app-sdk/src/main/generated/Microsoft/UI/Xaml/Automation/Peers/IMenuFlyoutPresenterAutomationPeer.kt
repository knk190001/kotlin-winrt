package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IMenuFlyoutPresenterAutomationPeer.ABI::class)
@Signature("{74d3ff77-1e92-5f96-99a1-697d74283ba7}")
@Guid("74d3ff771e925f9699a1697d74283ba7")
@WinRTInterface("74d3ff771e925f9699a1697d74283ba7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenterAutomationPeer.ByReference::class)
public interface IMenuFlyoutPresenterAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenterAutomationPeer> {
    public override fun getValue() =
        ABI.makeIMenuFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenterAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenterAutomationPeer {
    public val __1347168580_Ptr: Pointer?

    public val _1347168580_VtblPtr: Pointer?
      get() = __1347168580_Ptr?.getPointer(0)
  }

  public class IMenuFlyoutPresenterAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1347168580_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74d3ff771e925f9699a1697d74283ba7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenterAutomationPeer(ptr: Pointer?): WithDefault =
        IMenuFlyoutPresenterAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1347168580_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenterAutomationPeer):
        Array<IMenuFlyoutPresenterAutomationPeer?> = (elements as
        Array<IMenuFlyoutPresenterAutomationPeer?>).castToImpl<IMenuFlyoutPresenterAutomationPeer,IMenuFlyoutPresenterAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenterAutomationPeer?> =
        arrayOfNulls<IMenuFlyoutPresenterAutomationPeer_Impl>(size) as
        Array<IMenuFlyoutPresenterAutomationPeer?>
  }
}
