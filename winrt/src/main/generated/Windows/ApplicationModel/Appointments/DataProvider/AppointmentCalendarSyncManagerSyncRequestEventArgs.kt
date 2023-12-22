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

@ABIMarker(AppointmentCalendarSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentCalendarSyncManagerSyncRequestEventArgs;{ca17c6f7-0284-4edd-87ba-4d8f69dcf5c0})")
@WinRTByReference(brClass = AppointmentCalendarSyncManagerSyncRequestEventArgs.ByReference::class)
public class AppointmentCalendarSyncManagerSyncRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarSyncManagerSyncRequestEventArgs.WithDefault, IWinRTObject
    {
  private val __1878291850_Interface:
      IAppointmentCalendarSyncManagerSyncRequestEventArgs.WithDefault by lazy {
    as_1878291850()
  }


  public override val __1878291850_Ptr: JNAPointer? by lazy {
    __1878291850_Interface.__1878291850_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1878291850_Interface)

  private fun as_1878291850(): IAppointmentCalendarSyncManagerSyncRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarSyncManagerSyncRequestEventArgs.ABI.makeIAppointmentCalendarSyncManagerSyncRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarSyncManagerSyncRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarSyncManagerSyncRequestEventArgs.ABI.makeIAppointmentCalendarSyncManagerSyncRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        AppointmentCalendarSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarSyncManagerSyncRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentCalendarSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentCalendarSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarSyncManagerSyncRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
