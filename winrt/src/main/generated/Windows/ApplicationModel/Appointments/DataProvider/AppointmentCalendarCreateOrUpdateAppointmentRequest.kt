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

@ABIMarker(AppointmentCalendarCreateOrUpdateAppointmentRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarCreateOrUpdateAppointmentRequest;{2e62f2b2-ca96-48ac-9124-406b19fefa70})")
@WinRTByReference(brClass = AppointmentCalendarCreateOrUpdateAppointmentRequest.ByReference::class)
public class AppointmentCalendarCreateOrUpdateAppointmentRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarCreateOrUpdateAppointmentRequest.WithDefault, IWinRTObject
    {
  private val __1729504407_Interface:
      IAppointmentCalendarCreateOrUpdateAppointmentRequest.WithDefault by lazy {
    as_1729504407()
  }


  public override val __1729504407_Ptr: JNAPointer? by lazy {
    __1729504407_Interface.__1729504407_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1729504407_Interface)

  private fun as_1729504407(): IAppointmentCalendarCreateOrUpdateAppointmentRequest.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarCreateOrUpdateAppointmentRequest.ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarCreateOrUpdateAppointmentRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarCreateOrUpdateAppointmentRequest.ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarCreateOrUpdateAppointmentRequest> {
    public override fun getValue() =
        AppointmentCalendarCreateOrUpdateAppointmentRequest(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarCreateOrUpdateAppointmentRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarCreateOrUpdateAppointmentRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarCreateOrUpdateAppointmentRequest {
      val address = segment.toRawLongValue()
      return AppointmentCalendarCreateOrUpdateAppointmentRequest(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarCreateOrUpdateAppointmentRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
