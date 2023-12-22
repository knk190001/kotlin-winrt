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

@ABIMarker(AppointmentStoreChangeReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStoreChangeReader;{8b2409f1-65f3-42a0-961d-4c209bf30370})")
@WinRTByReference(brClass = AppointmentStoreChangeReader.ByReference::class)
public class AppointmentStoreChangeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStoreChangeReader.WithDefault, IWinRTObject {
  private val __2114239840_Interface: IAppointmentStoreChangeReader.WithDefault by lazy {
    as_2114239840()
  }


  public override val __2114239840_Ptr: JNAPointer? by lazy {
    __2114239840_Interface.__2114239840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2114239840_Interface)

  private fun as_2114239840(): IAppointmentStoreChangeReader.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChangeReader.ABI.makeIAppointmentStoreChangeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChangeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChangeReader.ABI.makeIAppointmentStoreChangeReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStoreChangeReader> {
    public override fun getValue() = AppointmentStoreChangeReader(pointer.getPointer(0))

    public fun setValue(value: AppointmentStoreChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStoreChangeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentStoreChangeReader {
      val address = segment.toRawLongValue()
      return AppointmentStoreChangeReader(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStoreChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
