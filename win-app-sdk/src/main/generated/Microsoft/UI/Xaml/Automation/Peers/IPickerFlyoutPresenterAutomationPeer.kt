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

@ABIMarker(IPickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("{b29f6d28-154b-5c1d-a5e8-98604bb5cdf6}")
@Guid("b29f6d28154b5c1da5e898604bb5cdf6")
@WinRTInterface("b29f6d28154b5c1da5e898604bb5cdf6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutPresenterAutomationPeer.ByReference::class)
public interface IPickerFlyoutPresenterAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() =
        ABI.makeIPickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutPresenterAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutPresenterAutomationPeer {
    public val __855887157_Ptr: Pointer?

    public val _855887157_VtblPtr: Pointer?
      get() = __855887157_Ptr?.getPointer(0)
  }

  public class IPickerFlyoutPresenterAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855887157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b29f6d28154b5c1da5e898604bb5cdf6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutPresenterAutomationPeer(ptr: Pointer?): WithDefault =
        IPickerFlyoutPresenterAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855887157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutPresenterAutomationPeer):
        Array<IPickerFlyoutPresenterAutomationPeer?> = (elements as
        Array<IPickerFlyoutPresenterAutomationPeer?>).castToImpl<IPickerFlyoutPresenterAutomationPeer,IPickerFlyoutPresenterAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutPresenterAutomationPeer?> =
        arrayOfNulls<IPickerFlyoutPresenterAutomationPeer_Impl>(size) as
        Array<IPickerFlyoutPresenterAutomationPeer?>
  }
}
