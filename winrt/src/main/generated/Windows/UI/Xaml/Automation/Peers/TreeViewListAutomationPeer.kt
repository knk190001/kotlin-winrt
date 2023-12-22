package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ITreeViewListAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.TreeViewList
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

@ABIMarker(TreeViewListAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.TreeViewListAutomationPeer;{71c1b5bc-bb29-4479-a8a8-606be6b823ae})")
@WinRTByReference(brClass = TreeViewListAutomationPeer.ByReference::class)
public open class TreeViewListAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), ITreeViewListAutomationPeer.WithDefault, IWinRTObject {
  private val __1809433810_Interface: ITreeViewListAutomationPeer.WithDefault by lazy {
    as_1809433810()
  }


  public override val __1809433810_Ptr: JNAPointer? by lazy {
    __1809433810_Interface.__1809433810_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1809433810_Interface)

  public constructor(owner: TreeViewList) : this(ABI.activate(owner))

  private fun as_1809433810(): ITreeViewListAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewListAutomationPeer.ABI.makeITreeViewListAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewListAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewListAutomationPeer.ABI.makeITreeViewListAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewListAutomationPeer> {
    public override fun getValue() = TreeViewListAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TreeViewListAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewListAutomationPeer, MemoryAddress> {
    public val ITreeViewListAutomationPeerFactory_Instance: ITreeViewListAutomationPeerFactory by
        lazy {
      createITreeViewListAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewListAutomationPeerFactory(): ITreeViewListAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.TreeViewListAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewListAutomationPeerFactory.ABI.makeITreeViewListAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TreeViewList): JNAPointer? =
        ITreeViewListAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewListAutomationPeer {
      val address = segment.toRawLongValue()
      return TreeViewListAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TreeViewListAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
