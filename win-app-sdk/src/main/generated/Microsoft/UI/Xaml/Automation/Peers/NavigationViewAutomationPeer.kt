package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.INavigationViewAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.NavigationView
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

@ABIMarker(NavigationViewAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.NavigationViewAutomationPeer;{72013eae-b015-550d-ba8d-a05112b62731})")
@WinRTByReference(brClass = NavigationViewAutomationPeer.ByReference::class)
public open class NavigationViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), INavigationViewAutomationPeer.WithDefault, IWinRTObject {
  private val __698311371_Interface: INavigationViewAutomationPeer.WithDefault by lazy {
    as_698311371()
  }


  public override val __698311371_Ptr: JNAPointer? by lazy {
    __698311371_Interface.__698311371_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__698311371_Interface)

  public constructor(owner: NavigationView) : this(ABI.activate(owner))

  private fun as_698311371(): INavigationViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewAutomationPeer.ABI.makeINavigationViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewAutomationPeer.ABI.makeINavigationViewAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewAutomationPeer> {
    public override fun getValue() = NavigationViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: NavigationViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewAutomationPeer, MemoryAddress> {
    public val INavigationViewAutomationPeerFactory_Instance: INavigationViewAutomationPeerFactory
        by lazy {
      createINavigationViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewAutomationPeerFactory(): INavigationViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.NavigationViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewAutomationPeerFactory.ABI.makeINavigationViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: NavigationView): JNAPointer? =
        INavigationViewAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewAutomationPeer {
      val address = segment.toRawLongValue()
      return NavigationViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
