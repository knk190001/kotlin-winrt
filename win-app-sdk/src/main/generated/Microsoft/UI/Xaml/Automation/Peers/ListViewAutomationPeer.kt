package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListViewAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ListView
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

@ABIMarker(ListViewAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListViewAutomationPeer;{8f2a3373-e305-55f3-923e-d9eee8d1a6ee})")
@WinRTByReference(brClass = ListViewAutomationPeer.ByReference::class)
public open class ListViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewBaseAutomationPeer(ptr), IListViewAutomationPeer.WithDefault, IWinRTObject {
  private val __1235426175_Interface: IListViewAutomationPeer.WithDefault by lazy {
    as_1235426175()
  }


  public override val __1235426175_Ptr: JNAPointer? by lazy {
    __1235426175_Interface.__1235426175_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1235426175_Interface)

  public constructor(owner: ListView) : this(ABI.activate(owner))

  private fun as_1235426175(): IListViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewAutomationPeer.ABI.makeIListViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewAutomationPeer.ABI.makeIListViewAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewAutomationPeer> {
    public override fun getValue() = ListViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewAutomationPeer, MemoryAddress> {
    public val IListViewAutomationPeerFactory_Instance: IListViewAutomationPeerFactory by lazy {
      createIListViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewAutomationPeerFactory(): IListViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewAutomationPeerFactory.ABI.makeIListViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListView): JNAPointer? =
        IListViewAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
