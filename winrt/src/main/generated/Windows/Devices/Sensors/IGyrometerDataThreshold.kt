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

@ABIMarker(IGyrometerDataThreshold.ABI::class)
@Signature("{8648b31e-6e52-5259-bbad-242a69dc38c8}")
@Guid("8648b31e6e525259bbad242a69dc38c8")
@WinRTInterface("8648b31e6e525259bbad242a69dc38c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometerDataThreshold.ByReference::class)
public interface IGyrometerDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XAxisInDegreesPerSecond(): Double

  @InterfaceMethod(1)
  public fun put_XAxisInDegreesPerSecond(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_YAxisInDegreesPerSecond(): Double

  @InterfaceMethod(3)
  public fun put_YAxisInDegreesPerSecond(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ZAxisInDegreesPerSecond(): Double

  @InterfaceMethod(5)
  public fun put_ZAxisInDegreesPerSecond(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGyrometerDataThreshold> {
    public override fun getValue() = ABI.makeIGyrometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: IGyrometerDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometerDataThreshold {
    public val __1243598669_Ptr: Pointer?

    public val _1243598669_VtblPtr: Pointer?
      get() = __1243598669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XAxisInDegreesPerSecond(): Double {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_XAxisInDegreesPerSecond(value: Double): Unit {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_YAxisInDegreesPerSecond(): Double {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_YAxisInDegreesPerSecond(value: Double): Unit {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZAxisInDegreesPerSecond(): Double {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ZAxisInDegreesPerSecond(value: Double): Unit {
      val fnPtr = _1243598669_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1243598669_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGyrometerDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1243598669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometerDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8648b31e6e525259bbad242a69dc38c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometerDataThreshold(ptr: Pointer?): WithDefault =
        IGyrometerDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometerDataThreshold {
      val address = segment.toRawLongValue()
      return makeIGyrometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: IGyrometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1243598669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometerDataThreshold): Array<IGyrometerDataThreshold?>
        = (elements as
        Array<IGyrometerDataThreshold?>).castToImpl<IGyrometerDataThreshold,IGyrometerDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometerDataThreshold?> =
        arrayOfNulls<IGyrometerDataThreshold_Impl>(size) as Array<IGyrometerDataThreshold?>
  }
}
