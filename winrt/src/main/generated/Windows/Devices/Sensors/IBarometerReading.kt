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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarometerReading.ABI::class)
@Signature("{f5b9d2e6-1df6-4a1a-a7ad-321d4f5db247}")
@Guid("f5b9d2e61df64a1aa7ad321d4f5db247")
@WinRTInterface("f5b9d2e61df64a1aa7ad321d4f5db247")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometerReading.ByReference::class)
public interface IBarometerReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_StationPressureInHectopascals(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarometerReading> {
    public override fun getValue() = ABI.makeIBarometerReading(pointer.getPointer(0))

    public fun setValue(value: IBarometerReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometerReading {
    public val __426367637_Ptr: Pointer?

    public val _426367637_VtblPtr: Pointer?
      get() = __426367637_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _426367637_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__426367637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StationPressureInHectopascals(): Double {
      val fnPtr = _426367637_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__426367637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarometerReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __426367637_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometerReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5b9d2e61df64a1aa7ad321d4f5db247")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometerReading(ptr: Pointer?): WithDefault = IBarometerReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometerReading {
      val address = segment.toRawLongValue()
      return makeIBarometerReading(Pointer(address))
    }

    public override fun toNative(obj: IBarometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__426367637_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometerReading): Array<IBarometerReading?> = (elements
        as Array<IBarometerReading?>).castToImpl<IBarometerReading,IBarometerReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometerReading?> =
        arrayOfNulls<IBarometerReading_Impl>(size) as Array<IBarometerReading?>
  }
}
