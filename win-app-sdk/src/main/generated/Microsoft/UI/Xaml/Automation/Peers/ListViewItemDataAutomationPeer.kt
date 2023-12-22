package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListViewItemDataAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IScrollItemProvider
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ListViewItemDataAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListViewItemDataAutomationPeer;{88bb28d3-45ed-5415-825f-dd2da536c968})")
@WinRTByReference(brClass = ListViewItemDataAutomationPeer.ByReference::class)
public open class ListViewItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorItemAutomationPeer(ptr), IListViewItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __1823401924_Interface: IListViewItemDataAutomationPeer.WithDefault by lazy {
    as_1823401924()
  }


  private val __428448034_Interface: IScrollItemProvider.WithDefault by lazy {
    as_428448034()
  }


  public override val __1823401924_Ptr: JNAPointer? by lazy {
    __1823401924_Interface.__1823401924_Ptr
  }


  public override val __428448034_Ptr: JNAPointer? by lazy {
    __428448034_Interface.__428448034_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1823401924_Interface, __428448034_Interface)

  public constructor(item: IUnknown, parent: ListViewBaseAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_1823401924(): IListViewItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemDataAutomationPeer.ABI.makeIListViewItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemDataAutomationPeer.ABI.makeIListViewItemDataAutomationPeer(ref.value))
  }

  private fun as_428448034(): IScrollItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollItemProvider.ABI.makeIScrollItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollItemProvider.ABI.makeIScrollItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemDataAutomationPeer> {
    public override fun getValue() = ListViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListViewItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItemDataAutomationPeer, MemoryAddress> {
    public val IListViewItemDataAutomationPeerFactory_Instance:
        IListViewItemDataAutomationPeerFactory by lazy {
      createIListViewItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewItemDataAutomationPeerFactory():
        IListViewItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListViewItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewItemDataAutomationPeerFactory.ABI.makeIListViewItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: ListViewBaseAutomationPeer): JNAPointer? =
        IListViewItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item,
        parent, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return ListViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
