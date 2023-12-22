package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListViewHeaderItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ListViewHeaderItem
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

@ABIMarker(ListViewHeaderItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListViewHeaderItemAutomationPeer;{0293eaca-f7de-5a0d-9beb-79dc1ac4a7de})")
@WinRTByReference(brClass = ListViewHeaderItemAutomationPeer.ByReference::class)
public open class ListViewHeaderItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewBaseHeaderItemAutomationPeer(ptr), IListViewHeaderItemAutomationPeer.WithDefault,
    IWinRTObject {
  private val __1599550303_Interface: IListViewHeaderItemAutomationPeer.WithDefault by lazy {
    as_1599550303()
  }


  public override val __1599550303_Ptr: JNAPointer? by lazy {
    __1599550303_Interface.__1599550303_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1599550303_Interface)

  public constructor(owner: ListViewHeaderItem) : this(ABI.activate(owner))

  private fun as_1599550303(): IListViewHeaderItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewHeaderItemAutomationPeer.ABI.makeIListViewHeaderItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewHeaderItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewHeaderItemAutomationPeer.ABI.makeIListViewHeaderItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewHeaderItemAutomationPeer> {
    public override fun getValue() = ListViewHeaderItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewHeaderItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewHeaderItemAutomationPeer, MemoryAddress> {
    public val IListViewHeaderItemAutomationPeerFactory_Instance:
        IListViewHeaderItemAutomationPeerFactory by lazy {
      createIListViewHeaderItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewHeaderItemAutomationPeerFactory():
        IListViewHeaderItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListViewHeaderItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewHeaderItemAutomationPeerFactory.ABI.makeIListViewHeaderItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListViewHeaderItem): JNAPointer? =
        IListViewHeaderItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewHeaderItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewHeaderItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewHeaderItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
