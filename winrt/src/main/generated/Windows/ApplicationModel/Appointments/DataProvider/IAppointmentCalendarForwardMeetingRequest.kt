package Windows.ApplicationModel.Appointments.DataProvider

import Windows.ApplicationModel.Appointments.AppointmentInvitee
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentCalendarForwardMeetingRequest.ABI::class)
@Signature("{82e5ee56-26b6-4253-8a8f-6cf5f2ff7884}")
@Guid("82e5ee5626b642538a8f6cf5f2ff7884")
@WinRTInterface("82e5ee5626b642538a8f6cf5f2ff7884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarForwardMeetingRequest.ByReference::class)
public interface IAppointmentCalendarForwardMeetingRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentCalendarLocalId(): String?

  @InterfaceMethod(1)
  public fun get_AppointmentLocalId(): String?

  @InterfaceMethod(2)
  public fun get_AppointmentOriginalStartTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun get_Invitees(): IVectorView<AppointmentInvitee?>?

  @InterfaceMethod(4)
  public fun get_Subject(): String?

  @InterfaceMethod(5)
  public fun get_ForwardHeader(): String?

  @InterfaceMethod(6)
  public fun get_Comment(): String?

  @InterfaceMethod(7)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarForwardMeetingRequest> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarForwardMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarForwardMeetingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarForwardMeetingRequest {
    public val __820117626_Ptr: Pointer?

    public val _820117626_VtblPtr: Pointer?
      get() = __820117626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentCalendarLocalId(): String? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppointmentLocalId(): String? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppointmentOriginalStartTime(): IReference<DateTime?>? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Invitees(): IVectorView<AppointmentInvitee?>? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppointmentInvitee?>>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppointmentInvitee?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Subject(): String? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ForwardHeader(): String? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Comment(): String? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _820117626_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__820117626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarForwardMeetingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __820117626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarForwardMeetingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82e5ee5626b642538a8f6cf5f2ff7884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarForwardMeetingRequest(ptr: Pointer?): WithDefault =
        IAppointmentCalendarForwardMeetingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarForwardMeetingRequest {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarForwardMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarForwardMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__820117626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarForwardMeetingRequest):
        Array<IAppointmentCalendarForwardMeetingRequest?> = (elements as
        Array<IAppointmentCalendarForwardMeetingRequest?>).castToImpl<IAppointmentCalendarForwardMeetingRequest,IAppointmentCalendarForwardMeetingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendarForwardMeetingRequest?> =
        arrayOfNulls<IAppointmentCalendarForwardMeetingRequest_Impl>(size) as
        Array<IAppointmentCalendarForwardMeetingRequest?>
  }
}
