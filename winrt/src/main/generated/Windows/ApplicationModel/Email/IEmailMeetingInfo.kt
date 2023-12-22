package Windows.ApplicationModel.Email

import Windows.ApplicationModel.Appointments.AppointmentRecurrence
import Windows.Foundation.DateTime
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IEmailMeetingInfo.ABI::class)
@Signature("{31c03fa9-7933-415f-a275-d165ba07026b}")
@Guid("31c03fa97933415fa275d165ba07026b")
@WinRTInterface("31c03fa97933415fa275d165ba07026b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMeetingInfo.ByReference::class)
public interface IEmailMeetingInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowNewTimeProposal(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowNewTimeProposal(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AppointmentRoamingId(): String?

  @InterfaceMethod(3)
  public fun put_AppointmentRoamingId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_AppointmentOriginalStartTime(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_AppointmentOriginalStartTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(7)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(8)
  public fun get_IsAllDay(): Boolean

  @InterfaceMethod(9)
  public fun put_IsAllDay(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsResponseRequested(): Boolean

  @InterfaceMethod(11)
  public fun put_IsResponseRequested(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_Location(): String?

  @InterfaceMethod(13)
  public fun put_Location(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_ProposedStartTime(): IReference<DateTime?>?

  @InterfaceMethod(15)
  public fun put_ProposedStartTime(proposedStartTime: IReference<DateTime?>?): Unit

  @InterfaceMethod(16)
  public fun get_ProposedDuration(): IReference<TimeSpan?>?

  @InterfaceMethod(17)
  public fun put_ProposedDuration(duration: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(18)
  public fun get_RecurrenceStartTime(): IReference<DateTime?>?

  @InterfaceMethod(19)
  public fun put_RecurrenceStartTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(20)
  public fun get_Recurrence(): AppointmentRecurrence?

  @InterfaceMethod(21)
  public fun put_Recurrence(value: AppointmentRecurrence?): Unit

  @InterfaceMethod(22)
  public fun get_RemoteChangeNumber(): WinDef.ULONG

  @InterfaceMethod(23)
  public fun put_RemoteChangeNumber(value: WinDef.ULONG): Unit

  @InterfaceMethod(24)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(25)
  public fun put_StartTime(value: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMeetingInfo> {
    public override fun getValue() = ABI.makeIEmailMeetingInfo(pointer.getPointer(0))

    public fun setValue(value: IEmailMeetingInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMeetingInfo {
    public val __1245430812_Ptr: Pointer?

    public val _1245430812_VtblPtr: Pointer?
      get() = __1245430812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowNewTimeProposal(): Boolean {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowNewTimeProposal(value: Boolean): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppointmentRoamingId(): String? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AppointmentRoamingId(value: String?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AppointmentOriginalStartTime(): IReference<DateTime?>? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AppointmentOriginalStartTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsAllDay(): Boolean {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsAllDay(value: Boolean): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsResponseRequested(): Boolean {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsResponseRequested(value: Boolean): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Location(): String? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Location(value: String?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ProposedStartTime(): IReference<DateTime?>? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ProposedStartTime(proposedStartTime: IReference<DateTime?>?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(proposedStartTime),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ProposedDuration(): IReference<TimeSpan?>? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ProposedDuration(duration: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(duration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_RecurrenceStartTime(): IReference<DateTime?>? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_RecurrenceStartTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Recurrence(): AppointmentRecurrence? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentRecurrence>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentRecurrence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Recurrence(value: AppointmentRecurrence?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_RemoteChangeNumber(): WinDef.ULONG {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_RemoteChangeNumber(value: WinDef.ULONG): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_StartTime(value: DateTime?): Unit {
      val fnPtr = _1245430812_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1245430812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMeetingInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1245430812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMeetingInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31c03fa97933415fa275d165ba07026b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMeetingInfo(ptr: Pointer?): WithDefault = IEmailMeetingInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMeetingInfo {
      val address = segment.toRawLongValue()
      return makeIEmailMeetingInfo(Pointer(address))
    }

    public override fun toNative(obj: IEmailMeetingInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1245430812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMeetingInfo): Array<IEmailMeetingInfo?> = (elements
        as Array<IEmailMeetingInfo?>).castToImpl<IEmailMeetingInfo,IEmailMeetingInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMeetingInfo?> =
        arrayOfNulls<IEmailMeetingInfo_Impl>(size) as Array<IEmailMeetingInfo?>
  }
}
