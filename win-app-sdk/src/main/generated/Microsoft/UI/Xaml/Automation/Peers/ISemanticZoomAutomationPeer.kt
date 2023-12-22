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

@ABIMarker(ISemanticZoomAutomationPeer.ABI::class)
@Signature("{7d7fbd09-112f-50fd-9654-0474ce760b5d}")
@Guid("7d7fbd09112f50fd96540474ce760b5d")
@WinRTInterface("7d7fbd09112f50fd96540474ce760b5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomAutomationPeer.ByReference::class)
public interface ISemanticZoomAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomAutomationPeer> {
    public override fun getValue() = ABI.makeISemanticZoomAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomAutomationPeer {
    public val __449435093_Ptr: Pointer?

    public val _449435093_VtblPtr: Pointer?
      get() = __449435093_Ptr?.getPointer(0)
  }

  public class ISemanticZoomAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449435093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d7fbd09112f50fd96540474ce760b5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomAutomationPeer(ptr: Pointer?): WithDefault =
        ISemanticZoomAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISemanticZoomAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449435093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomAutomationPeer):
        Array<ISemanticZoomAutomationPeer?> = (elements as
        Array<ISemanticZoomAutomationPeer?>).castToImpl<ISemanticZoomAutomationPeer,ISemanticZoomAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomAutomationPeer?> =
        arrayOfNulls<ISemanticZoomAutomationPeer_Impl>(size) as Array<ISemanticZoomAutomationPeer?>
  }
}
