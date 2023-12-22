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

@ABIMarker(IFlyoutPresenterAutomationPeer.ABI::class)
@Signature("{e589b818-4a64-58c5-9c0b-5cea0f867e9b}")
@Guid("e589b8184a6458c59c0b5cea0f867e9b")
@WinRTInterface("e589b8184a6458c59c0b5cea0f867e9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenterAutomationPeer.ByReference::class)
public interface IFlyoutPresenterAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenterAutomationPeer> {
    public override fun getValue() = ABI.makeIFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenterAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenterAutomationPeer {
    public val __15006493_Ptr: Pointer?

    public val _15006493_VtblPtr: Pointer?
      get() = __15006493_Ptr?.getPointer(0)
  }

  public class IFlyoutPresenterAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __15006493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e589b8184a6458c59c0b5cea0f867e9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenterAutomationPeer(ptr: Pointer?): WithDefault =
        IFlyoutPresenterAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__15006493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenterAutomationPeer):
        Array<IFlyoutPresenterAutomationPeer?> = (elements as
        Array<IFlyoutPresenterAutomationPeer?>).castToImpl<IFlyoutPresenterAutomationPeer,IFlyoutPresenterAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenterAutomationPeer?> =
        arrayOfNulls<IFlyoutPresenterAutomationPeer_Impl>(size) as
        Array<IFlyoutPresenterAutomationPeer?>
  }
}
