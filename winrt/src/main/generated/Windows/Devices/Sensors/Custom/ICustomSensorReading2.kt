package Windows.Devices.Sensors.Custom

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICustomSensorReading2.ABI::class)
@Signature("{223c98ea-bf73-4992-9a48-d3c897594ccb}")
@Guid("223c98eabf7349929a48d3c897594ccb")
@WinRTInterface("223c98eabf7349929a48d3c897594ccb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSensorReading2.ByReference::class)
public interface ICustomSensorReading2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PerformanceCount(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomSensorReading2> {
    public override fun getValue() = ABI.makeICustomSensorReading2(pointer.getPointer(0))

    public fun setValue(value: ICustomSensorReading2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSensorReading2 {
    public val __2072599928_Ptr: Pointer?

    public val _2072599928_VtblPtr: Pointer?
      get() = __2072599928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PerformanceCount(): IReference<TimeSpan?>? {
      val fnPtr = _2072599928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2072599928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class ICustomSensorReading2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2072599928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSensorReading2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("223c98eabf7349929a48d3c897594ccb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSensorReading2(ptr: Pointer?): WithDefault =
        ICustomSensorReading2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSensorReading2 {
      val address = segment.toRawLongValue()
      return makeICustomSensorReading2(Pointer(address))
    }

    public override fun toNative(obj: ICustomSensorReading2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2072599928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSensorReading2): Array<ICustomSensorReading2?> =
        (elements as
        Array<ICustomSensorReading2?>).castToImpl<ICustomSensorReading2,ICustomSensorReading2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSensorReading2?> =
        arrayOfNulls<ICustomSensorReading2_Impl>(size) as Array<ICustomSensorReading2?>
  }
}
