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

@ABIMarker(IMenuBarAutomationPeer.ABI::class)
@Signature("{ae96e710-b9d3-59dd-973e-1bbc86cf0afc}")
@Guid("ae96e710b9d359dd973e1bbc86cf0afc")
@WinRTInterface("ae96e710b9d359dd973e1bbc86cf0afc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarAutomationPeer.ByReference::class)
public interface IMenuBarAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarAutomationPeer> {
    public override fun getValue() = ABI.makeIMenuBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMenuBarAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarAutomationPeer {
    public val __1034781930_Ptr: Pointer?

    public val _1034781930_VtblPtr: Pointer?
      get() = __1034781930_Ptr?.getPointer(0)
  }

  public class IMenuBarAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1034781930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae96e710b9d359dd973e1bbc86cf0afc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarAutomationPeer(ptr: Pointer?): WithDefault =
        IMenuBarAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMenuBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1034781930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarAutomationPeer): Array<IMenuBarAutomationPeer?> =
        (elements as
        Array<IMenuBarAutomationPeer?>).castToImpl<IMenuBarAutomationPeer,IMenuBarAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarAutomationPeer?> =
        arrayOfNulls<IMenuBarAutomationPeer_Impl>(size) as Array<IMenuBarAutomationPeer?>
  }
}
