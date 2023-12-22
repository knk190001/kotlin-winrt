package Windows.ApplicationModel.Appointments

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(AppointmentRecurrence.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentRecurrence;{d87b3e83-15a6-487b-b959-0c361e60e954})")
@WinRTByReference(brClass = AppointmentRecurrence.ByReference::class)
public class AppointmentRecurrence(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentRecurrence.WithDefault, IAppointmentRecurrence2.WithDefault,
    IAppointmentRecurrence3.WithDefault, IWinRTObject {
  private val __1681632412_Interface: IAppointmentRecurrence.WithDefault by lazy {
    as_1681632412()
  }


  private val __590997170_Interface: IAppointmentRecurrence2.WithDefault by lazy {
    as_590997170()
  }


  private val __590997169_Interface: IAppointmentRecurrence3.WithDefault by lazy {
    as_590997169()
  }


  public override val __1681632412_Ptr: JNAPointer? by lazy {
    __1681632412_Interface.__1681632412_Ptr
  }


  public override val __590997170_Ptr: JNAPointer? by lazy {
    __590997170_Interface.__590997170_Ptr
  }


  public override val __590997169_Ptr: JNAPointer? by lazy {
    __590997169_Interface.__590997169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1681632412_Interface, __590997170_Interface, __590997169_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1681632412(): IAppointmentRecurrence.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentRecurrence.ABI.makeIAppointmentRecurrence(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentRecurrence>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentRecurrence.ABI.makeIAppointmentRecurrence(ref.value))
  }

  private fun as_590997170(): IAppointmentRecurrence2.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentRecurrence2.ABI.makeIAppointmentRecurrence2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentRecurrence2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentRecurrence2.ABI.makeIAppointmentRecurrence2(ref.value))
  }

  private fun as_590997169(): IAppointmentRecurrence3.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentRecurrence3.ABI.makeIAppointmentRecurrence3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentRecurrence3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentRecurrence3.ABI.makeIAppointmentRecurrence3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentRecurrence> {
    public override fun getValue() = AppointmentRecurrence(pointer.getPointer(0))

    public fun setValue(value: AppointmentRecurrence): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentRecurrence, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentRecurrence".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): AppointmentRecurrence {
      val address = segment.toRawLongValue()
      return AppointmentRecurrence(Pointer(address))
    }

    public override fun toNative(obj: AppointmentRecurrence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
