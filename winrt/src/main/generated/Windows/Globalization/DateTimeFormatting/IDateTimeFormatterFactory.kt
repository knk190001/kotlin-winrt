package Windows.Globalization.DateTimeFormatting

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDateTimeFormatterFactory.ABI::class)
@Signature("{ec8d8a53-1a2e-412d-8815-3b745fb1a2a0}")
@Guid("ec8d8a531a2e412d88153b745fb1a2a0")
@WinRTInterface("ec8d8a531a2e412d88153b745fb1a2a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDateTimeFormatterFactory.ByReference::class)
public interface IDateTimeFormatterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDateTimeFormatter(formatTemplate: String?): DateTimeFormatter?

  @InterfaceMethod(1)
  public fun CreateDateTimeFormatterLanguages(formatTemplate: String?,
      languages: IIterable<String?>?): DateTimeFormatter?

  @InterfaceMethod(2)
  public fun CreateDateTimeFormatterContext(
    formatTemplate: String?,
    languages: IIterable<String?>?,
    geographicRegion: String?,
    calendar: String?,
    clock: String?
  ): DateTimeFormatter?

  @InterfaceMethod(3)
  public fun CreateDateTimeFormatterDate(
    yearFormat: YearFormat?,
    monthFormat: MonthFormat?,
    dayFormat: DayFormat?,
    dayOfWeekFormat: DayOfWeekFormat?
  ): DateTimeFormatter?

  @InterfaceMethod(4)
  public fun CreateDateTimeFormatterTime(
    hourFormat: HourFormat?,
    minuteFormat: MinuteFormat?,
    secondFormat: SecondFormat?
  ): DateTimeFormatter?

  @InterfaceMethod(5)
  public fun CreateDateTimeFormatterDateTimeLanguages(
    yearFormat: YearFormat?,
    monthFormat: MonthFormat?,
    dayFormat: DayFormat?,
    dayOfWeekFormat: DayOfWeekFormat?,
    hourFormat: HourFormat?,
    minuteFormat: MinuteFormat?,
    secondFormat: SecondFormat?,
    languages: IIterable<String?>?
  ): DateTimeFormatter?

  @InterfaceMethod(6)
  public fun CreateDateTimeFormatterDateTimeContext(
    yearFormat: YearFormat?,
    monthFormat: MonthFormat?,
    dayFormat: DayFormat?,
    dayOfWeekFormat: DayOfWeekFormat?,
    hourFormat: HourFormat?,
    minuteFormat: MinuteFormat?,
    secondFormat: SecondFormat?,
    languages: IIterable<String?>?,
    geographicRegion: String?,
    calendar: String?,
    clock: String?
  ): DateTimeFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDateTimeFormatterFactory> {
    public override fun getValue() = ABI.makeIDateTimeFormatterFactory(pointer.getPointer(0))

    public fun setValue(value: IDateTimeFormatterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDateTimeFormatterFactory {
    public val __549162100_Ptr: Pointer?

    public val _549162100_VtblPtr: Pointer?
      get() = __549162100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDateTimeFormatter(formatTemplate: String?): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(formatTemplate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateDateTimeFormatterLanguages(formatTemplate: String?,
        languages: IIterable<String?>?): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(formatTemplate),
          marshalToNative(languages), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateDateTimeFormatterContext(
      formatTemplate: String?,
      languages: IIterable<String?>?,
      geographicRegion: String?,
      calendar: String?,
      clock: String?
    ): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(formatTemplate),
          marshalToNative(languages), marshalToNative(geographicRegion), marshalToNative(calendar),
          marshalToNative(clock), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateDateTimeFormatterDate(
      yearFormat: YearFormat?,
      monthFormat: MonthFormat?,
      dayFormat: DayFormat?,
      dayOfWeekFormat: DayOfWeekFormat?
    ): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(yearFormat),
          marshalToNative(monthFormat), marshalToNative(dayFormat),
          marshalToNative(dayOfWeekFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateDateTimeFormatterTime(
      hourFormat: HourFormat?,
      minuteFormat: MinuteFormat?,
      secondFormat: SecondFormat?
    ): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(hourFormat),
          marshalToNative(minuteFormat), marshalToNative(secondFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateDateTimeFormatterDateTimeLanguages(
      yearFormat: YearFormat?,
      monthFormat: MonthFormat?,
      dayFormat: DayFormat?,
      dayOfWeekFormat: DayOfWeekFormat?,
      hourFormat: HourFormat?,
      minuteFormat: MinuteFormat?,
      secondFormat: SecondFormat?,
      languages: IIterable<String?>?
    ): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(yearFormat),
          marshalToNative(monthFormat), marshalToNative(dayFormat),
          marshalToNative(dayOfWeekFormat), marshalToNative(hourFormat),
          marshalToNative(minuteFormat), marshalToNative(secondFormat), marshalToNative(languages),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateDateTimeFormatterDateTimeContext(
      yearFormat: YearFormat?,
      monthFormat: MonthFormat?,
      dayFormat: DayFormat?,
      dayOfWeekFormat: DayOfWeekFormat?,
      hourFormat: HourFormat?,
      minuteFormat: MinuteFormat?,
      secondFormat: SecondFormat?,
      languages: IIterable<String?>?,
      geographicRegion: String?,
      calendar: String?,
      clock: String?
    ): DateTimeFormatter? {
      val fnPtr = _549162100_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__549162100_Ptr, marshalToNative(yearFormat),
          marshalToNative(monthFormat), marshalToNative(dayFormat),
          marshalToNative(dayOfWeekFormat), marshalToNative(hourFormat),
          marshalToNative(minuteFormat), marshalToNative(secondFormat), marshalToNative(languages),
          marshalToNative(geographicRegion), marshalToNative(calendar), marshalToNative(clock),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }
  }

  public class IDateTimeFormatterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __549162100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDateTimeFormatterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec8d8a531a2e412d88153b745fb1a2a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDateTimeFormatterFactory(ptr: Pointer?): WithDefault =
        IDateTimeFormatterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDateTimeFormatterFactory {
      val address = segment.toRawLongValue()
      return makeIDateTimeFormatterFactory(Pointer(address))
    }

    public override fun toNative(obj: IDateTimeFormatterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__549162100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDateTimeFormatterFactory):
        Array<IDateTimeFormatterFactory?> = (elements as
        Array<IDateTimeFormatterFactory?>).castToImpl<IDateTimeFormatterFactory,IDateTimeFormatterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDateTimeFormatterFactory?> =
        arrayOfNulls<IDateTimeFormatterFactory_Impl>(size) as Array<IDateTimeFormatterFactory?>
  }
}
