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

@ABIMarker(AppointmentDataProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentDataProviderTriggerDetails;{b3283c01-7e12-4e5e-b1ef-74fb68ac6f2a})")
@WinRTByReference(brClass = AppointmentDataProviderTriggerDetails.ByReference::class)
public class AppointmentDataProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentDataProviderTriggerDetails.WithDefault, IWinRTObject {
  private val __2095831878_Interface: IAppointmentDataProviderTriggerDetails.WithDefault by lazy {
    as_2095831878()
  }


  public override val __2095831878_Ptr: JNAPointer? by lazy {
    __2095831878_Interface.__2095831878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2095831878_Interface)

  private fun as_2095831878(): IAppointmentDataProviderTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentDataProviderTriggerDetails.ABI.makeIAppointmentDataProviderTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentDataProviderTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentDataProviderTriggerDetails.ABI.makeIAppointmentDataProviderTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentDataProviderTriggerDetails> {
    public override fun getValue() = AppointmentDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: AppointmentDataProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentDataProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return AppointmentDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: AppointmentDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
