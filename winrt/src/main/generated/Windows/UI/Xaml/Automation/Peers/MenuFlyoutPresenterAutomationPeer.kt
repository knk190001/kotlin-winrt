package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IMenuFlyoutPresenterAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.MenuFlyoutPresenter
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

@ABIMarker(MenuFlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.MenuFlyoutPresenterAutomationPeer;{e244a871-fcbb-48fc-8a93-41ea134b53ce})")
@WinRTByReference(brClass = MenuFlyoutPresenterAutomationPeer.ByReference::class)
public open class MenuFlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : ItemsControlAutomationPeer(ptr), IMenuFlyoutPresenterAutomationPeer.WithDefault, IWinRTObject {
  private val __48758415_Interface: IMenuFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_48758415()
  }


  public override val __48758415_Ptr: JNAPointer? by lazy {
    __48758415_Interface.__48758415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__48758415_Interface)

  public constructor(owner: MenuFlyoutPresenter) : this(ABI.activate(owner))

  private fun as_48758415(): IMenuFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenterAutomationPeer.ABI.makeIMenuFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenterAutomationPeer.ABI.makeIMenuFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutPresenterAutomationPeer> {
    public override fun getValue() = MenuFlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IMenuFlyoutPresenterAutomationPeerFactory_Instance:
        IMenuFlyoutPresenterAutomationPeerFactory by lazy {
      createIMenuFlyoutPresenterAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutPresenterAutomationPeerFactory():
        IMenuFlyoutPresenterAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.MenuFlyoutPresenterAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutPresenterAutomationPeerFactory.ABI.makeIMenuFlyoutPresenterAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MenuFlyoutPresenter): JNAPointer? =
        IMenuFlyoutPresenterAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return MenuFlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
