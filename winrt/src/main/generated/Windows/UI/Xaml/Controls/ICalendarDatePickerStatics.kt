package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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

@ABIMarker(ICalendarDatePickerStatics.ABI::class)
@Signature("{39a3d291-afab-4b94-8395-ba7b874e3c8c}")
@Guid("39a3d291afab4b948395ba7b874e3c8c")
@WinRTInterface("39a3d291afab4b948395ba7b874e3c8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerStatics.ByReference::class)
public interface ICalendarDatePickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DateProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsCalendarOpenProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DateFormatProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CalendarViewStyleProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_MinDateProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_MaxDateProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_IsTodayHighlightedProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_DisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_FirstDayOfWeekProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_DayOfWeekFormatProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_CalendarIdentifierProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_IsOutOfScopeEnabledProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_IsGroupLabelVisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerStatics> {
    public override fun getValue() = ABI.makeICalendarDatePickerStatics(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerStatics {
    public val __150913551_Ptr: Pointer?

    public val _150913551_VtblPtr: Pointer?
      get() = __150913551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DateProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsCalendarOpenProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DateFormatProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CalendarViewStyleProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MinDateProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MaxDateProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsTodayHighlightedProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_DisplayModeProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_FirstDayOfWeekProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DayOfWeekFormatProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CalendarIdentifierProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IsOutOfScopeEnabledProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_IsGroupLabelVisibleProperty(): DependencyProperty? {
      val fnPtr = _150913551_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__150913551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __150913551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39a3d291afab4b948395ba7b874e3c8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerStatics(ptr: Pointer?): WithDefault =
        ICalendarDatePickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePickerStatics {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150913551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerStatics):
        Array<ICalendarDatePickerStatics?> = (elements as
        Array<ICalendarDatePickerStatics?>).castToImpl<ICalendarDatePickerStatics,ICalendarDatePickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerStatics?> =
        arrayOfNulls<ICalendarDatePickerStatics_Impl>(size) as Array<ICalendarDatePickerStatics?>
  }
}
