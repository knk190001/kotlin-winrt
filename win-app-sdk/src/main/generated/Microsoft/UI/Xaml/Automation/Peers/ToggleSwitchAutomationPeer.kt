package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IToggleSwitchAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IToggleProvider
import Microsoft.UI.Xaml.Controls.ToggleSwitch
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

@ABIMarker(ToggleSwitchAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ToggleSwitchAutomationPeer;{927d6091-5070-574f-9833-0ef89a9cbb4b})")
@WinRTByReference(brClass = ToggleSwitchAutomationPeer.ByReference::class)
public open class ToggleSwitchAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IToggleSwitchAutomationPeer.WithDefault,
    IToggleProvider.WithDefault, IWinRTObject {
  private val __1053418628_Interface: IToggleSwitchAutomationPeer.WithDefault by lazy {
    as_1053418628()
  }


  private val __1361046222_Interface: IToggleProvider.WithDefault by lazy {
    as_1361046222()
  }


  public override val __1053418628_Ptr: JNAPointer? by lazy {
    __1053418628_Interface.__1053418628_Ptr
  }


  public override val __1361046222_Ptr: JNAPointer? by lazy {
    __1361046222_Interface.__1361046222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1053418628_Interface, __1361046222_Interface)

  public constructor(owner: ToggleSwitch) : this(ABI.activate(owner))

  private fun as_1053418628(): IToggleSwitchAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IToggleSwitchAutomationPeer.ABI.makeIToggleSwitchAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSwitchAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSwitchAutomationPeer.ABI.makeIToggleSwitchAutomationPeer(ref.value))
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
      IByReference<ToggleSwitchAutomationPeer> {
    public override fun getValue() = ToggleSwitchAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ToggleSwitchAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSwitchAutomationPeer, MemoryAddress> {
    public val IToggleSwitchAutomationPeerFactory_Instance: IToggleSwitchAutomationPeerFactory by
        lazy {
      createIToggleSwitchAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleSwitchAutomationPeerFactory(): IToggleSwitchAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ToggleSwitchAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleSwitchAutomationPeerFactory.ABI.makeIToggleSwitchAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ToggleSwitch): JNAPointer? =
        IToggleSwitchAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleSwitchAutomationPeer {
      val address = segment.toRawLongValue()
      return ToggleSwitchAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ToggleSwitchAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
