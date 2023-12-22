package Windows.Globalization.DateTimeFormatting

import Windows.Foundation.Collections.IIterable
import Windows.Globalization.DateTimeFormatting.IDateTimeFormatterFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DateTimeFormatter.ABI::class)
@Signature("rc(Windows.Globalization.DateTimeFormatting.DateTimeFormatter;{95eeca10-73e0-4e4b-a183-3d6ad0ba35ec})")
@WinRTByReference(brClass = DateTimeFormatter.ByReference::class)
public class DateTimeFormatter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDateTimeFormatter.WithDefault, IDateTimeFormatter2.WithDefault, IWinRTObject
    {
  private val __919545758_Interface: IDateTimeFormatter.WithDefault by lazy {
    as_919545758()
  }


  private val __1558852524_Interface: IDateTimeFormatter2.WithDefault by lazy {
    as_1558852524()
  }


  public override val __919545758_Ptr: JNAPointer? by lazy {
    __919545758_Interface.__919545758_Ptr
  }


  public override val __1558852524_Ptr: JNAPointer? by lazy {
    __1558852524_Interface.__1558852524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__919545758_Interface, __1558852524_Interface)

  public constructor(formatTemplate: String) : this(ABI.activate(formatTemplate))

  public constructor(formatTemplate: String, languages: IIterable<String?>) :
      this(ABI.activate(formatTemplate, languages))

  public constructor(
    formatTemplate: String,
    languages: IIterable<String?>,
    geographicRegion: String,
    calendar: String,
    clock: String
  ) : this(ABI.activate(formatTemplate, languages, geographicRegion, calendar, clock))

  public constructor(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ) : this(ABI.activate(yearFormat, monthFormat, dayFormat, dayOfWeekFormat))

  public constructor(
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat
  ) : this(ABI.activate(hourFormat, minuteFormat, secondFormat))

  public constructor(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable<String?>
  ) : this(ABI.activate(yearFormat, monthFormat, dayFormat, dayOfWeekFormat, hourFormat,
      minuteFormat, secondFormat, languages))

  public constructor(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable<String?>,
    geographicRegion: String,
    calendar: String,
    clock: String
  ) : this(ABI.activate(yearFormat, monthFormat, dayFormat, dayOfWeekFormat, hourFormat,
      minuteFormat, secondFormat, languages, geographicRegion, calendar, clock))

  private fun as_919545758(): IDateTimeFormatter.WithDefault {
    if(pointer == NULL) {
      return(IDateTimeFormatter.ABI.makeIDateTimeFormatter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDateTimeFormatter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDateTimeFormatter.ABI.makeIDateTimeFormatter(ref.value))
  }

  private fun as_1558852524(): IDateTimeFormatter2.WithDefault {
    if(pointer == NULL) {
      return(IDateTimeFormatter2.ABI.makeIDateTimeFormatter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDateTimeFormatter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDateTimeFormatter2.ABI.makeIDateTimeFormatter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DateTimeFormatter> {
    public override fun getValue() = DateTimeFormatter(pointer.getPointer(0))

    public fun setValue(value: DateTimeFormatter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DateTimeFormatter, MemoryAddress> {
    public val IDateTimeFormatterStatics_Instance: IDateTimeFormatterStatics by lazy {
      createIDateTimeFormatterStatics()
    }


    public val IDateTimeFormatterFactory_Instance: IDateTimeFormatterFactory by lazy {
      createIDateTimeFormatterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDateTimeFormatterStatics(): IDateTimeFormatterStatics {
      val refiid = Guid.REFIID(IDateTimeFormatterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.DateTimeFormatting.DateTimeFormatter".toHandle(),refiid,interfacePtr)
      val result = IDateTimeFormatterStatics.ABI.makeIDateTimeFormatterStatics(interfacePtr.value)
      return result
    }

    public fun createIDateTimeFormatterFactory(): IDateTimeFormatterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.DateTimeFormatting.DateTimeFormatter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDateTimeFormatterFactory.ABI.makeIDateTimeFormatterFactory(factoryActivatorPtr.value))
    }

    public fun activate(formatTemplate: String): JNAPointer? =
        IDateTimeFormatterFactory_Instance.CreateDateTimeFormatter(formatTemplate)?.pointer

    public fun activate(formatTemplate: String, languages: IIterable<String?>): JNAPointer? =
        IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterLanguages(formatTemplate,
        languages)?.pointer

    public fun activate(
      formatTemplate: String,
      languages: IIterable<String?>,
      geographicRegion: String,
      calendar: String,
      clock: String
    ): JNAPointer? =
        IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterContext(formatTemplate, languages,
        geographicRegion, calendar, clock)?.pointer

    public fun activate(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat
    ): JNAPointer? = IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterDate(yearFormat,
        monthFormat, dayFormat, dayOfWeekFormat)?.pointer

    public fun activate(
      hourFormat: HourFormat,
      minuteFormat: MinuteFormat,
      secondFormat: SecondFormat
    ): JNAPointer? = IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterTime(hourFormat,
        minuteFormat, secondFormat)?.pointer

    public fun activate(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat,
      hourFormat: HourFormat,
      minuteFormat: MinuteFormat,
      secondFormat: SecondFormat,
      languages: IIterable<String?>
    ): JNAPointer? =
        IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterDateTimeLanguages(yearFormat,
        monthFormat, dayFormat, dayOfWeekFormat, hourFormat, minuteFormat, secondFormat,
        languages)?.pointer

    public fun activate(
      yearFormat: YearFormat,
      monthFormat: MonthFormat,
      dayFormat: DayFormat,
      dayOfWeekFormat: DayOfWeekFormat,
      hourFormat: HourFormat,
      minuteFormat: MinuteFormat,
      secondFormat: SecondFormat,
      languages: IIterable<String?>,
      geographicRegion: String,
      calendar: String,
      clock: String
    ): JNAPointer? =
        IDateTimeFormatterFactory_Instance.CreateDateTimeFormatterDateTimeContext(yearFormat,
        monthFormat, dayFormat, dayOfWeekFormat, hourFormat, minuteFormat, secondFormat, languages,
        geographicRegion, calendar, clock)?.pointer

    public override fun fromNative(segment: MemoryAddress): DateTimeFormatter {
      val address = segment.toRawLongValue()
      return DateTimeFormatter(Pointer(address))
    }

    public override fun toNative(obj: DateTimeFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LongDate() = ABI.IDateTimeFormatterStatics_Instance.get_LongDate()

    public fun get_LongTime() = ABI.IDateTimeFormatterStatics_Instance.get_LongTime()

    public fun get_ShortDate() = ABI.IDateTimeFormatterStatics_Instance.get_ShortDate()

    public fun get_ShortTime() = ABI.IDateTimeFormatterStatics_Instance.get_ShortTime()
  }
}
