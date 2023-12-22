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

@ABIMarker(IToggleButtonAutomationPeer.ABI::class)
@Signature("{637d9b99-bcc2-5e26-b43f-ba6c26af72c3}")
@Guid("637d9b99bcc25e26b43fba6c26af72c3")
@WinRTInterface("637d9b99bcc25e26b43fba6c26af72c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleButtonAutomationPeer.ByReference::class)
public interface IToggleButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIToggleButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IToggleButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleButtonAutomationPeer {
    public val __1643479042_Ptr: Pointer?

    public val _1643479042_VtblPtr: Pointer?
      get() = __1643479042_Ptr?.getPointer(0)
  }

  public class IToggleButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1643479042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("637d9b99bcc25e26b43fba6c26af72c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IToggleButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIToggleButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IToggleButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1643479042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleButtonAutomationPeer):
        Array<IToggleButtonAutomationPeer?> = (elements as
        Array<IToggleButtonAutomationPeer?>).castToImpl<IToggleButtonAutomationPeer,IToggleButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleButtonAutomationPeer?> =
        arrayOfNulls<IToggleButtonAutomationPeer_Impl>(size) as Array<IToggleButtonAutomationPeer?>
  }
}
