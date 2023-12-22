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

@ABIMarker(IInfoBarAutomationPeer.ABI::class)
@Signature("{aa2c40eb-df80-5050-92c5-5fda5abfdef2}")
@Guid("aa2c40ebdf80505092c55fda5abfdef2")
@WinRTInterface("aa2c40ebdf80505092c55fda5abfdef2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarAutomationPeer.ByReference::class)
public interface IInfoBarAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarAutomationPeer> {
    public override fun getValue() = ABI.makeIInfoBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IInfoBarAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarAutomationPeer {
    public val __658234747_Ptr: Pointer?

    public val _658234747_VtblPtr: Pointer?
      get() = __658234747_Ptr?.getPointer(0)
  }

  public class IInfoBarAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __658234747_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa2c40ebdf80505092c55fda5abfdef2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarAutomationPeer(ptr: Pointer?): WithDefault =
        IInfoBarAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIInfoBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__658234747_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarAutomationPeer): Array<IInfoBarAutomationPeer?> =
        (elements as
        Array<IInfoBarAutomationPeer?>).castToImpl<IInfoBarAutomationPeer,IInfoBarAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarAutomationPeer?> =
        arrayOfNulls<IInfoBarAutomationPeer_Impl>(size) as Array<IInfoBarAutomationPeer?>
  }
}
