package Windows.Media.DialProtocol

import Windows.Devices.Enumeration.DeviceInformation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDialDeviceStatics.ABI::class)
@Signature("{aa69cc95-01f8-4758-8461-2bbd1cdc3cf3}")
@Guid("aa69cc9501f8475884612bbd1cdc3cf3")
@WinRTInterface("aa69cc9501f8475884612bbd1cdc3cf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDeviceStatics.ByReference::class)
public interface IDialDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(appName: String?): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(value: String?): IAsyncOperation<DialDevice?>?

  @InterfaceMethod(2)
  public fun DeviceInfoSupportsDialAsync(device: DeviceInformation?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialDeviceStatics> {
    public override fun getValue() = ABI.makeIDialDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IDialDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDeviceStatics {
    public val __1432600083_Ptr: Pointer?

    public val _1432600083_VtblPtr: Pointer?
      get() = __1432600083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(appName: String?): String? {
      val fnPtr = _1432600083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1432600083_Ptr, marshalToNative(appName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(value: String?): IAsyncOperation<DialDevice?>? {
      val fnPtr = _1432600083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1432600083_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeviceInfoSupportsDialAsync(device: DeviceInformation?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1432600083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1432600083_Ptr, marshalToNative(device), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IDialDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432600083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa69cc9501f8475884612bbd1cdc3cf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDeviceStatics(ptr: Pointer?): WithDefault = IDialDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIDialDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IDialDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432600083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDeviceStatics): Array<IDialDeviceStatics?> =
        (elements as
        Array<IDialDeviceStatics?>).castToImpl<IDialDeviceStatics,IDialDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDeviceStatics?> =
        arrayOfNulls<IDialDeviceStatics_Impl>(size) as Array<IDialDeviceStatics?>
  }
}
