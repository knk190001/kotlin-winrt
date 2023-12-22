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

@ABIMarker(AppointmentCalendarForwardMeetingRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarForwardMeetingRequest;{82e5ee56-26b6-4253-8a8f-6cf5f2ff7884})")
@WinRTByReference(brClass = AppointmentCalendarForwardMeetingRequest.ByReference::class)
public class AppointmentCalendarForwardMeetingRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarForwardMeetingRequest.WithDefault, IWinRTObject {
  private val __820117626_Interface: IAppointmentCalendarForwardMeetingRequest.WithDefault by lazy {
    as_820117626()
  }


  public override val __820117626_Ptr: JNAPointer? by lazy {
    __820117626_Interface.__820117626_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__820117626_Interface)

  private fun as_820117626(): IAppointmentCalendarForwardMeetingRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarForwardMeetingRequest.ABI.makeIAppointmentCalendarForwardMeetingRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarForwardMeetingRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarForwardMeetingRequest.ABI.makeIAppointmentCalendarForwardMeetingRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarForwardMeetingRequest> {
    public override fun getValue() = AppointmentCalendarForwardMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarForwardMeetingRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarForwardMeetingRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarForwardMeetingRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarForwardMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarForwardMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
