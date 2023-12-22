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

@ABIMarker(IListBoxItemAutomationPeer.ABI::class)
@Signature("{19a8c4b4-e63a-5b2e-8e2f-c834e6a08204}")
@Guid("19a8c4b4e63a5b2e8e2fc834e6a08204")
@WinRTInterface("19a8c4b4e63a5b2e8e2fc834e6a08204")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItemAutomationPeer.ByReference::class)
public interface IListBoxItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxItemAutomationPeer> {
    public override fun getValue() = ABI.makeIListBoxItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListBoxItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItemAutomationPeer {
    public val __194925622_Ptr: Pointer?

    public val _194925622_VtblPtr: Pointer?
      get() = __194925622_Ptr?.getPointer(0)
  }

  public class IListBoxItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __194925622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19a8c4b4e63a5b2e8e2fc834e6a08204")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItemAutomationPeer(ptr: Pointer?): WithDefault =
        IListBoxItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListBoxItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__194925622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItemAutomationPeer):
        Array<IListBoxItemAutomationPeer?> = (elements as
        Array<IListBoxItemAutomationPeer?>).castToImpl<IListBoxItemAutomationPeer,IListBoxItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItemAutomationPeer?> =
        arrayOfNulls<IListBoxItemAutomationPeer_Impl>(size) as Array<IListBoxItemAutomationPeer?>
  }
}
