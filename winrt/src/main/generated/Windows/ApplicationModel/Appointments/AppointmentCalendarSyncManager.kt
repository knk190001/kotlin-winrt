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

@ABIMarker(AppointmentCalendarSyncManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentCalendarSyncManager;{2b21b3a0-4aff-4392-bc5f-5645ffcffb17})")
@WinRTByReference(brClass = AppointmentCalendarSyncManager.ByReference::class)
public class AppointmentCalendarSyncManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentCalendarSyncManager.WithDefault,
    IAppointmentCalendarSyncManager2.WithDefault, IWinRTObject {
  private val __466359488_Interface: IAppointmentCalendarSyncManager.WithDefault by lazy {
    as_466359488()
  }


  private val __1572242290_Interface: IAppointmentCalendarSyncManager2.WithDefault by lazy {
    as_1572242290()
  }


  public override val __466359488_Ptr: JNAPointer? by lazy {
    __466359488_Interface.__466359488_Ptr
  }


  public override val __1572242290_Ptr: JNAPointer? by lazy {
    __1572242290_Interface.__1572242290_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__466359488_Interface, __1572242290_Interface)

  private fun as_466359488(): IAppointmentCalendarSyncManager.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarSyncManager.ABI.makeIAppointmentCalendarSyncManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarSyncManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarSyncManager.ABI.makeIAppointmentCalendarSyncManager(ref.value))
  }

  private fun as_1572242290(): IAppointmentCalendarSyncManager2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentCalendarSyncManager2.ABI.makeIAppointmentCalendarSyncManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentCalendarSyncManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentCalendarSyncManager2.ABI.makeIAppointmentCalendarSyncManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentCalendarSyncManager> {
    public override fun getValue() = AppointmentCalendarSyncManager(pointer.getPointer(0))

    public fun setValue(value: AppointmentCalendarSyncManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentCalendarSyncManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentCalendarSyncManager {
      val address = segment.toRawLongValue()
      return AppointmentCalendarSyncManager(Pointer(address))
    }

    public override fun toNative(obj: AppointmentCalendarSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
