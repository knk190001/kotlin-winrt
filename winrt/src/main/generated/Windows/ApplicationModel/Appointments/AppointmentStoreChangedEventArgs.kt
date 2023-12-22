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

@ABIMarker(AppointmentStoreChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs;{2285f8b9-0791-417e-bfea-cc6d41636c8c})")
@WinRTByReference(brClass = AppointmentStoreChangedEventArgs.ByReference::class)
public class AppointmentStoreChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentStoreChangedEventArgs.WithDefault, IWinRTObject {
  private val __1220993904_Interface: IAppointmentStoreChangedEventArgs.WithDefault by lazy {
    as_1220993904()
  }


  public override val __1220993904_Ptr: JNAPointer? by lazy {
    __1220993904_Interface.__1220993904_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1220993904_Interface)

  private fun as_1220993904(): IAppointmentStoreChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentStoreChangedEventArgs.ABI.makeIAppointmentStoreChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentStoreChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentStoreChangedEventArgs.ABI.makeIAppointmentStoreChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentStoreChangedEventArgs> {
    public override fun getValue() = AppointmentStoreChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentStoreChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentStoreChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppointmentStoreChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentStoreChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentStoreChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
