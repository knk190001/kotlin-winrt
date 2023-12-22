package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(IMouseWheelParameters.ABI::class)
@Signature("{6d98be40-1d56-51d1-aa0d-f325439cd009}")
@Guid("6d98be401d5651d1aa0df325439cd009")
@WinRTInterface("6d98be401d5651d1aa0df325439cd009")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMouseWheelParameters.ByReference::class)
public interface IMouseWheelParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CharTranslation(): Point?

  @InterfaceMethod(1)
  public fun put_CharTranslation(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_DeltaScale(): Float

  @InterfaceMethod(3)
  public fun put_DeltaScale(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_DeltaRotationAngle(): Float

  @InterfaceMethod(5)
  public fun put_DeltaRotationAngle(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_PageTranslation(): Point?

  @InterfaceMethod(7)
  public fun put_PageTranslation(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMouseWheelParameters> {
    public override fun getValue() = ABI.makeIMouseWheelParameters(pointer.getPointer(0))

    public fun setValue(value: IMouseWheelParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMouseWheelParameters {
    public val __1410694343_Ptr: Pointer?

    public val _1410694343_VtblPtr: Pointer?
      get() = __1410694343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CharTranslation(): Point? {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CharTranslation(value: Point?): Unit {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeltaScale(): Float {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DeltaScale(value: Float): Unit {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DeltaRotationAngle(): Float {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DeltaRotationAngle(value: Float): Unit {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PageTranslation(): Point? {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PageTranslation(value: Point?): Unit {
      val fnPtr = _1410694343_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410694343_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMouseWheelParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410694343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMouseWheelParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d98be401d5651d1aa0df325439cd009")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMouseWheelParameters(ptr: Pointer?): WithDefault =
        IMouseWheelParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMouseWheelParameters {
      val address = segment.toRawLongValue()
      return makeIMouseWheelParameters(Pointer(address))
    }

    public override fun toNative(obj: IMouseWheelParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410694343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMouseWheelParameters): Array<IMouseWheelParameters?> =
        (elements as
        Array<IMouseWheelParameters?>).castToImpl<IMouseWheelParameters,IMouseWheelParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMouseWheelParameters?> =
        arrayOfNulls<IMouseWheelParameters_Impl>(size) as Array<IMouseWheelParameters?>
  }
}
