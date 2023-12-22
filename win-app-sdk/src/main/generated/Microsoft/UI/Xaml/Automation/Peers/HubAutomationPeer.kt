package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IHubAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Hub
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

@ABIMarker(HubAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.HubAutomationPeer;{8fa20cb6-42c1-531e-b54f-fcaf33c943a9})")
@WinRTByReference(brClass = HubAutomationPeer.ByReference::class)
public open class HubAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IHubAutomationPeer.WithDefault, IWinRTObject {
  private val __1814856597_Interface: IHubAutomationPeer.WithDefault by lazy {
    as_1814856597()
  }


  public override val __1814856597_Ptr: JNAPointer? by lazy {
    __1814856597_Interface.__1814856597_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1814856597_Interface)

  public constructor(owner: Hub) : this(ABI.activate(owner))

  private fun as_1814856597(): IHubAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IHubAutomationPeer.ABI.makeIHubAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHubAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHubAutomationPeer.ABI.makeIHubAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HubAutomationPeer> {
    public override fun getValue() = HubAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: HubAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HubAutomationPeer, MemoryAddress> {
    public val IHubAutomationPeerFactory_Instance: IHubAutomationPeerFactory by lazy {
      createIHubAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHubAutomationPeerFactory(): IHubAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.HubAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHubAutomationPeerFactory.ABI.makeIHubAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Hub): JNAPointer? =
        IHubAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HubAutomationPeer {
      val address = segment.toRawLongValue()
      return HubAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: HubAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
