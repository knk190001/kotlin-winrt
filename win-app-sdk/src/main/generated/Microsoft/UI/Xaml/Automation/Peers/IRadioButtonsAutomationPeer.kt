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

@ABIMarker(IRadioButtonsAutomationPeer.ABI::class)
@Signature("{fff86275-0cdd-54db-9d88-9c0e5f9bcb4d}")
@Guid("fff862750cdd54db9d889c0e5f9bcb4d")
@WinRTInterface("fff862750cdd54db9d889c0e5f9bcb4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonsAutomationPeer.ByReference::class)
public interface IRadioButtonsAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonsAutomationPeer> {
    public override fun getValue() = ABI.makeIRadioButtonsAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonsAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonsAutomationPeer {
    public val __1117649762_Ptr: Pointer?

    public val _1117649762_VtblPtr: Pointer?
      get() = __1117649762_Ptr?.getPointer(0)
  }

  public class IRadioButtonsAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117649762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonsAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fff862750cdd54db9d889c0e5f9bcb4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonsAutomationPeer(ptr: Pointer?): WithDefault =
        IRadioButtonsAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonsAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRadioButtonsAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonsAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117649762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonsAutomationPeer):
        Array<IRadioButtonsAutomationPeer?> = (elements as
        Array<IRadioButtonsAutomationPeer?>).castToImpl<IRadioButtonsAutomationPeer,IRadioButtonsAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonsAutomationPeer?> =
        arrayOfNulls<IRadioButtonsAutomationPeer_Impl>(size) as Array<IRadioButtonsAutomationPeer?>
  }
}
