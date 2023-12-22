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

@ABIMarker(ITreeViewListAutomationPeer.ABI::class)
@Signature("{71c1b5bc-bb29-4479-a8a8-606be6b823ae}")
@Guid("71c1b5bcbb294479a8a8606be6b823ae")
@WinRTInterface("71c1b5bcbb294479a8a8606be6b823ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewListAutomationPeer.ByReference::class)
public interface ITreeViewListAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewListAutomationPeer> {
    public override fun getValue() = ABI.makeITreeViewListAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITreeViewListAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewListAutomationPeer {
    public val __1809433810_Ptr: Pointer?

    public val _1809433810_VtblPtr: Pointer?
      get() = __1809433810_Ptr?.getPointer(0)
  }

  public class ITreeViewListAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1809433810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewListAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71c1b5bcbb294479a8a8606be6b823ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewListAutomationPeer(ptr: Pointer?): WithDefault =
        ITreeViewListAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewListAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITreeViewListAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewListAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1809433810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewListAutomationPeer):
        Array<ITreeViewListAutomationPeer?> = (elements as
        Array<ITreeViewListAutomationPeer?>).castToImpl<ITreeViewListAutomationPeer,ITreeViewListAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewListAutomationPeer?> =
        arrayOfNulls<ITreeViewListAutomationPeer_Impl>(size) as Array<ITreeViewListAutomationPeer?>
  }
}
