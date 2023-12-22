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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInclinometerDataThreshold.ABI::class)
@Signature("{f80a4783-7bfe-545e-bb60-a0ebc47bd2fb}")
@Guid("f80a47837bfe545ebb60a0ebc47bd2fb")
@WinRTInterface("f80a47837bfe545ebb60a0ebc47bd2fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerDataThreshold.ByReference::class)
public interface IInclinometerDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PitchInDegrees(): Float

  @InterfaceMethod(1)
  public fun put_PitchInDegrees(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_RollInDegrees(): Float

  @InterfaceMethod(3)
  public fun put_RollInDegrees(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_YawInDegrees(): Float

  @InterfaceMethod(5)
  public fun put_YawInDegrees(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerDataThreshold> {
    public override fun getValue() = ABI.makeIInclinometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: IInclinometerDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerDataThreshold {
    public val __388888648_Ptr: Pointer?

    public val _388888648_VtblPtr: Pointer?
      get() = __388888648_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PitchInDegrees(): Float {
      val fnPtr = _388888648_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_PitchInDegrees(value: Float): Unit {
      val fnPtr = _388888648_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RollInDegrees(): Float {
      val fnPtr = _388888648_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RollInDegrees(value: Float): Unit {
      val fnPtr = _388888648_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_YawInDegrees(): Float {
      val fnPtr = _388888648_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_YawInDegrees(value: Float): Unit {
      val fnPtr = _388888648_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388888648_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInclinometerDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __388888648_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f80a47837bfe545ebb60a0ebc47bd2fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerDataThreshold(ptr: Pointer?): WithDefault =
        IInclinometerDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerDataThreshold {
      val address = segment.toRawLongValue()
      return makeIInclinometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__388888648_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerDataThreshold):
        Array<IInclinometerDataThreshold?> = (elements as
        Array<IInclinometerDataThreshold?>).castToImpl<IInclinometerDataThreshold,IInclinometerDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerDataThreshold?> =
        arrayOfNulls<IInclinometerDataThreshold_Impl>(size) as Array<IInclinometerDataThreshold?>
  }
}
