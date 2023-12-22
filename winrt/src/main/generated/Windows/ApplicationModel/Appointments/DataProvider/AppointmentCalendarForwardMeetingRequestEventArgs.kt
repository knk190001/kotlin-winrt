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

@ABIMarker(AppointmentCalendarForwardMeetingRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarForwardMeetingRequestEventArgs;{3109151a-23a2-42fd-9c82-c9a60d59f8a8})")
@WinRTByReference(brClass = AppointmentCalendarForwardMeetingRequestEventArgs.ByReference::class)
public class AppointmentCalendarForwardMeetingRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarForwardMeetingRequestEventArgs.WithDefault, IWinRTObject {
  private val __1851333827_Interface: IAppointmentCalendarForwardMeetingRequestEventArgs.WithDefault
      by lazy {
    as_1851333827()
  }


  public override val __1851333827_Ptr: JNAPointer? by lazy {
    __1851333827_Interface.__1851333827_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1851333827_Interface)

  private fun as_1851333827(): IAppointmentCalendarForwardMeetingRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarForwardMeetingRequestEventArgs.ABI.makeIAppointmentCalendarForwardMeetingRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarForwardMeetingRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarForwardMeetingRequestEventArgs.ABI.makeIAppointmentCalendarForwardMeetingRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarForwardMeetingRequestEventArgs> {
    public override fun getValue() =
        AppointmentCalendarForwardMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarForwardMeetingRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarForwardMeetingRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarForwardMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentCalendarForwardMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarForwardMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
