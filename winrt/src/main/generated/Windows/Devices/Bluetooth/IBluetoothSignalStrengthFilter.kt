package Windows.Devices.Bluetooth

import Windows.Foundation.IReference
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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothSignalStrengthFilter.ABI::class)
@Signature("{df7b7391-6bb5-4cfe-90b1-5d7324edcf7f}")
@Guid("df7b73916bb54cfe90b15d7324edcf7f")
@WinRTInterface("df7b73916bb54cfe90b15d7324edcf7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothSignalStrengthFilter.ByReference::class)
public interface IBluetoothSignalStrengthFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InRangeThresholdInDBm(): IReference<Short>?

  @InterfaceMethod(1)
  public fun put_InRangeThresholdInDBm(value: IReference<Short>?): Unit

  @InterfaceMethod(2)
  public fun get_OutOfRangeThresholdInDBm(): IReference<Short>?

  @InterfaceMethod(3)
  public fun put_OutOfRangeThresholdInDBm(value: IReference<Short>?): Unit

  @InterfaceMethod(4)
  public fun get_OutOfRangeTimeout(): IReference<TimeSpan?>?

  @InterfaceMethod(5)
  public fun put_OutOfRangeTimeout(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(6)
  public fun get_SamplingInterval(): IReference<TimeSpan?>?

  @InterfaceMethod(7)
  public fun put_SamplingInterval(value: IReference<TimeSpan?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothSignalStrengthFilter> {
    public override fun getValue() = ABI.makeIBluetoothSignalStrengthFilter(pointer.getPointer(0))

    public fun setValue(value: IBluetoothSignalStrengthFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothSignalStrengthFilter {
    public val __1062100024_Ptr: Pointer?

    public val _1062100024_VtblPtr: Pointer?
      get() = __1062100024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InRangeThresholdInDBm(): IReference<Short>? {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InRangeThresholdInDBm(value: IReference<Short>?): Unit {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutOfRangeThresholdInDBm(): IReference<Short>? {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OutOfRangeThresholdInDBm(value: IReference<Short>?): Unit {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OutOfRangeTimeout(): IReference<TimeSpan?>? {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_OutOfRangeTimeout(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SamplingInterval(): IReference<TimeSpan?>? {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SamplingInterval(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1062100024_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062100024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothSignalStrengthFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1062100024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothSignalStrengthFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df7b73916bb54cfe90b15d7324edcf7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothSignalStrengthFilter(ptr: Pointer?): WithDefault =
        IBluetoothSignalStrengthFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothSignalStrengthFilter {
      val address = segment.toRawLongValue()
      return makeIBluetoothSignalStrengthFilter(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothSignalStrengthFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1062100024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothSignalStrengthFilter):
        Array<IBluetoothSignalStrengthFilter?> = (elements as
        Array<IBluetoothSignalStrengthFilter?>).castToImpl<IBluetoothSignalStrengthFilter,IBluetoothSignalStrengthFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothSignalStrengthFilter?> =
        arrayOfNulls<IBluetoothSignalStrengthFilter_Impl>(size) as
        Array<IBluetoothSignalStrengthFilter?>
  }
}
