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

@ABIMarker(IGridViewItemAutomationPeer.ABI::class)
@Signature("{de249c2e-5419-5798-b625-cd2c05307572}")
@Guid("de249c2e54195798b625cd2c05307572")
@WinRTInterface("de249c2e54195798b625cd2c05307572")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemAutomationPeer.ByReference::class)
public interface IGridViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemAutomationPeer> {
    public override fun getValue() = ABI.makeIGridViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemAutomationPeer {
    public val __1422438630_Ptr: Pointer?

    public val _1422438630_VtblPtr: Pointer?
      get() = __1422438630_Ptr?.getPointer(0)
  }

  public class IGridViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1422438630_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de249c2e54195798b625cd2c05307572")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        IGridViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIGridViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1422438630_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemAutomationPeer):
        Array<IGridViewItemAutomationPeer?> = (elements as
        Array<IGridViewItemAutomationPeer?>).castToImpl<IGridViewItemAutomationPeer,IGridViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemAutomationPeer?> =
        arrayOfNulls<IGridViewItemAutomationPeer_Impl>(size) as Array<IGridViewItemAutomationPeer?>
  }
}
