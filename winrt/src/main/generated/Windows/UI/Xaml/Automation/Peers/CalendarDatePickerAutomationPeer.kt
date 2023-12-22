package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ICalendarDatePickerAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IInvokeProvider
import Windows.UI.Xaml.Automation.Provider.IValueProvider
import Windows.UI.Xaml.Controls.CalendarDatePicker
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

@ABIMarker(CalendarDatePickerAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.CalendarDatePickerAutomationPeer;{40d8938e-db5e-4b03-beba-d10f62419787})")
@WinRTByReference(brClass = CalendarDatePickerAutomationPeer.ByReference::class)
public open class CalendarDatePickerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ICalendarDatePickerAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IValueProvider.WithDefault, IWinRTObject {
  private val __495359957_Interface: ICalendarDatePickerAutomationPeer.WithDefault by lazy {
    as_495359957()
  }


  private val __907541087_Interface: IInvokeProvider.WithDefault by lazy {
    as_907541087()
  }


  private val __1985648534_Interface: IValueProvider.WithDefault by lazy {
    as_1985648534()
  }


  public override val __495359957_Ptr: JNAPointer? by lazy {
    __495359957_Interface.__495359957_Ptr
  }


  public override val __907541087_Ptr: JNAPointer? by lazy {
    __907541087_Interface.__907541087_Ptr
  }


  public override val __1985648534_Ptr: JNAPointer? by lazy {
    __1985648534_Interface.__1985648534_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__495359957_Interface, __907541087_Interface, __1985648534_Interface)

  public constructor(owner: CalendarDatePicker) : this(ABI.activate(owner))

  private fun as_495359957(): ICalendarDatePickerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ICalendarDatePickerAutomationPeer.ABI.makeICalendarDatePickerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarDatePickerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarDatePickerAutomationPeer.ABI.makeICalendarDatePickerAutomationPeer(ref.value))
  }

  private fun as_907541087(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  private fun as_1985648534(): IValueProvider.WithDefault {
    if(pointer == NULL) {
      return(IValueProvider.ABI.makeIValueProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValueProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValueProvider.ABI.makeIValueProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarDatePickerAutomationPeer> {
    public override fun getValue() = CalendarDatePickerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: CalendarDatePickerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarDatePickerAutomationPeer, MemoryAddress> {
    public val ICalendarDatePickerAutomationPeerFactory_Instance:
        ICalendarDatePickerAutomationPeerFactory by lazy {
      createICalendarDatePickerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICalendarDatePickerAutomationPeerFactory():
        ICalendarDatePickerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.CalendarDatePickerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarDatePickerAutomationPeerFactory.ABI.makeICalendarDatePickerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: CalendarDatePicker): JNAPointer? =
        ICalendarDatePickerAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CalendarDatePickerAutomationPeer {
      val address = segment.toRawLongValue()
      return CalendarDatePickerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: CalendarDatePickerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
