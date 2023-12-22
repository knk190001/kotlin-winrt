package Windows.Devices.I2c

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

@ABIMarker(II2cDeviceStatics.ABI::class)
@Signature("{91a33be3-7334-4512-96bc-fbae9459f5f6}")
@Guid("91a33be37334451296bcfbae9459f5f6")
@WinRTInterface("91a33be37334451296bcfbae9459f5f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cDeviceStatics.ByReference::class)
public interface II2cDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(friendlyName: String?): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?, settings: I2cConnectionSettings?):
      IAsyncOperation<I2cDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<II2cDeviceStatics> {
    public override fun getValue() = ABI.makeII2cDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: II2cDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cDeviceStatics {
    public val __1628207232_Ptr: Pointer?

    public val _1628207232_VtblPtr: Pointer?
      get() = __1628207232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1628207232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1628207232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(friendlyName: String?): String? {
      val fnPtr = _1628207232_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1628207232_Ptr, marshalToNative(friendlyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?, settings: I2cConnectionSettings?):
        IAsyncOperation<I2cDevice?>? {
      val fnPtr = _1628207232_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<I2cDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1628207232_Ptr, marshalToNative(deviceId),
          marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<I2cDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class II2cDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1628207232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91a33be37334451296bcfbae9459f5f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cDeviceStatics(ptr: Pointer?): WithDefault = II2cDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cDeviceStatics {
      val address = segment.toRawLongValue()
      return makeII2cDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: II2cDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1628207232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cDeviceStatics): Array<II2cDeviceStatics?> = (elements
        as Array<II2cDeviceStatics?>).castToImpl<II2cDeviceStatics,II2cDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cDeviceStatics?> =
        arrayOfNulls<II2cDeviceStatics_Impl>(size) as Array<II2cDeviceStatics?>
  }
}
