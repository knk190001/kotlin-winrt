package Windows.ApplicationModel.Appointments

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

@ABIMarker(AppointmentStoreNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStoreNotificationTriggerDetails;{9b33cb11-c301-421e-afef-047ecfa76adb})")
@WinRTByReference(brClass = AppointmentStoreNotificationTriggerDetails.ByReference::class)
public class AppointmentStoreNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStoreNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __523390654_Interface: IAppointmentStoreNotificationTriggerDetails.WithDefault by
      lazy {
    as_523390654()
  }


  public override val __523390654_Ptr: JNAPointer? by lazy {
    __523390654_Interface.__523390654_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__523390654_Interface)

  private fun as_523390654(): IAppointmentStoreNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreNotificationTriggerDetails.ABI.makeIAppointmentStoreNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreNotificationTriggerDetails.ABI.makeIAppointmentStoreNotificationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStoreNotificationTriggerDetails> {
    public override fun getValue() =
        AppointmentStoreNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: AppointmentStoreNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStoreNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentStoreNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return AppointmentStoreNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStoreNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
