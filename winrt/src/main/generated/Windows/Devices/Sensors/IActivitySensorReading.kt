package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivitySensorReading.ABI::class)
@Signature("{85125a96-1472-40a2-b2ae-e1ef29226c78}")
@Guid("85125a96147240a2b2aee1ef29226c78")
@WinRTInterface("85125a96147240a2b2aee1ef29226c78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivitySensorReading.ByReference::class)
public interface IActivitySensorReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_Activity(): ActivityType?

  @InterfaceMethod(2)
  public fun get_Confidence(): ActivitySensorReadingConfidence?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivitySensorReading> {
    public override fun getValue() = ABI.makeIActivitySensorReading(pointer.getPointer(0))

    public fun setValue(value: IActivitySensorReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivitySensorReading {
    public val __1115253705_Ptr: Pointer?

    public val _1115253705_VtblPtr: Pointer?
      get() = __1115253705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1115253705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1115253705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Activity(): ActivityType? {
      val fnPtr = _1115253705_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivityType>()
      val hr = fn.invokeHR(arrayOf(__1115253705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivityType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Confidence(): ActivitySensorReadingConfidence? {
      val fnPtr = _1115253705_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivitySensorReadingConfidence>()
      val hr = fn.invokeHR(arrayOf(__1115253705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivitySensorReadingConfidence>(result.getValue())
      return resultValue
    }
  }

  public class IActivitySensorReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1115253705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivitySensorReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85125a96147240a2b2aee1ef29226c78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivitySensorReading(ptr: Pointer?): WithDefault =
        IActivitySensorReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivitySensorReading {
      val address = segment.toRawLongValue()
      return makeIActivitySensorReading(Pointer(address))
    }

    public override fun toNative(obj: IActivitySensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1115253705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivitySensorReading): Array<IActivitySensorReading?> =
        (elements as
        Array<IActivitySensorReading?>).castToImpl<IActivitySensorReading,IActivitySensorReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivitySensorReading?> =
        arrayOfNulls<IActivitySensorReading_Impl>(size) as Array<IActivitySensorReading?>
  }
}
