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

@ABIMarker(IRatingControlAutomationPeer.ABI::class)
@Signature("{3d14349a-9963-4a47-823c-f457cb3209d5}")
@Guid("3d14349a99634a47823cf457cb3209d5")
@WinRTInterface("3d14349a99634a47823cf457cb3209d5")
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
    public val __1498430081_Ptr: Pointer?

    public val _1498430081_VtblPtr: Pointer?
      get() = __1498430081_Ptr?.getPointer(0)
  }

  public class IRatingControlAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1498430081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingControlAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d14349a99634a47823cf457cb3209d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingControlAutomationPeer(ptr: Pointer?): WithDefault =
        IRatingControlAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingControlAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRatingControlAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRatingControlAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1498430081_Ptr))
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
