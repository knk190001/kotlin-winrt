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

@ABIMarker(IPivotItemAutomationPeer.ABI::class)
@Signature("{1a4241ad-5d55-4d27-b40f-2d37506fbe78}")
@Guid("1a4241ad5d554d27b40f2d37506fbe78")
@WinRTInterface("1a4241ad5d554d27b40f2d37506fbe78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemAutomationPeer.ByReference::class)
public interface IPivotItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemAutomationPeer> {
    public override fun getValue() = ABI.makeIPivotItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPivotItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemAutomationPeer {
    public val __1903658806_Ptr: Pointer?

    public val _1903658806_VtblPtr: Pointer?
      get() = __1903658806_Ptr?.getPointer(0)
  }

  public class IPivotItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1903658806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a4241ad5d554d27b40f2d37506fbe78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemAutomationPeer(ptr: Pointer?): WithDefault =
        IPivotItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPivotItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1903658806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemAutomationPeer):
        Array<IPivotItemAutomationPeer?> = (elements as
        Array<IPivotItemAutomationPeer?>).castToImpl<IPivotItemAutomationPeer,IPivotItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemAutomationPeer?> =
        arrayOfNulls<IPivotItemAutomationPeer_Impl>(size) as Array<IPivotItemAutomationPeer?>
  }
}
