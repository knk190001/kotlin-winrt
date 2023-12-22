package Windows.Devices.WiFiDirect

import Windows.Devices.Enumeration.DevicePairingKinds
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

@ABIMarker(IWiFiDirectConnectionParametersStatics.ABI::class)
@Signature("{598af493-7642-456f-b9d8-e8a9eb1f401a}")
@Guid("598af4937642456fb9d8e8a9eb1f401a")
@WinRTInterface("598af4937642456fb9d8e8a9eb1f401a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectConnectionParametersStatics.ByReference::class)
public interface IWiFiDirectConnectionParametersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod?):
      DevicePairingKinds?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectConnectionParametersStatics> {
    public override fun getValue() =
        ABI.makeIWiFiDirectConnectionParametersStatics(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectConnectionParametersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectConnectionParametersStatics {
    public val __1250488976_Ptr: Pointer?

    public val _1250488976_VtblPtr: Pointer?
      get() = __1250488976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod?):
        DevicePairingKinds? {
      val fnPtr = _1250488976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePairingKinds>()
      val hr = fn.invokeHR(arrayOf(__1250488976_Ptr, marshalToNative(configurationMethod), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePairingKinds>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectConnectionParametersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1250488976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectConnectionParametersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("598af4937642456fb9d8e8a9eb1f401a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectConnectionParametersStatics(ptr: Pointer?): WithDefault =
        IWiFiDirectConnectionParametersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectConnectionParametersStatics {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectConnectionParametersStatics(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectConnectionParametersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1250488976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectConnectionParametersStatics):
        Array<IWiFiDirectConnectionParametersStatics?> = (elements as
        Array<IWiFiDirectConnectionParametersStatics?>).castToImpl<IWiFiDirectConnectionParametersStatics,IWiFiDirectConnectionParametersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectConnectionParametersStatics?> =
        arrayOfNulls<IWiFiDirectConnectionParametersStatics_Impl>(size) as
        Array<IWiFiDirectConnectionParametersStatics?>
  }
}
