package Windows.ApplicationModel.Appointments.DataProvider

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentCalendarProposeNewTimeForMeetingRequest.ABI::class)
@Signature("{ce1c63f5-edf6-43c3-82b7-be6b368c6900}")
@Guid("ce1c63f5edf643c382b7be6b368c6900")
@WinRTInterface("ce1c63f5edf643c382b7be6b368c6900")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarProposeNewTimeForMeetingRequest.ByReference::class)
public interface IAppointmentCalendarProposeNewTimeForMeetingRequest : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendarLocalId(): String?

  @InterfaceMethod(1)
  public fun get_AppointmentLocalId(): String?

  @InterfaceMethod(2)
  public fun get_AppointmentOriginalStartTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun get_NewStartTime(): DateTime?

  @InterfaceMethod(4)
  public fun get_NewDuration(): TimeSpan?

  @InterfaceMethod(5)
  public fun get_Subject(): String?

  @InterfaceMethod(6)
  public fun get_Comment(): String?

  @InterfaceMethod(7)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarProposeNewTimeForMeetingRequest> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarProposeNewTimeForMeetingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarProposeNewTimeForMeetingRequest {
    public val __408201201_Ptr: Pointer?

    public val _408201201_VtblPtr: Pointer?
      get() = __408201201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendarLocalId(): String? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppointmentLocalId(): String? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppointmentOriginalStartTime(): IReference<DateTime?>? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NewStartTime(): DateTime? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NewDuration(): TimeSpan? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Subject(): String? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Comment(): String? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _408201201_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__408201201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarProposeNewTimeForMeetingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __408201201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarProposeNewTimeForMeetingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce1c63f5edf643c382b7be6b368c6900")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarProposeNewTimeForMeetingRequest(ptr: Pointer?): WithDefault =
        IAppointmentCalendarProposeNewTimeForMeetingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarProposeNewTimeForMeetingRequest {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarProposeNewTimeForMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarProposeNewTimeForMeetingRequest):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__408201201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarProposeNewTimeForMeetingRequest):
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequest?> = (elements as
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequest?>).castToImpl<IAppointmentCalendarProposeNewTimeForMeetingRequest,IAppointmentCalendarProposeNewTimeForMeetingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequest?> =
        arrayOfNulls<IAppointmentCalendarProposeNewTimeForMeetingRequest_Impl>(size) as
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequest?>
  }
}
