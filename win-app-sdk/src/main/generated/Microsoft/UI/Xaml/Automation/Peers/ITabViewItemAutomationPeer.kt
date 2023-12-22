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

@ABIMarker(ITabViewItemAutomationPeer.ABI::class)
@Signature("{58afb1c3-a3fd-54a1-be39-328dd8a6f8ec}")
@Guid("58afb1c3a3fd54a1be39328dd8a6f8ec")
@WinRTInterface("58afb1c3a3fd54a1be39328dd8a6f8ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemAutomationPeer.ByReference::class)
public interface ITabViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemAutomationPeer> {
    public override fun getValue() = ABI.makeITabViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemAutomationPeer {
    public val __1385308541_Ptr: Pointer?

    public val _1385308541_VtblPtr: Pointer?
      get() = __1385308541_Ptr?.getPointer(0)
  }

  public class ITabViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1385308541_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58afb1c3a3fd54a1be39328dd8a6f8ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        ITabViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITabViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1385308541_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemAutomationPeer):
        Array<ITabViewItemAutomationPeer?> = (elements as
        Array<ITabViewItemAutomationPeer?>).castToImpl<ITabViewItemAutomationPeer,ITabViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemAutomationPeer?> =
        arrayOfNulls<ITabViewItemAutomationPeer_Impl>(size) as Array<ITabViewItemAutomationPeer?>
  }
}
