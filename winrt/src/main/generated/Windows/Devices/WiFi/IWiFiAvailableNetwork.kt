package Windows.Devices.WiFi

import Windows.Foundation.TimeSpan
import Windows.Networking.Connectivity.NetworkSecuritySettings
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
import kotlin.Byte
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiAvailableNetwork.ABI::class)
@Signature("{26e96246-183e-4704-9826-71b4a2f0f668}")
@Guid("26e96246183e4704982671b4a2f0f668")
@WinRTInterface("26e96246183e4704982671b4a2f0f668")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiAvailableNetwork.ByReference::class)
public interface IWiFiAvailableNetwork : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uptime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_Ssid(): String?

  @InterfaceMethod(2)
  public fun get_Bssid(): String?

  @InterfaceMethod(3)
  public fun get_ChannelCenterFrequencyInKilohertz(): Int

  @InterfaceMethod(4)
  public fun get_NetworkRssiInDecibelMilliwatts(): Double

  @InterfaceMethod(5)
  public fun get_SignalBars(): Byte

  @InterfaceMethod(6)
  public fun get_NetworkKind(): WiFiNetworkKind?

  @InterfaceMethod(7)
  public fun get_PhyKind(): WiFiPhyKind?

  @InterfaceMethod(8)
  public fun get_SecuritySettings(): NetworkSecuritySettings?

  @InterfaceMethod(9)
  public fun get_BeaconInterval(): TimeSpan?

  @InterfaceMethod(10)
  public fun get_IsWiFiDirect(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiAvailableNetwork> {
    public override fun getValue() = ABI.makeIWiFiAvailableNetwork(pointer.getPointer(0))

    public fun setValue(value: IWiFiAvailableNetwork_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiAvailableNetwork {
    public val __1427347598_Ptr: Pointer?

    public val _1427347598_VtblPtr: Pointer?
      get() = __1427347598_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uptime(): TimeSpan? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Ssid(): String? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Bssid(): String? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ChannelCenterFrequencyInKilohertz(): Int {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_NetworkRssiInDecibelMilliwatts(): Double {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SignalBars(): Byte {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_NetworkKind(): WiFiNetworkKind? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiNetworkKind>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiNetworkKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PhyKind(): WiFiPhyKind? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiPhyKind>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiPhyKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SecuritySettings(): NetworkSecuritySettings? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkSecuritySettings>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkSecuritySettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_BeaconInterval(): TimeSpan? {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsWiFiDirect(): Boolean {
      val fnPtr = _1427347598_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1427347598_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWiFiAvailableNetwork_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1427347598_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiAvailableNetwork, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26e96246183e4704982671b4a2f0f668")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiAvailableNetwork(ptr: Pointer?): WithDefault =
        IWiFiAvailableNetwork_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiAvailableNetwork {
      val address = segment.toRawLongValue()
      return makeIWiFiAvailableNetwork(Pointer(address))
    }

    public override fun toNative(obj: IWiFiAvailableNetwork): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1427347598_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiAvailableNetwork): Array<IWiFiAvailableNetwork?> =
        (elements as
        Array<IWiFiAvailableNetwork?>).castToImpl<IWiFiAvailableNetwork,IWiFiAvailableNetwork_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiAvailableNetwork?> =
        arrayOfNulls<IWiFiAvailableNetwork_Impl>(size) as Array<IWiFiAvailableNetwork?>
  }
}
