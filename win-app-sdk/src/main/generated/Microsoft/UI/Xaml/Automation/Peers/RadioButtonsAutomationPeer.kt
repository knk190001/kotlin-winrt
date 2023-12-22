package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRadioButtonsAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.RadioButtons
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

@ABIMarker(RadioButtonsAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RadioButtonsAutomationPeer;{fff86275-0cdd-54db-9d88-9c0e5f9bcb4d})")
@WinRTByReference(brClass = RadioButtonsAutomationPeer.ByReference::class)
public open class RadioButtonsAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRadioButtonsAutomationPeer.WithDefault, IWinRTObject {
  private val __1117649762_Interface: IRadioButtonsAutomationPeer.WithDefault by lazy {
    as_1117649762()
  }


  public override val __1117649762_Ptr: JNAPointer? by lazy {
    __1117649762_Interface.__1117649762_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1117649762_Interface)

  public constructor(owner: RadioButtons) : this(ABI.activate(owner))

  private fun as_1117649762(): IRadioButtonsAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRadioButtonsAutomationPeer.ABI.makeIRadioButtonsAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadioButtonsAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadioButtonsAutomationPeer.ABI.makeIRadioButtonsAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadioButtonsAutomationPeer> {
    public override fun getValue() = RadioButtonsAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RadioButtonsAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadioButtonsAutomationPeer, MemoryAddress> {
    public val IRadioButtonsAutomationPeerFactory_Instance: IRadioButtonsAutomationPeerFactory by
        lazy {
      createIRadioButtonsAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioButtonsAutomationPeerFactory(): IRadioButtonsAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RadioButtonsAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadioButtonsAutomationPeerFactory.ABI.makeIRadioButtonsAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RadioButtons): JNAPointer? =
        IRadioButtonsAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadioButtonsAutomationPeer {
      val address = segment.toRawLongValue()
      return RadioButtonsAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RadioButtonsAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
