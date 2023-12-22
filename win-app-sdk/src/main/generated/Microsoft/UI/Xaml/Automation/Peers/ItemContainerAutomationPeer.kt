package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IItemContainerAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Automation.Provider.ISelectionItemProvider
import Microsoft.UI.Xaml.Controls.ItemContainer
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

@ABIMarker(ItemContainerAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ItemContainerAutomationPeer;{f915a1fb-754e-58c7-ad2a-b99528701793})")
@WinRTByReference(brClass = ItemContainerAutomationPeer.ByReference::class)
public open class ItemContainerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IItemContainerAutomationPeer.WithDefault,
    ISelectionItemProvider.WithDefault, IInvokeProvider.WithDefault, IWinRTObject {
  private val __1007636004_Interface: IItemContainerAutomationPeer.WithDefault by lazy {
    as_1007636004()
  }


  private val __1229913757_Interface: ISelectionItemProvider.WithDefault by lazy {
    as_1229913757()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __1007636004_Ptr: JNAPointer? by lazy {
    __1007636004_Interface.__1007636004_Ptr
  }


  public override val __1229913757_Ptr: JNAPointer? by lazy {
    __1229913757_Interface.__1229913757_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1007636004_Interface, __1229913757_Interface, __840579670_Interface)

  public constructor(owner: ItemContainer) : this(ABI.activate(owner))

  private fun as_1007636004(): IItemContainerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerAutomationPeer.ABI.makeIItemContainerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerAutomationPeer.ABI.makeIItemContainerAutomationPeer(ref.value))
  }

  private fun as_1229913757(): ISelectionItemProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionItemProvider.ABI.makeISelectionItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionItemProvider.ABI.makeISelectionItemProvider(ref.value))
  }

  private fun as_840579670(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemContainerAutomationPeer> {
    public override fun getValue() = ItemContainerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ItemContainerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemContainerAutomationPeer, MemoryAddress> {
    public val IItemContainerAutomationPeerFactory_Instance: IItemContainerAutomationPeerFactory by
        lazy {
      createIItemContainerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemContainerAutomationPeerFactory(): IItemContainerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ItemContainerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemContainerAutomationPeerFactory.ABI.makeIItemContainerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ItemContainer): JNAPointer? =
        IItemContainerAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemContainerAutomationPeer {
      val address = segment.toRawLongValue()
      return ItemContainerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ItemContainerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
