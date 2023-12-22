package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IAppBarButtonAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Windows.UI.Xaml.Controls.AppBarButton
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

@ABIMarker(AppBarButtonAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.AppBarButtonAutomationPeer;{443262b2-4f6d-4b76-9d2e-3eff777e8864})")
@WinRTByReference(brClass = AppBarButtonAutomationPeer.ByReference::class)
public open class AppBarButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonAutomationPeer(ptr), IAppBarButtonAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __1861725429_Interface: IAppBarButtonAutomationPeer.WithDefault by lazy {
    as_1861725429()
  }


  private val __1930365296_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1930365296()
  }


  public override val __1861725429_Ptr: JNAPointer? by lazy {
    __1861725429_Interface.__1861725429_Ptr
  }


  public override val __1930365296_Ptr: JNAPointer? by lazy {
    __1930365296_Interface.__1930365296_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1861725429_Interface, __1930365296_Interface)

  public constructor(owner: AppBarButton) : this(ABI.activate(owner))

  private fun as_1861725429(): IAppBarButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButtonAutomationPeer.ABI.makeIAppBarButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButtonAutomationPeer.ABI.makeIAppBarButtonAutomationPeer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarButtonAutomationPeer> {
    public override fun getValue() = AppBarButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AppBarButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarButtonAutomationPeer, MemoryAddress> {
    public val IAppBarButtonAutomationPeerFactory_Instance: IAppBarButtonAutomationPeerFactory by
        lazy {
      createIAppBarButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarButtonAutomationPeerFactory(): IAppBarButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.AppBarButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarButtonAutomationPeerFactory.ABI.makeIAppBarButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: AppBarButton): JNAPointer? =
        IAppBarButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return AppBarButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AppBarButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
