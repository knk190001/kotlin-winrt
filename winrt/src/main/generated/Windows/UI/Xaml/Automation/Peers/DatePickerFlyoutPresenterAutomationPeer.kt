package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(DatePickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.DatePickerFlyoutPresenterAutomationPeer;{752aed38-c2bf-4880-82b2-a6c05e90c135})")
@WinRTByReference(brClass = DatePickerFlyoutPresenterAutomationPeer.ByReference::class)
public class DatePickerFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IDatePickerFlyoutPresenterAutomationPeer.WithDefault,
    IWinRTObject {
  private val __1137320242_Interface: IDatePickerFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_1137320242()
  }


  public override val __1137320242_Ptr: JNAPointer? by lazy {
    __1137320242_Interface.__1137320242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1137320242_Interface)

  private fun as_1137320242(): IDatePickerFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyoutPresenterAutomationPeer.ABI.makeIDatePickerFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyoutPresenterAutomationPeer.ABI.makeIDatePickerFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() = DatePickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: DatePickerFlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DatePickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return DatePickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: DatePickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
