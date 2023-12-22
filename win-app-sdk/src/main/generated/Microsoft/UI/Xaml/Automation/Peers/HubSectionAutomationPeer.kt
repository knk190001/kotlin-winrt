package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IHubSectionAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IScrollItemProvider
import Microsoft.UI.Xaml.Controls.HubSection
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

@ABIMarker(HubSectionAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.HubSectionAutomationPeer;{174e94ab-c033-534a-895c-eaaf1dcc4352})")
@WinRTByReference(brClass = HubSectionAutomationPeer.ByReference::class)
public open class HubSectionAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IHubSectionAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __777013196_Interface: IHubSectionAutomationPeer.WithDefault by lazy {
    as_777013196()
  }


  private val __428448034_Interface: IScrollItemProvider.WithDefault by lazy {
    as_428448034()
  }


  public override val __777013196_Ptr: JNAPointer? by lazy {
    __777013196_Interface.__777013196_Ptr
  }


  public override val __428448034_Ptr: JNAPointer? by lazy {
    __428448034_Interface.__428448034_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__777013196_Interface, __428448034_Interface)

  public constructor(owner: HubSection) : this(ABI.activate(owner))

  private fun as_777013196(): IHubSectionAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IHubSectionAutomationPeer.ABI.makeIHubSectionAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHubSectionAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHubSectionAutomationPeer.ABI.makeIHubSectionAutomationPeer(ref.value))
  }

  private fun as_428448034(): IScrollItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollItemProvider.ABI.makeIScrollItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollItemProvider.ABI.makeIScrollItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HubSectionAutomationPeer> {
    public override fun getValue() = HubSectionAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: HubSectionAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HubSectionAutomationPeer, MemoryAddress> {
    public val IHubSectionAutomationPeerFactory_Instance: IHubSectionAutomationPeerFactory by lazy {
      createIHubSectionAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHubSectionAutomationPeerFactory(): IHubSectionAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.HubSectionAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHubSectionAutomationPeerFactory.ABI.makeIHubSectionAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: HubSection): JNAPointer? =
        IHubSectionAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HubSectionAutomationPeer {
      val address = segment.toRawLongValue()
      return HubSectionAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: HubSectionAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
