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

@ABIMarker(AppointmentCalendarSyncManagerSyncRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarSyncManagerSyncRequest;{12ab382b-7163-4a56-9a4e-7223a84adf46})")
@WinRTByReference(brClass = AppointmentCalendarSyncManagerSyncRequest.ByReference::class)
public class AppointmentCalendarSyncManagerSyncRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarSyncManagerSyncRequest.WithDefault, IWinRTObject {
  private val __106865953_Interface: IAppointmentCalendarSyncManagerSyncRequest.WithDefault by
      lazy {
    as_106865953()
  }


  public override val __106865953_Ptr: JNAPointer? by lazy {
    __106865953_Interface.__106865953_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__106865953_Interface)

  private fun as_106865953(): IAppointmentCalendarSyncManagerSyncRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarSyncManagerSyncRequest.ABI.makeIAppointmentCalendarSyncManagerSyncRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarSyncManagerSyncRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarSyncManagerSyncRequest.ABI.makeIAppointmentCalendarSyncManagerSyncRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarSyncManagerSyncRequest> {
    public override fun getValue() =
        AppointmentCalendarSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarSyncManagerSyncRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarSyncManagerSyncRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
