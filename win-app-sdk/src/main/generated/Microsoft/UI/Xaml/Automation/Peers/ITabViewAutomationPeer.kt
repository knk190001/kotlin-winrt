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

@ABIMarker(ITabViewAutomationPeer.ABI::class)
@Signature("{efb3f05b-2a25-5266-a1cb-5a0aa451ca32}")
@Guid("efb3f05b2a255266a1cb5a0aa451ca32")
@WinRTInterface("efb3f05b2a255266a1cb5a0aa451ca32")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewAutomationPeer.ByReference::class)
public interface ITabViewAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewAutomationPeer> {
    public override fun getValue() = ABI.makeITabViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITabViewAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewAutomationPeer {
    public val __387926032_Ptr: Pointer?

    public val _387926032_VtblPtr: Pointer?
      get() = __387926032_Ptr?.getPointer(0)
  }

  public class ITabViewAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __387926032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efb3f05b2a255266a1cb5a0aa451ca32")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewAutomationPeer(ptr: Pointer?): WithDefault =
        ITabViewAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITabViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITabViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__387926032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewAutomationPeer): Array<ITabViewAutomationPeer?> =
        (elements as
        Array<ITabViewAutomationPeer?>).castToImpl<ITabViewAutomationPeer,ITabViewAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewAutomationPeer?> =
        arrayOfNulls<ITabViewAutomationPeer_Impl>(size) as Array<ITabViewAutomationPeer?>
  }
}
