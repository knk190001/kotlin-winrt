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

@ABIMarker(AppointmentConflictResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentConflictResult;{d5cdf0be-2f2f-3b7d-af0a-a7e20f3a46e3})")
@WinRTByReference(brClass = AppointmentConflictResult.ByReference::class)
public class AppointmentConflictResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentConflictResult.WithDefault, IWinRTObject {
  private val __1040893757_Interface: IAppointmentConflictResult.WithDefault by lazy {
    as_1040893757()
  }


  public override val __1040893757_Ptr: JNAPointer? by lazy {
    __1040893757_Interface.__1040893757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1040893757_Interface)

  private fun as_1040893757(): IAppointmentConflictResult.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentConflictResult.ABI.makeIAppointmentConflictResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentConflictResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentConflictResult.ABI.makeIAppointmentConflictResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentConflictResult> {
    public override fun getValue() = AppointmentConflictResult(pointer.getPointer(0))

    public fun setValue(value: AppointmentConflictResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentConflictResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentConflictResult {
      val address = segment.toRawLongValue()
      return AppointmentConflictResult(Pointer(address))
    }

    public override fun toNative(obj: AppointmentConflictResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
