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

@ABIMarker(IHubAutomationPeer.ABI::class)
@Signature("{4ddee056-4ebc-4620-a05d-903e3c9a4ead}")
@Guid("4ddee0564ebc4620a05d903e3c9a4ead")
@WinRTInterface("4ddee0564ebc4620a05d903e3c9a4ead")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubAutomationPeer.ByReference::class)
public interface IHubAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubAutomationPeer> {
    public override fun getValue() = ABI.makeIHubAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IHubAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubAutomationPeer {
    public val __731989942_Ptr: Pointer?

    public val _731989942_VtblPtr: Pointer?
      get() = __731989942_Ptr?.getPointer(0)
  }

  public class IHubAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __731989942_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ddee0564ebc4620a05d903e3c9a4ead")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubAutomationPeer(ptr: Pointer?): WithDefault = IHubAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIHubAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IHubAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__731989942_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubAutomationPeer): Array<IHubAutomationPeer?> =
        (elements as
        Array<IHubAutomationPeer?>).castToImpl<IHubAutomationPeer,IHubAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubAutomationPeer?> =
        arrayOfNulls<IHubAutomationPeer_Impl>(size) as Array<IHubAutomationPeer?>
  }
}
