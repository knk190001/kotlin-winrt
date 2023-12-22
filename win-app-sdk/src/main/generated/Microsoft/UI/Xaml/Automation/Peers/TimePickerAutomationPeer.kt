package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITimePickerAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.TimePicker
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

@ABIMarker(TimePickerAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TimePickerAutomationPeer;{6309d3bb-3387-5965-acf5-47bfa9b92ed4})")
@WinRTByReference(brClass = TimePickerAutomationPeer.ByReference::class)
public open class TimePickerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITimePickerAutomationPeer.WithDefault, IWinRTObject {
  private val __732331543_Interface: ITimePickerAutomationPeer.WithDefault by lazy {
    as_732331543()
  }


  public override val __732331543_Ptr: JNAPointer? by lazy {
    __732331543_Interface.__732331543_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__732331543_Interface)

  public constructor(owner: TimePicker) : this(ABI.activate(owner))

  private fun as_732331543(): ITimePickerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerAutomationPeer.ABI.makeITimePickerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerAutomationPeer.ABI.makeITimePickerAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerAutomationPeer> {
    public override fun getValue() = TimePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TimePickerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerAutomationPeer, MemoryAddress> {
    public val ITimePickerAutomationPeerFactory_Instance: ITimePickerAutomationPeerFactory by lazy {
      createITimePickerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimePickerAutomationPeerFactory(): ITimePickerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TimePickerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimePickerAutomationPeerFactory.ABI.makeITimePickerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TimePicker): JNAPointer? =
        ITimePickerAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TimePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return TimePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TimePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
