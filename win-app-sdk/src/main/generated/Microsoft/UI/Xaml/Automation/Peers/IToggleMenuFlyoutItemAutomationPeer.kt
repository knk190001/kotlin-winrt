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

@ABIMarker(IToggleMenuFlyoutItemAutomationPeer.ABI::class)
@Signature("{ea4e4c7e-1f12-56c0-a2a5-b59e9c25b06d}")
@Guid("ea4e4c7e1f1256c0a2a5b59e9c25b06d")
@WinRTInterface("ea4e4c7e1f1256c0a2a5b59e9c25b06d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleMenuFlyoutItemAutomationPeer.ByReference::class)
public interface IToggleMenuFlyoutItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleMenuFlyoutItemAutomationPeer> {
    public override fun getValue() =
        ABI.makeIToggleMenuFlyoutItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IToggleMenuFlyoutItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleMenuFlyoutItemAutomationPeer {
    public val __108132605_Ptr: Pointer?

    public val _108132605_VtblPtr: Pointer?
      get() = __108132605_Ptr?.getPointer(0)
  }

  public class IToggleMenuFlyoutItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108132605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleMenuFlyoutItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea4e4c7e1f1256c0a2a5b59e9c25b06d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleMenuFlyoutItemAutomationPeer(ptr: Pointer?): WithDefault =
        IToggleMenuFlyoutItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleMenuFlyoutItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIToggleMenuFlyoutItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IToggleMenuFlyoutItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108132605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleMenuFlyoutItemAutomationPeer):
        Array<IToggleMenuFlyoutItemAutomationPeer?> = (elements as
        Array<IToggleMenuFlyoutItemAutomationPeer?>).castToImpl<IToggleMenuFlyoutItemAutomationPeer,IToggleMenuFlyoutItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleMenuFlyoutItemAutomationPeer?> =
        arrayOfNulls<IToggleMenuFlyoutItemAutomationPeer_Impl>(size) as
        Array<IToggleMenuFlyoutItemAutomationPeer?>
  }
}
