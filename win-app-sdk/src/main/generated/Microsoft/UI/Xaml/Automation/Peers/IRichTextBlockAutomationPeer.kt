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

@ABIMarker(IRichTextBlockAutomationPeer.ABI::class)
@Signature("{7080ff80-b3b8-5d3c-89b5-d989d561192f}")
@Guid("7080ff80b3b85d3c89b5d989d561192f")
@WinRTInterface("7080ff80b3b85d3c89b5d989d561192f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockAutomationPeer.ByReference::class)
public interface IRichTextBlockAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockAutomationPeer> {
    public override fun getValue() = ABI.makeIRichTextBlockAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockAutomationPeer {
    public val __540052774_Ptr: Pointer?

    public val _540052774_VtblPtr: Pointer?
      get() = __540052774_Ptr?.getPointer(0)
  }

  public class IRichTextBlockAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __540052774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7080ff80b3b85d3c89b5d989d561192f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockAutomationPeer(ptr: Pointer?): WithDefault =
        IRichTextBlockAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__540052774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockAutomationPeer):
        Array<IRichTextBlockAutomationPeer?> = (elements as
        Array<IRichTextBlockAutomationPeer?>).castToImpl<IRichTextBlockAutomationPeer,IRichTextBlockAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockAutomationPeer?> =
        arrayOfNulls<IRichTextBlockAutomationPeer_Impl>(size) as
        Array<IRichTextBlockAutomationPeer?>
  }
}
