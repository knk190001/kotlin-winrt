package Windows.Devices.Sensors

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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

@ABIMarker(IPedometerStatics.ABI::class)
@Signature("{82980a2f-4083-4dfb-b411-938ea0f4b946}")
@Guid("82980a2f40834dfbb411938ea0f4b946")
@WinRTInterface("82980a2f40834dfbb411938ea0f4b946")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPedometerStatics.ByReference::class)
public interface IPedometerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Pedometer?>?

  @InterfaceMethod(1)
  public fun GetDefaultAsync(): IAsyncOperation<Pedometer?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(3)
  public fun GetSystemHistoryAsync(fromTime: DateTime?):
      IAsyncOperation<IVectorView<PedometerReading?>?>?

  @InterfaceMethod(4)
  public fun GetSystemHistoryAsync(fromTime: DateTime?, duration: TimeSpan?):
      IAsyncOperation<IVectorView<PedometerReading?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPedometerStatics> {
    public override fun getValue() = ABI.makeIPedometerStatics(pointer.getPointer(0))

    public fun setValue(value: IPedometerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPedometerStatics {
    public val __1738335448_Ptr: Pointer?

    public val _1738335448_VtblPtr: Pointer?
      get() = __1738335448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Pedometer?>? {
      val fnPtr = _1738335448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Pedometer?>>()
      val hr = fn.invokeHR(arrayOf(__1738335448_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Pedometer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefaultAsync(): IAsyncOperation<Pedometer?>? {
      val fnPtr = _1738335448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Pedometer?>>()
      val hr = fn.invokeHR(arrayOf(__1738335448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Pedometer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1738335448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1738335448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetSystemHistoryAsync(fromTime: DateTime?):
        IAsyncOperation<IVectorView<PedometerReading?>?>? {
      val fnPtr = _1738335448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PedometerReading?>?>>()
      val hr = fn.invokeHR(arrayOf(__1738335448_Ptr, marshalToNative(fromTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PedometerReading?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSystemHistoryAsync(fromTime: DateTime?, duration: TimeSpan?):
        IAsyncOperation<IVectorView<PedometerReading?>?>? {
      val fnPtr = _1738335448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PedometerReading?>?>>()
      val hr = fn.invokeHR(arrayOf(__1738335448_Ptr, marshalToNative(fromTime),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PedometerReading?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IPedometerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1738335448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPedometerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82980a2f40834dfbb411938ea0f4b946")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPedometerStatics(ptr: Pointer?): WithDefault = IPedometerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPedometerStatics {
      val address = segment.toRawLongValue()
      return makeIPedometerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPedometerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1738335448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPedometerStatics): Array<IPedometerStatics?> = (elements
        as Array<IPedometerStatics?>).castToImpl<IPedometerStatics,IPedometerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPedometerStatics?> =
        arrayOfNulls<IPedometerStatics_Impl>(size) as Array<IPedometerStatics?>
  }
}
