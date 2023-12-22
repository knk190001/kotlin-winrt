package Windows.ApplicationModel.Appointments.AppointmentsProvider

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

@ABIMarker(IAppointmentsProviderLaunchActionVerbsStatics2.ABI::class)
@Signature("{ef9049a4-af21-473c-88dc-76cd89f60ca5}")
@Guid("ef9049a4af21473c88dc76cd89f60ca5")
@WinRTInterface("ef9049a4af21473c88dc76cd89f60ca5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentsProviderLaunchActionVerbsStatics2.ByReference::class)
public interface IAppointmentsProviderLaunchActionVerbsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowAppointmentDetails(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderLaunchActionVerbsStatics2> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderLaunchActionVerbsStatics2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderLaunchActionVerbsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderLaunchActionVerbsStatics2 {
    public val __537757087_Ptr: Pointer?

    public val _537757087_VtblPtr: Pointer?
      get() = __537757087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowAppointmentDetails(): String? {
      val fnPtr = _537757087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__537757087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderLaunchActionVerbsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __537757087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderLaunchActionVerbsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef9049a4af21473c88dc76cd89f60ca5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderLaunchActionVerbsStatics2(ptr: Pointer?): WithDefault =
        IAppointmentsProviderLaunchActionVerbsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderLaunchActionVerbsStatics2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderLaunchActionVerbsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderLaunchActionVerbsStatics2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__537757087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderLaunchActionVerbsStatics2):
        Array<IAppointmentsProviderLaunchActionVerbsStatics2?> = (elements as
        Array<IAppointmentsProviderLaunchActionVerbsStatics2?>).castToImpl<IAppointmentsProviderLaunchActionVerbsStatics2,IAppointmentsProviderLaunchActionVerbsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentsProviderLaunchActionVerbsStatics2?> =
        arrayOfNulls<IAppointmentsProviderLaunchActionVerbsStatics2_Impl>(size) as
        Array<IAppointmentsProviderLaunchActionVerbsStatics2?>
  }
}
