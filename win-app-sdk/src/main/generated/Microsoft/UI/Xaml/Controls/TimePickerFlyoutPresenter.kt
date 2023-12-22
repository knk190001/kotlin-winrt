package Microsoft.UI.Xaml.Controls

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
@Signature("rc(Microsoft.UI.Xaml.Controls.TimePickerFlyoutPresenter;{a7439b37-7a77-5aeb-806b-bc726005de20})")
@WinRTByReference(brClass = TimePickerFlyoutPresenter.ByReference::class)
public class TimePickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITimePickerFlyoutPresenter.WithDefault, IWinRTObject {
  private val __257188811_Interface: ITimePickerFlyoutPresenter.WithDefault by lazy {
    as_257188811()
  }


  public override val __257188811_Ptr: JNAPointer? by lazy {
    __257188811_Interface.__257188811_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257188811_Interface)

  private fun as_257188811(): ITimePickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerFlyoutPresenter.ABI.makeITimePickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerFlyoutPresenter.ABI.makeITimePickerFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerFlyoutPresenter> {
    public override fun getValue() = TimePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: TimePickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerFlyoutPresenter, MemoryAddress> {
    public val ITimePickerFlyoutPresenterStatics_Instance: ITimePickerFlyoutPresenterStatics by
        lazy {
      createITimePickerFlyoutPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimePickerFlyoutPresenterStatics(): ITimePickerFlyoutPresenterStatics {
      val refiid = Guid.REFIID(ITimePickerFlyoutPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TimePickerFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          ITimePickerFlyoutPresenterStatics.ABI.makeITimePickerFlyoutPresenterStatics(interfacePtr.value)
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
        ABI.ITimePickerFlyoutPresenterStatics_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
