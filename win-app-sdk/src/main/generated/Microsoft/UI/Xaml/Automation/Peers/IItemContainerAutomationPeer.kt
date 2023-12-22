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

@ABIMarker(IItemContainerAutomationPeer.ABI::class)
@Signature("{f915a1fb-754e-58c7-ad2a-b99528701793}")
@Guid("f915a1fb754e58c7ad2ab99528701793")
@WinRTInterface("f915a1fb754e58c7ad2ab99528701793")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerAutomationPeer.ByReference::class)
public interface IItemContainerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerAutomationPeer> {
    public override fun getValue() = ABI.makeIItemContainerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IItemContainerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerAutomationPeer {
    public val __1007636004_Ptr: Pointer?

    public val _1007636004_VtblPtr: Pointer?
      get() = __1007636004_Ptr?.getPointer(0)
  }

  public class IItemContainerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1007636004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f915a1fb754e58c7ad2ab99528701793")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerAutomationPeer(ptr: Pointer?): WithDefault =
        IItemContainerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIItemContainerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007636004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerAutomationPeer):
        Array<IItemContainerAutomationPeer?> = (elements as
        Array<IItemContainerAutomationPeer?>).castToImpl<IItemContainerAutomationPeer,IItemContainerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerAutomationPeer?> =
        arrayOfNulls<IItemContainerAutomationPeer_Impl>(size) as
        Array<IItemContainerAutomationPeer?>
  }
}
