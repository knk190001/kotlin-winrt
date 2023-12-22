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

@ABIMarker(IAppointmentCalendarCancelMeetingRequestEventArgs.ABI::class)
@Signature("{1a79be16-7f30-4e35-beef-9d2c7b6dcae1}")
@Guid("1a79be167f304e35beef9d2c7b6dcae1")
@WinRTInterface("1a79be167f304e35beef9d2c7b6dcae1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarCancelMeetingRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarCancelMeetingRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarCancelMeetingRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarCancelMeetingRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarCancelMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarCancelMeetingRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarCancelMeetingRequestEventArgs {
    public val __29828810_Ptr: Pointer?

    public val _29828810_VtblPtr: Pointer?
      get() = __29828810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarCancelMeetingRequest? {
      val fnPtr = _29828810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarCancelMeetingRequest>()
      val hr = fn.invokeHR(arrayOf(__29828810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarCancelMeetingRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _29828810_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__29828810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarCancelMeetingRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __29828810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarCancelMeetingRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a79be167f304e35beef9d2c7b6dcae1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarCancelMeetingRequestEventArgs(ptr: Pointer?): WithDefault =
        IAppointmentCalendarCancelMeetingRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarCancelMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarCancelMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarCancelMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__29828810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarCancelMeetingRequestEventArgs):
        Array<IAppointmentCalendarCancelMeetingRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarCancelMeetingRequestEventArgs?>).castToImpl<IAppointmentCalendarCancelMeetingRequestEventArgs,IAppointmentCalendarCancelMeetingRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarCancelMeetingRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarCancelMeetingRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarCancelMeetingRequestEventArgs?>
  }
}
