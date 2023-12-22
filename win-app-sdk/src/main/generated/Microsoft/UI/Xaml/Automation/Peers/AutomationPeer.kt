package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(AutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AutomationPeer;{e51d3e4e-34f0-568c-999f-6277e2afe6d7})")
@WinRTByReference(brClass = AutomationPeer.ByReference::class)
public open class AutomationPeer(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAutomationPeer.WithDefault, IAutomationPeerProtected.WithDefault,
    IAutomationPeerOverrides.WithDefault, IWinRTObject {
  private val __460510404_Interface: IAutomationPeer.WithDefault by lazy {
    as_460510404()
  }


  private val __730446894_Interface: IAutomationPeerProtected.WithDefault by lazy {
    as_730446894()
  }


  private val __871877045_Interface: IAutomationPeerOverrides.WithDefault by lazy {
    as_871877045()
  }


  public override val __460510404_Ptr: JNAPointer? by lazy {
    __460510404_Interface.__460510404_Ptr
  }


  public override val __730446894_Ptr: JNAPointer? by lazy {
    __730446894_Interface.__730446894_Ptr
  }


  public override val __871877045_Ptr: JNAPointer? by lazy {
    __871877045_Interface.__871877045_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__460510404_Interface, __730446894_Interface, __871877045_Interface)

  public constructor() : this(ABI.activate())

  private fun as_460510404(): IAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer.ABI.makeIAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer.ABI.makeIAutomationPeer(ref.value))
  }

  private fun as_730446894(): IAutomationPeerProtected.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerProtected.ABI.makeIAutomationPeerProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerProtected.ABI.makeIAutomationPeerProtected(ref.value))
  }

  private fun as_871877045(): IAutomationPeerOverrides.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides.ABI.makeIAutomationPeerOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides.ABI.makeIAutomationPeerOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AutomationPeer>
      {
    public override fun getValue() = AutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationPeer, MemoryAddress> {
    public val IAutomationPeerStatics_Instance: IAutomationPeerStatics by lazy {
      createIAutomationPeerStatics()
    }


    public val IAutomationPeerFactory_Instance: IAutomationPeerFactory by lazy {
      createIAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutomationPeerStatics(): IAutomationPeerStatics {
      val refiid = Guid.REFIID(IAutomationPeerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutomationPeer".toHandle(),refiid,interfacePtr)
      val result = IAutomationPeerStatics.ABI.makeIAutomationPeerStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationPeerFactory(): IAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAutomationPeerFactory.ABI.makeIAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAutomationPeerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AutomationPeer {
      val address = segment.toRawLongValue()
      return AutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ListenerExists(eventId: AutomationEvents) =
        ABI.IAutomationPeerStatics_Instance.ListenerExists(eventId)

    public fun GenerateRawElementProviderRuntimeId() =
        ABI.IAutomationPeerStatics_Instance.GenerateRawElementProviderRuntimeId()
  }
}
