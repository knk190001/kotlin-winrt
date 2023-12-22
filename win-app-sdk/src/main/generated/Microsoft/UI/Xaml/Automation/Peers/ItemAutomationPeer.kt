package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IVirtualizedItemProvider
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

@ABIMarker(ItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ItemAutomationPeer;{be8a71bb-3e36-54d2-920e-60722f1c62ff})")
@WinRTByReference(brClass = ItemAutomationPeer.ByReference::class)
public open class ItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : AutomationPeer(ptr), IItemAutomationPeer.WithDefault, IVirtualizedItemProvider.WithDefault,
    IWinRTObject {
  private val __2107526063_Interface: IItemAutomationPeer.WithDefault by lazy {
    as_2107526063()
  }


  private val __841567154_Interface: IVirtualizedItemProvider.WithDefault by lazy {
    as_841567154()
  }


  public override val __2107526063_Ptr: JNAPointer? by lazy {
    __2107526063_Interface.__2107526063_Ptr
  }


  public override val __841567154_Ptr: JNAPointer? by lazy {
    __841567154_Interface.__841567154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2107526063_Interface, __841567154_Interface)

  public constructor(item: IUnknown, parent: ItemsControlAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_2107526063(): IItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IItemAutomationPeer.ABI.makeIItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemAutomationPeer.ABI.makeIItemAutomationPeer(ref.value))
  }

  private fun as_841567154(): IVirtualizedItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizedItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemAutomationPeer> {
    public override fun getValue() = ItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemAutomationPeer, MemoryAddress> {
    public val IItemAutomationPeerFactory_Instance: IItemAutomationPeerFactory by lazy {
      createIItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemAutomationPeerFactory(): IItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemAutomationPeerFactory.ABI.makeIItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: ItemsControlAutomationPeer): JNAPointer? =
        IItemAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item, parent, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
