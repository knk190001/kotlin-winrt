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

@ABIMarker(ICalendarDatePickerAutomationPeer.ABI::class)
@Signature("{40d8938e-db5e-4b03-beba-d10f62419787}")
@Guid("40d8938edb5e4b03bebad10f62419787")
@WinRTInterface("40d8938edb5e4b03bebad10f62419787")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerAutomationPeer.ByReference::class)
public interface ICalendarDatePickerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerAutomationPeer> {
    public override fun getValue() =
        ABI.makeICalendarDatePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerAutomationPeer {
    public val __495359957_Ptr: Pointer?

    public val _495359957_VtblPtr: Pointer?
      get() = __495359957_Ptr?.getPointer(0)
  }

  public class ICalendarDatePickerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __495359957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40d8938edb5e4b03bebad10f62419787")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerAutomationPeer(ptr: Pointer?): WithDefault =
        ICalendarDatePickerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__495359957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerAutomationPeer):
        Array<ICalendarDatePickerAutomationPeer?> = (elements as
        Array<ICalendarDatePickerAutomationPeer?>).castToImpl<ICalendarDatePickerAutomationPeer,ICalendarDatePickerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerAutomationPeer?> =
        arrayOfNulls<ICalendarDatePickerAutomationPeer_Impl>(size) as
        Array<ICalendarDatePickerAutomationPeer?>
  }
}
