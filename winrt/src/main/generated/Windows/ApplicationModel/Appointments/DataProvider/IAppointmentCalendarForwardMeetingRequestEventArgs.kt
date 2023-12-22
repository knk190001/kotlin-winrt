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

@ABIMarker(IAppointmentCalendarForwardMeetingRequestEventArgs.ABI::class)
@Signature("{3109151a-23a2-42fd-9c82-c9a60d59f8a8}")
@Guid("3109151a23a242fd9c82c9a60d59f8a8")
@WinRTInterface("3109151a23a242fd9c82c9a60d59f8a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarForwardMeetingRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarForwardMeetingRequestEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarForwardMeetingRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarForwardMeetingRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarForwardMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarForwardMeetingRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarForwardMeetingRequestEventArgs {
    public val __1851333827_Ptr: Pointer?

    public val _1851333827_VtblPtr: Pointer?
      get() = __1851333827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarForwardMeetingRequest? {
      val fnPtr = _1851333827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarForwardMeetingRequest>()
      val hr = fn.invokeHR(arrayOf(__1851333827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarForwardMeetingRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1851333827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1851333827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarForwardMeetingRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1851333827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarForwardMeetingRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3109151a23a242fd9c82c9a60d59f8a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarForwardMeetingRequestEventArgs(ptr: Pointer?): WithDefault =
        IAppointmentCalendarForwardMeetingRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarForwardMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarForwardMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarForwardMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1851333827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarForwardMeetingRequestEventArgs):
        Array<IAppointmentCalendarForwardMeetingRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarForwardMeetingRequestEventArgs?>).castToImpl<IAppointmentCalendarForwardMeetingRequestEventArgs,IAppointmentCalendarForwardMeetingRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarForwardMeetingRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarForwardMeetingRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarForwardMeetingRequestEventArgs?>
  }
}
