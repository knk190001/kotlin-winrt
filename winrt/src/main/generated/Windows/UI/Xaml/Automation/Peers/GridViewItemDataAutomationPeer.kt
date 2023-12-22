package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IGridViewItemDataAutomationPeerFactory.ABI.IID
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

@ABIMarker(GridViewItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.GridViewItemDataAutomationPeer;{f3f4868f-29d4-4094-8c54-ea61a88294a4})")
@WinRTByReference(brClass = GridViewItemDataAutomationPeer.ByReference::class)
public open class GridViewItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorItemAutomationPeer(ptr), IGridViewItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __1320392569_Interface: IGridViewItemDataAutomationPeer.WithDefault by lazy {
    as_1320392569()
  }


  private val __8885417_Interface: IScrollItemProvider.WithDefault by lazy {
    as_8885417()
  }


  public override val __1320392569_Ptr: JNAPointer? by lazy {
    __1320392569_Interface.__1320392569_Ptr
  }


  public override val __8885417_Ptr: JNAPointer? by lazy {
    __8885417_Interface.__8885417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1320392569_Interface, __8885417_Interface)

  public constructor(item: IUnknown, parent: GridViewAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_1320392569(): IGridViewItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IGridViewItemDataAutomationPeer.ABI.makeIGridViewItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewItemDataAutomationPeer.ABI.makeIGridViewItemDataAutomationPeer(ref.value))
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
      IByReference<GridViewItemDataAutomationPeer> {
    public override fun getValue() = GridViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: GridViewItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewItemDataAutomationPeer, MemoryAddress> {
    public val IGridViewItemDataAutomationPeerFactory_Instance:
        IGridViewItemDataAutomationPeerFactory by lazy {
      createIGridViewItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewItemDataAutomationPeerFactory():
        IGridViewItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.GridViewItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewItemDataAutomationPeerFactory.ABI.makeIGridViewItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: GridViewAutomationPeer): JNAPointer? =
        IGridViewItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item,
        parent, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return GridViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: GridViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
