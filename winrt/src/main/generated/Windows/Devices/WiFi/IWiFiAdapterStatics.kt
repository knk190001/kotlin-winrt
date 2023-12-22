package Windows.Devices.WiFi

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IWiFiAdapterStatics.ABI::class)
@Signature("{da25fddd-d24c-43e3-aabd-c4659f730f99}")
@Guid("da25fdddd24c43e3aabdc4659f730f99")
@WinRTInterface("da25fdddd24c43e3aabdc4659f730f99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiAdapterStatics.ByReference::class)
public interface IWiFiAdapterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllAdaptersAsync(): IAsyncOperation<IVectorView<WiFiAdapter?>?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiAdapter?>?

  @InterfaceMethod(3)
  public fun RequestAccessAsync(): IAsyncOperation<WiFiAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiAdapterStatics> {
    public override fun getValue() = ABI.makeIWiFiAdapterStatics(pointer.getPointer(0))

    public fun setValue(value: IWiFiAdapterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiAdapterStatics {
    public val __689774851_Ptr: Pointer?

    public val _689774851_VtblPtr: Pointer?
      get() = __689774851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAdaptersAsync(): IAsyncOperation<IVectorView<WiFiAdapter?>?>? {
      val fnPtr = _689774851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WiFiAdapter?>?>>()
      val hr = fn.invokeHR(arrayOf(__689774851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WiFiAdapter?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _689774851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__689774851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiAdapter?>? {
      val fnPtr = _689774851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiAdapter?>>()
      val hr = fn.invokeHR(arrayOf(__689774851_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiAdapter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessAsync(): IAsyncOperation<WiFiAccessStatus?>? {
      val fnPtr = _689774851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__689774851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiAdapterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __689774851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiAdapterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da25fdddd24c43e3aabdc4659f730f99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiAdapterStatics(ptr: Pointer?): WithDefault = IWiFiAdapterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiAdapterStatics {
      val address = segment.toRawLongValue()
      return makeIWiFiAdapterStatics(Pointer(address))
    }

    public override fun toNative(obj: IWiFiAdapterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__689774851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiAdapterStatics): Array<IWiFiAdapterStatics?> =
        (elements as
        Array<IWiFiAdapterStatics?>).castToImpl<IWiFiAdapterStatics,IWiFiAdapterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiAdapterStatics?> =
        arrayOfNulls<IWiFiAdapterStatics_Impl>(size) as Array<IWiFiAdapterStatics?>
  }
}
