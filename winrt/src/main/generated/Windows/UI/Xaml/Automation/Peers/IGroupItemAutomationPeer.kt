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

@ABIMarker(IGroupItemAutomationPeer.ABI::class)
@Signature("{1914fe6d-0740-4236-9ee1-38cf19c1c388}")
@Guid("1914fe6d074042369ee138cf19c1c388")
@WinRTInterface("1914fe6d074042369ee138cf19c1c388")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupItemAutomationPeer.ByReference::class)
public interface IGroupItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupItemAutomationPeer> {
    public override fun getValue() = ABI.makeIGroupItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IGroupItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupItemAutomationPeer {
    public val __1868528691_Ptr: Pointer?

    public val _1868528691_VtblPtr: Pointer?
      get() = __1868528691_Ptr?.getPointer(0)
  }

  public class IGroupItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1868528691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1914fe6d074042369ee138cf19c1c388")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupItemAutomationPeer(ptr: Pointer?): WithDefault =
        IGroupItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIGroupItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IGroupItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1868528691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupItemAutomationPeer):
        Array<IGroupItemAutomationPeer?> = (elements as
        Array<IGroupItemAutomationPeer?>).castToImpl<IGroupItemAutomationPeer,IGroupItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupItemAutomationPeer?> =
        arrayOfNulls<IGroupItemAutomationPeer_Impl>(size) as Array<IGroupItemAutomationPeer?>
  }
}
