package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IToggleMenuFlyoutItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IToggleProvider
import Microsoft.UI.Xaml.Controls.ToggleMenuFlyoutItem
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

@ABIMarker(ToggleMenuFlyoutItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ToggleMenuFlyoutItemAutomationPeer;{ea4e4c7e-1f12-56c0-a2a5-b59e9c25b06d})")
@WinRTByReference(brClass = ToggleMenuFlyoutItemAutomationPeer.ByReference::class)
public open class ToggleMenuFlyoutItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IToggleMenuFlyoutItemAutomationPeer.WithDefault,
    IToggleProvider.WithDefault, IWinRTObject {
  private val __108132605_Interface: IToggleMenuFlyoutItemAutomationPeer.WithDefault by lazy {
    as_108132605()
  }


  private val __1361046222_Interface: IToggleProvider.WithDefault by lazy {
    as_1361046222()
  }


  public override val __108132605_Ptr: JNAPointer? by lazy {
    __108132605_Interface.__108132605_Ptr
  }


  public override val __1361046222_Ptr: JNAPointer? by lazy {
    __1361046222_Interface.__1361046222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__108132605_Interface, __1361046222_Interface)

  public constructor(owner: ToggleMenuFlyoutItem) : this(ABI.activate(owner))

  private fun as_108132605(): IToggleMenuFlyoutItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IToggleMenuFlyoutItemAutomationPeer.ABI.makeIToggleMenuFlyoutItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleMenuFlyoutItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleMenuFlyoutItemAutomationPeer.ABI.makeIToggleMenuFlyoutItemAutomationPeer(ref.value))
  }

  private fun as_1361046222(): IToggleProvider.WithDefault {
    if(pointer == NULL) {
      return(IToggleProvider.ABI.makeIToggleProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleProvider.ABI.makeIToggleProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleMenuFlyoutItemAutomationPeer> {
    public override fun getValue() = ToggleMenuFlyoutItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ToggleMenuFlyoutItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleMenuFlyoutItemAutomationPeer, MemoryAddress> {
    public val IToggleMenuFlyoutItemAutomationPeerFactory_Instance:
        IToggleMenuFlyoutItemAutomationPeerFactory by lazy {
      createIToggleMenuFlyoutItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleMenuFlyoutItemAutomationPeerFactory():
        IToggleMenuFlyoutItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ToggleMenuFlyoutItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleMenuFlyoutItemAutomationPeerFactory.ABI.makeIToggleMenuFlyoutItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ToggleMenuFlyoutItem): JNAPointer? =
        IToggleMenuFlyoutItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleMenuFlyoutItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ToggleMenuFlyoutItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ToggleMenuFlyoutItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
