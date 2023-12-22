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

@ABIMarker(IDropDownButtonAutomationPeer.ABI::class)
@Signature("{72f294f1-bff6-5d07-9db4-54134506bc80}")
@Guid("72f294f1bff65d079db454134506bc80")
@WinRTInterface("72f294f1bff65d079db454134506bc80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropDownButtonAutomationPeer.ByReference::class)
public interface IDropDownButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropDownButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIDropDownButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IDropDownButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropDownButtonAutomationPeer {
    public val __879145256_Ptr: Pointer?

    public val _879145256_VtblPtr: Pointer?
      get() = __879145256_Ptr?.getPointer(0)
  }

  public class IDropDownButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __879145256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropDownButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72f294f1bff65d079db454134506bc80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropDownButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IDropDownButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropDownButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIDropDownButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IDropDownButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__879145256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropDownButtonAutomationPeer):
        Array<IDropDownButtonAutomationPeer?> = (elements as
        Array<IDropDownButtonAutomationPeer?>).castToImpl<IDropDownButtonAutomationPeer,IDropDownButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropDownButtonAutomationPeer?> =
        arrayOfNulls<IDropDownButtonAutomationPeer_Impl>(size) as
        Array<IDropDownButtonAutomationPeer?>
  }
}
