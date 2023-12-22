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

@ABIMarker(AppointmentInvitee.ABI::class)
@Signature("rc(Windows.ApplicationModel.Appointments.AppointmentInvitee;{13bf0796-9842-495b-b0e7-ef8f79c0701d})")
@WinRTByReference(brClass = AppointmentInvitee.ByReference::class)
public class AppointmentInvitee(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentInvitee.WithDefault, IAppointmentParticipant.WithDefault,
    IWinRTObject {
  private val __495876408_Interface: IAppointmentInvitee.WithDefault by lazy {
    as_495876408()
  }


  private val __880852351_Interface: IAppointmentParticipant.WithDefault by lazy {
    as_880852351()
  }


  public override val __495876408_Ptr: JNAPointer? by lazy {
    __495876408_Interface.__495876408_Ptr
  }


  public override val __880852351_Ptr: JNAPointer? by lazy {
    __880852351_Interface.__880852351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__495876408_Interface, __880852351_Interface)

  public constructor() : this(ABI.activate())

  private fun as_495876408(): IAppointmentInvitee.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentInvitee.ABI.makeIAppointmentInvitee(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentInvitee>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentInvitee.ABI.makeIAppointmentInvitee(ref.value))
  }

  private fun as_880852351(): IAppointmentParticipant.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentParticipant.ABI.makeIAppointmentParticipant(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentParticipant>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentParticipant.ABI.makeIAppointmentParticipant(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppointmentInvitee> {
    public override fun getValue() = AppointmentInvitee(pointer.getPointer(0))

    public fun setValue(value: AppointmentInvitee): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentInvitee, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Appointments.AppointmentInvitee".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AppointmentInvitee {
      val address = segment.toRawLongValue()
      return AppointmentInvitee(Pointer(address))
    }

    public override fun toNative(obj: AppointmentInvitee): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
