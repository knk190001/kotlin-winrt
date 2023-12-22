package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.INavigationViewItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Controls.NavigationViewItem
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

@ABIMarker(NavigationViewItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.NavigationViewItemAutomationPeer;{c7924c7a-739f-5251-9b86-df6486eb08a7})")
@WinRTByReference(brClass = NavigationViewItemAutomationPeer.ByReference::class)
public open class NavigationViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), INavigationViewItemAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __1811539672_Interface: INavigationViewItemAutomationPeer.WithDefault by lazy {
    as_1811539672()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  public override val __1811539672_Ptr: JNAPointer? by lazy {
    __1811539672_Interface.__1811539672_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1811539672_Interface, __1578214981_Interface)

  public constructor(owner: NavigationViewItem) : this(ABI.activate(owner))

  private fun as_1811539672(): INavigationViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemAutomationPeer.ABI.makeINavigationViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemAutomationPeer.ABI.makeINavigationViewItemAutomationPeer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemAutomationPeer> {
    public override fun getValue() = NavigationViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemAutomationPeer, MemoryAddress> {
    public val INavigationViewItemAutomationPeerFactory_Instance:
        INavigationViewItemAutomationPeerFactory by lazy {
      createINavigationViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemAutomationPeerFactory():
        INavigationViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.NavigationViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemAutomationPeerFactory.ABI.makeINavigationViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: NavigationViewItem): JNAPointer? =
        INavigationViewItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return NavigationViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
