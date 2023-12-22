package Windows.Devices.WiFiDirect.Services

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWiFiDirectServiceStatics.ABI::class)
@Signature("{7db40045-fd74-4688-b725-5dce86acf233}")
@Guid("7db40045fd744688b7255dce86acf233")
@WinRTInterface("7db40045fd744688b7255dce86acf233")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceStatics.ByReference::class)
public interface IWiFiDirectServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSelector(serviceName: String?): String?

  @InterfaceMethod(1)
  public fun GetSelector(serviceName: String?, serviceInfoFilter: IBuffer?): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiDirectService?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceStatics> {
    public override fun getValue() = ABI.makeIWiFiDirectServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceStatics {
    public val __1802793733_Ptr: Pointer?

    public val _1802793733_VtblPtr: Pointer?
      get() = __1802793733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSelector(serviceName: String?): String? {
      val fnPtr = _1802793733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802793733_Ptr, marshalToNative(serviceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSelector(serviceName: String?, serviceInfoFilter: IBuffer?): String? {
      val fnPtr = _1802793733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802793733_Ptr, marshalToNative(serviceName),
          marshalToNative(serviceInfoFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiDirectService?>? {
      val fnPtr = _1802793733_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectService?>>()
      val hr = fn.invokeHR(arrayOf(__1802793733_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiDirectService?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1802793733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7db40045fd744688b7255dce86acf233")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceStatics(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectServiceStatics {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802793733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceStatics):
        Array<IWiFiDirectServiceStatics?> = (elements as
        Array<IWiFiDirectServiceStatics?>).castToImpl<IWiFiDirectServiceStatics,IWiFiDirectServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceStatics?> =
        arrayOfNulls<IWiFiDirectServiceStatics_Impl>(size) as Array<IWiFiDirectServiceStatics?>
  }
}
