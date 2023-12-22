package Windows.ApplicationModel.Appointments.DataProvider

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
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

@ABIMarker(IAppointmentCalendarCancelMeetingRequest.ABI::class)
@Signature("{49460f8d-6434-40d7-ad46-6297419314d1}")
@Guid("49460f8d643440d7ad466297419314d1")
@WinRTInterface("49460f8d643440d7ad466297419314d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarCancelMeetingRequest.ByReference::class)
public interface IAppointmentCalendarCancelMeetingRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendarLocalId(): String?

  @InterfaceMethod(1)
  public fun get_AppointmentLocalId(): String?

  @InterfaceMethod(2)
  public fun get_AppointmentOriginalStartTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun get_Subject(): String?

  @InterfaceMethod(4)
  public fun get_Comment(): String?

  @InterfaceMethod(5)
  public fun get_NotifyInvitees(): Boolean

  @InterfaceMethod(6)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarCancelMeetingRequest> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarCancelMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarCancelMeetingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarCancelMeetingRequest {
    public val __673834419_Ptr: Pointer?

    public val _673834419_VtblPtr: Pointer?
      get() = __673834419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendarLocalId(): String? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppointmentLocalId(): String? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppointmentOriginalStartTime(): IReference<DateTime?>? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Subject(): String? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Comment(): String? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NotifyInvitees(): Boolean {
      val fnPtr = _673834419_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _673834419_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__673834419_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarCancelMeetingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __673834419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarCancelMeetingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49460f8d643440d7ad466297419314d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarCancelMeetingRequest(ptr: Pointer?): WithDefault =
        IAppointmentCalendarCancelMeetingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarCancelMeetingRequest {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarCancelMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarCancelMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__673834419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarCancelMeetingRequest):
        Array<IAppointmentCalendarCancelMeetingRequest?> = (elements as
        Array<IAppointmentCalendarCancelMeetingRequest?>).castToImpl<IAppointmentCalendarCancelMeetingRequest,IAppointmentCalendarCancelMeetingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendarCancelMeetingRequest?> =
        arrayOfNulls<IAppointmentCalendarCancelMeetingRequest_Impl>(size) as
        Array<IAppointmentCalendarCancelMeetingRequest?>
  }
}
