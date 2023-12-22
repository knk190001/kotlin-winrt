package Windows.ApplicationModel.Appointments.DataProvider

import Windows.ApplicationModel.Appointments.Appointment
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IAppointmentCalendarCreateOrUpdateAppointmentRequest.ABI::class)
@Signature("{2e62f2b2-ca96-48ac-9124-406b19fefa70}")
@Guid("2e62f2b2ca9648ac9124406b19fefa70")
@WinRTInterface("2e62f2b2ca9648ac9124406b19fefa70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarCreateOrUpdateAppointmentRequest.ByReference::class)
public interface IAppointmentCalendarCreateOrUpdateAppointmentRequest : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendarLocalId(): String?

  @InterfaceMethod(1)
  public fun get_Appointment(): Appointment?

  @InterfaceMethod(2)
  public fun get_NotifyInvitees(): Boolean

  @InterfaceMethod(3)
  public fun get_ChangedProperties(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun ReportCompletedAsync(createdOrUpdatedAppointment: Appointment?): IAsyncAction?

  @InterfaceMethod(5)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarCreateOrUpdateAppointmentRequest> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequest(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarCreateOrUpdateAppointmentRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarCreateOrUpdateAppointmentRequest {
    public val __1729504407_Ptr: Pointer?

    public val _1729504407_VtblPtr: Pointer?
      get() = __1729504407_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendarLocalId(): String? {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Appointment(): Appointment? {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Appointment>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Appointment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NotifyInvitees(): Boolean {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ChangedProperties(): IVectorView<String?>? {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ReportCompletedAsync(createdOrUpdatedAppointment: Appointment?):
        IAsyncAction? {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr, marshalToNative(createdOrUpdatedAppointment),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1729504407_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1729504407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarCreateOrUpdateAppointmentRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1729504407_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarCreateOrUpdateAppointmentRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e62f2b2ca9648ac9124406b19fefa70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarCreateOrUpdateAppointmentRequest(ptr: Pointer?): WithDefault
        = IAppointmentCalendarCreateOrUpdateAppointmentRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarCreateOrUpdateAppointmentRequest {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarCreateOrUpdateAppointmentRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarCreateOrUpdateAppointmentRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1729504407_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarCreateOrUpdateAppointmentRequest):
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequest?> = (elements as
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequest?>).castToImpl<IAppointmentCalendarCreateOrUpdateAppointmentRequest,IAppointmentCalendarCreateOrUpdateAppointmentRequest_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequest?> =
        arrayOfNulls<IAppointmentCalendarCreateOrUpdateAppointmentRequest_Impl>(size) as
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequest?>
  }
}
