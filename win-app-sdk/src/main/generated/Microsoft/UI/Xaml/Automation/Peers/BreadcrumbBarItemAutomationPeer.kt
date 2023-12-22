package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IBreadcrumbBarItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Controls.BreadcrumbBarItem
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

@ABIMarker(BreadcrumbBarItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.BreadcrumbBarItemAutomationPeer;{48e81612-7de0-5065-b881-04ebfff90497})")
@WinRTByReference(brClass = BreadcrumbBarItemAutomationPeer.ByReference::class)
public open class BreadcrumbBarItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IBreadcrumbBarItemAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IWinRTObject {
  private val __1335811975_Interface: IBreadcrumbBarItemAutomationPeer.WithDefault by lazy {
    as_1335811975()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __1335811975_Ptr: JNAPointer? by lazy {
    __1335811975_Interface.__1335811975_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1335811975_Interface, __840579670_Interface)

  public constructor(owner: BreadcrumbBarItem) : this(ABI.activate(owner))

  private fun as_1335811975(): IBreadcrumbBarItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IBreadcrumbBarItemAutomationPeer.ABI.makeIBreadcrumbBarItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBreadcrumbBarItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBreadcrumbBarItemAutomationPeer.ABI.makeIBreadcrumbBarItemAutomationPeer(ref.value))
  }

  private fun as_840579670(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BreadcrumbBarItemAutomationPeer> {
    public override fun getValue() = BreadcrumbBarItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: BreadcrumbBarItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BreadcrumbBarItemAutomationPeer, MemoryAddress> {
    public val IBreadcrumbBarItemAutomationPeerFactory_Instance:
        IBreadcrumbBarItemAutomationPeerFactory by lazy {
      createIBreadcrumbBarItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBreadcrumbBarItemAutomationPeerFactory():
        IBreadcrumbBarItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.BreadcrumbBarItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBreadcrumbBarItemAutomationPeerFactory.ABI.makeIBreadcrumbBarItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: BreadcrumbBarItem): JNAPointer? =
        IBreadcrumbBarItemAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BreadcrumbBarItemAutomationPeer {
      val address = segment.toRawLongValue()
      return BreadcrumbBarItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: BreadcrumbBarItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
