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

@ABIMarker(IMagnetometerReading.ABI::class)
@Signature("{0c2cc40d-ebfd-4e5c-bb11-afc29b3cae61}")
@Guid("0c2cc40debfd4e5cbb11afc29b3cae61")
@WinRTInterface("0c2cc40debfd4e5cbb11afc29b3cae61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometerReading.ByReference::class)
public interface IMagnetometerReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_MagneticFieldX(): Float

  @InterfaceMethod(2)
  public fun get_MagneticFieldY(): Float

  @InterfaceMethod(3)
  public fun get_MagneticFieldZ(): Float

  @InterfaceMethod(4)
  public fun get_DirectionalAccuracy(): MagnetometerAccuracy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagnetometerReading> {
    public override fun getValue() = ABI.makeIMagnetometerReading(pointer.getPointer(0))

    public fun setValue(value: IMagnetometerReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometerReading {
    public val __580852764_Ptr: Pointer?

    public val _580852764_VtblPtr: Pointer?
      get() = __580852764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _580852764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__580852764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MagneticFieldX(): Float {
      val fnPtr = _580852764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__580852764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MagneticFieldY(): Float {
      val fnPtr = _580852764_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__580852764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MagneticFieldZ(): Float {
      val fnPtr = _580852764_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__580852764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DirectionalAccuracy(): MagnetometerAccuracy? {
      val fnPtr = _580852764_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerAccuracy>()
      val hr = fn.invokeHR(arrayOf(__580852764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerAccuracy>(result.getValue())
      return resultValue
    }
  }

  public class IMagnetometerReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __580852764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometerReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c2cc40debfd4e5cbb11afc29b3cae61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometerReading(ptr: Pointer?): WithDefault = IMagnetometerReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometerReading {
      val address = segment.toRawLongValue()
      return makeIMagnetometerReading(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__580852764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometerReading): Array<IMagnetometerReading?> =
        (elements as
        Array<IMagnetometerReading?>).castToImpl<IMagnetometerReading,IMagnetometerReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometerReading?> =
        arrayOfNulls<IMagnetometerReading_Impl>(size) as Array<IMagnetometerReading?>
  }
}
