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

@ABIMarker(AppointmentException.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentException;{a2076767-16f6-4bce-9f5a-8600b8019fcb})")
@WinRTByReference(brClass = AppointmentException.ByReference::class)
public class AppointmentException(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentException.WithDefault, IWinRTObject {
  private val __708197989_Interface: IAppointmentException.WithDefault by lazy {
    as_708197989()
  }


  public override val __708197989_Ptr: JNAPointer? by lazy {
    __708197989_Interface.__708197989_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__708197989_Interface)

  private fun as_708197989(): IAppointmentException.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentException.ABI.makeIAppointmentException(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentException>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentException.ABI.makeIAppointmentException(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentException> {
    public override fun getValue() = AppointmentException(pointer.getPointer(0))

    public fun setValue(value: AppointmentException): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentException, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentException {
      val address = segment.toRawLongValue()
      return AppointmentException(Pointer(address))
    }

    public override fun toNative(obj: AppointmentException): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
