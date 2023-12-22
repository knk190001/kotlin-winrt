package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PickerFlyoutBase
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(DatePickerFlyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.DatePickerFlyout;{ba7ecf3c-edb1-593b-a4ac-c09802eace99})")
@WinRTByReference(brClass = DatePickerFlyout.ByReference::class)
public class DatePickerFlyout(
  ptr: JNAPointer? = NULL
) : PickerFlyoutBase(ptr), IDatePickerFlyout.WithDefault, IWinRTObject {
  private val __239777090_Interface: IDatePickerFlyout.WithDefault by lazy {
    as_239777090()
  }


  public override val __239777090_Ptr: JNAPointer? by lazy {
    __239777090_Interface.__239777090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__239777090_Interface)

  public constructor() : this(ABI.activate())

  private fun as_239777090(): IDatePickerFlyout.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyout.ABI.makeIDatePickerFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyout.ABI.makeIDatePickerFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerFlyout> {
    public override fun getValue() = DatePickerFlyout(pointer.getPointer(0))

    public fun setValue(value: DatePickerFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerFlyout, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDatePickerFlyoutStatics_Instance: IDatePickerFlyoutStatics by lazy {
      createIDatePickerFlyoutStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.DatePickerFlyout".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIDatePickerFlyoutStatics(): IDatePickerFlyoutStatics {
      val refiid = Guid.REFIID(IDatePickerFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.DatePickerFlyout".toHandle(),refiid,interfacePtr)
      val result = IDatePickerFlyoutStatics.ABI.makeIDatePickerFlyoutStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DatePickerFlyout {
      val address = segment.toRawLongValue()
      return DatePickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: DatePickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CalendarIdentifierProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_CalendarIdentifierProperty()

    public fun get_DateProperty() = ABI.IDatePickerFlyoutStatics_Instance.get_DateProperty()

    public fun get_DayVisibleProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_DayVisibleProperty()

    public fun get_MonthVisibleProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_MonthVisibleProperty()

    public fun get_YearVisibleProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_YearVisibleProperty()

    public fun get_MinYearProperty() = ABI.IDatePickerFlyoutStatics_Instance.get_MinYearProperty()

    public fun get_MaxYearProperty() = ABI.IDatePickerFlyoutStatics_Instance.get_MaxYearProperty()

    public fun get_DayFormatProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_DayFormatProperty()

    public fun get_MonthFormatProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_MonthFormatProperty()

    public fun get_YearFormatProperty() =
        ABI.IDatePickerFlyoutStatics_Instance.get_YearFormatProperty()
  }
}
