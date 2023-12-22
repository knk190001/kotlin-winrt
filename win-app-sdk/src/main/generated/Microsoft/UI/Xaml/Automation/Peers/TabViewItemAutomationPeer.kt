package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITabViewItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.TabViewItem
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

@ABIMarker(TabViewItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TabViewItemAutomationPeer;{58afb1c3-a3fd-54a1-be39-328dd8a6f8ec})")
@WinRTByReference(brClass = TabViewItemAutomationPeer.ByReference::class)
public open class TabViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewItemAutomationPeer(ptr), ITabViewItemAutomationPeer.WithDefault, IWinRTObject {
  private val __1385308541_Interface: ITabViewItemAutomationPeer.WithDefault by lazy {
    as_1385308541()
  }


  public override val __1385308541_Ptr: JNAPointer? by lazy {
    __1385308541_Interface.__1385308541_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1385308541_Interface)

  public constructor(owner: TabViewItem) : this(ABI.activate(owner))

  private fun as_1385308541(): ITabViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITabViewItemAutomationPeer.ABI.makeITabViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewItemAutomationPeer.ABI.makeITabViewItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewItemAutomationPeer> {
    public override fun getValue() = TabViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TabViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewItemAutomationPeer, MemoryAddress> {
    public val ITabViewItemAutomationPeerFactory_Instance: ITabViewItemAutomationPeerFactory by
        lazy {
      createITabViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewItemAutomationPeerFactory(): ITabViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TabViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewItemAutomationPeerFactory.ABI.makeITabViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TabViewItem): JNAPointer? =
        ITabViewItemAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return TabViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TabViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
