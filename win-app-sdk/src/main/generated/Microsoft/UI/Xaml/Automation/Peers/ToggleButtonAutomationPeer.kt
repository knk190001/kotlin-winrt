package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IToggleButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IToggleProvider
import Microsoft.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(ToggleButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ToggleButtonAutomationPeer;{637d9b99-bcc2-5e26-b43f-ba6c26af72c3})")
@WinRTByReference(brClass = ToggleButtonAutomationPeer.ByReference::class)
public open class ToggleButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonBaseAutomationPeer(ptr), IToggleButtonAutomationPeer.WithDefault,
    IToggleProvider.WithDefault, IWinRTObject {
  private val __1643479042_Interface: IToggleButtonAutomationPeer.WithDefault by lazy {
    as_1643479042()
  }


  private val __1361046222_Interface: IToggleProvider.WithDefault by lazy {
    as_1361046222()
  }


  public override val __1643479042_Ptr: JNAPointer? by lazy {
    __1643479042_Interface.__1643479042_Ptr
  }


  public override val __1361046222_Ptr: JNAPointer? by lazy {
    __1361046222_Interface.__1361046222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1643479042_Interface, __1361046222_Interface)

  public constructor(owner: ToggleButton) : this(ABI.activate(owner))

  private fun as_1643479042(): IToggleButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IToggleButtonAutomationPeer.ABI.makeIToggleButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleButtonAutomationPeer.ABI.makeIToggleButtonAutomationPeer(ref.value))
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
      IByReference<ToggleButtonAutomationPeer> {
    public override fun getValue() = ToggleButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ToggleButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleButtonAutomationPeer, MemoryAddress> {
    public val IToggleButtonAutomationPeerFactory_Instance: IToggleButtonAutomationPeerFactory by
        lazy {
      createIToggleButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleButtonAutomationPeerFactory(): IToggleButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ToggleButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleButtonAutomationPeerFactory.ABI.makeIToggleButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ToggleButton): JNAPointer? =
        IToggleButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return ToggleButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ToggleButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
