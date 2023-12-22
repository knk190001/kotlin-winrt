package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ISelectorItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.ISelectionItemProvider
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

@ABIMarker(SelectorItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.SelectorItemAutomationPeer;{70b85e53-e684-5068-91b7-2d84fea8e9d7})")
@WinRTByReference(brClass = SelectorItemAutomationPeer.ByReference::class)
public open class SelectorItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemAutomationPeer(ptr), ISelectorItemAutomationPeer.WithDefault,
    ISelectionItemProvider.WithDefault, IWinRTObject {
  private val __1333457170_Interface: ISelectorItemAutomationPeer.WithDefault by lazy {
    as_1333457170()
  }


  private val __1229913757_Interface: ISelectionItemProvider.WithDefault by lazy {
    as_1229913757()
  }


  public override val __1333457170_Ptr: JNAPointer? by lazy {
    __1333457170_Interface.__1333457170_Ptr
  }


  public override val __1229913757_Ptr: JNAPointer? by lazy {
    __1229913757_Interface.__1229913757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1333457170_Interface, __1229913757_Interface)

  public constructor(item: IUnknown, parent: SelectorAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_1333457170(): ISelectorItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISelectorItemAutomationPeer.ABI.makeISelectorItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectorItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectorItemAutomationPeer.ABI.makeISelectorItemAutomationPeer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectorItemAutomationPeer> {
    public override fun getValue() = SelectorItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SelectorItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectorItemAutomationPeer, MemoryAddress> {
    public val ISelectorItemAutomationPeerFactory_Instance: ISelectorItemAutomationPeerFactory by
        lazy {
      createISelectorItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectorItemAutomationPeerFactory(): ISelectorItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.SelectorItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectorItemAutomationPeerFactory.ABI.makeISelectorItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: SelectorAutomationPeer): JNAPointer? =
        ISelectorItemAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item, parent,
        null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SelectorItemAutomationPeer {
      val address = segment.toRawLongValue()
      return SelectorItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SelectorItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
