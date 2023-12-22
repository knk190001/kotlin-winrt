package Windows.Devices.WiFi

import Windows.Foundation.IAsyncOperation
import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IWiFiAdapter2.ABI::class)
@Signature("{5bc4501d-81e4-453d-9430-1fcafbadd6b6}")
@Guid("5bc4501d81e4453d94301fcafbadd6b6")
@WinRTInterface("5bc4501d81e4453d94301fcafbadd6b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiAdapter2.ByReference::class)
public interface IWiFiAdapter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetWpsConfigurationAsync(availableNetwork: WiFiAvailableNetwork?):
      IAsyncOperation<WiFiWpsConfigurationResult?>?

  @InterfaceMethod(1)
  public fun ConnectAsync(
    availableNetwork: WiFiAvailableNetwork?,
    reconnectionKind: WiFiReconnectionKind?,
    passwordCredential: PasswordCredential?,
    ssid: String?,
    connectionMethod: WiFiConnectionMethod?
  ): IAsyncOperation<WiFiConnectionResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWiFiAdapter2>
      {
    public override fun getValue() = ABI.makeIWiFiAdapter2(pointer.getPointer(0))

    public fun setValue(value: IWiFiAdapter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiAdapter2 {
    public val __654678000_Ptr: Pointer?

    public val _654678000_VtblPtr: Pointer?
      get() = __654678000_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetWpsConfigurationAsync(availableNetwork: WiFiAvailableNetwork?):
        IAsyncOperation<WiFiWpsConfigurationResult?>? {
      val fnPtr = _654678000_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiWpsConfigurationResult?>>()
      val hr = fn.invokeHR(arrayOf(__654678000_Ptr, marshalToNative(availableNetwork), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiWpsConfigurationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConnectAsync(
      availableNetwork: WiFiAvailableNetwork?,
      reconnectionKind: WiFiReconnectionKind?,
      passwordCredential: PasswordCredential?,
      ssid: String?,
      connectionMethod: WiFiConnectionMethod?
    ): IAsyncOperation<WiFiConnectionResult?>? {
      val fnPtr = _654678000_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiConnectionResult?>>()
      val hr = fn.invokeHR(arrayOf(__654678000_Ptr, marshalToNative(availableNetwork),
          marshalToNative(reconnectionKind), marshalToNative(passwordCredential),
          marshalToNative(ssid), marshalToNative(connectionMethod), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiConnectionResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiAdapter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654678000_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiAdapter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bc4501d81e4453d94301fcafbadd6b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiAdapter2(ptr: Pointer?): WithDefault = IWiFiAdapter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiAdapter2 {
      val address = segment.toRawLongValue()
      return makeIWiFiAdapter2(Pointer(address))
    }

    public override fun toNative(obj: IWiFiAdapter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654678000_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiAdapter2): Array<IWiFiAdapter2?> = (elements as
        Array<IWiFiAdapter2?>).castToImpl<IWiFiAdapter2,IWiFiAdapter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiAdapter2?> =
        arrayOfNulls<IWiFiAdapter2_Impl>(size) as Array<IWiFiAdapter2?>
  }
}
