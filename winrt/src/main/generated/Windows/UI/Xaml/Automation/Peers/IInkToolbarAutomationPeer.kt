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

@ABIMarker(IInkToolbarAutomationPeer.ABI::class)
@Signature("{123baaa4-f2e8-4bcb-9382-5dfdd11fe45f}")
@Guid("123baaa4f2e84bcb93825dfdd11fe45f")
@WinRTInterface("123baaa4f2e84bcb93825dfdd11fe45f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarAutomationPeer.ByReference::class)
public interface IInkToolbarAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarAutomationPeer> {
    public override fun getValue() = ABI.makeIInkToolbarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarAutomationPeer {
    public val __940474906_Ptr: Pointer?

    public val _940474906_VtblPtr: Pointer?
      get() = __940474906_Ptr?.getPointer(0)
  }

  public class IInkToolbarAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __940474906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("123baaa4f2e84bcb93825dfdd11fe45f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarAutomationPeer(ptr: Pointer?): WithDefault =
        IInkToolbarAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIInkToolbarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__940474906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarAutomationPeer):
        Array<IInkToolbarAutomationPeer?> = (elements as
        Array<IInkToolbarAutomationPeer?>).castToImpl<IInkToolbarAutomationPeer,IInkToolbarAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarAutomationPeer?> =
        arrayOfNulls<IInkToolbarAutomationPeer_Impl>(size) as Array<IInkToolbarAutomationPeer?>
  }
}
