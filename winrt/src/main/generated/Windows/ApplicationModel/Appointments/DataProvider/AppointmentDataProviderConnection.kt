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

@ABIMarker(AppointmentDataProviderConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.DataProvider.AppointmentDataProviderConnection;{f3dd9d83-3254-465f-abdb-928046552cf4})")
@WinRTByReference(brClass = AppointmentDataProviderConnection.ByReference::class)
public class AppointmentDataProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentDataProviderConnection.WithDefault, IWinRTObject {
  private val __827904698_Interface: IAppointmentDataProviderConnection.WithDefault by lazy {
    as_827904698()
  }


  public override val __827904698_Ptr: JNAPointer? by lazy {
    __827904698_Interface.__827904698_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__827904698_Interface)

  private fun as_827904698(): IAppointmentDataProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentDataProviderConnection.ABI.makeIAppointmentDataProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentDataProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentDataProviderConnection.ABI.makeIAppointmentDataProviderConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentDataProviderConnection> {
    public override fun getValue() = AppointmentDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: AppointmentDataProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentDataProviderConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentDataProviderConnection {
      val address = segment.toRawLongValue()
      return AppointmentDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: AppointmentDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
