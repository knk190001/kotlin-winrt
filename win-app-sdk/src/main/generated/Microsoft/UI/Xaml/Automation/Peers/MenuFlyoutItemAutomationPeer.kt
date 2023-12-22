package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IMenuFlyoutItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Controls.MenuFlyoutItem
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

@ABIMarker(MenuFlyoutItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.MenuFlyoutItemAutomationPeer;{fdb57952-2a4f-5ed4-8ada-320def75ea71})")
@WinRTByReference(brClass = MenuFlyoutItemAutomationPeer.ByReference::class)
public open class MenuFlyoutItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMenuFlyoutItemAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IWinRTObject {
  private val __947345975_Interface: IMenuFlyoutItemAutomationPeer.WithDefault by lazy {
    as_947345975()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __947345975_Ptr: JNAPointer? by lazy {
    __947345975_Interface.__947345975_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__947345975_Interface, __840579670_Interface)

  public constructor(owner: MenuFlyoutItem) : this(ABI.activate(owner))

  private fun as_947345975(): IMenuFlyoutItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItemAutomationPeer.ABI.makeIMenuFlyoutItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItemAutomationPeer.ABI.makeIMenuFlyoutItemAutomationPeer(ref.value))
  }

  private fun as_840579670(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutItemAutomationPeer> {
    public override fun getValue() = MenuFlyoutItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutItemAutomationPeer, MemoryAddress> {
    public val IMenuFlyoutItemAutomationPeerFactory_Instance: IMenuFlyoutItemAutomationPeerFactory
        by lazy {
      createIMenuFlyoutItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutItemAutomationPeerFactory(): IMenuFlyoutItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.MenuFlyoutItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutItemAutomationPeerFactory.ABI.makeIMenuFlyoutItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MenuFlyoutItem): JNAPointer? =
        IMenuFlyoutItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutItemAutomationPeer {
      val address = segment.toRawLongValue()
      return MenuFlyoutItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
