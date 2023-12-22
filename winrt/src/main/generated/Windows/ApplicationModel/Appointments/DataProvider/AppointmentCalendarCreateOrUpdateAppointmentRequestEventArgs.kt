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

@ABIMarker(AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs;{cf8ded28-002e-4bf7-8e9d-5e20d49aa3ba})")
@WinRTByReference(brClass =
    AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ByReference::class)
public class AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.WithDefault,
    IWinRTObject {
  private val __372051904_Interface:
      IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.WithDefault by lazy {
    as_372051904()
  }


  public override val __372051904_Ptr: JNAPointer? by lazy {
    __372051904_Interface.__372051904_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__372051904_Interface)

  private fun as_372051904():
      IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs> {
    public override fun getValue() =
        AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
