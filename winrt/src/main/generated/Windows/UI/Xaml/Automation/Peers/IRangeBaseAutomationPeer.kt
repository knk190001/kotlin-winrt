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

@ABIMarker(IRangeBaseAutomationPeer.ABI::class)
@Signature("{e454b549-4b2c-42ad-b04b-d35947d1ee50}")
@Guid("e454b5494b2c42adb04bd35947d1ee50")
@WinRTInterface("e454b5494b2c42adb04bd35947d1ee50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBaseAutomationPeer.ByReference::class)
public interface IRangeBaseAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeBaseAutomationPeer> {
    public override fun getValue() = ABI.makeIRangeBaseAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRangeBaseAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBaseAutomationPeer {
    public val __1298199215_Ptr: Pointer?

    public val _1298199215_VtblPtr: Pointer?
      get() = __1298199215_Ptr?.getPointer(0)
  }

  public class IRangeBaseAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1298199215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBaseAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e454b5494b2c42adb04bd35947d1ee50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBaseAutomationPeer(ptr: Pointer?): WithDefault =
        IRangeBaseAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBaseAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRangeBaseAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRangeBaseAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1298199215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBaseAutomationPeer):
        Array<IRangeBaseAutomationPeer?> = (elements as
        Array<IRangeBaseAutomationPeer?>).castToImpl<IRangeBaseAutomationPeer,IRangeBaseAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBaseAutomationPeer?> =
        arrayOfNulls<IRangeBaseAutomationPeer_Impl>(size) as Array<IRangeBaseAutomationPeer?>
  }
}
