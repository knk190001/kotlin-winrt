package Windows.ApplicationModel.Appointments.DataProvider

import Windows.Foundation.Deferral
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentCalendarUpdateMeetingResponseRequestEventArgs.ABI::class)
@Signature("{88759883-97bf-479d-aed5-0be8ce567d1e}")
@Guid("8875988397bf479daed50be8ce567d1e")
@WinRTInterface("8875988397bf479daed50be8ce567d1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentCalendarUpdateMeetingResponseRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarUpdateMeetingResponseRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarUpdateMeetingResponseRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarUpdateMeetingResponseRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarUpdateMeetingResponseRequestEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarUpdateMeetingResponseRequestEventArgs {
    public val __1127012612_Ptr: Pointer?

    public val _1127012612_VtblPtr: Pointer?
      get() = __1127012612_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarUpdateMeetingResponseRequest? {
      val fnPtr = _1127012612_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarUpdateMeetingResponseRequest>()
      val hr = fn.invokeHR(arrayOf(__1127012612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarUpdateMeetingResponseRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1127012612_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1127012612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarUpdateMeetingResponseRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1127012612_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8875988397bf479daed50be8ce567d1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarUpdateMeetingResponseRequestEventArgs(ptr: Pointer?):
        WithDefault = IAppointmentCalendarUpdateMeetingResponseRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarUpdateMeetingResponseRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarUpdateMeetingResponseRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarUpdateMeetingResponseRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1127012612_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IAppointmentCalendarUpdateMeetingResponseRequestEventArgs):
        Array<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs?>).castToImpl<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs,IAppointmentCalendarUpdateMeetingResponseRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarUpdateMeetingResponseRequestEventArgs?>
  }
}
