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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccelerometerDataThreshold.ABI::class)
@Signature("{f92c1b68-6320-5577-879e-9942621c3dd9}")
@Guid("f92c1b6863205577879e9942621c3dd9")
@WinRTInterface("f92c1b6863205577879e9942621c3dd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerDataThreshold.ByReference::class)
public interface IAccelerometerDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XAxisInGForce(): Double

  @InterfaceMethod(1)
  public fun put_XAxisInGForce(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_YAxisInGForce(): Double

  @InterfaceMethod(3)
  public fun put_YAxisInGForce(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ZAxisInGForce(): Double

  @InterfaceMethod(5)
  public fun put_ZAxisInGForce(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerDataThreshold> {
    public override fun getValue() = ABI.makeIAccelerometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerDataThreshold {
    public val __124956994_Ptr: Pointer?

    public val _124956994_VtblPtr: Pointer?
      get() = __124956994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XAxisInGForce(): Double {
      val fnPtr = _124956994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_XAxisInGForce(value: Double): Unit {
      val fnPtr = _124956994_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_YAxisInGForce(): Double {
      val fnPtr = _124956994_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_YAxisInGForce(value: Double): Unit {
      val fnPtr = _124956994_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZAxisInGForce(): Double {
      val fnPtr = _124956994_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ZAxisInGForce(value: Double): Unit {
      val fnPtr = _124956994_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124956994_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccelerometerDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __124956994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f92c1b6863205577879e9942621c3dd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerDataThreshold(ptr: Pointer?): WithDefault =
        IAccelerometerDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerDataThreshold {
      val address = segment.toRawLongValue()
      return makeIAccelerometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__124956994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerDataThreshold):
        Array<IAccelerometerDataThreshold?> = (elements as
        Array<IAccelerometerDataThreshold?>).castToImpl<IAccelerometerDataThreshold,IAccelerometerDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerDataThreshold?> =
        arrayOfNulls<IAccelerometerDataThreshold_Impl>(size) as Array<IAccelerometerDataThreshold?>
  }
}
