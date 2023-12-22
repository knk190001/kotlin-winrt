package Windows.ApplicationModel.Appointments

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppointmentProperties.ABI::class)
@WinRTByReference(brClass = AppointmentProperties.ByReference::class)
public class AppointmentProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentProperties> {
    public override fun getValue() = AppointmentProperties(pointer.getPointer(0))

    public fun setValue(value: AppointmentProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentProperties, MemoryAddress> {
    public val IAppointmentPropertiesStatics_Instance: IAppointmentPropertiesStatics by lazy {
      createIAppointmentPropertiesStatics()
    }


    public val IAppointmentPropertiesStatics2_Instance: IAppointmentPropertiesStatics2 by lazy {
      createIAppointmentPropertiesStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppointmentPropertiesStatics(): IAppointmentPropertiesStatics {
      val refiid = Guid.REFIID(IAppointmentPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentPropertiesStatics.ABI.makeIAppointmentPropertiesStatics(interfacePtr.value)
      return result
    }

    public fun createIAppointmentPropertiesStatics2(): IAppointmentPropertiesStatics2 {
      val refiid = Guid.REFIID(IAppointmentPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentPropertiesStatics2.ABI.makeIAppointmentPropertiesStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppointmentProperties {
      val address = segment.toRawLongValue()
      return AppointmentProperties(Pointer(address))
    }

    public override fun toNative(obj: AppointmentProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Subject() = ABI.IAppointmentPropertiesStatics_Instance.get_Subject()

    public fun get_Location() = ABI.IAppointmentPropertiesStatics_Instance.get_Location()

    public fun get_StartTime() = ABI.IAppointmentPropertiesStatics_Instance.get_StartTime()

    public fun get_Duration() = ABI.IAppointmentPropertiesStatics_Instance.get_Duration()

    public fun get_Reminder() = ABI.IAppointmentPropertiesStatics_Instance.get_Reminder()

    public fun get_BusyStatus() = ABI.IAppointmentPropertiesStatics_Instance.get_BusyStatus()

    public fun get_Sensitivity() = ABI.IAppointmentPropertiesStatics_Instance.get_Sensitivity()

    public fun get_OriginalStartTime() =
        ABI.IAppointmentPropertiesStatics_Instance.get_OriginalStartTime()

    public fun get_IsResponseRequested() =
        ABI.IAppointmentPropertiesStatics_Instance.get_IsResponseRequested()

    public fun get_AllowNewTimeProposal() =
        ABI.IAppointmentPropertiesStatics_Instance.get_AllowNewTimeProposal()

    public fun get_AllDay() = ABI.IAppointmentPropertiesStatics_Instance.get_AllDay()

    public fun get_Details() = ABI.IAppointmentPropertiesStatics_Instance.get_Details()

    public fun get_OnlineMeetingLink() =
        ABI.IAppointmentPropertiesStatics_Instance.get_OnlineMeetingLink()

    public fun get_ReplyTime() = ABI.IAppointmentPropertiesStatics_Instance.get_ReplyTime()

    public fun get_Organizer() = ABI.IAppointmentPropertiesStatics_Instance.get_Organizer()

    public fun get_UserResponse() = ABI.IAppointmentPropertiesStatics_Instance.get_UserResponse()

    public fun get_HasInvitees() = ABI.IAppointmentPropertiesStatics_Instance.get_HasInvitees()

    public fun get_IsCanceledMeeting() =
        ABI.IAppointmentPropertiesStatics_Instance.get_IsCanceledMeeting()

    public fun get_IsOrganizedByUser() =
        ABI.IAppointmentPropertiesStatics_Instance.get_IsOrganizedByUser()

    public fun get_Recurrence() = ABI.IAppointmentPropertiesStatics_Instance.get_Recurrence()

    public fun get_Uri() = ABI.IAppointmentPropertiesStatics_Instance.get_Uri()

    public fun get_Invitees() = ABI.IAppointmentPropertiesStatics_Instance.get_Invitees()

    public fun get_DefaultProperties() =
        ABI.IAppointmentPropertiesStatics_Instance.get_DefaultProperties()

    public fun get_ChangeNumber() = ABI.IAppointmentPropertiesStatics2_Instance.get_ChangeNumber()

    public fun get_RemoteChangeNumber() =
        ABI.IAppointmentPropertiesStatics2_Instance.get_RemoteChangeNumber()

    public fun get_DetailsKind() = ABI.IAppointmentPropertiesStatics2_Instance.get_DetailsKind()
  }
}
