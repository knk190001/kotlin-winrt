package Windows.ApplicationModel.Appointments

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentManagerStatics2.ABI::class)
@Signature("{0a81f60d-d04f-4034-af72-a36573b45ff0}")
@Guid("0a81f60dd04f4034af72a36573b45ff0")
@WinRTInterface("0a81f60dd04f4034af72a36573b45ff0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentManagerStatics2.ByReference::class)
public interface IAppointmentManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAppointmentDetailsAsync(appointmentId: String?): IAsyncAction?

  @InterfaceMethod(1)
  public fun ShowAppointmentDetailsAsync(appointmentId: String?, instanceStartDate: DateTime?):
      IAsyncAction?

  @InterfaceMethod(2)
  public fun ShowEditNewAppointmentAsync(appointment: Appointment?): IAsyncOperation<String?>?

  @InterfaceMethod(3)
  public fun RequestStoreAsync(options: AppointmentStoreAccessType?):
      IAsyncOperation<AppointmentStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentManagerStatics2> {
    public override fun getValue() = ABI.makeIAppointmentManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentManagerStatics2 {
    public val __282212390_Ptr: Pointer?

    public val _282212390_VtblPtr: Pointer?
      get() = __282212390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAppointmentDetailsAsync(appointmentId: String?): IAsyncAction? {
      val fnPtr = _282212390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__282212390_Ptr, marshalToNative(appointmentId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAppointmentDetailsAsync(appointmentId: String?,
        instanceStartDate: DateTime?): IAsyncAction? {
      val fnPtr = _282212390_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__282212390_Ptr, marshalToNative(appointmentId),
          marshalToNative(instanceStartDate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowEditNewAppointmentAsync(appointment: Appointment?):
        IAsyncOperation<String?>? {
      val fnPtr = _282212390_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__282212390_Ptr, marshalToNative(appointment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestStoreAsync(options: AppointmentStoreAccessType?):
        IAsyncOperation<AppointmentStore?>? {
      val fnPtr = _282212390_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentStore?>>()
      val hr = fn.invokeHR(arrayOf(__282212390_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppointmentStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __282212390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a81f60dd04f4034af72a36573b45ff0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentManagerStatics2(ptr: Pointer?): WithDefault =
        IAppointmentManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__282212390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentManagerStatics2):
        Array<IAppointmentManagerStatics2?> = (elements as
        Array<IAppointmentManagerStatics2?>).castToImpl<IAppointmentManagerStatics2,IAppointmentManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentManagerStatics2?> =
        arrayOfNulls<IAppointmentManagerStatics2_Impl>(size) as Array<IAppointmentManagerStatics2?>
  }
}
