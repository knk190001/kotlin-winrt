package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointmentCalendar.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.UI.Color
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAppointmentCalendar2.ABI::class)
@Signature("{18e7e422-2467-4e1c-a459-d8a29303d092}")
@Guid("18e7e42224674e1ca459d8a29303d092")
@WinRTInterface("18e7e42224674e1ca459d8a29303d092")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendar2.ByReference::class)
public interface IAppointmentCalendar2 : NativeMapped, IWinRTInterface, IAppointmentCalendar {
  @InterfaceMethod(0)
  public fun get_SyncManager(): AppointmentCalendarSyncManager?

  @InterfaceMethod(1)
  public fun get_RemoteId(): String?

  @InterfaceMethod(2)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(3)
  public fun put_DisplayColor(value: Color?): Unit

  @InterfaceMethod(4)
  public fun put_IsHidden(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(6)
  public fun get_CanCreateOrUpdateAppointments(): Boolean

  @InterfaceMethod(7)
  public fun put_CanCreateOrUpdateAppointments(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_CanCancelMeetings(): Boolean

  @InterfaceMethod(9)
  public fun put_CanCancelMeetings(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_CanForwardMeetings(): Boolean

  @InterfaceMethod(11)
  public fun put_CanForwardMeetings(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_CanProposeNewTimeForMeetings(): Boolean

  @InterfaceMethod(13)
  public fun put_CanProposeNewTimeForMeetings(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CanUpdateMeetingResponses(): Boolean

  @InterfaceMethod(15)
  public fun put_CanUpdateMeetingResponses(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_CanNotifyInvitees(): Boolean

  @InterfaceMethod(17)
  public fun put_CanNotifyInvitees(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_MustNofityInvitees(): Boolean

  @InterfaceMethod(19)
  public fun put_MustNofityInvitees(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun TryCreateOrUpdateAppointmentAsync(appointment: Appointment?, notifyInvitees: Boolean):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(21)
  public fun TryCancelMeetingAsync(
    meeting: Appointment?,
    subject: String?,
    comment: String?,
    notifyInvitees: Boolean
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(22)
  public fun TryForwardMeetingAsync(
    meeting: Appointment?,
    invitees: IIterable<AppointmentInvitee?>?,
    subject: String?,
    forwardHeader: String?,
    comment: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(23)
  public fun TryProposeNewTimeForMeetingAsync(
    meeting: Appointment?,
    newStartTime: DateTime?,
    newDuration: TimeSpan?,
    subject: String?,
    comment: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(24)
  public fun TryUpdateMeetingResponseAsync(
    meeting: Appointment?,
    response: AppointmentParticipantResponse?,
    subject: String?,
    comment: String?,
    sendUpdate: Boolean
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendar2> {
    public override fun getValue() = ABI.makeIAppointmentCalendar2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendar2, IAppointmentCalendar.WithDefault {
    public val __872046080_Ptr: Pointer?

    public val _872046080_VtblPtr: Pointer?
      get() = __872046080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SyncManager(): AppointmentCalendarSyncManager? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarSyncManager>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentCalendarSyncManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemoteId(): String? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun put_DisplayColor(value: Color?): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_IsHidden(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CanCreateOrUpdateAppointments(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_CanCreateOrUpdateAppointments(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CanCancelMeetings(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_CanCancelMeetings(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CanForwardMeetings(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_CanForwardMeetings(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CanProposeNewTimeForMeetings(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_CanProposeNewTimeForMeetings(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CanUpdateMeetingResponses(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_CanUpdateMeetingResponses(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_CanNotifyInvitees(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_CanNotifyInvitees(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_MustNofityInvitees(): Boolean {
      val fnPtr = _872046080_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_MustNofityInvitees(value: Boolean): Unit {
      val fnPtr = _872046080_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun TryCreateOrUpdateAppointmentAsync(appointment: Appointment?,
        notifyInvitees: Boolean): IAsyncOperation<Boolean>? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(appointment), notifyInvitees,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun TryCancelMeetingAsync(
      meeting: Appointment?,
      subject: String?,
      comment: String?,
      notifyInvitees: Boolean
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(meeting),
          marshalToNative(subject), marshalToNative(comment), notifyInvitees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun TryForwardMeetingAsync(
      meeting: Appointment?,
      invitees: IIterable<AppointmentInvitee?>?,
      subject: String?,
      forwardHeader: String?,
      comment: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(meeting),
          marshalToNative(invitees), marshalToNative(subject), marshalToNative(forwardHeader),
          marshalToNative(comment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun TryProposeNewTimeForMeetingAsync(
      meeting: Appointment?,
      newStartTime: DateTime?,
      newDuration: TimeSpan?,
      subject: String?,
      comment: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(meeting),
          marshalToNative(newStartTime), marshalToNative(newDuration), marshalToNative(subject),
          marshalToNative(comment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun TryUpdateMeetingResponseAsync(
      meeting: Appointment?,
      response: AppointmentParticipantResponse?,
      subject: String?,
      comment: String?,
      sendUpdate: Boolean
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _872046080_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__872046080_Ptr, marshalToNative(meeting),
          marshalToNative(response), marshalToNative(subject), marshalToNative(comment), sendUpdate,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointmentCalendar {
    public override val __997961842_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_872046080_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __872046080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18e7e42224674e1ca459d8a29303d092")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendar2(ptr: Pointer?): WithDefault =
        IAppointmentCalendar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentCalendar2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendar2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872046080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendar2): Array<IAppointmentCalendar2?> =
        (elements as
        Array<IAppointmentCalendar2?>).castToImpl<IAppointmentCalendar2,IAppointmentCalendar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendar2?> =
        arrayOfNulls<IAppointmentCalendar2_Impl>(size) as Array<IAppointmentCalendar2?>
  }
}
