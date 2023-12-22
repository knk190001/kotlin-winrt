package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IDatePickerFactory.ABI.IID
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

@ABIMarker(DatePicker.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DatePicker;{06da3946-08b8-4103-8b8a-093efd6a7657})")
@WinRTByReference(brClass = DatePicker.ByReference::class)
public open class DatePicker(
  ptr: JNAPointer? = NULL
) : Control(ptr), IDatePicker.WithDefault, IDatePicker2.WithDefault, IDatePicker3.WithDefault,
    IWinRTObject {
  private val __1087057160_Interface: IDatePicker.WithDefault by lazy {
    as_1087057160()
  }


  private val __660966458_Interface: IDatePicker2.WithDefault by lazy {
    as_660966458()
  }


  private val __660966459_Interface: IDatePicker3.WithDefault by lazy {
    as_660966459()
  }


  public override val __1087057160_Ptr: JNAPointer? by lazy {
    __1087057160_Interface.__1087057160_Ptr
  }


  public override val __660966458_Ptr: JNAPointer? by lazy {
    __660966458_Interface.__660966458_Ptr
  }


  public override val __660966459_Ptr: JNAPointer? by lazy {
    __660966459_Interface.__660966459_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1087057160_Interface, __660966458_Interface, __660966459_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1087057160(): IDatePicker.WithDefault {
    if(pointer == NULL) {
      return(IDatePicker.ABI.makeIDatePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePicker.ABI.makeIDatePicker(ref.value))
  }

  private fun as_660966458(): IDatePicker2.WithDefault {
    if(pointer == NULL) {
      return(IDatePicker2.ABI.makeIDatePicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePicker2.ABI.makeIDatePicker2(ref.value))
  }

  private fun as_660966459(): IDatePicker3.WithDefault {
    if(pointer == NULL) {
      return(IDatePicker3.ABI.makeIDatePicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePicker3.ABI.makeIDatePicker3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DatePicker> {
    public override fun getValue() = DatePicker(pointer.getPointer(0))

    public fun setValue(value: DatePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePicker, MemoryAddress> {
    public val IDatePickerStatics3_Instance: IDatePickerStatics3 by lazy {
      createIDatePickerStatics3()
    }


    public val IDatePickerStatics2_Instance: IDatePickerStatics2 by lazy {
      createIDatePickerStatics2()
    }


    public val IDatePickerStatics_Instance: IDatePickerStatics by lazy {
      createIDatePickerStatics()
    }


    public val IDatePickerFactory_Instance: IDatePickerFactory by lazy {
      createIDatePickerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDatePickerStatics3(): IDatePickerStatics3 {
      val refiid = Guid.REFIID(IDatePickerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePicker".toHandle(),refiid,interfacePtr)
      val result = IDatePickerStatics3.ABI.makeIDatePickerStatics3(interfacePtr.value)
      return result
    }

    public fun createIDatePickerStatics2(): IDatePickerStatics2 {
      val refiid = Guid.REFIID(IDatePickerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePicker".toHandle(),refiid,interfacePtr)
      val result = IDatePickerStatics2.ABI.makeIDatePickerStatics2(interfacePtr.value)
      return result
    }

    public fun createIDatePickerStatics(): IDatePickerStatics {
      val refiid = Guid.REFIID(IDatePickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePicker".toHandle(),refiid,interfacePtr)
      val result = IDatePickerStatics.ABI.makeIDatePickerStatics(interfacePtr.value)
      return result
    }

    public fun createIDatePickerFactory(): IDatePickerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePicker".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDatePickerFactory.ABI.makeIDatePickerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDatePickerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DatePicker {
      val address = segment.toRawLongValue()
      return DatePicker(Pointer(address))
    }

    public override fun toNative(obj: DatePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectedDateProperty() =
        ABI.IDatePickerStatics3_Instance.get_SelectedDateProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IDatePickerStatics2_Instance.get_LightDismissOverlayModeProperty()

    public fun get_HeaderProperty() = ABI.IDatePickerStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IDatePickerStatics_Instance.get_HeaderTemplateProperty()

    public fun get_CalendarIdentifierProperty() =
        ABI.IDatePickerStatics_Instance.get_CalendarIdentifierProperty()

    public fun get_DateProperty() = ABI.IDatePickerStatics_Instance.get_DateProperty()

    public fun get_DayVisibleProperty() = ABI.IDatePickerStatics_Instance.get_DayVisibleProperty()

    public fun get_MonthVisibleProperty() =
        ABI.IDatePickerStatics_Instance.get_MonthVisibleProperty()

    public fun get_YearVisibleProperty() = ABI.IDatePickerStatics_Instance.get_YearVisibleProperty()

    public fun get_DayFormatProperty() = ABI.IDatePickerStatics_Instance.get_DayFormatProperty()

    public fun get_MonthFormatProperty() = ABI.IDatePickerStatics_Instance.get_MonthFormatProperty()

    public fun get_YearFormatProperty() = ABI.IDatePickerStatics_Instance.get_YearFormatProperty()

    public fun get_MinYearProperty() = ABI.IDatePickerStatics_Instance.get_MinYearProperty()

    public fun get_MaxYearProperty() = ABI.IDatePickerStatics_Instance.get_MaxYearProperty()

    public fun get_OrientationProperty() = ABI.IDatePickerStatics_Instance.get_OrientationProperty()
  }
}
