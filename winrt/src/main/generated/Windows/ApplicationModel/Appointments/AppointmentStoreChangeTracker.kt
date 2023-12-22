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

@ABIMarker(AppointmentStoreChangeTracker.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStoreChangeTracker;{1b25f4b1-8ece-4f17-93c8-e6412458fd5c})")
@WinRTByReference(brClass = AppointmentStoreChangeTracker.ByReference::class)
public class AppointmentStoreChangeTracker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStoreChangeTracker.WithDefault,
    IAppointmentStoreChangeTracker2.WithDefault, IWinRTObject {
  private val __1030879685_Interface: IAppointmentStoreChangeTracker.WithDefault by lazy {
    as_1030879685()
  }


  private val __1892499113_Interface: IAppointmentStoreChangeTracker2.WithDefault by lazy {
    as_1892499113()
  }


  public override val __1030879685_Ptr: JNAPointer? by lazy {
    __1030879685_Interface.__1030879685_Ptr
  }


  public override val __1892499113_Ptr: JNAPointer? by lazy {
    __1892499113_Interface.__1892499113_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1030879685_Interface, __1892499113_Interface)

  private fun as_1030879685(): IAppointmentStoreChangeTracker.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChangeTracker.ABI.makeIAppointmentStoreChangeTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChangeTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChangeTracker.ABI.makeIAppointmentStoreChangeTracker(ref.value))
  }

  private fun as_1892499113(): IAppointmentStoreChangeTracker2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChangeTracker2.ABI.makeIAppointmentStoreChangeTracker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChangeTracker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChangeTracker2.ABI.makeIAppointmentStoreChangeTracker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStoreChangeTracker> {
    public override fun getValue() = AppointmentStoreChangeTracker(pointer.getPointer(0))

    public fun setValue(value: AppointmentStoreChangeTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStoreChangeTracker, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentStoreChangeTracker {
      val address = segment.toRawLongValue()
      return AppointmentStoreChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStoreChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
