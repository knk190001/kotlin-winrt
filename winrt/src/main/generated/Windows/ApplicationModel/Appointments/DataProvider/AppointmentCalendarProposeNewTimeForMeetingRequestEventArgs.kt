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

@ABIMarker(AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs;{d2d777d8-fed1-4280-a3ba-2e1f47609aa2})")
@WinRTByReference(brClass =
    AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ByReference::class)
public class AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.WithDefault,
    IWinRTObject {
  private val __1859239096_Interface:
      IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.WithDefault by lazy {
    as_1859239096()
  }


  public override val __1859239096_Ptr: JNAPointer? by lazy {
    __1859239096_Interface.__1859239096_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1859239096_Interface)

  private fun as_1859239096():
      IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs> {
    public override fun getValue() =
        AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarProposeNewTimeForMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
