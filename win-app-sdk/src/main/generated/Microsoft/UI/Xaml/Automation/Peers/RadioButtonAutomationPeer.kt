package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRadioButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.ISelectionItemProvider
import Microsoft.UI.Xaml.Controls.RadioButton
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

@ABIMarker(RadioButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RadioButtonAutomationPeer;{cce147b7-574a-53b6-a5b2-ca2622a79b2c})")
@WinRTByReference(brClass = RadioButtonAutomationPeer.ByReference::class)
public open class RadioButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ToggleButtonAutomationPeer(ptr), IRadioButtonAutomationPeer.WithDefault,
    ISelectionItemProvider.WithDefault, IWinRTObject {
  private val __1754075011_Interface: IRadioButtonAutomationPeer.WithDefault by lazy {
    as_1754075011()
  }


  private val __1229913757_Interface: ISelectionItemProvider.WithDefault by lazy {
    as_1229913757()
  }


  public override val __1754075011_Ptr: JNAPointer? by lazy {
    __1754075011_Interface.__1754075011_Ptr
  }


  public override val __1229913757_Ptr: JNAPointer? by lazy {
    __1229913757_Interface.__1229913757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1754075011_Interface, __1229913757_Interface)

  public constructor(owner: RadioButton) : this(ABI.activate(owner))

  private fun as_1754075011(): IRadioButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRadioButtonAutomationPeer.ABI.makeIRadioButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadioButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadioButtonAutomationPeer.ABI.makeIRadioButtonAutomationPeer(ref.value))
  }

  private fun as_1229913757(): ISelectionItemProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionItemProvider.ABI.makeISelectionItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionItemProvider.ABI.makeISelectionItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadioButtonAutomationPeer> {
    public override fun getValue() = RadioButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RadioButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadioButtonAutomationPeer, MemoryAddress> {
    public val IRadioButtonAutomationPeerFactory_Instance: IRadioButtonAutomationPeerFactory by
        lazy {
      createIRadioButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioButtonAutomationPeerFactory(): IRadioButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RadioButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadioButtonAutomationPeerFactory.ABI.makeIRadioButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RadioButton): JNAPointer? =
        IRadioButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadioButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return RadioButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RadioButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
