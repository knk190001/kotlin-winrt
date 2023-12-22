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

@ABIMarker(IFlipViewItemAutomationPeer.ABI::class)
@Signature("{3569b1bb-7601-56de-812a-171455d8ad32}")
@Guid("3569b1bb760156de812a171455d8ad32")
@WinRTInterface("3569b1bb760156de812a171455d8ad32")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItemAutomationPeer.ByReference::class)
public interface IFlipViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewItemAutomationPeer> {
    public override fun getValue() = ABI.makeIFlipViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItemAutomationPeer {
    public val __177167617_Ptr: Pointer?

    public val _177167617_VtblPtr: Pointer?
      get() = __177167617_Ptr?.getPointer(0)
  }

  public class IFlipViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177167617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3569b1bb760156de812a171455d8ad32")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        IFlipViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177167617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItemAutomationPeer):
        Array<IFlipViewItemAutomationPeer?> = (elements as
        Array<IFlipViewItemAutomationPeer?>).castToImpl<IFlipViewItemAutomationPeer,IFlipViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItemAutomationPeer?> =
        arrayOfNulls<IFlipViewItemAutomationPeer_Impl>(size) as Array<IFlipViewItemAutomationPeer?>
  }
}
