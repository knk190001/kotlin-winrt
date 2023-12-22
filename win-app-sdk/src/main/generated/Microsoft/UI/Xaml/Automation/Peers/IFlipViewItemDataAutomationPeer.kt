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

@ABIMarker(IFlipViewItemDataAutomationPeer.ABI::class)
@Signature("{3bb31a93-e737-501d-b9a6-a11461c9bcf5}")
@Guid("3bb31a93e737501db9a6a11461c9bcf5")
@WinRTInterface("3bb31a93e737501db9a6a11461c9bcf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItemDataAutomationPeer.ByReference::class)
public interface IFlipViewItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewItemDataAutomationPeer> {
    public override fun getValue() = ABI.makeIFlipViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItemDataAutomationPeer {
    public val __1111084213_Ptr: Pointer?

    public val _1111084213_VtblPtr: Pointer?
      get() = __1111084213_Ptr?.getPointer(0)
  }

  public class IFlipViewItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111084213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bb31a93e737501db9a6a11461c9bcf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        IFlipViewItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111084213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItemDataAutomationPeer):
        Array<IFlipViewItemDataAutomationPeer?> = (elements as
        Array<IFlipViewItemDataAutomationPeer?>).castToImpl<IFlipViewItemDataAutomationPeer,IFlipViewItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItemDataAutomationPeer?> =
        arrayOfNulls<IFlipViewItemDataAutomationPeer_Impl>(size) as
        Array<IFlipViewItemDataAutomationPeer?>
  }
}
