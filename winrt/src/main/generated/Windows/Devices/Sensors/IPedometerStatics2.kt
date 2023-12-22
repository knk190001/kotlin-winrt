package Windows.Devices.Sensors

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPedometerStatics2.ABI::class)
@Signature("{79f5c6bb-ce0e-4133-b47e-8627ea72f677}")
@Guid("79f5c6bbce0e4133b47e8627ea72f677")
@WinRTInterface("79f5c6bbce0e4133b47e8627ea72f677")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPedometerStatics2.ByReference::class)
public interface IPedometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetReadingsFromTriggerDetails(triggerDetails: SensorDataThresholdTriggerDetails?):
      IVectorView<PedometerReading?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPedometerStatics2> {
    public override fun getValue() = ABI.makeIPedometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPedometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPedometerStatics2 {
    public val __1946176010_Ptr: Pointer?

    public val _1946176010_VtblPtr: Pointer?
      get() = __1946176010_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetReadingsFromTriggerDetails(triggerDetails: SensorDataThresholdTriggerDetails?):
        IVectorView<PedometerReading?>? {
      val fnPtr = _1946176010_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PedometerReading?>>()
      val hr = fn.invokeHR(arrayOf(__1946176010_Ptr, marshalToNative(triggerDetails), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PedometerReading?>>(result.getValue())
      return resultValue
    }
  }

  public class IPedometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946176010_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPedometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79f5c6bbce0e4133b47e8627ea72f677")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPedometerStatics2(ptr: Pointer?): WithDefault = IPedometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPedometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPedometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPedometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946176010_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPedometerStatics2): Array<IPedometerStatics2?> =
        (elements as
        Array<IPedometerStatics2?>).castToImpl<IPedometerStatics2,IPedometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPedometerStatics2?> =
        arrayOfNulls<IPedometerStatics2_Impl>(size) as Array<IPedometerStatics2?>
  }
}
