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

@ABIMarker(ListPickerFlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListPickerFlyoutPresenterAutomationPeer;{56dfdc58-2395-4060-8047-8ea463698a24})")
@WinRTByReference(brClass = ListPickerFlyoutPresenterAutomationPeer.ByReference::class)
public class ListPickerFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IListPickerFlyoutPresenterAutomationPeer.WithDefault,
    IWinRTObject {
  private val __1383283266_Interface: IListPickerFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_1383283266()
  }


  public override val __1383283266_Ptr: JNAPointer? by lazy {
    __1383283266_Interface.__1383283266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383283266_Interface)

  private fun as_1383283266(): IListPickerFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListPickerFlyoutPresenterAutomationPeer.ABI.makeIListPickerFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListPickerFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListPickerFlyoutPresenterAutomationPeer.ABI.makeIListPickerFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListPickerFlyoutPresenterAutomationPeer> {
    public override fun getValue() = ListPickerFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListPickerFlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListPickerFlyoutPresenterAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ListPickerFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return ListPickerFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListPickerFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
