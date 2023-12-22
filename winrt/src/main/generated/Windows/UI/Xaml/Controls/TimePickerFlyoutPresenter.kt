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

@ABIMarker(TimePickerFlyoutPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TimePickerFlyoutPresenter;{c5320638-7a18-40ed-9fd0-4c852c09b24e})")
@WinRTByReference(brClass = TimePickerFlyoutPresenter.ByReference::class)
public class TimePickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITimePickerFlyoutPresenter.WithDefault, ITimePickerFlyoutPresenter2.WithDefault,
    IWinRTObject {
  private val __1490931946_Interface: ITimePickerFlyoutPresenter.WithDefault by lazy {
    as_1490931946()
  }


  private val __1025749980_Interface: ITimePickerFlyoutPresenter2.WithDefault by lazy {
    as_1025749980()
  }


  public override val __1490931946_Ptr: JNAPointer? by lazy {
    __1490931946_Interface.__1490931946_Ptr
  }


  public override val __1025749980_Ptr: JNAPointer? by lazy {
    __1025749980_Interface.__1025749980_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1490931946_Interface, __1025749980_Interface)

  private fun as_1490931946(): ITimePickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerFlyoutPresenter.ABI.makeITimePickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerFlyoutPresenter.ABI.makeITimePickerFlyoutPresenter(ref.value))
  }

  private fun as_1025749980(): ITimePickerFlyoutPresenter2.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerFlyoutPresenter2.ABI.makeITimePickerFlyoutPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerFlyoutPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerFlyoutPresenter2.ABI.makeITimePickerFlyoutPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerFlyoutPresenter> {
    public override fun getValue() = TimePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: TimePickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerFlyoutPresenter, MemoryAddress> {
    public val ITimePickerFlyoutPresenterStatics2_Instance: ITimePickerFlyoutPresenterStatics2 by
        lazy {
      createITimePickerFlyoutPresenterStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimePickerFlyoutPresenterStatics2(): ITimePickerFlyoutPresenterStatics2 {
      val refiid = Guid.REFIID(ITimePickerFlyoutPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TimePickerFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          ITimePickerFlyoutPresenterStatics2.ABI.makeITimePickerFlyoutPresenterStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimePickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return TimePickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: TimePickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDefaultShadowEnabledProperty() =
        ABI.ITimePickerFlyoutPresenterStatics2_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
