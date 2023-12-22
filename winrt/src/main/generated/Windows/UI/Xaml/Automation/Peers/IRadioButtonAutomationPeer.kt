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

@ABIMarker(IRadioButtonAutomationPeer.ABI::class)
@Signature("{7e6a5ed8-0b30-4743-b102-dcdf548e3131}")
@Guid("7e6a5ed80b304743b102dcdf548e3131")
@WinRTInterface("7e6a5ed80b304743b102dcdf548e3131")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonAutomationPeer.ByReference::class)
public interface IRadioButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIRadioButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonAutomationPeer {
    public val __1754505266_Ptr: Pointer?

    public val _1754505266_VtblPtr: Pointer?
      get() = __1754505266_Ptr?.getPointer(0)
  }

  public class IRadioButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754505266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e6a5ed80b304743b102dcdf548e3131")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IRadioButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIRadioButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754505266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonAutomationPeer):
        Array<IRadioButtonAutomationPeer?> = (elements as
        Array<IRadioButtonAutomationPeer?>).castToImpl<IRadioButtonAutomationPeer,IRadioButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonAutomationPeer?> =
        arrayOfNulls<IRadioButtonAutomationPeer_Impl>(size) as Array<IRadioButtonAutomationPeer?>
  }
}
