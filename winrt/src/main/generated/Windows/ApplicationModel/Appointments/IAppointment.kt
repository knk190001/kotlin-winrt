package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointment.ABI::class)
@Signature("{dd002f2f-2bdd-4076-90a3-22c275312965}")
@Guid("dd002f2f2bdd407690a322c275312965")
@WinRTInterface("dd002f2f2bdd407690a322c275312965")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointment.ByReference::class)
public interface IAppointment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(1)
  public fun put_StartTime(value: DateTime?): Unit

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_Location(): String?

  @InterfaceMethod(5)
  public fun put_Location(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Subject(): String?

  @InterfaceMethod(7)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Details(): String?

  @InterfaceMethod(9)
  public fun put_Details(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_Reminder(): IReference<TimeSpan?>?

  @InterfaceMethod(11)
  public fun put_Reminder(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(12)
  public fun get_Organizer(): AppointmentOrganizer?

  @InterfaceMethod(13)
  public fun put_Organizer(value: AppointmentOrganizer?): Unit

  @InterfaceMethod(14)
  public fun get_Invitees(): IVector<AppointmentInvitee?>?

  @InterfaceMethod(15)
  public fun get_Recurrence(): AppointmentRecurrence?

  @InterfaceMethod(16)
  public fun put_Recurrence(value: AppointmentRecurrence?): Unit

  @InterfaceMethod(17)
  public fun get_BusyStatus(): AppointmentBusyStatus?

  @InterfaceMethod(18)
  public fun put_BusyStatus(value: AppointmentBusyStatus?): Unit

  @InterfaceMethod(19)
  public fun get_AllDay(): Boolean

  @InterfaceMethod(20)
  public fun put_AllDay(value: Boolean): Unit

  @InterfaceMethod(21)
  public fun get_Sensitivity(): AppointmentSensitivity?

  @InterfaceMethod(22)
  public fun put_Sensitivity(value: AppointmentSensitivity?): Unit

  @InterfaceMethod(23)
  public fun get_Uri(): Uri?

  @InterfaceMethod(24)
  public fun put_Uri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppointment> {
    public override fun getValue() = ABI.makeIAppointment(pointer.getPointer(0))

    public fun setValue(value: IAppointment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointment {
    public val __815880940_Ptr: Pointer?

    public val _815880940_VtblPtr: Pointer?
      get() = __815880940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_StartTime(value: DateTime?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Location(): String? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Location(value: String?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Subject(): String? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Details(): String? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Details(value: String?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Reminder(): IReference<TimeSpan?>? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Reminder(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Organizer(): AppointmentOrganizer? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentOrganizer>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentOrganizer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Organizer(value: AppointmentOrganizer?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Invitees(): IVector<AppointmentInvitee?>? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppointmentInvitee?>>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AppointmentInvitee?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_Recurrence(): AppointmentRecurrence? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentRecurrence>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentRecurrence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Recurrence(value: AppointmentRecurrence?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_BusyStatus(): AppointmentBusyStatus? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentBusyStatus>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentBusyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_BusyStatus(value: AppointmentBusyStatus?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_AllDay(): Boolean {
      val fnPtr = _815880940_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_AllDay(value: Boolean): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_Sensitivity(): AppointmentSensitivity? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentSensitivity>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentSensitivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_Sensitivity(value: AppointmentSensitivity?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_Uri(): Uri? {
      val fnPtr = _815880940_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _815880940_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815880940_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __815880940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd002f2f2bdd407690a322c275312965")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointment(ptr: Pointer?): WithDefault = IAppointment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointment {
      val address = segment.toRawLongValue()
      return makeIAppointment(Pointer(address))
    }

    public override fun toNative(obj: IAppointment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__815880940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointment): Array<IAppointment?> = (elements as
        Array<IAppointment?>).castToImpl<IAppointment,IAppointment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointment?> =
        arrayOfNulls<IAppointment_Impl>(size) as Array<IAppointment?>
  }
}
