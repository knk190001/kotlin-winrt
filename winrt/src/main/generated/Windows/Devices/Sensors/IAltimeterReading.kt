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

@ABIMarker(IAltimeterReading.ABI::class)
@Signature("{fbe8ef73-7f5e-48c8-aa1a-f1f3befc1144}")
@Guid("fbe8ef737f5e48c8aa1af1f3befc1144")
@WinRTInterface("fbe8ef737f5e48c8aa1af1f3befc1144")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAltimeterReading.ByReference::class)
public interface IAltimeterReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_AltitudeChangeInMeters(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAltimeterReading> {
    public override fun getValue() = ABI.makeIAltimeterReading(pointer.getPointer(0))

    public fun setValue(value: IAltimeterReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAltimeterReading {
    public val __236668047_Ptr: Pointer?

    public val _236668047_VtblPtr: Pointer?
      get() = __236668047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _236668047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__236668047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AltitudeChangeInMeters(): Double {
      val fnPtr = _236668047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__236668047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAltimeterReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __236668047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAltimeterReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbe8ef737f5e48c8aa1af1f3befc1144")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAltimeterReading(ptr: Pointer?): WithDefault = IAltimeterReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAltimeterReading {
      val address = segment.toRawLongValue()
      return makeIAltimeterReading(Pointer(address))
    }

    public override fun toNative(obj: IAltimeterReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__236668047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAltimeterReading): Array<IAltimeterReading?> = (elements
        as Array<IAltimeterReading?>).castToImpl<IAltimeterReading,IAltimeterReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAltimeterReading?> =
        arrayOfNulls<IAltimeterReading_Impl>(size) as Array<IAltimeterReading?>
  }
}
