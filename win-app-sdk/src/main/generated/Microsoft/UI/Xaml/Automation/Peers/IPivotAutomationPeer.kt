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

@ABIMarker(IPivotAutomationPeer.ABI::class)
@Signature("{84225540-a6a3-5e65-a3dc-b31b81ab14c1}")
@Guid("84225540a6a35e65a3dcb31b81ab14c1")
@WinRTInterface("84225540a6a35e65a3dcb31b81ab14c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotAutomationPeer.ByReference::class)
public interface IPivotAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotAutomationPeer> {
    public override fun getValue() = ABI.makeIPivotAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPivotAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotAutomationPeer {
    public val __1969167800_Ptr: Pointer?

    public val _1969167800_VtblPtr: Pointer?
      get() = __1969167800_Ptr?.getPointer(0)
  }

  public class IPivotAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1969167800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84225540a6a35e65a3dcb31b81ab14c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotAutomationPeer(ptr: Pointer?): WithDefault = IPivotAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPivotAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPivotAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1969167800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotAutomationPeer): Array<IPivotAutomationPeer?> =
        (elements as
        Array<IPivotAutomationPeer?>).castToImpl<IPivotAutomationPeer,IPivotAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotAutomationPeer?> =
        arrayOfNulls<IPivotAutomationPeer_Impl>(size) as Array<IPivotAutomationPeer?>
  }
}
