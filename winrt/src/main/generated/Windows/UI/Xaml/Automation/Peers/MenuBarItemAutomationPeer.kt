package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IMenuBarItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Windows.UI.Xaml.Automation.Provider.IInvokeProvider
import Windows.UI.Xaml.Controls.MenuBarItem
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

@ABIMarker(MenuBarItemAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.MenuBarItemAutomationPeer;{0fce49b4-cff5-5c4b-98ee-e75fdddf799a})")
@WinRTByReference(brClass = MenuBarItemAutomationPeer.ByReference::class)
public open class MenuBarItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMenuBarItemAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IInvokeProvider.WithDefault, IWinRTObject {
  private val __1700621992_Interface: IMenuBarItemAutomationPeer.WithDefault by lazy {
    as_1700621992()
  }


  private val __1930365296_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1930365296()
  }


  private val __907541087_Interface: IInvokeProvider.WithDefault by lazy {
    as_907541087()
  }


  public override val __1700621992_Ptr: JNAPointer? by lazy {
    __1700621992_Interface.__1700621992_Ptr
  }


  public override val __1930365296_Ptr: JNAPointer? by lazy {
    __1930365296_Interface.__1930365296_Ptr
  }


  public override val __907541087_Ptr: JNAPointer? by lazy {
    __907541087_Interface.__907541087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1700621992_Interface, __1930365296_Interface, __907541087_Interface)

  public constructor(owner: MenuBarItem) : this(ABI.activate(owner))

  private fun as_1700621992(): IMenuBarItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMenuBarItemAutomationPeer.ABI.makeIMenuBarItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBarItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBarItemAutomationPeer.ABI.makeIMenuBarItemAutomationPeer(ref.value))
  }

  private fun as_1930365296(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  private fun as_907541087(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuBarItemAutomationPeer> {
    public override fun getValue() = MenuBarItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MenuBarItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBarItemAutomationPeer, MemoryAddress> {
    public val IMenuBarItemAutomationPeerFactory_Instance: IMenuBarItemAutomationPeerFactory by
        lazy {
      createIMenuBarItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarItemAutomationPeerFactory(): IMenuBarItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.MenuBarItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarItemAutomationPeerFactory.ABI.makeIMenuBarItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MenuBarItem): JNAPointer? =
        IMenuBarItemAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBarItemAutomationPeer {
      val address = segment.toRawLongValue()
      return MenuBarItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MenuBarItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
