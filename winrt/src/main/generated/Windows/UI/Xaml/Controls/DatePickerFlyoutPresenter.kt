package Windows.UI.Xaml.Controls

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

@ABIMarker(DatePickerFlyoutPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DatePickerFlyoutPresenter;{7c62f70e-2ddc-4381-832f-54cbdfaa849a})")
@WinRTByReference(brClass = DatePickerFlyoutPresenter.ByReference::class)
public class DatePickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : Control(ptr), IDatePickerFlyoutPresenter.WithDefault, IDatePickerFlyoutPresenter2.WithDefault,
    IWinRTObject {
  private val __1955850027_Interface: IDatePickerFlyoutPresenter.WithDefault by lazy {
    as_1955850027()
  }


  private val __501808643_Interface: IDatePickerFlyoutPresenter2.WithDefault by lazy {
    as_501808643()
  }


  public override val __1955850027_Ptr: JNAPointer? by lazy {
    __1955850027_Interface.__1955850027_Ptr
  }


  public override val __501808643_Ptr: JNAPointer? by lazy {
    __501808643_Interface.__501808643_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1955850027_Interface, __501808643_Interface)

  private fun as_1955850027(): IDatePickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyoutPresenter.ABI.makeIDatePickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyoutPresenter.ABI.makeIDatePickerFlyoutPresenter(ref.value))
  }

  private fun as_501808643(): IDatePickerFlyoutPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyoutPresenter2.ABI.makeIDatePickerFlyoutPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyoutPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyoutPresenter2.ABI.makeIDatePickerFlyoutPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerFlyoutPresenter> {
    public override fun getValue() = DatePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: DatePickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerFlyoutPresenter, MemoryAddress> {
    public val IDatePickerFlyoutPresenterStatics2_Instance: IDatePickerFlyoutPresenterStatics2 by
        lazy {
      createIDatePickerFlyoutPresenterStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDatePickerFlyoutPresenterStatics2(): IDatePickerFlyoutPresenterStatics2 {
      val refiid = Guid.REFIID(IDatePickerFlyoutPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePickerFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IDatePickerFlyoutPresenterStatics2.ABI.makeIDatePickerFlyoutPresenterStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DatePickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return DatePickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: DatePickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDefaultShadowEnabledProperty() =
        ABI.IDatePickerFlyoutPresenterStatics2_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
