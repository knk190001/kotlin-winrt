package Windows.Devices.Sensors

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

@ABIMarker(IActivitySensorReadingChangeReport.ABI::class)
@Signature("{4f3c2915-d93b-47bd-960a-f20fb2f322b9}")
@Guid("4f3c2915d93b47bd960af20fb2f322b9")
@WinRTInterface("4f3c2915d93b47bd960af20fb2f322b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivitySensorReadingChangeReport.ByReference::class)
public interface IActivitySensorReadingChangeReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): ActivitySensorReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivitySensorReadingChangeReport> {
    public override fun getValue() =
        ABI.makeIActivitySensorReadingChangeReport(pointer.getPointer(0))

    public fun setValue(value: IActivitySensorReadingChangeReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivitySensorReadingChangeReport {
    public val __1540284709_Ptr: Pointer?

    public val _1540284709_VtblPtr: Pointer?
      get() = __1540284709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): ActivitySensorReading? {
      val fnPtr = _1540284709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivitySensorReading>()
      val hr = fn.invokeHR(arrayOf(__1540284709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivitySensorReading>(result.getValue())
      return resultValue
    }
  }

  public class IActivitySensorReadingChangeReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1540284709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivitySensorReadingChangeReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f3c2915d93b47bd960af20fb2f322b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivitySensorReadingChangeReport(ptr: Pointer?): WithDefault =
        IActivitySensorReadingChangeReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivitySensorReadingChangeReport {
      val address = segment.toRawLongValue()
      return makeIActivitySensorReadingChangeReport(Pointer(address))
    }

    public override fun toNative(obj: IActivitySensorReadingChangeReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1540284709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivitySensorReadingChangeReport):
        Array<IActivitySensorReadingChangeReport?> = (elements as
        Array<IActivitySensorReadingChangeReport?>).castToImpl<IActivitySensorReadingChangeReport,IActivitySensorReadingChangeReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivitySensorReadingChangeReport?> =
        arrayOfNulls<IActivitySensorReadingChangeReport_Impl>(size) as
        Array<IActivitySensorReadingChangeReport?>
  }
}
