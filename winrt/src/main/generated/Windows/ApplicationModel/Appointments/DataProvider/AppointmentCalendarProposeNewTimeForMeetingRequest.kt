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

@ABIMarker(AppointmentCalendarProposeNewTimeForMeetingRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarProposeNewTimeForMeetingRequest;{ce1c63f5-edf6-43c3-82b7-be6b368c6900})")
@WinRTByReference(brClass = AppointmentCalendarProposeNewTimeForMeetingRequest.ByReference::class)
public class AppointmentCalendarProposeNewTimeForMeetingRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarProposeNewTimeForMeetingRequest.WithDefault, IWinRTObject
    {
  private val __408201201_Interface: IAppointmentCalendarProposeNewTimeForMeetingRequest.WithDefault
      by lazy {
    as_408201201()
  }


  public override val __408201201_Ptr: JNAPointer? by lazy {
    __408201201_Interface.__408201201_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__408201201_Interface)

  private fun as_408201201(): IAppointmentCalendarProposeNewTimeForMeetingRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarProposeNewTimeForMeetingRequest.ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarProposeNewTimeForMeetingRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarProposeNewTimeForMeetingRequest.ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarProposeNewTimeForMeetingRequest> {
    public override fun getValue() =
        AppointmentCalendarProposeNewTimeForMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarProposeNewTimeForMeetingRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarProposeNewTimeForMeetingRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarProposeNewTimeForMeetingRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarProposeNewTimeForMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarProposeNewTimeForMeetingRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
