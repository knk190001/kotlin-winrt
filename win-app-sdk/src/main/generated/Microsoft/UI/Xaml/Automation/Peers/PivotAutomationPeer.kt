package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IPivotAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IScrollProvider
import Microsoft.UI.Xaml.Automation.Provider.ISelectionProvider
import Microsoft.UI.Xaml.Controls.Pivot
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

@ABIMarker(PivotAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.PivotAutomationPeer;{84225540-a6a3-5e65-a3dc-b31b81ab14c1})")
@WinRTByReference(brClass = PivotAutomationPeer.ByReference::class)
public class PivotAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemsControlAutomationPeer(ptr), IPivotAutomationPeer.WithDefault,
    ISelectionProvider.WithDefault, IScrollProvider.WithDefault, IWinRTObject {
  private val __1969167800_Interface: IPivotAutomationPeer.WithDefault by lazy {
    as_1969167800()
  }


  private val __95200080_Interface: ISelectionProvider.WithDefault by lazy {
    as_95200080()
  }


  private val __1467697237_Interface: IScrollProvider.WithDefault by lazy {
    as_1467697237()
  }


  public override val __1969167800_Ptr: JNAPointer? by lazy {
    __1969167800_Interface.__1969167800_Ptr
  }


  public override val __95200080_Ptr: JNAPointer? by lazy {
    __95200080_Interface.__95200080_Ptr
  }


  public override val __1467697237_Ptr: JNAPointer? by lazy {
    __1467697237_Interface.__1467697237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1969167800_Interface, __95200080_Interface, __1467697237_Interface)

  public constructor(owner: Pivot) : this(ABI.activate(owner))

  private fun as_1969167800(): IPivotAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPivotAutomationPeer.ABI.makeIPivotAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotAutomationPeer.ABI.makeIPivotAutomationPeer(ref.value))
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

  private fun as_1467697237(): IScrollProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollProvider.ABI.makeIScrollProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollProvider.ABI.makeIScrollProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotAutomationPeer> {
    public override fun getValue() = PivotAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PivotAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotAutomationPeer, MemoryAddress> {
    public val IPivotAutomationPeerFactory_Instance: IPivotAutomationPeerFactory by lazy {
      createIPivotAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotAutomationPeerFactory(): IPivotAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.PivotAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotAutomationPeerFactory.ABI.makeIPivotAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Pivot): JNAPointer? =
        IPivotAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner)?.pointer

    public override fun fromNative(segment: MemoryAddress): PivotAutomationPeer {
      val address = segment.toRawLongValue()
      return PivotAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PivotAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
