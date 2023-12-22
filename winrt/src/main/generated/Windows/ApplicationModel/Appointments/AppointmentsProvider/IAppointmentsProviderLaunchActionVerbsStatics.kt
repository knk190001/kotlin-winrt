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

@ABIMarker(IAppointmentsProviderLaunchActionVerbsStatics.ABI::class)
@Signature("{36dbba28-9e2e-49c6-8ef7-3ab7a5dcc8b8}")
@Guid("36dbba289e2e49c68ef73ab7a5dcc8b8")
@WinRTInterface("36dbba289e2e49c68ef73ab7a5dcc8b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentsProviderLaunchActionVerbsStatics.ByReference::class)
public interface IAppointmentsProviderLaunchActionVerbsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddAppointment(): String?

  @InterfaceMethod(1)
  public fun get_ReplaceAppointment(): String?

  @InterfaceMethod(2)
  public fun get_RemoveAppointment(): String?

  @InterfaceMethod(3)
  public fun get_ShowTimeFrame(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderLaunchActionVerbsStatics> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderLaunchActionVerbsStatics(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderLaunchActionVerbsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderLaunchActionVerbsStatics {
    public val __1957009651_Ptr: Pointer?

    public val _1957009651_VtblPtr: Pointer?
      get() = __1957009651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddAppointment(): String? {
      val fnPtr = _1957009651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1957009651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ReplaceAppointment(): String? {
      val fnPtr = _1957009651_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1957009651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoveAppointment(): String? {
      val fnPtr = _1957009651_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1957009651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ShowTimeFrame(): String? {
      val fnPtr = _1957009651_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1957009651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderLaunchActionVerbsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957009651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderLaunchActionVerbsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36dbba289e2e49c68ef73ab7a5dcc8b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderLaunchActionVerbsStatics(ptr: Pointer?): WithDefault =
        IAppointmentsProviderLaunchActionVerbsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderLaunchActionVerbsStatics {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderLaunchActionVerbsStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderLaunchActionVerbsStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957009651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderLaunchActionVerbsStatics):
        Array<IAppointmentsProviderLaunchActionVerbsStatics?> = (elements as
        Array<IAppointmentsProviderLaunchActionVerbsStatics?>).castToImpl<IAppointmentsProviderLaunchActionVerbsStatics,IAppointmentsProviderLaunchActionVerbsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentsProviderLaunchActionVerbsStatics?> =
        arrayOfNulls<IAppointmentsProviderLaunchActionVerbsStatics_Impl>(size) as
        Array<IAppointmentsProviderLaunchActionVerbsStatics?>
  }
}
