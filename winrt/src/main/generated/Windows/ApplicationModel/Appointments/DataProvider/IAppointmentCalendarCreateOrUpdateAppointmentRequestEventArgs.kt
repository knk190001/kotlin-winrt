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

@ABIMarker(IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ABI::class)
@Signature("{cf8ded28-002e-4bf7-8e9d-5e20d49aa3ba}")
@Guid("cf8ded28002e4bf78e9d5e20d49aa3ba")
@WinRTInterface("cf8ded28002e4bf78e9d5e20d49aa3ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarCreateOrUpdateAppointmentRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs {
    public val __372051904_Ptr: Pointer?

    public val _372051904_VtblPtr: Pointer?
      get() = __372051904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarCreateOrUpdateAppointmentRequest? {
      val fnPtr = _372051904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarCreateOrUpdateAppointmentRequest>()
      val hr = fn.invokeHR(arrayOf(__372051904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarCreateOrUpdateAppointmentRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _372051904_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__372051904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __372051904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf8ded28002e4bf78e9d5e20d49aa3ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(ptr: Pointer?):
        WithDefault = IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs(Pointer(address))
    }

    public override
        fun toNative(obj: IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__372051904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs):
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?>).castToImpl<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs,IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarCreateOrUpdateAppointmentRequestEventArgs?>
  }
}
