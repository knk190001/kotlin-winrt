package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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

@ABIMarker(IPedometerReading.ABI::class)
@Signature("{2245dcf4-a8e1-432f-896a-be0dd9b02d24}")
@Guid("2245dcf4a8e1432f896abe0dd9b02d24")
@WinRTInterface("2245dcf4a8e1432f896abe0dd9b02d24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPedometerReading.ByReference::class)
public interface IPedometerReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StepKind(): PedometerStepKind?

  @InterfaceMethod(1)
  public fun get_CumulativeSteps(): Int

  @InterfaceMethod(2)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(3)
  public fun get_CumulativeStepsDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPedometerReading> {
    public override fun getValue() = ABI.makeIPedometerReading(pointer.getPointer(0))

    public fun setValue(value: IPedometerReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPedometerReading {
    public val __1239214575_Ptr: Pointer?

    public val _1239214575_VtblPtr: Pointer?
      get() = __1239214575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StepKind(): PedometerStepKind? {
      val fnPtr = _1239214575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PedometerStepKind>()
      val hr = fn.invokeHR(arrayOf(__1239214575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PedometerStepKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CumulativeSteps(): Int {
      val fnPtr = _1239214575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1239214575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1239214575_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1239214575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CumulativeStepsDuration(): TimeSpan? {
      val fnPtr = _1239214575_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1239214575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IPedometerReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1239214575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPedometerReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2245dcf4a8e1432f896abe0dd9b02d24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPedometerReading(ptr: Pointer?): WithDefault = IPedometerReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPedometerReading {
      val address = segment.toRawLongValue()
      return makeIPedometerReading(Pointer(address))
    }

    public override fun toNative(obj: IPedometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1239214575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPedometerReading): Array<IPedometerReading?> = (elements
        as Array<IPedometerReading?>).castToImpl<IPedometerReading,IPedometerReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPedometerReading?> =
        arrayOfNulls<IPedometerReading_Impl>(size) as Array<IPedometerReading?>
  }
}
