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

@ABIMarker(IMenuBarItemAutomationPeer.ABI::class)
@Signature("{0fce49b4-cff5-5c4b-98ee-e75fdddf799a}")
@Guid("0fce49b4cff55c4b98eee75fdddf799a")
@WinRTInterface("0fce49b4cff55c4b98eee75fdddf799a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarItemAutomationPeer.ByReference::class)
public interface IMenuBarItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarItemAutomationPeer> {
    public override fun getValue() = ABI.makeIMenuBarItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMenuBarItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarItemAutomationPeer {
    public val __1700621992_Ptr: Pointer?

    public val _1700621992_VtblPtr: Pointer?
      get() = __1700621992_Ptr?.getPointer(0)
  }

  public class IMenuBarItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1700621992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fce49b4cff55c4b98eee75fdddf799a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarItemAutomationPeer(ptr: Pointer?): WithDefault =
        IMenuBarItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMenuBarItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1700621992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarItemAutomationPeer):
        Array<IMenuBarItemAutomationPeer?> = (elements as
        Array<IMenuBarItemAutomationPeer?>).castToImpl<IMenuBarItemAutomationPeer,IMenuBarItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarItemAutomationPeer?> =
        arrayOfNulls<IMenuBarItemAutomationPeer_Impl>(size) as Array<IMenuBarItemAutomationPeer?>
  }
}
