package Windows.ApplicationModel.Appointments.DataProvider

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

@ABIMarker(AppointmentCalendarCancelMeetingRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarCancelMeetingRequest;{49460f8d-6434-40d7-ad46-6297419314d1})")
@WinRTByReference(brClass = AppointmentCalendarCancelMeetingRequest.ByReference::class)
public class AppointmentCalendarCancelMeetingRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarCancelMeetingRequest.WithDefault, IWinRTObject {
  private val __673834419_Interface: IAppointmentCalendarCancelMeetingRequest.WithDefault by lazy {
    as_673834419()
  }


  public override val __673834419_Ptr: JNAPointer? by lazy {
    __673834419_Interface.__673834419_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__673834419_Interface)

  private fun as_673834419(): IAppointmentCalendarCancelMeetingRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarCancelMeetingRequest.ABI.makeIAppointmentCalendarCancelMeetingRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarCancelMeetingRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarCancelMeetingRequest.ABI.makeIAppointmentCalendarCancelMeetingRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarCancelMeetingRequest> {
    public override fun getValue() = AppointmentCalendarCancelMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarCancelMeetingRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarCancelMeetingRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarCancelMeetingRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarCancelMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarCancelMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
