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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPlatformTelemetryRegistrationSettings.ABI::class)
@Signature("{819a8582-ca19-415e-bb79-9c224bfa3a73}")
@Guid("819a8582ca19415ebb799c224bfa3a73")
@WinRTInterface("819a8582ca19415ebb799c224bfa3a73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformTelemetryRegistrationSettings.ByReference::class)
public interface IPlatformTelemetryRegistrationSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StorageSize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_StorageSize(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_UploadQuotaSize(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_UploadQuotaSize(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformTelemetryRegistrationSettings> {
    public override fun getValue() =
        ABI.makeIPlatformTelemetryRegistrationSettings(pointer.getPointer(0))

    public fun setValue(value: IPlatformTelemetryRegistrationSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformTelemetryRegistrationSettings {
    public val __782499940_Ptr: Pointer?

    public val _782499940_VtblPtr: Pointer?
      get() = __782499940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StorageSize(): WinDef.UINT {
      val fnPtr = _782499940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__782499940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_StorageSize(value: WinDef.UINT): Unit {
      val fnPtr = _782499940_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__782499940_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UploadQuotaSize(): WinDef.UINT {
      val fnPtr = _782499940_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__782499940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_UploadQuotaSize(value: WinDef.UINT): Unit {
      val fnPtr = _782499940_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__782499940_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlatformTelemetryRegistrationSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __782499940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformTelemetryRegistrationSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("819a8582ca19415ebb799c224bfa3a73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformTelemetryRegistrationSettings(ptr: Pointer?): WithDefault =
        IPlatformTelemetryRegistrationSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlatformTelemetryRegistrationSettings {
      val address = segment.toRawLongValue()
      return makeIPlatformTelemetryRegistrationSettings(Pointer(address))
    }

    public override fun toNative(obj: IPlatformTelemetryRegistrationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__782499940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformTelemetryRegistrationSettings):
        Array<IPlatformTelemetryRegistrationSettings?> = (elements as
        Array<IPlatformTelemetryRegistrationSettings?>).castToImpl<IPlatformTelemetryRegistrationSettings,IPlatformTelemetryRegistrationSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformTelemetryRegistrationSettings?> =
        arrayOfNulls<IPlatformTelemetryRegistrationSettings_Impl>(size) as
        Array<IPlatformTelemetryRegistrationSettings?>
  }
}
