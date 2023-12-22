package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IFrameworkElementAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.FrameworkElement
import Windows.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(FrameworkElementAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.FrameworkElementAutomationPeer;{b90ad781-bfeb-4451-bd47-9f3a63ebd24a})")
@WinRTByReference(brClass = FrameworkElementAutomationPeer.ByReference::class)
public open class FrameworkElementAutomationPeer(
  ptr: JNAPointer? = NULL
) : AutomationPeer(ptr), IFrameworkElementAutomationPeer.WithDefault, IWinRTObject {
  private val __477746831_Interface: IFrameworkElementAutomationPeer.WithDefault by lazy {
    as_477746831()
  }


  public override val __477746831_Ptr: JNAPointer? by lazy {
    __477746831_Interface.__477746831_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__477746831_Interface)

  public constructor(owner: FrameworkElement) : this(ABI.activate(owner))

  private fun as_477746831(): IFrameworkElementAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementAutomationPeer.ABI.makeIFrameworkElementAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementAutomationPeer.ABI.makeIFrameworkElementAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameworkElementAutomationPeer> {
    public override fun getValue() = FrameworkElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: FrameworkElementAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameworkElementAutomationPeer, MemoryAddress> {
    public val IFrameworkElementAutomationPeerStatics_Instance:
        IFrameworkElementAutomationPeerStatics by lazy {
      createIFrameworkElementAutomationPeerStatics()
    }


    public val IFrameworkElementAutomationPeerFactory_Instance:
        IFrameworkElementAutomationPeerFactory by lazy {
      createIFrameworkElementAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameworkElementAutomationPeerStatics():
        IFrameworkElementAutomationPeerStatics {
      val refiid = Guid.REFIID(IFrameworkElementAutomationPeerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.FrameworkElementAutomationPeer".toHandle(),refiid,interfacePtr)
      val result =
          IFrameworkElementAutomationPeerStatics.ABI.makeIFrameworkElementAutomationPeerStatics(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementAutomationPeerFactory():
        IFrameworkElementAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.FrameworkElementAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFrameworkElementAutomationPeerFactory.ABI.makeIFrameworkElementAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: FrameworkElement): JNAPointer? =
        IFrameworkElementAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FrameworkElementAutomationPeer {
      val address = segment.toRawLongValue()
      return FrameworkElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: FrameworkElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromElement(element: UIElement) =
        ABI.IFrameworkElementAutomationPeerStatics_Instance.FromElement(element)

    public fun CreatePeerForElement(element: UIElement) =
        ABI.IFrameworkElementAutomationPeerStatics_Instance.CreatePeerForElement(element)
  }
}
