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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInclinometerReading.ABI::class)
@Signature("{9f44f055-b6f6-497f-b127-1a775e501458}")
@Guid("9f44f055b6f6497fb1271a775e501458")
@WinRTInterface("9f44f055b6f6497fb1271a775e501458")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerReading.ByReference::class)
public interface IInclinometerReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_PitchDegrees(): Float

  @InterfaceMethod(2)
  public fun get_RollDegrees(): Float

  @InterfaceMethod(3)
  public fun get_YawDegrees(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerReading> {
    public override fun getValue() = ABI.makeIInclinometerReading(pointer.getPointer(0))

    public fun setValue(value: IInclinometerReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerReading {
    public val __36844493_Ptr: Pointer?

    public val _36844493_VtblPtr: Pointer?
      get() = __36844493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _36844493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__36844493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PitchDegrees(): Float {
      val fnPtr = _36844493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__36844493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RollDegrees(): Float {
      val fnPtr = _36844493_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__36844493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_YawDegrees(): Float {
      val fnPtr = _36844493_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__36844493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IInclinometerReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36844493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f44f055b6f6497fb1271a775e501458")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerReading(ptr: Pointer?): WithDefault = IInclinometerReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerReading {
      val address = segment.toRawLongValue()
      return makeIInclinometerReading(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36844493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerReading): Array<IInclinometerReading?> =
        (elements as
        Array<IInclinometerReading?>).castToImpl<IInclinometerReading,IInclinometerReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerReading?> =
        arrayOfNulls<IInclinometerReading_Impl>(size) as Array<IInclinometerReading?>
  }
}
