package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IFlyoutPresenterAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.FlyoutPresenter
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

@ABIMarker(FlyoutPresenterAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.FlyoutPresenterAutomationPeer;{e589b818-4a64-58c5-9c0b-5cea0f867e9b})")
@WinRTByReference(brClass = FlyoutPresenterAutomationPeer.ByReference::class)
public open class FlyoutPresenterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IFlyoutPresenterAutomationPeer.WithDefault, IWinRTObject {
  private val __15006493_Interface: IFlyoutPresenterAutomationPeer.WithDefault by lazy {
    as_15006493()
  }


  public override val __15006493_Ptr: JNAPointer? by lazy {
    __15006493_Interface.__15006493_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__15006493_Interface)

  public constructor(owner: FlyoutPresenter) : this(ABI.activate(owner))

  private fun as_15006493(): IFlyoutPresenterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutPresenterAutomationPeer.ABI.makeIFlyoutPresenterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutPresenterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutPresenterAutomationPeer.ABI.makeIFlyoutPresenterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlyoutPresenterAutomationPeer> {
    public override fun getValue() = FlyoutPresenterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: FlyoutPresenterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutPresenterAutomationPeer, MemoryAddress> {
    public val IFlyoutPresenterAutomationPeerFactory_Instance: IFlyoutPresenterAutomationPeerFactory
        by lazy {
      createIFlyoutPresenterAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutPresenterAutomationPeerFactory():
        IFlyoutPresenterAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.FlyoutPresenterAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutPresenterAutomationPeerFactory.ABI.makeIFlyoutPresenterAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: FlyoutPresenter): JNAPointer? =
        IFlyoutPresenterAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlyoutPresenterAutomationPeer {
      val address = segment.toRawLongValue()
      return FlyoutPresenterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: FlyoutPresenterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
