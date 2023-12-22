package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITreeViewItemDataAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
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

@ABIMarker(TreeViewItemDataAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TreeViewItemDataAutomationPeer;{20f74f77-edfa-5c71-9deb-530dcaf9c11d})")
@WinRTByReference(brClass = TreeViewItemDataAutomationPeer.ByReference::class)
public open class TreeViewItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemAutomationPeer(ptr), ITreeViewItemDataAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __2057888964_Interface: ITreeViewItemDataAutomationPeer.WithDefault by lazy {
    as_2057888964()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  public override val __2057888964_Ptr: JNAPointer? by lazy {
    __2057888964_Interface.__2057888964_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2057888964_Interface, __1578214981_Interface)

  public constructor(item: IUnknown, parent: TreeViewListAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_2057888964(): ITreeViewItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItemDataAutomationPeer.ABI.makeITreeViewItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItemDataAutomationPeer.ABI.makeITreeViewItemDataAutomationPeer(ref.value))
  }

  private fun as_1578214981(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewItemDataAutomationPeer> {
    public override fun getValue() = TreeViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TreeViewItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewItemDataAutomationPeer, MemoryAddress> {
    public val ITreeViewItemDataAutomationPeerFactory_Instance:
        ITreeViewItemDataAutomationPeerFactory by lazy {
      createITreeViewItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewItemDataAutomationPeerFactory():
        ITreeViewItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TreeViewItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewItemDataAutomationPeerFactory.ABI.makeITreeViewItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: TreeViewListAutomationPeer): JNAPointer? =
        ITreeViewItemDataAutomationPeerFactory_Instance.CreateInstanceWithOwner(item, parent, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return TreeViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TreeViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
