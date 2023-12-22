package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ICalendarDatePickerFactory.ABI::class)
@Signature("{b00c7818-955a-5524-b451-93868230892f}")
@Guid("b00c7818955a5524b45193868230892f")
@WinRTInterface("b00c7818955a5524b45193868230892f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerFactory.ByReference::class)
public interface ICalendarDatePickerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CalendarDatePicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerFactory> {
    public override fun getValue() = ABI.makeICalendarDatePickerFactory(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerFactory {
    public val __1590679543_Ptr: Pointer?

    public val _1590679543_VtblPtr: Pointer?
      get() = __1590679543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CalendarDatePicker? {
      val fnPtr = _1590679543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarDatePicker>()
      val hr = fn.invokeHR(arrayOf(__1590679543_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarDatePicker>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1590679543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b00c7818955a5524b45193868230892f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerFactory(ptr: Pointer?): WithDefault =
        ICalendarDatePickerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePickerFactory {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1590679543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerFactory):
        Array<ICalendarDatePickerFactory?> = (elements as
        Array<ICalendarDatePickerFactory?>).castToImpl<ICalendarDatePickerFactory,ICalendarDatePickerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerFactory?> =
        arrayOfNulls<ICalendarDatePickerFactory_Impl>(size) as Array<ICalendarDatePickerFactory?>
  }
}
