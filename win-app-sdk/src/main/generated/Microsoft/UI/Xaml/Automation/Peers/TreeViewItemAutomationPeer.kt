package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITreeViewItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Controls.TreeViewItem
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

@ABIMarker(TreeViewItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TreeViewItemAutomationPeer;{25b38166-b905-5480-8439-e459a5b77b8c})")
@WinRTByReference(brClass = TreeViewItemAutomationPeer.ByReference::class)
public open class TreeViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewItemAutomationPeer(ptr), ITreeViewItemAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __493610354_Interface: ITreeViewItemAutomationPeer.WithDefault by lazy {
    as_493610354()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  public override val __493610354_Ptr: JNAPointer? by lazy {
    __493610354_Interface.__493610354_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__493610354_Interface, __1578214981_Interface)

  public constructor(owner: TreeViewItem) : this(ABI.activate(owner))

  private fun as_493610354(): ITreeViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItemAutomationPeer.ABI.makeITreeViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItemAutomationPeer.ABI.makeITreeViewItemAutomationPeer(ref.value))
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
      IByReference<TreeViewItemAutomationPeer> {
    public override fun getValue() = TreeViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TreeViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewItemAutomationPeer, MemoryAddress> {
    public val ITreeViewItemAutomationPeerFactory_Instance: ITreeViewItemAutomationPeerFactory by
        lazy {
      createITreeViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewItemAutomationPeerFactory(): ITreeViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TreeViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewItemAutomationPeerFactory.ABI.makeITreeViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TreeViewItem): JNAPointer? =
        ITreeViewItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return TreeViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TreeViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
