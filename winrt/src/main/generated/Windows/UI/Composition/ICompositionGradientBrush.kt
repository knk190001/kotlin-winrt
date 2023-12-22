package Windows.UI.Composition

import Windows.Foundation.Numerics.Matrix3x2
import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(ICompositionGradientBrush.ABI::class)
@Signature("{1d9709e0-ffc6-4c0e-a9ab-34144d4c9098}")
@Guid("1d9709e0ffc64c0ea9ab34144d4c9098")
@WinRTInterface("1d9709e0ffc64c0ea9ab34144d4c9098")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGradientBrush.ByReference::class)
public interface ICompositionGradientBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnchorPoint(): Vector2?

  @InterfaceMethod(1)
  public fun put_AnchorPoint(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_CenterPoint(): Vector2?

  @InterfaceMethod(3)
  public fun put_CenterPoint(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_ColorStops(): CompositionColorGradientStopCollection?

  @InterfaceMethod(5)
  public fun get_ExtendMode(): CompositionGradientExtendMode?

  @InterfaceMethod(6)
  public fun put_ExtendMode(value: CompositionGradientExtendMode?): Unit

  @InterfaceMethod(7)
  public fun get_InterpolationSpace(): CompositionColorSpace?

  @InterfaceMethod(8)
  public fun put_InterpolationSpace(value: CompositionColorSpace?): Unit

  @InterfaceMethod(9)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(10)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(11)
  public fun get_RotationAngle(): Float

  @InterfaceMethod(12)
  public fun put_RotationAngle(value: Float): Unit

  @InterfaceMethod(13)
  public fun get_RotationAngleInDegrees(): Float

  @InterfaceMethod(14)
  public fun put_RotationAngleInDegrees(value: Float): Unit

  @InterfaceMethod(15)
  public fun get_Scale(): Vector2?

  @InterfaceMethod(16)
  public fun put_Scale(value: Vector2?): Unit

  @InterfaceMethod(17)
  public fun get_TransformMatrix(): Matrix3x2?

  @InterfaceMethod(18)
  public fun put_TransformMatrix(value: Matrix3x2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGradientBrush> {
    public override fun getValue() = ABI.makeICompositionGradientBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGradientBrush {
    public val __414553614_Ptr: Pointer?

    public val _414553614_VtblPtr: Pointer?
      get() = __414553614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnchorPoint(): Vector2? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnchorPoint(value: Vector2?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterPoint(): Vector2? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CenterPoint(value: Vector2?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ColorStops(): CompositionColorGradientStopCollection? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorGradientStopCollection>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorGradientStopCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ExtendMode(): CompositionGradientExtendMode? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGradientExtendMode>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGradientExtendMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ExtendMode(value: CompositionGradientExtendMode?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_InterpolationSpace(): CompositionColorSpace? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorSpace>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_InterpolationSpace(value: CompositionColorSpace?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_RotationAngle(): Float {
      val fnPtr = _414553614_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_RotationAngle(value: Float): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_RotationAngleInDegrees(): Float {
      val fnPtr = _414553614_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_RotationAngleInDegrees(value: Float): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Scale(): Vector2? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Scale(value: Vector2?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_TransformMatrix(): Matrix3x2? {
      val fnPtr = _414553614_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_TransformMatrix(value: Matrix3x2?): Unit {
      val fnPtr = _414553614_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414553614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __414553614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d9709e0ffc64c0ea9ab34144d4c9098")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGradientBrush(ptr: Pointer?): WithDefault =
        ICompositionGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGradientBrush {
      val address = segment.toRawLongValue()
      return makeICompositionGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__414553614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGradientBrush):
        Array<ICompositionGradientBrush?> = (elements as
        Array<ICompositionGradientBrush?>).castToImpl<ICompositionGradientBrush,ICompositionGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGradientBrush?> =
        arrayOfNulls<ICompositionGradientBrush_Impl>(size) as Array<ICompositionGradientBrush?>
  }
}
