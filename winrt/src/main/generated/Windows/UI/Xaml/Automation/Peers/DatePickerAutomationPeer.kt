package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IDatePickerAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.DatePicker
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

@ABIMarker(DatePickerAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.DatePickerAutomationPeer;{d07d357f-a0b9-45dc-991a-76c505e7d0f5})")
@WinRTByReference(brClass = DatePickerAutomationPeer.ByReference::class)
public open class DatePickerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IDatePickerAutomationPeer.WithDefault, IWinRTObject {
  private val __1019796173_Interface: IDatePickerAutomationPeer.WithDefault by lazy {
    as_1019796173()
  }


  public override val __1019796173_Ptr: JNAPointer? by lazy {
    __1019796173_Interface.__1019796173_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1019796173_Interface)

  public constructor(owner: DatePicker) : this(ABI.activate(owner))

  private fun as_1019796173(): IDatePickerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerAutomationPeer.ABI.makeIDatePickerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerAutomationPeer.ABI.makeIDatePickerAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerAutomationPeer> {
    public override fun getValue() = DatePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: DatePickerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerAutomationPeer, MemoryAddress> {
    public val IDatePickerAutomationPeerFactory_Instance: IDatePickerAutomationPeerFactory by lazy {
      createIDatePickerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDatePickerAutomationPeerFactory(): IDatePickerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.DatePickerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDatePickerAutomationPeerFactory.ABI.makeIDatePickerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: DatePicker): JNAPointer? =
        IDatePickerAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DatePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return DatePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: DatePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
