package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IPivotItemDataAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IScrollItemProvider
import Windows.UI.Xaml.Automation.Provider.ISelectionItemProvider
import Windows.UI.Xaml.Automation.Provider.IVirtualizedItemProvider
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

@ABIMarker(PivotItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.PivotItemDataAutomationPeer;{a2a3b788-ea1d-48b7-88ee-f08b6aa07fee})")
@WinRTByReference(brClass = PivotItemDataAutomationPeer.ByReference::class)
public class PivotItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemAutomationPeer(ptr), IPivotItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, ISelectionItemProvider.WithDefault,
    IVirtualizedItemProvider.WithDefault, IWinRTObject {
  private val __1015792896_Interface: IPivotItemDataAutomationPeer.WithDefault by lazy {
    as_1015792896()
  }


  private val __8885417_Interface: IScrollItemProvider.WithDefault by lazy {
    as_8885417()
  }


  private val __735116216_Interface: ISelectionItemProvider.WithDefault by lazy {
    as_735116216()
  }


  private val __550239033_Interface: IVirtualizedItemProvider.WithDefault by lazy {
    as_550239033()
  }


  public override val __1015792896_Ptr: JNAPointer? by lazy {
    __1015792896_Interface.__1015792896_Ptr
  }


  public override val __8885417_Ptr: JNAPointer? by lazy {
    __8885417_Interface.__8885417_Ptr
  }


  public override val __735116216_Ptr: JNAPointer? by lazy {
    __735116216_Interface.__735116216_Ptr
  }


  public override val __550239033_Ptr: JNAPointer? by lazy {
    __550239033_Interface.__550239033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1015792896_Interface, __8885417_Interface, __735116216_Interface,
        __550239033_Interface)

  public constructor(item: IUnknown, parent: PivotAutomationPeer) : this(ABI.activate(item, parent))

  private fun as_1015792896(): IPivotItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPivotItemDataAutomationPeer.ABI.makeIPivotItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotItemDataAutomationPeer.ABI.makeIPivotItemDataAutomationPeer(ref.value))
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

  private fun as_735116216(): ISelectionItemProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionItemProvider.ABI.makeISelectionItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionItemProvider.ABI.makeISelectionItemProvider(ref.value))
  }

  private fun as_550239033(): IVirtualizedItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizedItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotItemDataAutomationPeer> {
    public override fun getValue() = PivotItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PivotItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotItemDataAutomationPeer, MemoryAddress> {
    public val IPivotItemDataAutomationPeerFactory_Instance: IPivotItemDataAutomationPeerFactory by
        lazy {
      createIPivotItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotItemDataAutomationPeerFactory(): IPivotItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.PivotItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotItemDataAutomationPeerFactory.ABI.makeIPivotItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: PivotAutomationPeer): JNAPointer? =
        IPivotItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item,
        parent)?.pointer

    public override fun fromNative(segment: MemoryAddress): PivotItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return PivotItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PivotItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
