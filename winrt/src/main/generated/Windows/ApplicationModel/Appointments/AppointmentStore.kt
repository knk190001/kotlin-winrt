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

@ABIMarker(AppointmentStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStore;{a461918c-7a47-4d96-96c9-15cd8a05a735})")
@WinRTByReference(brClass = AppointmentStore.ByReference::class)
public class AppointmentStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStore.WithDefault, IAppointmentStore2.WithDefault,
    IAppointmentStore3.WithDefault, IWinRTObject {
  private val __773230547_Interface: IAppointmentStore.WithDefault by lazy {
    as_773230547()
  }


  private val __1799656869_Interface: IAppointmentStore2.WithDefault by lazy {
    as_1799656869()
  }


  private val __1799656870_Interface: IAppointmentStore3.WithDefault by lazy {
    as_1799656870()
  }


  public override val __773230547_Ptr: JNAPointer? by lazy {
    __773230547_Interface.__773230547_Ptr
  }


  public override val __1799656869_Ptr: JNAPointer? by lazy {
    __1799656869_Interface.__1799656869_Ptr
  }


  public override val __1799656870_Ptr: JNAPointer? by lazy {
    __1799656870_Interface.__1799656870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__773230547_Interface, __1799656869_Interface, __1799656870_Interface)

  private fun as_773230547(): IAppointmentStore.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStore.ABI.makeIAppointmentStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStore.ABI.makeIAppointmentStore(ref.value))
  }

  private fun as_1799656869(): IAppointmentStore2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStore2.ABI.makeIAppointmentStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStore2.ABI.makeIAppointmentStore2(ref.value))
  }

  private fun as_1799656870(): IAppointmentStore3.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStore3.ABI.makeIAppointmentStore3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStore3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStore3.ABI.makeIAppointmentStore3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStore> {
    public override fun getValue() = AppointmentStore(pointer.getPointer(0))

    public fun setValue(value: AppointmentStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentStore {
      val address = segment.toRawLongValue()
      return AppointmentStore(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
