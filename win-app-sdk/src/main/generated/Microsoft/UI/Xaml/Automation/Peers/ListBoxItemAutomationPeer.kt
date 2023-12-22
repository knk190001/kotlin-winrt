package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IListBoxItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ListBoxItem
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

@ABIMarker(ListBoxItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ListBoxItemAutomationPeer;{19a8c4b4-e63a-5b2e-8e2f-c834e6a08204})")
@WinRTByReference(brClass = ListBoxItemAutomationPeer.ByReference::class)
public open class ListBoxItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IListBoxItemAutomationPeer.WithDefault, IWinRTObject {
  private val __194925622_Interface: IListBoxItemAutomationPeer.WithDefault by lazy {
    as_194925622()
  }


  public override val __194925622_Ptr: JNAPointer? by lazy {
    __194925622_Interface.__194925622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__194925622_Interface)

  public constructor(owner: ListBoxItem) : this(ABI.activate(owner))

  private fun as_194925622(): IListBoxItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListBoxItemAutomationPeer.ABI.makeIListBoxItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBoxItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBoxItemAutomationPeer.ABI.makeIListBoxItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListBoxItemAutomationPeer> {
    public override fun getValue() = ListBoxItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListBoxItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListBoxItemAutomationPeer, MemoryAddress> {
    public val IListBoxItemAutomationPeerFactory_Instance: IListBoxItemAutomationPeerFactory by
        lazy {
      createIListBoxItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListBoxItemAutomationPeerFactory(): IListBoxItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ListBoxItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListBoxItemAutomationPeerFactory.ABI.makeIListBoxItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListBoxItem): JNAPointer? =
        IListBoxItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListBoxItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ListBoxItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListBoxItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
