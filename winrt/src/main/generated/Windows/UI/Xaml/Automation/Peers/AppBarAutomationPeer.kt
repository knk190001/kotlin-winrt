package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IAppBarAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Windows.UI.Xaml.Automation.Provider.IToggleProvider
import Windows.UI.Xaml.Automation.Provider.IWindowProvider
import Windows.UI.Xaml.Controls.AppBar
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

@ABIMarker(AppBarAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.AppBarAutomationPeer;{8b4acfeb-89fa-4f13-84be-35ca5b7c9590})")
@WinRTByReference(brClass = AppBarAutomationPeer.ByReference::class)
public open class AppBarAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IAppBarAutomationPeer.WithDefault,
    IToggleProvider.WithDefault, IExpandCollapseProvider.WithDefault, IWindowProvider.WithDefault,
    IWinRTObject {
  private val __1849620317_Interface: IAppBarAutomationPeer.WithDefault by lazy {
    as_1849620317()
  }


  private val __1185800317_Interface: IToggleProvider.WithDefault by lazy {
    as_1185800317()
  }


  private val __1930365296_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1930365296()
  }


  private val __370058521_Interface: IWindowProvider.WithDefault by lazy {
    as_370058521()
  }


  public override val __1849620317_Ptr: JNAPointer? by lazy {
    __1849620317_Interface.__1849620317_Ptr
  }


  public override val __1185800317_Ptr: JNAPointer? by lazy {
    __1185800317_Interface.__1185800317_Ptr
  }


  public override val __1930365296_Ptr: JNAPointer? by lazy {
    __1930365296_Interface.__1930365296_Ptr
  }


  public override val __370058521_Ptr: JNAPointer? by lazy {
    __370058521_Interface.__370058521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1849620317_Interface, __1185800317_Interface, __1930365296_Interface,
        __370058521_Interface)

  public constructor(owner: AppBar) : this(ABI.activate(owner))

  private fun as_1849620317(): IAppBarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarAutomationPeer.ABI.makeIAppBarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarAutomationPeer.ABI.makeIAppBarAutomationPeer(ref.value))
  }

  private fun as_1185800317(): IToggleProvider.WithDefault {
    if(pointer == NULL) {
      return(IToggleProvider.ABI.makeIToggleProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleProvider.ABI.makeIToggleProvider(ref.value))
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

  private fun as_370058521(): IWindowProvider.WithDefault {
    if(pointer == NULL) {
      return(IWindowProvider.ABI.makeIWindowProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowProvider.ABI.makeIWindowProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarAutomationPeer> {
    public override fun getValue() = AppBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AppBarAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarAutomationPeer, MemoryAddress> {
    public val IAppBarAutomationPeerFactory_Instance: IAppBarAutomationPeerFactory by lazy {
      createIAppBarAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarAutomationPeerFactory(): IAppBarAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.AppBarAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarAutomationPeerFactory.ABI.makeIAppBarAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: AppBar): JNAPointer? =
        IAppBarAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarAutomationPeer {
      val address = segment.toRawLongValue()
      return AppBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AppBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
