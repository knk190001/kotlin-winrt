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

@ABIMarker(IInclinometerStatics4.ABI::class)
@Signature("{e8ba96f9-6e85-4a83-aed0-d7cdcc9856c8}")
@Guid("e8ba96f96e854a83aed0d7cdcc9856c8")
@WinRTInterface("e8ba96f96e854a83aed0d7cdcc9856c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerStatics4.ByReference::class)
public interface IInclinometerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(readingType: SensorReadingType?): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Inclinometer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerStatics4> {
    public override fun getValue() = ABI.makeIInclinometerStatics4(pointer.getPointer(0))

    public fun setValue(value: IInclinometerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerStatics4 {
    public val __1043050568_Ptr: Pointer?

    public val _1043050568_VtblPtr: Pointer?
      get() = __1043050568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(readingType: SensorReadingType?): String? {
      val fnPtr = _1043050568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1043050568_Ptr, marshalToNative(readingType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Inclinometer?>? {
      val fnPtr = _1043050568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Inclinometer?>>()
      val hr = fn.invokeHR(arrayOf(__1043050568_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Inclinometer?>>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1043050568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8ba96f96e854a83aed0d7cdcc9856c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerStatics4(ptr: Pointer?): WithDefault =
        IInclinometerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerStatics4 {
      val address = segment.toRawLongValue()
      return makeIInclinometerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1043050568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerStatics4): Array<IInclinometerStatics4?> =
        (elements as
        Array<IInclinometerStatics4?>).castToImpl<IInclinometerStatics4,IInclinometerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerStatics4?> =
        arrayOfNulls<IInclinometerStatics4_Impl>(size) as Array<IInclinometerStatics4?>
  }
}
