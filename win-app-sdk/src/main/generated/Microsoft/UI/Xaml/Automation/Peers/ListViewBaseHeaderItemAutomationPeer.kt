package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListViewBaseHeaderItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ListViewBaseHeaderItem
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

@ABIMarker(ListViewBaseHeaderItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListViewBaseHeaderItemAutomationPeer;{623314d2-c7f1-5003-9560-07d420a33a2a})")
@WinRTByReference(brClass = ListViewBaseHeaderItemAutomationPeer.ByReference::class)
public open class ListViewBaseHeaderItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IListViewBaseHeaderItemAutomationPeer.WithDefault,
    IWinRTObject {
  private val __1745135536_Interface: IListViewBaseHeaderItemAutomationPeer.WithDefault by lazy {
    as_1745135536()
  }


  public override val __1745135536_Ptr: JNAPointer? by lazy {
    __1745135536_Interface.__1745135536_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1745135536_Interface)

  public constructor(owner: ListViewBaseHeaderItem) : this(ABI.activate(owner))

  private fun as_1745135536(): IListViewBaseHeaderItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewBaseHeaderItemAutomationPeer.ABI.makeIListViewBaseHeaderItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBaseHeaderItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBaseHeaderItemAutomationPeer.ABI.makeIListViewBaseHeaderItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewBaseHeaderItemAutomationPeer> {
    public override fun getValue() = ListViewBaseHeaderItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewBaseHeaderItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewBaseHeaderItemAutomationPeer, MemoryAddress> {
    public val IListViewBaseHeaderItemAutomationPeerFactory_Instance:
        IListViewBaseHeaderItemAutomationPeerFactory by lazy {
      createIListViewBaseHeaderItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewBaseHeaderItemAutomationPeerFactory():
        IListViewBaseHeaderItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListViewBaseHeaderItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewBaseHeaderItemAutomationPeerFactory.ABI.makeIListViewBaseHeaderItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListViewBaseHeaderItem): JNAPointer? =
        IListViewBaseHeaderItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewBaseHeaderItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewBaseHeaderItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewBaseHeaderItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
