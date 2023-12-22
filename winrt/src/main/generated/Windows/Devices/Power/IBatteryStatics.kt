package Windows.Devices.Power

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

@ABIMarker(IBatteryStatics.ABI::class)
@Signature("{79cd72b6-9e5e-4452-bea6-dfcd541e597f}")
@Guid("79cd72b69e5e4452bea6dfcd541e597f")
@WinRTInterface("79cd72b69e5e4452bea6dfcd541e597f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBatteryStatics.ByReference::class)
public interface IBatteryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AggregateBattery(): Battery?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Battery?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBatteryStatics> {
    public override fun getValue() = ABI.makeIBatteryStatics(pointer.getPointer(0))

    public fun setValue(value: IBatteryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBatteryStatics {
    public val __2074411432_Ptr: Pointer?

    public val _2074411432_VtblPtr: Pointer?
      get() = __2074411432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AggregateBattery(): Battery? {
      val fnPtr = _2074411432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Battery>()
      val hr = fn.invokeHR(arrayOf(__2074411432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Battery>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Battery?>? {
      val fnPtr = _2074411432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Battery?>>()
      val hr = fn.invokeHR(arrayOf(__2074411432_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Battery?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _2074411432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2074411432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBatteryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2074411432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBatteryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79cd72b69e5e4452bea6dfcd541e597f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBatteryStatics(ptr: Pointer?): WithDefault = IBatteryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBatteryStatics {
      val address = segment.toRawLongValue()
      return makeIBatteryStatics(Pointer(address))
    }

    public override fun toNative(obj: IBatteryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074411432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBatteryStatics): Array<IBatteryStatics?> = (elements as
        Array<IBatteryStatics?>).castToImpl<IBatteryStatics,IBatteryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBatteryStatics?> =
        arrayOfNulls<IBatteryStatics_Impl>(size) as Array<IBatteryStatics?>
  }
}
