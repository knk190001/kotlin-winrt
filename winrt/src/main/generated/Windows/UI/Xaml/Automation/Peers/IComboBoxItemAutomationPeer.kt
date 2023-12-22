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

@ABIMarker(IComboBoxItemAutomationPeer.ABI::class)
@Signature("{12ddc76e-9552-446a-82ee-938cc371800f}")
@Guid("12ddc76e9552446a82ee938cc371800f")
@WinRTInterface("12ddc76e9552446a82ee938cc371800f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItemAutomationPeer.ByReference::class)
public interface IComboBoxItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxItemAutomationPeer> {
    public override fun getValue() = ABI.makeIComboBoxItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItemAutomationPeer {
    public val __833450497_Ptr: Pointer?

    public val _833450497_VtblPtr: Pointer?
      get() = __833450497_Ptr?.getPointer(0)
  }

  public class IComboBoxItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __833450497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12ddc76e9552446a82ee938cc371800f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItemAutomationPeer(ptr: Pointer?): WithDefault =
        IComboBoxItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIComboBoxItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__833450497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItemAutomationPeer):
        Array<IComboBoxItemAutomationPeer?> = (elements as
        Array<IComboBoxItemAutomationPeer?>).castToImpl<IComboBoxItemAutomationPeer,IComboBoxItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItemAutomationPeer?> =
        arrayOfNulls<IComboBoxItemAutomationPeer_Impl>(size) as Array<IComboBoxItemAutomationPeer?>
  }
}
