package Microsoft.UI.Composition

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
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionSpriteShape.ABI::class)
@Signature("{982138f2-5781-509a-ba5d-112bcb0b98ef}")
@Guid("982138f25781509aba5d112bcb0b98ef")
@WinRTInterface("982138f25781509aba5d112bcb0b98ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSpriteShape.ByReference::class)
public interface ICompositionSpriteShape : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillBrush(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_FillBrush(value: CompositionBrush?): Unit

  @InterfaceMethod(2)
  public fun get_Geometry(): CompositionGeometry?

  @InterfaceMethod(3)
  public fun put_Geometry(value: CompositionGeometry?): Unit

  @InterfaceMethod(4)
  public fun get_IsStrokeNonScaling(): Boolean

  @InterfaceMethod(5)
  public fun put_IsStrokeNonScaling(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_StrokeBrush(): CompositionBrush?

  @InterfaceMethod(7)
  public fun put_StrokeBrush(value: CompositionBrush?): Unit

  @InterfaceMethod(8)
  public fun get_StrokeDashArray(): CompositionStrokeDashArray?

  @InterfaceMethod(9)
  public fun get_StrokeDashCap(): CompositionStrokeCap?

  @InterfaceMethod(10)
  public fun put_StrokeDashCap(value: CompositionStrokeCap?): Unit

  @InterfaceMethod(11)
  public fun get_StrokeDashOffset(): Float

  @InterfaceMethod(12)
  public fun put_StrokeDashOffset(value: Float): Unit

  @InterfaceMethod(13)
  public fun get_StrokeEndCap(): CompositionStrokeCap?

  @InterfaceMethod(14)
  public fun put_StrokeEndCap(value: CompositionStrokeCap?): Unit

  @InterfaceMethod(15)
  public fun get_StrokeLineJoin(): CompositionStrokeLineJoin?

  @InterfaceMethod(16)
  public fun put_StrokeLineJoin(value: CompositionStrokeLineJoin?): Unit

  @InterfaceMethod(17)
  public fun get_StrokeMiterLimit(): Float

  @InterfaceMethod(18)
  public fun put_StrokeMiterLimit(value: Float): Unit

  @InterfaceMethod(19)
  public fun get_StrokeStartCap(): CompositionStrokeCap?

  @InterfaceMethod(20)
  public fun put_StrokeStartCap(value: CompositionStrokeCap?): Unit

  @InterfaceMethod(21)
  public fun get_StrokeThickness(): Float

  @InterfaceMethod(22)
  public fun put_StrokeThickness(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSpriteShape> {
    public override fun getValue() = ABI.makeICompositionSpriteShape(pointer.getPointer(0))

    public fun setValue(value: ICompositionSpriteShape_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSpriteShape {
    public val __1174216917_Ptr: Pointer?

    public val _1174216917_VtblPtr: Pointer?
      get() = __1174216917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillBrush(): CompositionBrush? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FillBrush(value: CompositionBrush?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Geometry(): CompositionGeometry? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGeometry>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Geometry(value: CompositionGeometry?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsStrokeNonScaling(): Boolean {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsStrokeNonScaling(value: Boolean): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_StrokeBrush(): CompositionBrush? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_StrokeBrush(value: CompositionBrush?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_StrokeDashArray(): CompositionStrokeDashArray? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStrokeDashArray>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStrokeDashArray>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_StrokeDashCap(): CompositionStrokeCap? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStrokeCap>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStrokeCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_StrokeDashCap(value: CompositionStrokeCap?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_StrokeDashOffset(): Float {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_StrokeDashOffset(value: Float): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_StrokeEndCap(): CompositionStrokeCap? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStrokeCap>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStrokeCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_StrokeEndCap(value: CompositionStrokeCap?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_StrokeLineJoin(): CompositionStrokeLineJoin? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStrokeLineJoin>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStrokeLineJoin>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_StrokeLineJoin(value: CompositionStrokeLineJoin?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_StrokeMiterLimit(): Float {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_StrokeMiterLimit(value: Float): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_StrokeStartCap(): CompositionStrokeCap? {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStrokeCap>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStrokeCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_StrokeStartCap(value: CompositionStrokeCap?): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_StrokeThickness(): Float {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_StrokeThickness(value: Float): Unit {
      val fnPtr = _1174216917_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1174216917_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionSpriteShape_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1174216917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSpriteShape, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("982138f25781509aba5d112bcb0b98ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSpriteShape(ptr: Pointer?): WithDefault =
        ICompositionSpriteShape_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSpriteShape {
      val address = segment.toRawLongValue()
      return makeICompositionSpriteShape(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSpriteShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1174216917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSpriteShape): Array<ICompositionSpriteShape?>
        = (elements as
        Array<ICompositionSpriteShape?>).castToImpl<ICompositionSpriteShape,ICompositionSpriteShape_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSpriteShape?> =
        arrayOfNulls<ICompositionSpriteShape_Impl>(size) as Array<ICompositionSpriteShape?>
  }
}
