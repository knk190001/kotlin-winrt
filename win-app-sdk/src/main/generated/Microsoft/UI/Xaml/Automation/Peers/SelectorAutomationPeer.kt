package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ISelectorAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.ISelectionProvider
import Microsoft.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(SelectorAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.SelectorAutomationPeer;{4bac62ba-fb33-5f8b-995e-0dd93431294f})")
@WinRTByReference(brClass = SelectorAutomationPeer.ByReference::class)
public open class SelectorAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemsControlAutomationPeer(ptr), ISelectorAutomationPeer.WithDefault,
    ISelectionProvider.WithDefault, IWinRTObject {
  private val __476224005_Interface: ISelectorAutomationPeer.WithDefault by lazy {
    as_476224005()
  }


  private val __95200080_Interface: ISelectionProvider.WithDefault by lazy {
    as_95200080()
  }


  public override val __476224005_Ptr: JNAPointer? by lazy {
    __476224005_Interface.__476224005_Ptr
  }


  public override val __95200080_Ptr: JNAPointer? by lazy {
    __95200080_Interface.__95200080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__476224005_Interface, __95200080_Interface)

  public constructor(owner: Selector) : this(ABI.activate(owner))

  private fun as_476224005(): ISelectorAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISelectorAutomationPeer.ABI.makeISelectorAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectorAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectorAutomationPeer.ABI.makeISelectorAutomationPeer(ref.value))
  }

  private fun as_95200080(): ISelectionProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionProvider.ABI.makeISelectionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionProvider.ABI.makeISelectionProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectorAutomationPeer> {
    public override fun getValue() = SelectorAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SelectorAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectorAutomationPeer, MemoryAddress> {
    public val ISelectorAutomationPeerFactory_Instance: ISelectorAutomationPeerFactory by lazy {
      createISelectorAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectorAutomationPeerFactory(): ISelectorAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.SelectorAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectorAutomationPeerFactory.ABI.makeISelectorAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Selector): JNAPointer? =
        ISelectorAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SelectorAutomationPeer {
      val address = segment.toRawLongValue()
      return SelectorAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SelectorAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
