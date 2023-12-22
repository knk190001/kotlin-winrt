package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IListViewItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ListViewItem
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

@ABIMarker(ListViewItemAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListViewItemAutomationPeer;{ca114e70-a16d-4d09-a1cf-1856ef98a9ec})")
@WinRTByReference(brClass = ListViewItemAutomationPeer.ByReference::class)
public open class ListViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IListViewItemAutomationPeer.WithDefault, IWinRTObject {
  private val __922164103_Interface: IListViewItemAutomationPeer.WithDefault by lazy {
    as_922164103()
  }


  public override val __922164103_Ptr: JNAPointer? by lazy {
    __922164103_Interface.__922164103_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922164103_Interface)

  public constructor(owner: ListViewItem) : this(ABI.activate(owner))

  private fun as_922164103(): IListViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemAutomationPeer.ABI.makeIListViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemAutomationPeer.ABI.makeIListViewItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemAutomationPeer> {
    public override fun getValue() = ListViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItemAutomationPeer, MemoryAddress> {
    public val IListViewItemAutomationPeerFactory_Instance: IListViewItemAutomationPeerFactory by
        lazy {
      createIListViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewItemAutomationPeerFactory(): IListViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ListViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewItemAutomationPeerFactory.ABI.makeIListViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListViewItem): JNAPointer? =
        IListViewItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
