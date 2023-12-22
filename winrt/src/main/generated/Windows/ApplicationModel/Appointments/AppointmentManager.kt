package Windows.ApplicationModel.Appointments

import Windows.Foundation.DateTime
import Windows.Foundation.Rect
import Windows.Foundation.TimeSpan
import Windows.System.User
import Windows.UI.Popups.Placement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppointmentManager.ABI::class)
@WinRTByReference(brClass = AppointmentManager.ByReference::class)
public class AppointmentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentManager> {
    public override fun getValue() = AppointmentManager(pointer.getPointer(0))

    public fun setValue(value: AppointmentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentManager, MemoryAddress> {
    public val IAppointmentManagerStatics2_Instance: IAppointmentManagerStatics2 by lazy {
      createIAppointmentManagerStatics2()
    }


    public val IAppointmentManagerStatics3_Instance: IAppointmentManagerStatics3 by lazy {
      createIAppointmentManagerStatics3()
    }


    public val IAppointmentManagerStatics_Instance: IAppointmentManagerStatics by lazy {
      createIAppointmentManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppointmentManagerStatics2(): IAppointmentManagerStatics2 {
      val refiid = Guid.REFIID(IAppointmentManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentManagerStatics2.ABI.makeIAppointmentManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIAppointmentManagerStatics3(): IAppointmentManagerStatics3 {
      val refiid = Guid.REFIID(IAppointmentManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentManagerStatics3.ABI.makeIAppointmentManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIAppointmentManagerStatics(): IAppointmentManagerStatics {
      val refiid = Guid.REFIID(IAppointmentManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentManager".toHandle(),refiid,interfacePtr)
      val result = IAppointmentManagerStatics.ABI.makeIAppointmentManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppointmentManager {
      val address = segment.toRawLongValue()
      return AppointmentManager(Pointer(address))
    }

    public override fun toNative(obj: AppointmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowAppointmentDetailsAsync(appointmentId: String) =
        ABI.IAppointmentManagerStatics2_Instance.ShowAppointmentDetailsAsync(appointmentId)

    public fun ShowAppointmentDetailsAsync(appointmentId: String, instanceStartDate: DateTime) =
        ABI.IAppointmentManagerStatics2_Instance.ShowAppointmentDetailsAsync(appointmentId,
        instanceStartDate)

    public fun ShowEditNewAppointmentAsync(appointment: Appointment) =
        ABI.IAppointmentManagerStatics2_Instance.ShowEditNewAppointmentAsync(appointment)

    public fun RequestStoreAsync(options: AppointmentStoreAccessType) =
        ABI.IAppointmentManagerStatics2_Instance.RequestStoreAsync(options)

    public fun GetForUser(user: User) = ABI.IAppointmentManagerStatics3_Instance.GetForUser(user)

    public fun ShowAddAppointmentAsync(appointment: Appointment, selection: Rect) =
        ABI.IAppointmentManagerStatics_Instance.ShowAddAppointmentAsync(appointment, selection)

    public fun ShowAddAppointmentAsync(
      appointment: Appointment,
      selection: Rect,
      preferredPlacement: Placement
    ) = ABI.IAppointmentManagerStatics_Instance.ShowAddAppointmentAsync(appointment, selection,
        preferredPlacement)

    public fun ShowReplaceAppointmentAsync(
      appointmentId: String,
      appointment: Appointment,
      selection: Rect
    ) = ABI.IAppointmentManagerStatics_Instance.ShowReplaceAppointmentAsync(appointmentId,
        appointment, selection)

    public fun ShowReplaceAppointmentAsync(
      appointmentId: String,
      appointment: Appointment,
      selection: Rect,
      preferredPlacement: Placement
    ) = ABI.IAppointmentManagerStatics_Instance.ShowReplaceAppointmentAsync(appointmentId,
        appointment, selection, preferredPlacement)

    public fun ShowReplaceAppointmentAsync(
      appointmentId: String,
      appointment: Appointment,
      selection: Rect,
      preferredPlacement: Placement,
      instanceStartDate: DateTime
    ) = ABI.IAppointmentManagerStatics_Instance.ShowReplaceAppointmentAsync(appointmentId,
        appointment, selection, preferredPlacement, instanceStartDate)

    public fun ShowRemoveAppointmentAsync(appointmentId: String, selection: Rect) =
        ABI.IAppointmentManagerStatics_Instance.ShowRemoveAppointmentAsync(appointmentId, selection)

    public fun ShowRemoveAppointmentAsync(
      appointmentId: String,
      selection: Rect,
      preferredPlacement: Placement
    ) = ABI.IAppointmentManagerStatics_Instance.ShowRemoveAppointmentAsync(appointmentId, selection,
        preferredPlacement)

    public fun ShowRemoveAppointmentAsync(
      appointmentId: String,
      selection: Rect,
      preferredPlacement: Placement,
      instanceStartDate: DateTime
    ) = ABI.IAppointmentManagerStatics_Instance.ShowRemoveAppointmentAsync(appointmentId, selection,
        preferredPlacement, instanceStartDate)

    public fun ShowTimeFrameAsync(timeToShow: DateTime, duration: TimeSpan) =
        ABI.IAppointmentManagerStatics_Instance.ShowTimeFrameAsync(timeToShow, duration)
  }
}
