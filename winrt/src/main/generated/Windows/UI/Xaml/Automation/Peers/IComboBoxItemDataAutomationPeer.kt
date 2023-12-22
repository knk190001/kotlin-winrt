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

@ABIMarker(IComboBoxItemDataAutomationPeer.ABI::class)
@Signature("{4fef6df2-289c-4c04-831b-5a668c6d7104}")
@Guid("4fef6df2289c4c04831b5a668c6d7104")
@WinRTInterface("4fef6df2289c4c04831b5a668c6d7104")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItemDataAutomationPeer.ByReference::class)
public interface IComboBoxItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxItemDataAutomationPeer> {
    public override fun getValue() = ABI.makeIComboBoxItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItemDataAutomationPeer {
    public val __1305593931_Ptr: Pointer?

    public val _1305593931_VtblPtr: Pointer?
      get() = __1305593931_Ptr?.getPointer(0)
  }

  public class IComboBoxItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1305593931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fef6df2289c4c04831b5a668c6d7104")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        IComboBoxItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIComboBoxItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305593931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItemDataAutomationPeer):
        Array<IComboBoxItemDataAutomationPeer?> = (elements as
        Array<IComboBoxItemDataAutomationPeer?>).castToImpl<IComboBoxItemDataAutomationPeer,IComboBoxItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItemDataAutomationPeer?> =
        arrayOfNulls<IComboBoxItemDataAutomationPeer_Impl>(size) as
        Array<IComboBoxItemDataAutomationPeer?>
  }
}
