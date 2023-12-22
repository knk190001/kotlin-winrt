package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.CalendarDatePicker
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarDatePickerAutomationPeerFactory.ABI::class)
@Signature("{ab705dd2-d293-45bf-9f19-26f7603a5e9b}")
@Guid("ab705dd2d29345bf9f1926f7603a5e9b")
@WinRTInterface("ab705dd2d29345bf9f1926f7603a5e9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerAutomationPeerFactory.ByReference::class)
public interface ICalendarDatePickerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: CalendarDatePicker?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): CalendarDatePickerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeICalendarDatePickerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerAutomationPeerFactory {
    public val __580381279_Ptr: Pointer?

    public val _580381279_VtblPtr: Pointer?
      get() = __580381279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: CalendarDatePicker?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): CalendarDatePickerAutomationPeer? {
      val fnPtr = _580381279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarDatePickerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__580381279_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarDatePickerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __580381279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab705dd2d29345bf9f1926f7603a5e9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ICalendarDatePickerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICalendarDatePickerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__580381279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerAutomationPeerFactory):
        Array<ICalendarDatePickerAutomationPeerFactory?> = (elements as
        Array<ICalendarDatePickerAutomationPeerFactory?>).castToImpl<ICalendarDatePickerAutomationPeerFactory,ICalendarDatePickerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerAutomationPeerFactory?> =
        arrayOfNulls<ICalendarDatePickerAutomationPeerFactory_Impl>(size) as
        Array<ICalendarDatePickerAutomationPeerFactory?>
  }
}
