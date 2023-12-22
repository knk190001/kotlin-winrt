package Windows.Devices.WiFiDirect.Services

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiDirectServiceProvisioningInfo.ABI::class)
@Signature("{8bdb7cfe-97d9-45a2-8e99-db50910fb6a6}")
@Guid("8bdb7cfe97d945a28e99db50910fb6a6")
@WinRTInterface("8bdb7cfe97d945a28e99db50910fb6a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceProvisioningInfo.ByReference::class)
public interface IWiFiDirectServiceProvisioningInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedConfigurationMethod(): WiFiDirectServiceConfigurationMethod?

  @InterfaceMethod(1)
  public fun get_IsGroupFormationNeeded(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceProvisioningInfo> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceProvisioningInfo(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceProvisioningInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceProvisioningInfo {
    public val __53304837_Ptr: Pointer?

    public val _53304837_VtblPtr: Pointer?
      get() = __53304837_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedConfigurationMethod(): WiFiDirectServiceConfigurationMethod? {
      val fnPtr = _53304837_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceConfigurationMethod>()
      val hr = fn.invokeHR(arrayOf(__53304837_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceConfigurationMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsGroupFormationNeeded(): Boolean {
      val fnPtr = _53304837_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__53304837_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWiFiDirectServiceProvisioningInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __53304837_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceProvisioningInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bdb7cfe97d945a28e99db50910fb6a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceProvisioningInfo(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceProvisioningInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectServiceProvisioningInfo {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceProvisioningInfo(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceProvisioningInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__53304837_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceProvisioningInfo):
        Array<IWiFiDirectServiceProvisioningInfo?> = (elements as
        Array<IWiFiDirectServiceProvisioningInfo?>).castToImpl<IWiFiDirectServiceProvisioningInfo,IWiFiDirectServiceProvisioningInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceProvisioningInfo?> =
        arrayOfNulls<IWiFiDirectServiceProvisioningInfo_Impl>(size) as
        Array<IWiFiDirectServiceProvisioningInfo?>
  }
}
