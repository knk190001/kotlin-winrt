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

@ABIMarker(AppointmentCalendarUpdateMeetingResponseRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarUpdateMeetingResponseRequest;{a36d608c-c29d-4b94-b086-7e9ff7bd84a0})")
@WinRTByReference(brClass = AppointmentCalendarUpdateMeetingResponseRequest.ByReference::class)
public class AppointmentCalendarUpdateMeetingResponseRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarUpdateMeetingResponseRequest.WithDefault, IWinRTObject {
  private val __399918629_Interface: IAppointmentCalendarUpdateMeetingResponseRequest.WithDefault by
      lazy {
    as_399918629()
  }


  public override val __399918629_Ptr: JNAPointer? by lazy {
    __399918629_Interface.__399918629_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__399918629_Interface)

  private fun as_399918629(): IAppointmentCalendarUpdateMeetingResponseRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarUpdateMeetingResponseRequest.ABI.makeIAppointmentCalendarUpdateMeetingResponseRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarUpdateMeetingResponseRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarUpdateMeetingResponseRequest.ABI.makeIAppointmentCalendarUpdateMeetingResponseRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarUpdateMeetingResponseRequest> {
    public override fun getValue() =
        AppointmentCalendarUpdateMeetingResponseRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarUpdateMeetingResponseRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarUpdateMeetingResponseRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarUpdateMeetingResponseRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarUpdateMeetingResponseRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarUpdateMeetingResponseRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
