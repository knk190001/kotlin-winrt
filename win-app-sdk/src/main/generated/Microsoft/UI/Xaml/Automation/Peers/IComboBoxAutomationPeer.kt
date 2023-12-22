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

@ABIMarker(IComboBoxAutomationPeer.ABI::class)
@Signature("{459d2245-1fd2-5dda-822c-bed13df6776b}")
@Guid("459d22451fd25dda822cbed13df6776b")
@WinRTInterface("459d22451fd25dda822cbed13df6776b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxAutomationPeer.ByReference::class)
public interface IComboBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxAutomationPeer> {
    public override fun getValue() = ABI.makeIComboBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IComboBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxAutomationPeer {
    public val __145473273_Ptr: Pointer?

    public val _145473273_VtblPtr: Pointer?
      get() = __145473273_Ptr?.getPointer(0)
  }

  public class IComboBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145473273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("459d22451fd25dda822cbed13df6776b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxAutomationPeer(ptr: Pointer?): WithDefault =
        IComboBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIComboBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145473273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxAutomationPeer): Array<IComboBoxAutomationPeer?>
        = (elements as
        Array<IComboBoxAutomationPeer?>).castToImpl<IComboBoxAutomationPeer,IComboBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxAutomationPeer?> =
        arrayOfNulls<IComboBoxAutomationPeer_Impl>(size) as Array<IComboBoxAutomationPeer?>
  }
}
