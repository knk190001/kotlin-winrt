package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListViewBaseAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IDropTargetProvider
import Microsoft.UI.Xaml.Controls.ListViewBase
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

@ABIMarker(ListViewBaseAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListViewBaseAutomationPeer;{ad9a395c-5a96-5331-9636-ee4c53184986})")
@WinRTByReference(brClass = ListViewBaseAutomationPeer.ByReference::class)
public open class ListViewBaseAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), IListViewBaseAutomationPeer.WithDefault,
    IDropTargetProvider.WithDefault, IWinRTObject {
  private val __1267562064_Interface: IListViewBaseAutomationPeer.WithDefault by lazy {
    as_1267562064()
  }


  private val __508378302_Interface: IDropTargetProvider.WithDefault by lazy {
    as_508378302()
  }


  public override val __1267562064_Ptr: JNAPointer? by lazy {
    __1267562064_Interface.__1267562064_Ptr
  }


  public override val __508378302_Ptr: JNAPointer? by lazy {
    __508378302_Interface.__508378302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1267562064_Interface, __508378302_Interface)

  public constructor(owner: ListViewBase) : this(ABI.activate(owner))

  private fun as_1267562064(): IListViewBaseAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewBaseAutomationPeer.ABI.makeIListViewBaseAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBaseAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBaseAutomationPeer.ABI.makeIListViewBaseAutomationPeer(ref.value))
  }

  private fun as_508378302(): IDropTargetProvider.WithDefault {
    if(pointer == NULL) {
      return(IDropTargetProvider.ABI.makeIDropTargetProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropTargetProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropTargetProvider.ABI.makeIDropTargetProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewBaseAutomationPeer> {
    public override fun getValue() = ListViewBaseAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewBaseAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewBaseAutomationPeer, MemoryAddress> {
    public val IListViewBaseAutomationPeerFactory_Instance: IListViewBaseAutomationPeerFactory by
        lazy {
      createIListViewBaseAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewBaseAutomationPeerFactory(): IListViewBaseAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListViewBaseAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewBaseAutomationPeerFactory.ABI.makeIListViewBaseAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListViewBase): JNAPointer? =
        IListViewBaseAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewBaseAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewBaseAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewBaseAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
