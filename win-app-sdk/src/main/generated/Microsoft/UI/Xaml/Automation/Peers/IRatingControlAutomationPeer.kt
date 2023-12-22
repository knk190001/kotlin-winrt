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

@ABIMarker(IRatingControlAutomationPeer.ABI::class)
@Signature("{55493ec4-926b-595a-97a3-a7fa604188a4}")
@Guid("55493ec4926b595a97a3a7fa604188a4")
@WinRTInterface("55493ec4926b595a97a3a7fa604188a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingControlAutomationPeer.ByReference::class)
public interface IRatingControlAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingControlAutomationPeer> {
    public override fun getValue() = ABI.makeIRatingControlAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRatingControlAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingControlAutomationPeer {
    public val __1694748918_Ptr: Pointer?

    public val _1694748918_VtblPtr: Pointer?
      get() = __1694748918_Ptr?.getPointer(0)
  }

  public class IRatingControlAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1694748918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingControlAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55493ec4926b595a97a3a7fa604188a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingControlAutomationPeer(ptr: Pointer?): WithDefault =
        IRatingControlAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingControlAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRatingControlAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRatingControlAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1694748918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingControlAutomationPeer):
        Array<IRatingControlAutomationPeer?> = (elements as
        Array<IRatingControlAutomationPeer?>).castToImpl<IRatingControlAutomationPeer,IRatingControlAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingControlAutomationPeer?> =
        arrayOfNulls<IRatingControlAutomationPeer_Impl>(size) as
        Array<IRatingControlAutomationPeer?>
  }
}
