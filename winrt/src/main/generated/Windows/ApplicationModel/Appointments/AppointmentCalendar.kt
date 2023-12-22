package Windows.ApplicationModel.Appointments

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppointmentCalendar.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentCalendar;{5273819d-8339-3d4f-a02f-64084452bb5d})")
@WinRTByReference(brClass = AppointmentCalendar.ByReference::class)
public class AppointmentCalendar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendar.WithDefault, IAppointmentCalendar2.WithDefault,
    IAppointmentCalendar3.WithDefault, IWinRTObject {
  private val __997961842_Interface: IAppointmentCalendar.WithDefault by lazy {
    as_997961842()
  }


  private val __872046080_Interface: IAppointmentCalendar2.WithDefault by lazy {
    as_872046080()
  }


  private val __872046081_Interface: IAppointmentCalendar3.WithDefault by lazy {
    as_872046081()
  }


  public override val __997961842_Ptr: JNAPointer? by lazy {
    __997961842_Interface.__997961842_Ptr
  }


  public override val __872046080_Ptr: JNAPointer? by lazy {
    __872046080_Interface.__872046080_Ptr
  }


  public override val __872046081_Ptr: JNAPointer? by lazy {
    __872046081_Interface.__872046081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__997961842_Interface, __872046080_Interface, __872046081_Interface)

  private fun as_997961842(): IAppointmentCalendar.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendar.ABI.makeIAppointmentCalendar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendar.ABI.makeIAppointmentCalendar(ref.value))
  }

  private fun as_872046080(): IAppointmentCalendar2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendar2.ABI.makeIAppointmentCalendar2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendar2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendar2.ABI.makeIAppointmentCalendar2(ref.value))
  }

  private fun as_872046081(): IAppointmentCalendar3.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendar3.ABI.makeIAppointmentCalendar3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendar3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendar3.ABI.makeIAppointmentCalendar3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendar> {
    public override fun getValue() = AppointmentCalendar(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendar, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentCalendar {
      val address = segment.toRawLongValue()
      return AppointmentCalendar(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
