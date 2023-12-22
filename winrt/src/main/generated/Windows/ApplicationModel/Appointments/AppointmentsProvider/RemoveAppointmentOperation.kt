package Windows.ApplicationModel.Appointments.AppointmentsProvider

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

@ABIMarker(RemoveAppointmentOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation;{08b66aba-fe33-46cd-a50c-a8ffb3260537})")
@WinRTByReference(brClass = RemoveAppointmentOperation.ByReference::class)
public class RemoveAppointmentOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoveAppointmentOperation.WithDefault, IWinRTObject {
  private val __1012522784_Interface: IRemoveAppointmentOperation.WithDefault by lazy {
    as_1012522784()
  }


  public override val __1012522784_Ptr: JNAPointer? by lazy {
    __1012522784_Interface.__1012522784_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1012522784_Interface)

  private fun as_1012522784(): IRemoveAppointmentOperation.WithDefault {
    if(pointer == NULL) {
      return(IRemoveAppointmentOperation.ABI.makeIRemoveAppointmentOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoveAppointmentOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoveAppointmentOperation.ABI.makeIRemoveAppointmentOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoveAppointmentOperation> {
    public override fun getValue() = RemoveAppointmentOperation(pointer.getPointer(0))

    public fun setValue(value: RemoveAppointmentOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoveAppointmentOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoveAppointmentOperation {
      val address = segment.toRawLongValue()
      return RemoveAppointmentOperation(Pointer(address))
    }

    public override fun toNative(obj: RemoveAppointmentOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
