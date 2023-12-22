package Windows.Devices.Sensors

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

@ABIMarker(IAccelerometerStatics3.ABI::class)
@Signature("{9de218cf-455d-4cf3-8200-70e1410340f8}")
@Guid("9de218cf455d4cf3820070e1410340f8")
@WinRTInterface("9de218cf455d4cf3820070e1410340f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerStatics3.ByReference::class)
public interface IAccelerometerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Accelerometer?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(readingType: AccelerometerReadingType?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerStatics3> {
    public override fun getValue() = ABI.makeIAccelerometerStatics3(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerStatics3 {
    public val __1403103249_Ptr: Pointer?

    public val _1403103249_VtblPtr: Pointer?
      get() = __1403103249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Accelerometer?>? {
      val fnPtr = _1403103249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Accelerometer?>>()
      val hr = fn.invokeHR(arrayOf(__1403103249_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Accelerometer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(readingType: AccelerometerReadingType?): String? {
      val fnPtr = _1403103249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1403103249_Ptr, marshalToNative(readingType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1403103249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9de218cf455d4cf3820070e1410340f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerStatics3(ptr: Pointer?): WithDefault =
        IAccelerometerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerStatics3 {
      val address = segment.toRawLongValue()
      return makeIAccelerometerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1403103249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerStatics3): Array<IAccelerometerStatics3?> =
        (elements as
        Array<IAccelerometerStatics3?>).castToImpl<IAccelerometerStatics3,IAccelerometerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerStatics3?> =
        arrayOfNulls<IAccelerometerStatics3_Impl>(size) as Array<IAccelerometerStatics3?>
  }
}
