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

@ABIMarker(AppointmentStoreChange.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStoreChange;{a5a6e035-0a33-3654-8463-b543e90c3b79})")
@WinRTByReference(brClass = AppointmentStoreChange.ByReference::class)
public class AppointmentStoreChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStoreChange.WithDefault, IAppointmentStoreChange2.WithDefault,
    IWinRTObject {
  private val __2110380605_Interface: IAppointmentStoreChange.WithDefault by lazy {
    as_2110380605()
  }


  private val __997289365_Interface: IAppointmentStoreChange2.WithDefault by lazy {
    as_997289365()
  }


  public override val __2110380605_Ptr: JNAPointer? by lazy {
    __2110380605_Interface.__2110380605_Ptr
  }


  public override val __997289365_Ptr: JNAPointer? by lazy {
    __997289365_Interface.__997289365_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2110380605_Interface, __997289365_Interface)

  private fun as_2110380605(): IAppointmentStoreChange.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChange.ABI.makeIAppointmentStoreChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChange.ABI.makeIAppointmentStoreChange(ref.value))
  }

  private fun as_997289365(): IAppointmentStoreChange2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChange2.ABI.makeIAppointmentStoreChange2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChange2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChange2.ABI.makeIAppointmentStoreChange2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStoreChange> {
    public override fun getValue() = AppointmentStoreChange(pointer.getPointer(0))

    public fun setValue(value: AppointmentStoreChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStoreChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentStoreChange {
      val address = segment.toRawLongValue()
      return AppointmentStoreChange(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStoreChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
