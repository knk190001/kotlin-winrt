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

@ABIMarker(IPivotItemDataAutomationPeer.ABI::class)
@Signature("{a2a3b788-ea1d-48b7-88ee-f08b6aa07fee}")
@Guid("a2a3b788ea1d48b788eef08b6aa07fee")
@WinRTInterface("a2a3b788ea1d48b788eef08b6aa07fee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemDataAutomationPeer.ByReference::class)
public interface IPivotItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemDataAutomationPeer> {
    public override fun getValue() = ABI.makeIPivotItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPivotItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemDataAutomationPeer {
    public val __1015792896_Ptr: Pointer?

    public val _1015792896_VtblPtr: Pointer?
      get() = __1015792896_Ptr?.getPointer(0)
  }

  public class IPivotItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015792896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2a3b788ea1d48b788eef08b6aa07fee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        IPivotItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPivotItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015792896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemDataAutomationPeer):
        Array<IPivotItemDataAutomationPeer?> = (elements as
        Array<IPivotItemDataAutomationPeer?>).castToImpl<IPivotItemDataAutomationPeer,IPivotItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemDataAutomationPeer?> =
        arrayOfNulls<IPivotItemDataAutomationPeer_Impl>(size) as
        Array<IPivotItemDataAutomationPeer?>
  }
}
