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

@ABIMarker(ISearchBoxAutomationPeer.ABI::class)
@Signature("{854011a4-18a6-4f30-939b-8871afa3f5e9}")
@Guid("854011a418a64f30939b8871afa3f5e9")
@WinRTInterface("854011a418a64f30939b8871afa3f5e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxAutomationPeer.ByReference::class)
public interface ISearchBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxAutomationPeer> {
    public override fun getValue() = ABI.makeISearchBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxAutomationPeer {
    public val __191132860_Ptr: Pointer?

    public val _191132860_VtblPtr: Pointer?
      get() = __191132860_Ptr?.getPointer(0)
  }

  public class ISearchBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __191132860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("854011a418a64f30939b8871afa3f5e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxAutomationPeer(ptr: Pointer?): WithDefault =
        ISearchBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISearchBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__191132860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxAutomationPeer):
        Array<ISearchBoxAutomationPeer?> = (elements as
        Array<ISearchBoxAutomationPeer?>).castToImpl<ISearchBoxAutomationPeer,ISearchBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxAutomationPeer?> =
        arrayOfNulls<ISearchBoxAutomationPeer_Impl>(size) as Array<ISearchBoxAutomationPeer?>
  }
}
