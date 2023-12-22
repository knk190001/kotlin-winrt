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

@ABIMarker(IPivotItemAutomationPeer.ABI::class)
@Signature("{bfe7fb7b-2d88-56e4-b50f-0a40de6f52a1}")
@Guid("bfe7fb7b2d8856e4b50f0a40de6f52a1")
@WinRTInterface("bfe7fb7b2d8856e4b50f0a40de6f52a1")
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
    public val __1761959893_Ptr: Pointer?

    public val _1761959893_VtblPtr: Pointer?
      get() = __1761959893_Ptr?.getPointer(0)
  }

  public class IPivotItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1761959893_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfe7fb7b2d8856e4b50f0a40de6f52a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemAutomationPeer(ptr: Pointer?): WithDefault =
        IPivotItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPivotItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1761959893_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemAutomationPeer):
        Array<IPivotItemAutomationPeer?> = (elements as
        Array<IPivotItemAutomationPeer?>).castToImpl<IPivotItemAutomationPeer,IPivotItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemAutomationPeer?> =
        arrayOfNulls<IPivotItemAutomationPeer_Impl>(size) as Array<IPivotItemAutomationPeer?>
  }
}
