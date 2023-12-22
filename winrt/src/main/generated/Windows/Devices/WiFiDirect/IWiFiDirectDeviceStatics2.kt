package Windows.Devices.WiFiDirect

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

@ABIMarker(IWiFiDirectDeviceStatics2.ABI::class)
@Signature("{1a953e49-b103-437e-9226-ab67971342f9}")
@Guid("1a953e49b103437e9226ab67971342f9")
@WinRTInterface("1a953e49b103437e9226ab67971342f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectDeviceStatics2.ByReference::class)
public interface IWiFiDirectDeviceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(type: WiFiDirectDeviceSelectorType?): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?, connectionParameters: WiFiDirectConnectionParameters?):
      IAsyncOperation<WiFiDirectDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectDeviceStatics2> {
    public override fun getValue() = ABI.makeIWiFiDirectDeviceStatics2(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectDeviceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectDeviceStatics2 {
    public val __1119718288_Ptr: Pointer?

    public val _1119718288_VtblPtr: Pointer?
      get() = __1119718288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(type: WiFiDirectDeviceSelectorType?): String? {
      val fnPtr = _1119718288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1119718288_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?,
        connectionParameters: WiFiDirectConnectionParameters?):
        IAsyncOperation<WiFiDirectDevice?>? {
      val fnPtr = _1119718288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1119718288_Ptr, marshalToNative(deviceId),
          marshalToNative(connectionParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiDirectDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectDeviceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1119718288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectDeviceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a953e49b103437e9226ab67971342f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectDeviceStatics2(ptr: Pointer?): WithDefault =
        IWiFiDirectDeviceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectDeviceStatics2 {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectDeviceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectDeviceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1119718288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectDeviceStatics2):
        Array<IWiFiDirectDeviceStatics2?> = (elements as
        Array<IWiFiDirectDeviceStatics2?>).castToImpl<IWiFiDirectDeviceStatics2,IWiFiDirectDeviceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectDeviceStatics2?> =
        arrayOfNulls<IWiFiDirectDeviceStatics2_Impl>(size) as Array<IWiFiDirectDeviceStatics2?>
  }
}
