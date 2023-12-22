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

@ABIMarker(Appointment.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.Appointment;{dd002f2f-2bdd-4076-90a3-22c275312965})")
@WinRTByReference(brClass = Appointment.ByReference::class)
public class Appointment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointment.WithDefault, IAppointment2.WithDefault,
    IAppointment3.WithDefault, IWinRTObject {
  private val __815880940_Interface: IAppointment.WithDefault by lazy {
    as_815880940()
  }


  private val __477494686_Interface: IAppointment2.WithDefault by lazy {
    as_477494686()
  }


  private val __477494687_Interface: IAppointment3.WithDefault by lazy {
    as_477494687()
  }


  public override val __815880940_Ptr: JNAPointer? by lazy {
    __815880940_Interface.__815880940_Ptr
  }


  public override val __477494686_Ptr: JNAPointer? by lazy {
    __477494686_Interface.__477494686_Ptr
  }


  public override val __477494687_Ptr: JNAPointer? by lazy {
    __477494687_Interface.__477494687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__815880940_Interface, __477494686_Interface, __477494687_Interface)

  public constructor() : this(ABI.activate())

  private fun as_815880940(): IAppointment.WithDefault {
    if(pointer == NULL) {
      return(IAppointment.ABI.makeIAppointment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointment.ABI.makeIAppointment(ref.value))
  }

  private fun as_477494686(): IAppointment2.WithDefault {
    if(pointer == NULL) {
      return(IAppointment2.ABI.makeIAppointment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointment2.ABI.makeIAppointment2(ref.value))
  }

  private fun as_477494687(): IAppointment3.WithDefault {
    if(pointer == NULL) {
      return(IAppointment3.ABI.makeIAppointment3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointment3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointment3.ABI.makeIAppointment3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Appointment> {
    public override fun getValue() = Appointment(pointer.getPointer(0))

    public fun setValue(value: Appointment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Appointment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.Appointment".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Appointment {
      val address = segment.toRawLongValue()
      return Appointment(Pointer(address))
    }

    public override fun toNative(obj: Appointment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
