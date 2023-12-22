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

@ABIMarker(IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ABI::class)
@Signature("{d2d777d8-fed1-4280-a3ba-2e1f47609aa2}")
@Guid("d2d777d8fed14280a3ba2e1f47609aa2")
@WinRTInterface("d2d777d8fed14280a3ba2e1f47609aa2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarProposeNewTimeForMeetingRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs {
    public val __1859239096_Ptr: Pointer?

    public val _1859239096_VtblPtr: Pointer?
      get() = __1859239096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarProposeNewTimeForMeetingRequest? {
      val fnPtr = _1859239096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarProposeNewTimeForMeetingRequest>()
      val hr = fn.invokeHR(arrayOf(__1859239096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarProposeNewTimeForMeetingRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1859239096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1859239096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1859239096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2d777d8fed14280a3ba2e1f47609aa2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(ptr: Pointer?):
        WithDefault = IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1859239096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs):
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?>).castToImpl<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs,IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarProposeNewTimeForMeetingRequestEventArgs?>
  }
}
