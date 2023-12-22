package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IFlipViewItemDataAutomationPeerFactory.ABI.IID
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

@ABIMarker(FlipViewItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.FlipViewItemDataAutomationPeer;{b0986175-00bc-4118-8a6f-16ee9c15d968})")
@WinRTByReference(brClass = FlipViewItemDataAutomationPeer.ByReference::class)
public open class FlipViewItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorItemAutomationPeer(ptr), IFlipViewItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __99899872_Interface: IFlipViewItemDataAutomationPeer.WithDefault by lazy {
    as_99899872()
  }


  private val __8885417_Interface: IScrollItemProvider.WithDefault by lazy {
    as_8885417()
  }


  public override val __99899872_Ptr: JNAPointer? by lazy {
    __99899872_Interface.__99899872_Ptr
  }


  public override val __8885417_Ptr: JNAPointer? by lazy {
    __8885417_Interface.__8885417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__99899872_Interface, __8885417_Interface)

  public constructor(item: IUnknown, parent: FlipViewAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_99899872(): IFlipViewItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IFlipViewItemDataAutomationPeer.ABI.makeIFlipViewItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipViewItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipViewItemDataAutomationPeer.ABI.makeIFlipViewItemDataAutomationPeer(ref.value))
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
      IByReference<FlipViewItemDataAutomationPeer> {
    public override fun getValue() = FlipViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: FlipViewItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipViewItemDataAutomationPeer, MemoryAddress> {
    public val IFlipViewItemDataAutomationPeerFactory_Instance:
        IFlipViewItemDataAutomationPeerFactory by lazy {
      createIFlipViewItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewItemDataAutomationPeerFactory():
        IFlipViewItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.FlipViewItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlipViewItemDataAutomationPeerFactory.ABI.makeIFlipViewItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: FlipViewAutomationPeer): JNAPointer? =
        IFlipViewItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item,
        parent, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlipViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return FlipViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: FlipViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
