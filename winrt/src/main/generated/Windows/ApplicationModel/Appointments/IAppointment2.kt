package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointment.ABI.IID
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IAppointment2.ABI::class)
@Signature("{5e85983c-540f-3452-9b5c-0dd7ad4c65a2}")
@Guid("5e85983c540f34529b5c0dd7ad4c65a2")
@WinRTInterface("5e85983c540f34529b5c0dd7ad4c65a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointment2.ByReference::class)
public interface IAppointment2 : NativeMapped, IWinRTInterface, IAppointment {
  @InterfaceMethod(0)
  public fun get_LocalId(): String?

  @InterfaceMethod(1)
  public fun get_CalendarId(): String?

  @InterfaceMethod(2)
  public fun get_RoamingId(): String?

  @InterfaceMethod(3)
  public fun put_RoamingId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_OriginalStartTime(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun get_IsResponseRequested(): Boolean

  @InterfaceMethod(6)
  public fun put_IsResponseRequested(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_AllowNewTimeProposal(): Boolean

  @InterfaceMethod(8)
  public fun put_AllowNewTimeProposal(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_OnlineMeetingLink(): String?

  @InterfaceMethod(10)
  public fun put_OnlineMeetingLink(value: String?): Unit

  @InterfaceMethod(11)
  public fun get_ReplyTime(): IReference<DateTime?>?

  @InterfaceMethod(12)
  public fun put_ReplyTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(13)
  public fun get_UserResponse(): AppointmentParticipantResponse?

  @InterfaceMethod(14)
  public fun put_UserResponse(value: AppointmentParticipantResponse?): Unit

  @InterfaceMethod(15)
  public fun get_HasInvitees(): Boolean

  @InterfaceMethod(16)
  public fun get_IsCanceledMeeting(): Boolean

  @InterfaceMethod(17)
  public fun put_IsCanceledMeeting(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_IsOrganizedByUser(): Boolean

  @InterfaceMethod(19)
  public fun put_IsOrganizedByUser(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppointment2>
      {
    public override fun getValue() = ABI.makeIAppointment2(pointer.getPointer(0))

    public fun setValue(value: IAppointment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointment2, IAppointment.WithDefault {
    public val __477494686_Ptr: Pointer?

    public val _477494686_VtblPtr: Pointer?
      get() = __477494686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalId(): String? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CalendarId(): String? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RoamingId(): String? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RoamingId(value: String?): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OriginalStartTime(): IReference<DateTime?>? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsResponseRequested(): Boolean {
      val fnPtr = _477494686_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_IsResponseRequested(value: Boolean): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_AllowNewTimeProposal(): Boolean {
      val fnPtr = _477494686_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_AllowNewTimeProposal(value: Boolean): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_OnlineMeetingLink(): String? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_OnlineMeetingLink(value: String?): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ReplyTime(): IReference<DateTime?>? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ReplyTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_UserResponse(): AppointmentParticipantResponse? {
      val fnPtr = _477494686_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentParticipantResponse>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentParticipantResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_UserResponse(value: AppointmentParticipantResponse?): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_HasInvitees(): Boolean {
      val fnPtr = _477494686_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_IsCanceledMeeting(): Boolean {
      val fnPtr = _477494686_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsCanceledMeeting(value: Boolean): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsOrganizedByUser(): Boolean {
      val fnPtr = _477494686_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsOrganizedByUser(value: Boolean): Unit {
      val fnPtr = _477494686_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494686_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointment {
    public override val __815880940_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_477494686_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __477494686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e85983c540f34529b5c0dd7ad4c65a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointment2(ptr: Pointer?): WithDefault = IAppointment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointment2 {
      val address = segment.toRawLongValue()
      return makeIAppointment2(Pointer(address))
    }

    public override fun toNative(obj: IAppointment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__477494686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointment2): Array<IAppointment2?> = (elements as
        Array<IAppointment2?>).castToImpl<IAppointment2,IAppointment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointment2?> =
        arrayOfNulls<IAppointment2_Impl>(size) as Array<IAppointment2?>
  }
}
