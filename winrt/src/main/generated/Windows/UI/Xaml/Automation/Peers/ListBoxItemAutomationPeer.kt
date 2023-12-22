package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IListBoxItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ListBoxItem
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
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListBoxItemAutomationPeer;{1bc6e1c6-2997-42df-99eb-92bc1dd149fb})")
@WinRTByReference(brClass = ListBoxItemAutomationPeer.ByReference::class)
public open class ListBoxItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IListBoxItemAutomationPeer.WithDefault, IWinRTObject {
  private val __981312641_Interface: IListBoxItemAutomationPeer.WithDefault by lazy {
    as_981312641()
  }


  public override val __981312641_Ptr: JNAPointer? by lazy {
    __981312641_Interface.__981312641_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__981312641_Interface)

  public constructor(owner: ListBoxItem) : this(ABI.activate(owner))

  private fun as_981312641(): IListBoxItemAutomationPeer.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ListBoxItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
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
