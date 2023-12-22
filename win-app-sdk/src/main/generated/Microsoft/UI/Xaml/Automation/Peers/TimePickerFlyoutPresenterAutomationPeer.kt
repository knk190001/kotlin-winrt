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

@ABIMarker(TimePickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TimePickerFlyoutPresenterAutomationPeer;{2438268a-62e8-5d61-95d0-d36f6b42e652})")
@WinRTByReference(brClass = TimePickerFlyoutPresenterAutomationPeer.ByReference::class)
public class TimePickerFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITimePickerFlyoutPresenterAutomationPeer.WithDefault,
    IWinRTObject {
  private val __867975336_Interface: ITimePickerFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_867975336()
  }


  public override val __867975336_Ptr: JNAPointer? by lazy {
    __867975336_Interface.__867975336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__867975336_Interface)

  private fun as_867975336(): ITimePickerFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerFlyoutPresenterAutomationPeer.ABI.makeITimePickerFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerFlyoutPresenterAutomationPeer.ABI.makeITimePickerFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() = TimePickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TimePickerFlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        TimePickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return TimePickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TimePickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
