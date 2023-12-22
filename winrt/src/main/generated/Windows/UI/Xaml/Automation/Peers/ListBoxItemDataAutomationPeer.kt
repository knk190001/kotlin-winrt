package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IListBoxItemDataAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IScrollItemProvider
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

@ABIMarker(ListBoxItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListBoxItemDataAutomationPeer;{fd7d5fee-fde0-482a-8084-dcebba5b9806})")
@WinRTByReference(brClass = ListBoxItemDataAutomationPeer.ByReference::class)
public open class ListBoxItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorItemAutomationPeer(ptr), IListBoxItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __910473931_Interface: IListBoxItemDataAutomationPeer.WithDefault by lazy {
    as_910473931()
  }


  private val __8885417_Interface: IScrollItemProvider.WithDefault by lazy {
    as_8885417()
  }


  public override val __910473931_Ptr: JNAPointer? by lazy {
    __910473931_Interface.__910473931_Ptr
  }


  public override val __8885417_Ptr: JNAPointer? by lazy {
    __8885417_Interface.__8885417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__910473931_Interface, __8885417_Interface)

  public constructor(item: IUnknown, parent: ListBoxAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_910473931(): IListBoxItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListBoxItemDataAutomationPeer.ABI.makeIListBoxItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBoxItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBoxItemDataAutomationPeer.ABI.makeIListBoxItemDataAutomationPeer(ref.value))
  }

  private fun as_8885417(): IScrollItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollItemProvider.ABI.makeIScrollItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollItemProvider.ABI.makeIScrollItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListBoxItemDataAutomationPeer> {
    public override fun getValue() = ListBoxItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListBoxItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListBoxItemDataAutomationPeer, MemoryAddress> {
    public val IListBoxItemDataAutomationPeerFactory_Instance: IListBoxItemDataAutomationPeerFactory
        by lazy {
      createIListBoxItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListBoxItemDataAutomationPeerFactory():
        IListBoxItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ListBoxItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListBoxItemDataAutomationPeerFactory.ABI.makeIListBoxItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: ListBoxAutomationPeer): JNAPointer? =
        IListBoxItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item, parent,
        null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListBoxItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return ListBoxItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListBoxItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
