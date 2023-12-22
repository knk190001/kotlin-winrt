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

@ABIMarker(IWiFiDirectDeviceStatics.ABI::class)
@Signature("{e86cb57c-3aac-4851-a792-482aaf931b04}")
@Guid("e86cb57c3aac4851a792482aaf931b04")
@WinRTInterface("e86cb57c3aac4851a792482aaf931b04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectDeviceStatics.ByReference::class)
public interface IWiFiDirectDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiDirectDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectDeviceStatics> {
    public override fun getValue() = ABI.makeIWiFiDirectDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectDeviceStatics {
    public val __379522050_Ptr: Pointer?

    public val _379522050_VtblPtr: Pointer?
      get() = __379522050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _379522050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__379522050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<WiFiDirectDevice?>? {
      val fnPtr = _379522050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectDevice?>>()
      val hr = fn.invokeHR(arrayOf(__379522050_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiDirectDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __379522050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e86cb57c3aac4851a792482aaf931b04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectDeviceStatics(ptr: Pointer?): WithDefault =
        IWiFiDirectDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__379522050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectDeviceStatics):
        Array<IWiFiDirectDeviceStatics?> = (elements as
        Array<IWiFiDirectDeviceStatics?>).castToImpl<IWiFiDirectDeviceStatics,IWiFiDirectDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectDeviceStatics?> =
        arrayOfNulls<IWiFiDirectDeviceStatics_Impl>(size) as Array<IWiFiDirectDeviceStatics?>
  }
}
