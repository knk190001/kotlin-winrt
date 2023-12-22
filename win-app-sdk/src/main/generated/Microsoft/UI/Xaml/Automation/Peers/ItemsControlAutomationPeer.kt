package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IItemsControlAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IItemContainerProvider
import Microsoft.UI.Xaml.Controls.ItemsControl
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

@ABIMarker(ItemsControlAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ItemsControlAutomationPeer;{0ae7bb7e-1407-5947-985f-9d542f433ab1})")
@WinRTByReference(brClass = ItemsControlAutomationPeer.ByReference::class)
public open class ItemsControlAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IItemsControlAutomationPeer.WithDefault,
    IItemsControlAutomationPeerOverrides.WithDefault, IItemContainerProvider.WithDefault,
    IWinRTObject {
  private val __1808652697_Interface: IItemsControlAutomationPeer.WithDefault by lazy {
    as_1808652697()
  }


  private val __374956174_Interface: IItemsControlAutomationPeerOverrides.WithDefault by lazy {
    as_374956174()
  }


  private val __1059692114_Interface: IItemContainerProvider.WithDefault by lazy {
    as_1059692114()
  }


  public override val __1808652697_Ptr: JNAPointer? by lazy {
    __1808652697_Interface.__1808652697_Ptr
  }


  public override val __374956174_Ptr: JNAPointer? by lazy {
    __374956174_Interface.__374956174_Ptr
  }


  public override val __1059692114_Ptr: JNAPointer? by lazy {
    __1059692114_Interface.__1059692114_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1808652697_Interface, __374956174_Interface, __1059692114_Interface)

  public constructor(owner: ItemsControl) : this(ABI.activate(owner))

  private fun as_1808652697(): IItemsControlAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IItemsControlAutomationPeer.ABI.makeIItemsControlAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControlAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControlAutomationPeer.ABI.makeIItemsControlAutomationPeer(ref.value))
  }

  private fun as_374956174(): IItemsControlAutomationPeerOverrides.WithDefault {
    if(pointer == NULL) {
      return(IItemsControlAutomationPeerOverrides.ABI.makeIItemsControlAutomationPeerOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControlAutomationPeerOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControlAutomationPeerOverrides.ABI.makeIItemsControlAutomationPeerOverrides(ref.value))
  }

  private fun as_1059692114(): IItemContainerProvider.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerProvider.ABI.makeIItemContainerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerProvider.ABI.makeIItemContainerProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsControlAutomationPeer> {
    public override fun getValue() = ItemsControlAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ItemsControlAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsControlAutomationPeer, MemoryAddress> {
    public val IItemsControlAutomationPeerFactory_Instance: IItemsControlAutomationPeerFactory by
        lazy {
      createIItemsControlAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsControlAutomationPeerFactory(): IItemsControlAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ItemsControlAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsControlAutomationPeerFactory.ABI.makeIItemsControlAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ItemsControl): JNAPointer? =
        IItemsControlAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsControlAutomationPeer {
      val address = segment.toRawLongValue()
      return ItemsControlAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ItemsControlAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
