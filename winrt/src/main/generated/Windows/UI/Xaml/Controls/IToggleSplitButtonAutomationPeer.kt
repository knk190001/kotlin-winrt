package Windows.UI.Xaml.Controls

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

@ABIMarker(IToggleSplitButtonAutomationPeer.ABI::class)
@Signature("{538e61de-7d46-5da7-94ab-acede6a12b9e}")
@Guid("538e61de7d465da794abacede6a12b9e")
@WinRTInterface("538e61de7d465da794abacede6a12b9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButtonAutomationPeer.ByReference::class)
public interface IToggleSplitButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIToggleSplitButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButtonAutomationPeer {
    public val __2001155221_Ptr: Pointer?

    public val _2001155221_VtblPtr: Pointer?
      get() = __2001155221_Ptr?.getPointer(0)
  }

  public class IToggleSplitButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2001155221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("538e61de7d465da794abacede6a12b9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IToggleSplitButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSplitButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2001155221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButtonAutomationPeer):
        Array<IToggleSplitButtonAutomationPeer?> = (elements as
        Array<IToggleSplitButtonAutomationPeer?>).castToImpl<IToggleSplitButtonAutomationPeer,IToggleSplitButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButtonAutomationPeer?> =
        arrayOfNulls<IToggleSplitButtonAutomationPeer_Impl>(size) as
        Array<IToggleSplitButtonAutomationPeer?>
  }
}
