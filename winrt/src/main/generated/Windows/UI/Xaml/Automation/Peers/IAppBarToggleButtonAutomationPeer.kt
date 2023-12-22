package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IAppBarToggleButtonAutomationPeer.ABI::class)
@Signature("{8464efad-9655-4aff-9550-63ae9ec8fe9c}")
@Guid("8464efad96554aff955063ae9ec8fe9c")
@WinRTInterface("8464efad96554aff955063ae9ec8fe9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonAutomationPeer.ByReference::class)
public interface IAppBarToggleButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonAutomationPeer> {
    public override fun getValue() =
        ABI.makeIAppBarToggleButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonAutomationPeer {
    public val __302155031_Ptr: Pointer?

    public val _302155031_VtblPtr: Pointer?
      get() = __302155031_Ptr?.getPointer(0)
  }

  public class IAppBarToggleButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __302155031_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8464efad96554aff955063ae9ec8fe9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__302155031_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonAutomationPeer):
        Array<IAppBarToggleButtonAutomationPeer?> = (elements as
        Array<IAppBarToggleButtonAutomationPeer?>).castToImpl<IAppBarToggleButtonAutomationPeer,IAppBarToggleButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonAutomationPeer?> =
        arrayOfNulls<IAppBarToggleButtonAutomationPeer_Impl>(size) as
        Array<IAppBarToggleButtonAutomationPeer?>
  }
}
