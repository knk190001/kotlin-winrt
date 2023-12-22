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

@ABIMarker(IRichEditBoxAutomationPeer.ABI::class)
@Signature("{193a43f1-129d-57e1-bcf9-ba966bcadacb}")
@Guid("193a43f1129d57e1bcf9ba966bcadacb")
@WinRTInterface("193a43f1129d57e1bcf9ba966bcadacb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxAutomationPeer.ByReference::class)
public interface IRichEditBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxAutomationPeer> {
    public override fun getValue() = ABI.makeIRichEditBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxAutomationPeer {
    public val __1202755931_Ptr: Pointer?

    public val _1202755931_VtblPtr: Pointer?
      get() = __1202755931_Ptr?.getPointer(0)
  }

  public class IRichEditBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1202755931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("193a43f1129d57e1bcf9ba966bcadacb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxAutomationPeer(ptr: Pointer?): WithDefault =
        IRichEditBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1202755931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxAutomationPeer):
        Array<IRichEditBoxAutomationPeer?> = (elements as
        Array<IRichEditBoxAutomationPeer?>).castToImpl<IRichEditBoxAutomationPeer,IRichEditBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxAutomationPeer?> =
        arrayOfNulls<IRichEditBoxAutomationPeer_Impl>(size) as Array<IRichEditBoxAutomationPeer?>
  }
}
