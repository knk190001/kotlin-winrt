package Windows.System.Diagnostics.Telemetry

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

@ABIMarker(IPlatformTelemetryRegistrationResult.ABI::class)
@Signature("{4d8518ab-2292-49bd-a15a-3d71d2145112}")
@Guid("4d8518ab229249bda15a3d71d2145112")
@WinRTInterface("4d8518ab229249bda15a3d71d2145112")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformTelemetryRegistrationResult.ByReference::class)
public interface IPlatformTelemetryRegistrationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PlatformTelemetryRegistrationStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformTelemetryRegistrationResult> {
    public override fun getValue() =
        ABI.makeIPlatformTelemetryRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: IPlatformTelemetryRegistrationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformTelemetryRegistrationResult {
    public val __1919129046_Ptr: Pointer?

    public val _1919129046_VtblPtr: Pointer?
      get() = __1919129046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PlatformTelemetryRegistrationStatus? {
      val fnPtr = _1919129046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformTelemetryRegistrationStatus>()
      val hr = fn.invokeHR(arrayOf(__1919129046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformTelemetryRegistrationStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPlatformTelemetryRegistrationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1919129046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformTelemetryRegistrationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d8518ab229249bda15a3d71d2145112")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformTelemetryRegistrationResult(ptr: Pointer?): WithDefault =
        IPlatformTelemetryRegistrationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlatformTelemetryRegistrationResult {
      val address = segment.toRawLongValue()
      return makeIPlatformTelemetryRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: IPlatformTelemetryRegistrationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1919129046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformTelemetryRegistrationResult):
        Array<IPlatformTelemetryRegistrationResult?> = (elements as
        Array<IPlatformTelemetryRegistrationResult?>).castToImpl<IPlatformTelemetryRegistrationResult,IPlatformTelemetryRegistrationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformTelemetryRegistrationResult?> =
        arrayOfNulls<IPlatformTelemetryRegistrationResult_Impl>(size) as
        Array<IPlatformTelemetryRegistrationResult?>
  }
}
