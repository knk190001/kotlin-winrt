package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.CornerRadius
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Thickness
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

@ABIMarker(ICalendarView2.ABI::class)
@Signature("{f55ab64a-5504-5d9e-9d20-2ffdb88fc56b}")
@Guid("f55ab64a55045d9e9d202ffdb88fc56b")
@WinRTInterface("f55ab64a55045d9e9d202ffdb88fc56b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarView2.ByReference::class)
public interface ICalendarView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDisabledBorderBrush(): Brush?

  @InterfaceMethod(1)
  public fun put_SelectedDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_TodaySelectedInnerBorderBrush(): Brush?

  @InterfaceMethod(3)
  public fun put_TodaySelectedInnerBorderBrush(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_BlackoutStrikethroughBrush(): Brush?

  @InterfaceMethod(5)
  public fun put_BlackoutStrikethroughBrush(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_BlackoutBackground(): Brush?

  @InterfaceMethod(7)
  public fun put_BlackoutBackground(value: Brush?): Unit

  @InterfaceMethod(8)
  public fun get_CalendarItemHoverBackground(): Brush?

  @InterfaceMethod(9)
  public fun put_CalendarItemHoverBackground(value: Brush?): Unit

  @InterfaceMethod(10)
  public fun get_CalendarItemPressedBackground(): Brush?

  @InterfaceMethod(11)
  public fun put_CalendarItemPressedBackground(value: Brush?): Unit

  @InterfaceMethod(12)
  public fun get_CalendarItemDisabledBackground(): Brush?

  @InterfaceMethod(13)
  public fun put_CalendarItemDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(14)
  public fun get_TodayBackground(): Brush?

  @InterfaceMethod(15)
  public fun put_TodayBackground(value: Brush?): Unit

  @InterfaceMethod(16)
  public fun get_TodayBlackoutBackground(): Brush?

  @InterfaceMethod(17)
  public fun put_TodayBlackoutBackground(value: Brush?): Unit

  @InterfaceMethod(18)
  public fun get_TodayHoverBackground(): Brush?

  @InterfaceMethod(19)
  public fun put_TodayHoverBackground(value: Brush?): Unit

  @InterfaceMethod(20)
  public fun get_TodayPressedBackground(): Brush?

  @InterfaceMethod(21)
  public fun put_TodayPressedBackground(value: Brush?): Unit

  @InterfaceMethod(22)
  public fun get_TodayDisabledBackground(): Brush?

  @InterfaceMethod(23)
  public fun put_TodayDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(24)
  public fun get_TodayBlackoutForeground(): Brush?

  @InterfaceMethod(25)
  public fun put_TodayBlackoutForeground(value: Brush?): Unit

  @InterfaceMethod(26)
  public fun get_SelectedHoverForeground(): Brush?

  @InterfaceMethod(27)
  public fun put_SelectedHoverForeground(value: Brush?): Unit

  @InterfaceMethod(28)
  public fun get_SelectedPressedForeground(): Brush?

  @InterfaceMethod(29)
  public fun put_SelectedPressedForeground(value: Brush?): Unit

  @InterfaceMethod(30)
  public fun get_SelectedDisabledForeground(): Brush?

  @InterfaceMethod(31)
  public fun put_SelectedDisabledForeground(value: Brush?): Unit

  @InterfaceMethod(32)
  public fun get_OutOfScopeHoverForeground(): Brush?

  @InterfaceMethod(33)
  public fun put_OutOfScopeHoverForeground(value: Brush?): Unit

  @InterfaceMethod(34)
  public fun get_OutOfScopePressedForeground(): Brush?

  @InterfaceMethod(35)
  public fun put_OutOfScopePressedForeground(value: Brush?): Unit

  @InterfaceMethod(36)
  public fun get_DisabledForeground(): Brush?

  @InterfaceMethod(37)
  public fun put_DisabledForeground(value: Brush?): Unit

  @InterfaceMethod(38)
  public fun get_DayItemMargin(): Thickness?

  @InterfaceMethod(39)
  public fun put_DayItemMargin(value: Thickness?): Unit

  @InterfaceMethod(40)
  public fun get_MonthYearItemMargin(): Thickness?

  @InterfaceMethod(41)
  public fun put_MonthYearItemMargin(value: Thickness?): Unit

  @InterfaceMethod(42)
  public fun get_FirstOfMonthLabelMargin(): Thickness?

  @InterfaceMethod(43)
  public fun put_FirstOfMonthLabelMargin(value: Thickness?): Unit

  @InterfaceMethod(44)
  public fun get_FirstOfYearDecadeLabelMargin(): Thickness?

  @InterfaceMethod(45)
  public fun put_FirstOfYearDecadeLabelMargin(value: Thickness?): Unit

  @InterfaceMethod(46)
  public fun get_CalendarItemCornerRadius(): CornerRadius?

  @InterfaceMethod(47)
  public fun put_CalendarItemCornerRadius(value: CornerRadius?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICalendarView2>
      {
    public override fun getValue() = ABI.makeICalendarView2(pointer.getPointer(0))

    public fun setValue(value: ICalendarView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarView2 {
    public val __1215870707_Ptr: Pointer?

    public val _1215870707_VtblPtr: Pointer?
      get() = __1215870707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDisabledBorderBrush(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectedDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TodaySelectedInnerBorderBrush(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TodaySelectedInnerBorderBrush(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BlackoutStrikethroughBrush(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BlackoutStrikethroughBrush(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BlackoutBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BlackoutBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CalendarItemHoverBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_CalendarItemHoverBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CalendarItemPressedBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CalendarItemPressedBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CalendarItemDisabledBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_CalendarItemDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TodayBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TodayBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TodayBlackoutBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TodayBlackoutBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TodayHoverBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_TodayHoverBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_TodayPressedBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_TodayPressedBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_TodayDisabledBackground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_TodayDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_TodayBlackoutForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_TodayBlackoutForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectedHoverForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectedHoverForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_SelectedPressedForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_SelectedPressedForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SelectedDisabledForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SelectedDisabledForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_OutOfScopeHoverForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_OutOfScopeHoverForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_OutOfScopePressedForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_OutOfScopePressedForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_DisabledForeground(): Brush? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_DisabledForeground(value: Brush?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_DayItemMargin(): Thickness? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_DayItemMargin(value: Thickness?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_MonthYearItemMargin(): Thickness? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_MonthYearItemMargin(value: Thickness?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_FirstOfMonthLabelMargin(): Thickness? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_FirstOfMonthLabelMargin(value: Thickness?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_FirstOfYearDecadeLabelMargin(): Thickness? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_FirstOfYearDecadeLabelMargin(value: Thickness?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_CalendarItemCornerRadius(): CornerRadius? {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_CalendarItemCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1215870707_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215870707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215870707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f55ab64a55045d9e9d202ffdb88fc56b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarView2(ptr: Pointer?): WithDefault = ICalendarView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarView2 {
      val address = segment.toRawLongValue()
      return makeICalendarView2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215870707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarView2): Array<ICalendarView2?> = (elements as
        Array<ICalendarView2?>).castToImpl<ICalendarView2,ICalendarView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarView2?> =
        arrayOfNulls<ICalendarView2_Impl>(size) as Array<ICalendarView2?>
  }
}
