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

@ABIMarker(IMenuFlyoutItemAutomationPeer.ABI::class)
@Signature("{fdb57952-2a4f-5ed4-8ada-320def75ea71}")
@Guid("fdb579522a4f5ed48ada320def75ea71")
@WinRTInterface("fdb579522a4f5ed48ada320def75ea71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemAutomationPeer.ByReference::class)
public interface IMenuFlyoutItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemAutomationPeer> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemAutomationPeer {
    public val __947345975_Ptr: Pointer?

    public val _947345975_VtblPtr: Pointer?
      get() = __947345975_Ptr?.getPointer(0)
  }

  public class IMenuFlyoutItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947345975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdb579522a4f5ed48ada320def75ea71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemAutomationPeer(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947345975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemAutomationPeer):
        Array<IMenuFlyoutItemAutomationPeer?> = (elements as
        Array<IMenuFlyoutItemAutomationPeer?>).castToImpl<IMenuFlyoutItemAutomationPeer,IMenuFlyoutItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemAutomationPeer?> =
        arrayOfNulls<IMenuFlyoutItemAutomationPeer_Impl>(size) as
        Array<IMenuFlyoutItemAutomationPeer?>
  }
}
