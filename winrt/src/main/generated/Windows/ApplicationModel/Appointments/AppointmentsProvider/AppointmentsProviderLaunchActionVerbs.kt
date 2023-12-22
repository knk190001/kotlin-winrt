package Windows.ApplicationModel.Appointments.AppointmentsProvider

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

@ABIMarker(AppointmentsProviderLaunchActionVerbs.ABI::class)
@WinRTByReference(brClass = AppointmentsProviderLaunchActionVerbs.ByReference::class)
public class AppointmentsProviderLaunchActionVerbs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentsProviderLaunchActionVerbs> {
    public override fun getValue() = AppointmentsProviderLaunchActionVerbs(pointer.getPointer(0))

    public fun setValue(value: AppointmentsProviderLaunchActionVerbs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentsProviderLaunchActionVerbs, MemoryAddress> {
    public val IAppointmentsProviderLaunchActionVerbsStatics2_Instance:
        IAppointmentsProviderLaunchActionVerbsStatics2 by lazy {
      createIAppointmentsProviderLaunchActionVerbsStatics2()
    }


    public val IAppointmentsProviderLaunchActionVerbsStatics_Instance:
        IAppointmentsProviderLaunchActionVerbsStatics by lazy {
      createIAppointmentsProviderLaunchActionVerbsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppointmentsProviderLaunchActionVerbsStatics2():
        IAppointmentsProviderLaunchActionVerbsStatics2 {
      val refiid = Guid.REFIID(IAppointmentsProviderLaunchActionVerbsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentsProviderLaunchActionVerbsStatics2.ABI.makeIAppointmentsProviderLaunchActionVerbsStatics2(interfacePtr.value)
      return result
    }

    public fun createIAppointmentsProviderLaunchActionVerbsStatics():
        IAppointmentsProviderLaunchActionVerbsStatics {
      val refiid = Guid.REFIID(IAppointmentsProviderLaunchActionVerbsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs".toHandle(),refiid,interfacePtr)
      val result =
          IAppointmentsProviderLaunchActionVerbsStatics.ABI.makeIAppointmentsProviderLaunchActionVerbsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppointmentsProviderLaunchActionVerbs {
      val address = segment.toRawLongValue()
      return AppointmentsProviderLaunchActionVerbs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentsProviderLaunchActionVerbs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShowAppointmentDetails() =
        ABI.IAppointmentsProviderLaunchActionVerbsStatics2_Instance.get_ShowAppointmentDetails()

    public fun get_AddAppointment() =
        ABI.IAppointmentsProviderLaunchActionVerbsStatics_Instance.get_AddAppointment()

    public fun get_ReplaceAppointment() =
        ABI.IAppointmentsProviderLaunchActionVerbsStatics_Instance.get_ReplaceAppointment()

    public fun get_RemoveAppointment() =
        ABI.IAppointmentsProviderLaunchActionVerbsStatics_Instance.get_RemoveAppointment()

    public fun get_ShowTimeFrame() =
        ABI.IAppointmentsProviderLaunchActionVerbsStatics_Instance.get_ShowTimeFrame()
  }
}
