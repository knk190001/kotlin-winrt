package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IItemsViewAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.ISelectionProvider
import Microsoft.UI.Xaml.Controls.ItemsView
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

@ABIMarker(ItemsViewAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ItemsViewAutomationPeer;{d456ad6d-18d5-51ae-a44e-95671f848184})")
@WinRTByReference(brClass = ItemsViewAutomationPeer.ByReference::class)
public open class ItemsViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IItemsViewAutomationPeer.WithDefault,
    ISelectionProvider.WithDefault, IWinRTObject {
  private val __352964549_Interface: IItemsViewAutomationPeer.WithDefault by lazy {
    as_352964549()
  }


  private val __95200080_Interface: ISelectionProvider.WithDefault by lazy {
    as_95200080()
  }


  public override val __352964549_Ptr: JNAPointer? by lazy {
    __352964549_Interface.__352964549_Ptr
  }


  public override val __95200080_Ptr: JNAPointer? by lazy {
    __95200080_Interface.__95200080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__352964549_Interface, __95200080_Interface)

  public constructor(owner: ItemsView) : this(ABI.activate(owner))

  private fun as_352964549(): IItemsViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IItemsViewAutomationPeer.ABI.makeIItemsViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsViewAutomationPeer.ABI.makeIItemsViewAutomationPeer(ref.value))
  }

  private fun as_95200080(): ISelectionProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionProvider.ABI.makeISelectionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionProvider.ABI.makeISelectionProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsViewAutomationPeer> {
    public override fun getValue() = ItemsViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ItemsViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsViewAutomationPeer, MemoryAddress> {
    public val IItemsViewAutomationPeerFactory_Instance: IItemsViewAutomationPeerFactory by lazy {
      createIItemsViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsViewAutomationPeerFactory(): IItemsViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ItemsViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsViewAutomationPeerFactory.ABI.makeIItemsViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ItemsView): JNAPointer? =
        IItemsViewAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsViewAutomationPeer {
      val address = segment.toRawLongValue()
      return ItemsViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ItemsViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
