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

@ABIMarker(ILoopingSelectorItemAutomationPeer.ABI::class)
@Signature("{d3fa68bf-04cf-4f4c-8d3e-4780a19d4788}")
@Guid("d3fa68bf04cf4f4c8d3e4780a19d4788")
@WinRTInterface("d3fa68bf04cf4f4c8d3e4780a19d4788")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorItemAutomationPeer.ByReference::class)
public interface ILoopingSelectorItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorItemAutomationPeer> {
    public override fun getValue() =
        ABI.makeILoopingSelectorItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorItemAutomationPeer {
    public val __1418473231_Ptr: Pointer?

    public val _1418473231_VtblPtr: Pointer?
      get() = __1418473231_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418473231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3fa68bf04cf4f4c8d3e4780a19d4788")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorItemAutomationPeer(ptr: Pointer?): WithDefault =
        ILoopingSelectorItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418473231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorItemAutomationPeer):
        Array<ILoopingSelectorItemAutomationPeer?> = (elements as
        Array<ILoopingSelectorItemAutomationPeer?>).castToImpl<ILoopingSelectorItemAutomationPeer,ILoopingSelectorItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorItemAutomationPeer?> =
        arrayOfNulls<ILoopingSelectorItemAutomationPeer_Impl>(size) as
        Array<ILoopingSelectorItemAutomationPeer?>
  }
}
