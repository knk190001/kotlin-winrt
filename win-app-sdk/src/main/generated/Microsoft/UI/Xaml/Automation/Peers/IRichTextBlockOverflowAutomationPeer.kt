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

@ABIMarker(IRichTextBlockOverflowAutomationPeer.ABI::class)
@Signature("{d0bf83c0-8cfb-5770-b26c-0706e51a9a3b}")
@Guid("d0bf83c08cfb5770b26c0706e51a9a3b")
@WinRTInterface("d0bf83c08cfb5770b26c0706e51a9a3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflowAutomationPeer.ByReference::class)
public interface IRichTextBlockOverflowAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflowAutomationPeer> {
    public override fun getValue() =
        ABI.makeIRichTextBlockOverflowAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflowAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflowAutomationPeer {
    public val __1541437052_Ptr: Pointer?

    public val _1541437052_VtblPtr: Pointer?
      get() = __1541437052_Ptr?.getPointer(0)
  }

  public class IRichTextBlockOverflowAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541437052_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflowAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0bf83c08cfb5770b26c0706e51a9a3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflowAutomationPeer(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflowAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflowAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflowAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflowAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541437052_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflowAutomationPeer):
        Array<IRichTextBlockOverflowAutomationPeer?> = (elements as
        Array<IRichTextBlockOverflowAutomationPeer?>).castToImpl<IRichTextBlockOverflowAutomationPeer,IRichTextBlockOverflowAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflowAutomationPeer?> =
        arrayOfNulls<IRichTextBlockOverflowAutomationPeer_Impl>(size) as
        Array<IRichTextBlockOverflowAutomationPeer?>
  }
}
