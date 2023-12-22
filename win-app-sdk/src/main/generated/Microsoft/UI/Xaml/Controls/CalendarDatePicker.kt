package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICalendarDatePickerFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CalendarDatePicker.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CalendarDatePicker;{e3d9faa1-0fd0-5932-a6db-ff00c003ac21})")
@WinRTByReference(brClass = CalendarDatePicker.ByReference::class)
public open class CalendarDatePicker(
  ptr: JNAPointer? = NULL
) : Control(ptr), ICalendarDatePicker.WithDefault, IWinRTObject {
  private val __158542399_Interface: ICalendarDatePicker.WithDefault by lazy {
    as_158542399()
  }


  public override val __158542399_Ptr: JNAPointer? by lazy {
    __158542399_Interface.__158542399_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__158542399_Interface)

  public constructor() : this(ABI.activate())

  private fun as_158542399(): ICalendarDatePicker.WithDefault {
    if(pointer == NULL) {
      return(ICalendarDatePicker.ABI.makeICalendarDatePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarDatePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarDatePicker.ABI.makeICalendarDatePicker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarDatePicker> {
    public override fun getValue() = CalendarDatePicker(pointer.getPointer(0))

    public fun setValue(value: CalendarDatePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarDatePicker, MemoryAddress> {
    public val ICalendarDatePickerStatics_Instance: ICalendarDatePickerStatics by lazy {
      createICalendarDatePickerStatics()
    }


    public val ICalendarDatePickerFactory_Instance: ICalendarDatePickerFactory by lazy {
      createICalendarDatePickerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICalendarDatePickerStatics(): ICalendarDatePickerStatics {
      val refiid = Guid.REFIID(ICalendarDatePickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CalendarDatePicker".toHandle(),refiid,interfacePtr)
      val result = ICalendarDatePickerStatics.ABI.makeICalendarDatePickerStatics(interfacePtr.value)
      return result
    }

    public fun createICalendarDatePickerFactory(): ICalendarDatePickerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CalendarDatePicker".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarDatePickerFactory.ABI.makeICalendarDatePickerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICalendarDatePickerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CalendarDatePicker {
      val address = segment.toRawLongValue()
      return CalendarDatePicker(Pointer(address))
    }

    public override fun toNative(obj: CalendarDatePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DateProperty() = ABI.ICalendarDatePickerStatics_Instance.get_DateProperty()

    public fun get_IsCalendarOpenProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_IsCalendarOpenProperty()

    public fun get_DateFormatProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_DateFormatProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_PlaceholderTextProperty()

    public fun get_HeaderProperty() = ABI.ICalendarDatePickerStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_HeaderTemplateProperty()

    public fun get_CalendarViewStyleProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_CalendarViewStyleProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_LightDismissOverlayModeProperty()

    public fun get_DescriptionProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_DescriptionProperty()

    public fun get_MinDateProperty() = ABI.ICalendarDatePickerStatics_Instance.get_MinDateProperty()

    public fun get_MaxDateProperty() = ABI.ICalendarDatePickerStatics_Instance.get_MaxDateProperty()

    public fun get_IsTodayHighlightedProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_IsTodayHighlightedProperty()

    public fun get_DisplayModeProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_DisplayModeProperty()

    public fun get_FirstDayOfWeekProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_FirstDayOfWeekProperty()

    public fun get_DayOfWeekFormatProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_DayOfWeekFormatProperty()

    public fun get_CalendarIdentifierProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_CalendarIdentifierProperty()

    public fun get_IsOutOfScopeEnabledProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_IsOutOfScopeEnabledProperty()

    public fun get_IsGroupLabelVisibleProperty() =
        ABI.ICalendarDatePickerStatics_Instance.get_IsGroupLabelVisibleProperty()
  }
}
