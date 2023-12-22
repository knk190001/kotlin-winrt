package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ISemanticZoomAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IToggleProvider
import Microsoft.UI.Xaml.Controls.SemanticZoom
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

@ABIMarker(SemanticZoomAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.SemanticZoomAutomationPeer;{7d7fbd09-112f-50fd-9654-0474ce760b5d})")
@WinRTByReference(brClass = SemanticZoomAutomationPeer.ByReference::class)
public open class SemanticZoomAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ISemanticZoomAutomationPeer.WithDefault,
    IToggleProvider.WithDefault, IWinRTObject {
  private val __449435093_Interface: ISemanticZoomAutomationPeer.WithDefault by lazy {
    as_449435093()
  }


  private val __1361046222_Interface: IToggleProvider.WithDefault by lazy {
    as_1361046222()
  }


  public override val __449435093_Ptr: JNAPointer? by lazy {
    __449435093_Interface.__449435093_Ptr
  }


  public override val __1361046222_Ptr: JNAPointer? by lazy {
    __1361046222_Interface.__1361046222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__449435093_Interface, __1361046222_Interface)

  public constructor(owner: SemanticZoom) : this(ABI.activate(owner))

  private fun as_449435093(): ISemanticZoomAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoomAutomationPeer.ABI.makeISemanticZoomAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoomAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoomAutomationPeer.ABI.makeISemanticZoomAutomationPeer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SemanticZoomAutomationPeer> {
    public override fun getValue() = SemanticZoomAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SemanticZoomAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SemanticZoomAutomationPeer, MemoryAddress> {
    public val ISemanticZoomAutomationPeerFactory_Instance: ISemanticZoomAutomationPeerFactory by
        lazy {
      createISemanticZoomAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISemanticZoomAutomationPeerFactory(): ISemanticZoomAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.SemanticZoomAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISemanticZoomAutomationPeerFactory.ABI.makeISemanticZoomAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: SemanticZoom): JNAPointer? =
        ISemanticZoomAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SemanticZoomAutomationPeer {
      val address = segment.toRawLongValue()
      return SemanticZoomAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SemanticZoomAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
