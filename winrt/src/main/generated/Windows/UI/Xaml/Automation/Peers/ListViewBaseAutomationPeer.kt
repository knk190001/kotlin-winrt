package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IListViewBaseAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IDropTargetProvider
import Windows.UI.Xaml.Controls.ListViewBase
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
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListViewBaseAutomationPeer;{87ec7649-b83d-4e55-9afd-bd835e748f5c})")
@WinRTByReference(brClass = ListViewBaseAutomationPeer.ByReference::class)
public open class ListViewBaseAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), IListViewBaseAutomationPeer.WithDefault,
    IDropTargetProvider.WithDefault, IWinRTObject {
  private val __1635599045_Interface: IListViewBaseAutomationPeer.WithDefault by lazy {
    as_1635599045()
  }


  private val __945711753_Interface: IDropTargetProvider.WithDefault by lazy {
    as_945711753()
  }


  public override val __1635599045_Ptr: JNAPointer? by lazy {
    __1635599045_Interface.__1635599045_Ptr
  }


  public override val __945711753_Ptr: JNAPointer? by lazy {
    __945711753_Interface.__945711753_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1635599045_Interface, __945711753_Interface)

  public constructor(owner: ListViewBase) : this(ABI.activate(owner))

  private fun as_1635599045(): IListViewBaseAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewBaseAutomationPeer.ABI.makeIListViewBaseAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBaseAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBaseAutomationPeer.ABI.makeIListViewBaseAutomationPeer(ref.value))
  }

  private fun as_945711753(): IDropTargetProvider.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ListViewBaseAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
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
