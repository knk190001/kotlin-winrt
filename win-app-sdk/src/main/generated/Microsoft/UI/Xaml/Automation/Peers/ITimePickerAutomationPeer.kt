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

@ABIMarker(ITimePickerAutomationPeer.ABI::class)
@Signature("{6309d3bb-3387-5965-acf5-47bfa9b92ed4}")
@Guid("6309d3bb33875965acf547bfa9b92ed4")
@WinRTInterface("6309d3bb33875965acf547bfa9b92ed4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerAutomationPeer.ByReference::class)
public interface ITimePickerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerAutomationPeer> {
    public override fun getValue() = ABI.makeITimePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITimePickerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerAutomationPeer {
    public val __732331543_Ptr: Pointer?

    public val _732331543_VtblPtr: Pointer?
      get() = __732331543_Ptr?.getPointer(0)
  }

  public class ITimePickerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __732331543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6309d3bb33875965acf547bfa9b92ed4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerAutomationPeer(ptr: Pointer?): WithDefault =
        ITimePickerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITimePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__732331543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerAutomationPeer):
        Array<ITimePickerAutomationPeer?> = (elements as
        Array<ITimePickerAutomationPeer?>).castToImpl<ITimePickerAutomationPeer,ITimePickerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerAutomationPeer?> =
        arrayOfNulls<ITimePickerAutomationPeer_Impl>(size) as Array<ITimePickerAutomationPeer?>
  }
}
