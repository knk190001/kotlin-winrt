package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.Media3D.Matrix3D
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

@ABIMarker(IPlaneProjection.ABI::class)
@Signature("{d3e22836-0322-5d75-941c-a5ffb05192b2}")
@Guid("d3e2283603225d75941ca5ffb05192b2")
@WinRTInterface("d3e2283603225d75941ca5ffb05192b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaneProjection.ByReference::class)
public interface IPlaneProjection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalOffsetX(): Double

  @InterfaceMethod(1)
  public fun put_LocalOffsetX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_LocalOffsetY(): Double

  @InterfaceMethod(3)
  public fun put_LocalOffsetY(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_LocalOffsetZ(): Double

  @InterfaceMethod(5)
  public fun put_LocalOffsetZ(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_RotationX(): Double

  @InterfaceMethod(7)
  public fun put_RotationX(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_RotationY(): Double

  @InterfaceMethod(9)
  public fun put_RotationY(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_RotationZ(): Double

  @InterfaceMethod(11)
  public fun put_RotationZ(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_CenterOfRotationX(): Double

  @InterfaceMethod(13)
  public fun put_CenterOfRotationX(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_CenterOfRotationY(): Double

  @InterfaceMethod(15)
  public fun put_CenterOfRotationY(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_CenterOfRotationZ(): Double

  @InterfaceMethod(17)
  public fun put_CenterOfRotationZ(value: Double): Unit

  @InterfaceMethod(18)
  public fun get_GlobalOffsetX(): Double

  @InterfaceMethod(19)
  public fun put_GlobalOffsetX(value: Double): Unit

  @InterfaceMethod(20)
  public fun get_GlobalOffsetY(): Double

  @InterfaceMethod(21)
  public fun put_GlobalOffsetY(value: Double): Unit

  @InterfaceMethod(22)
  public fun get_GlobalOffsetZ(): Double

  @InterfaceMethod(23)
  public fun put_GlobalOffsetZ(value: Double): Unit

  @InterfaceMethod(24)
  public fun get_ProjectionMatrix(): Matrix3D?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaneProjection> {
    public override fun getValue() = ABI.makeIPlaneProjection(pointer.getPointer(0))

    public fun setValue(value: IPlaneProjection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaneProjection {
    public val __939900282_Ptr: Pointer?

    public val _939900282_VtblPtr: Pointer?
      get() = __939900282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalOffsetX(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_LocalOffsetX(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LocalOffsetY(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_LocalOffsetY(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LocalOffsetZ(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_LocalOffsetZ(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotationX(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RotationX(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RotationY(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_RotationY(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RotationZ(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_RotationZ(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CenterOfRotationX(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_CenterOfRotationX(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CenterOfRotationY(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_CenterOfRotationY(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_CenterOfRotationZ(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_CenterOfRotationZ(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_GlobalOffsetX(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_GlobalOffsetX(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_GlobalOffsetY(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_GlobalOffsetY(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_GlobalOffsetZ(): Double {
      val fnPtr = _939900282_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_GlobalOffsetZ(value: Double): Unit {
      val fnPtr = _939900282_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_ProjectionMatrix(): Matrix3D? {
      val fnPtr = _939900282_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__939900282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }
  }

  public class IPlaneProjection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __939900282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaneProjection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3e2283603225d75941ca5ffb05192b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaneProjection(ptr: Pointer?): WithDefault = IPlaneProjection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaneProjection {
      val address = segment.toRawLongValue()
      return makeIPlaneProjection(Pointer(address))
    }

    public override fun toNative(obj: IPlaneProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__939900282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaneProjection): Array<IPlaneProjection?> = (elements as
        Array<IPlaneProjection?>).castToImpl<IPlaneProjection,IPlaneProjection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaneProjection?> =
        arrayOfNulls<IPlaneProjection_Impl>(size) as Array<IPlaneProjection?>
  }
}
