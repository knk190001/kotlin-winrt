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

@ABIMarker(ILoopingSelectorItemDataAutomationPeer.ABI::class)
@Signature("{1f8362eb-a069-5121-a56b-619365b4515c}")
@Guid("1f8362eba0695121a56b619365b4515c")
@WinRTInterface("1f8362eba0695121a56b619365b4515c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorItemDataAutomationPeer.ByReference::class)
public interface ILoopingSelectorItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorItemDataAutomationPeer> {
    public override fun getValue() =
        ABI.makeILoopingSelectorItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorItemDataAutomationPeer {
    public val __61142896_Ptr: Pointer?

    public val _61142896_VtblPtr: Pointer?
      get() = __61142896_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __61142896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f8362eba0695121a56b619365b4515c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        ILoopingSelectorItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__61142896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorItemDataAutomationPeer):
        Array<ILoopingSelectorItemDataAutomationPeer?> = (elements as
        Array<ILoopingSelectorItemDataAutomationPeer?>).castToImpl<ILoopingSelectorItemDataAutomationPeer,ILoopingSelectorItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorItemDataAutomationPeer?> =
        arrayOfNulls<ILoopingSelectorItemDataAutomationPeer_Impl>(size) as
        Array<ILoopingSelectorItemDataAutomationPeer?>
  }
}
