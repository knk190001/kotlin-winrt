package Windows.Devices.PointOfService

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

@ABIMarker(IMagneticStripeReaderStatics.ABI::class)
@Signature("{c45fab4a-efd7-4760-a5ce-15b0e47e94eb}")
@Guid("c45fab4aefd74760a5ce15b0e47e94eb")
@WinRTInterface("c45fab4aefd74760a5ce15b0e47e94eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderStatics.ByReference::class)
public interface IMagneticStripeReaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<MagneticStripeReader?>?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<MagneticStripeReader?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderStatics> {
    public override fun getValue() = ABI.makeIMagneticStripeReaderStatics(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderStatics {
    public val __391372014_Ptr: Pointer?

    public val _391372014_VtblPtr: Pointer?
      get() = __391372014_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<MagneticStripeReader?>? {
      val fnPtr = _391372014_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MagneticStripeReader?>>()
      val hr = fn.invokeHR(arrayOf(__391372014_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MagneticStripeReader?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<MagneticStripeReader?>? {
      val fnPtr = _391372014_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MagneticStripeReader?>>()
      val hr = fn.invokeHR(arrayOf(__391372014_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MagneticStripeReader?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _391372014_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__391372014_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __391372014_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c45fab4aefd74760a5ce15b0e47e94eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderStatics(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderStatics {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderStatics(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__391372014_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderStatics):
        Array<IMagneticStripeReaderStatics?> = (elements as
        Array<IMagneticStripeReaderStatics?>).castToImpl<IMagneticStripeReaderStatics,IMagneticStripeReaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderStatics?> =
        arrayOfNulls<IMagneticStripeReaderStatics_Impl>(size) as
        Array<IMagneticStripeReaderStatics?>
  }
}
