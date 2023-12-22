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

@ABIMarker(AddAppointmentOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation;{ec4a9af3-620d-4c69-add7-9794e918081f})")
@WinRTByReference(brClass = AddAppointmentOperation.ByReference::class)
public class AddAppointmentOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAddAppointmentOperation.WithDefault, IWinRTObject {
  private val __151431573_Interface: IAddAppointmentOperation.WithDefault by lazy {
    as_151431573()
  }


  public override val __151431573_Ptr: JNAPointer? by lazy {
    __151431573_Interface.__151431573_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__151431573_Interface)

  private fun as_151431573(): IAddAppointmentOperation.WithDefault {
    if(pointer == NULL) {
      return(IAddAppointmentOperation.ABI.makeIAddAppointmentOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAddAppointmentOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAddAppointmentOperation.ABI.makeIAddAppointmentOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AddAppointmentOperation> {
    public override fun getValue() = AddAppointmentOperation(pointer.getPointer(0))

    public fun setValue(value: AddAppointmentOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AddAppointmentOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AddAppointmentOperation {
      val address = segment.toRawLongValue()
      return AddAppointmentOperation(Pointer(address))
    }

    public override fun toNative(obj: AddAppointmentOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
