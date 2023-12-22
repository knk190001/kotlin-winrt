package Microsoft.UI.Xaml.Automation.Peers

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
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.DatePickerFlyoutPresenterAutomationPeer;{600b7162-0529-5fd1-b6e4-41dc37eda513})")
@WinRTByReference(brClass = DatePickerFlyoutPresenterAutomationPeer.ByReference::class)
public class DatePickerFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IDatePickerFlyoutPresenterAutomationPeer.WithDefault,
    IWinRTObject {
  private val __581873703_Interface: IDatePickerFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_581873703()
  }


  public override val __581873703_Ptr: JNAPointer? by lazy {
    __581873703_Interface.__581873703_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__581873703_Interface)

  private fun as_581873703(): IDatePickerFlyoutPresenterAutomationPeer.WithDefault {
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
