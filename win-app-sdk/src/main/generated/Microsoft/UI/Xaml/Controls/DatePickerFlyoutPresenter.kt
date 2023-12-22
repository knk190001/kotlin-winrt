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

@ABIMarker(DatePickerFlyoutPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.DatePickerFlyoutPresenter;{1adfda34-60f5-501b-b8e2-73a49cad6712})")
@WinRTByReference(brClass = DatePickerFlyoutPresenter.ByReference::class)
public class DatePickerFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : Control(ptr), IDatePickerFlyoutPresenter.WithDefault, IWinRTObject {
  private val __207729270_Interface: IDatePickerFlyoutPresenter.WithDefault by lazy {
    as_207729270()
  }


  public override val __207729270_Ptr: JNAPointer? by lazy {
    __207729270_Interface.__207729270_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__207729270_Interface)

  private fun as_207729270(): IDatePickerFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyoutPresenter.ABI.makeIDatePickerFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyoutPresenter.ABI.makeIDatePickerFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerFlyoutPresenter> {
    public override fun getValue() = DatePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: DatePickerFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerFlyoutPresenter, MemoryAddress> {
    public val IDatePickerFlyoutPresenterStatics_Instance: IDatePickerFlyoutPresenterStatics by
        lazy {
      createIDatePickerFlyoutPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDatePickerFlyoutPresenterStatics(): IDatePickerFlyoutPresenterStatics {
      val refiid = Guid.REFIID(IDatePickerFlyoutPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.DatePickerFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IDatePickerFlyoutPresenterStatics.ABI.makeIDatePickerFlyoutPresenterStatics(interfacePtr.value)
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
        ABI.IDatePickerFlyoutPresenterStatics_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
