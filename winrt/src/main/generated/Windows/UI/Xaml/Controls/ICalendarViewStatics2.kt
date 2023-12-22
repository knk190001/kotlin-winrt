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

@ABIMarker(ICalendarViewStatics2.ABI::class)
@Signature("{f29e5024-b8fb-50c8-8a38-d443abb37009}")
@Guid("f29e5024b8fb50c88a38d443abb37009")
@WinRTInterface("f29e5024b8fb50c88a38d443abb37009")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewStatics2.ByReference::class)
public interface ICalendarViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TodaySelectedInnerBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BlackoutStrikethroughBrushProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BlackoutBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CalendarItemHoverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CalendarItemPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CalendarItemDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_TodayBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_TodayBlackoutBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_TodayHoverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_TodayPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_TodayDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_TodayBlackoutForegroundProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_SelectedHoverForegroundProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_SelectedPressedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SelectedDisabledForegroundProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_OutOfScopeHoverForegroundProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_OutOfScopePressedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_DisabledForegroundProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_DayItemMarginProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_MonthYearItemMarginProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_FirstOfMonthLabelMarginProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_FirstOfYearDecadeLabelMarginProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_CalendarItemCornerRadiusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewStatics2> {
    public override fun getValue() = ABI.makeICalendarViewStatics2(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewStatics2 {
    public val __2040511308_Ptr: Pointer?

    public val _2040511308_VtblPtr: Pointer?
      get() = __2040511308_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TodaySelectedInnerBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BlackoutStrikethroughBrushProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BlackoutBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CalendarItemHoverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CalendarItemPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CalendarItemDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TodayBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TodayBlackoutBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TodayHoverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TodayPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_TodayDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_TodayBlackoutForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_SelectedHoverForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_SelectedPressedForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SelectedDisabledForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_OutOfScopeHoverForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_OutOfScopePressedForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_DisabledForegroundProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_DayItemMarginProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_MonthYearItemMarginProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_FirstOfMonthLabelMarginProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_FirstOfYearDecadeLabelMarginProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_CalendarItemCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _2040511308_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2040511308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2040511308_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f29e5024b8fb50c88a38d443abb37009")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewStatics2(ptr: Pointer?): WithDefault =
        ICalendarViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewStatics2 {
      val address = segment.toRawLongValue()
      return makeICalendarViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2040511308_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewStatics2): Array<ICalendarViewStatics2?> =
        (elements as
        Array<ICalendarViewStatics2?>).castToImpl<ICalendarViewStatics2,ICalendarViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewStatics2?> =
        arrayOfNulls<ICalendarViewStatics2_Impl>(size) as Array<ICalendarViewStatics2?>
  }
}
