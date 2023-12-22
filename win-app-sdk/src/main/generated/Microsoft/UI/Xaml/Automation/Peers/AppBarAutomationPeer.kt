package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IAppBarAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Automation.Provider.IToggleProvider
import Microsoft.UI.Xaml.Automation.Provider.IWindowProvider
import Microsoft.UI.Xaml.Controls.AppBar
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
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AppBarAutomationPeer;{883a52e2-1810-5f1a-a9fd-1db0f9c62b02})")
@WinRTByReference(brClass = AppBarAutomationPeer.ByReference::class)
public open class AppBarAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IAppBarAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IToggleProvider.WithDefault, IWindowProvider.WithDefault,
    IWinRTObject {
  private val __62612530_Interface: IAppBarAutomationPeer.WithDefault by lazy {
    as_62612530()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  private val __1361046222_Interface: IToggleProvider.WithDefault by lazy {
    as_1361046222()
  }


  private val __2118179278_Interface: IWindowProvider.WithDefault by lazy {
    as_2118179278()
  }


  public override val __62612530_Ptr: JNAPointer? by lazy {
    __62612530_Interface.__62612530_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val __1361046222_Ptr: JNAPointer? by lazy {
    __1361046222_Interface.__1361046222_Ptr
  }


  public override val __2118179278_Ptr: JNAPointer? by lazy {
    __2118179278_Interface.__2118179278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__62612530_Interface, __1578214981_Interface, __1361046222_Interface,
        __2118179278_Interface)

  public constructor(owner: AppBar) : this(ABI.activate(owner))

  private fun as_62612530(): IAppBarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarAutomationPeer.ABI.makeIAppBarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarAutomationPeer.ABI.makeIAppBarAutomationPeer(ref.value))
  }

  private fun as_1578214981(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
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

  private fun as_2118179278(): IWindowProvider.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AppBarAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
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
