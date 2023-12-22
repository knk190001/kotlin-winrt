package Windows.ApplicationModel.Appointments.DataProvider

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

@ABIMarker(IAppointmentDataProviderTriggerDetails.ABI::class)
@Signature("{b3283c01-7e12-4e5e-b1ef-74fb68ac6f2a}")
@Guid("b3283c017e124e5eb1ef74fb68ac6f2a")
@WinRTInterface("b3283c017e124e5eb1ef74fb68ac6f2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentDataProviderTriggerDetails.ByReference::class)
public interface IAppointmentDataProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): AppointmentDataProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentDataProviderTriggerDetails> {
    public override fun getValue() =
        ABI.makeIAppointmentDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IAppointmentDataProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentDataProviderTriggerDetails {
    public val __2095831878_Ptr: Pointer?

    public val _2095831878_VtblPtr: Pointer?
      get() = __2095831878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): AppointmentDataProviderConnection? {
      val fnPtr = _2095831878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentDataProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__2095831878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentDataProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentDataProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2095831878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentDataProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3283c017e124e5eb1ef74fb68ac6f2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentDataProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IAppointmentDataProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIAppointmentDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2095831878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentDataProviderTriggerDetails):
        Array<IAppointmentDataProviderTriggerDetails?> = (elements as
        Array<IAppointmentDataProviderTriggerDetails?>).castToImpl<IAppointmentDataProviderTriggerDetails,IAppointmentDataProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentDataProviderTriggerDetails?> =
        arrayOfNulls<IAppointmentDataProviderTriggerDetails_Impl>(size) as
        Array<IAppointmentDataProviderTriggerDetails?>
  }
}
