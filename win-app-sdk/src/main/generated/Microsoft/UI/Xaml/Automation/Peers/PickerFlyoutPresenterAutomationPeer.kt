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

@ABIMarker(PickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.PickerFlyoutPresenterAutomationPeer;{b29f6d28-154b-5c1d-a5e8-98604bb5cdf6})")
@WinRTByReference(brClass = PickerFlyoutPresenterAutomationPeer.ByReference::class)
public class PickerFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IPickerFlyoutPresenterAutomationPeer.WithDefault,
    IWinRTObject {
  private val __855887157_Interface: IPickerFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_855887157()
  }


  public override val __855887157_Ptr: JNAPointer? by lazy {
    __855887157_Interface.__855887157_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__855887157_Interface)

  private fun as_855887157(): IPickerFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPickerFlyoutPresenterAutomationPeer.ABI.makeIPickerFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerFlyoutPresenterAutomationPeer.ABI.makeIPickerFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() = PickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PickerFlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return PickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
