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

@ABIMarker(IAppointmentCalendarSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("{ca17c6f7-0284-4edd-87ba-4d8f69dcf5c0}")
@Guid("ca17c6f702844edd87ba4d8f69dcf5c0")
@WinRTInterface("ca17c6f702844edd87ba4d8f69dcf5c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarSyncManagerSyncRequestEventArgs.ByReference::class)
public interface IAppointmentCalendarSyncManagerSyncRequestEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): AppointmentCalendarSyncManagerSyncRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentCalendarSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarSyncManagerSyncRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarSyncManagerSyncRequestEventArgs {
    public val __1878291850_Ptr: Pointer?

    public val _1878291850_VtblPtr: Pointer?
      get() = __1878291850_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): AppointmentCalendarSyncManagerSyncRequest? {
      val fnPtr = _1878291850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentCalendarSyncManagerSyncRequest>()
      val hr = fn.invokeHR(arrayOf(__1878291850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppointmentCalendarSyncManagerSyncRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1878291850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1878291850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendarSyncManagerSyncRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878291850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca17c6f702844edd87ba4d8f69dcf5c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarSyncManagerSyncRequestEventArgs(ptr: Pointer?): WithDefault =
        IAppointmentCalendarSyncManagerSyncRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentCalendarSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarSyncManagerSyncRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1878291850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarSyncManagerSyncRequestEventArgs):
        Array<IAppointmentCalendarSyncManagerSyncRequestEventArgs?> = (elements as
        Array<IAppointmentCalendarSyncManagerSyncRequestEventArgs?>).castToImpl<IAppointmentCalendarSyncManagerSyncRequestEventArgs,IAppointmentCalendarSyncManagerSyncRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentCalendarSyncManagerSyncRequestEventArgs?> =
        arrayOfNulls<IAppointmentCalendarSyncManagerSyncRequestEventArgs_Impl>(size) as
        Array<IAppointmentCalendarSyncManagerSyncRequestEventArgs?>
  }
}
