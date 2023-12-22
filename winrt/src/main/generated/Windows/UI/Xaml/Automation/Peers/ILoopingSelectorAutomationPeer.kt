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

@ABIMarker(ILoopingSelectorAutomationPeer.ABI::class)
@Signature("{50b406ca-bae9-4816-8a3a-0cb4f96478a2}")
@Guid("50b406cabae948168a3a0cb4f96478a2")
@WinRTInterface("50b406cabae948168a3a0cb4f96478a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorAutomationPeer.ByReference::class)
public interface ILoopingSelectorAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorAutomationPeer> {
    public override fun getValue() = ABI.makeILoopingSelectorAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorAutomationPeer {
    public val __286547586_Ptr: Pointer?

    public val _286547586_VtblPtr: Pointer?
      get() = __286547586_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __286547586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50b406cabae948168a3a0cb4f96478a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorAutomationPeer(ptr: Pointer?): WithDefault =
        ILoopingSelectorAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorAutomationPeer {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__286547586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorAutomationPeer):
        Array<ILoopingSelectorAutomationPeer?> = (elements as
        Array<ILoopingSelectorAutomationPeer?>).castToImpl<ILoopingSelectorAutomationPeer,ILoopingSelectorAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorAutomationPeer?> =
        arrayOfNulls<ILoopingSelectorAutomationPeer_Impl>(size) as
        Array<ILoopingSelectorAutomationPeer?>
  }
}
