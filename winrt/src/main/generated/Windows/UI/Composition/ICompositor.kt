package Windows.UI.Composition

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Numerics.Vector2
import Windows.Graphics.Effects.IGraphicsEffect
import Windows.UI.Color
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositor.ABI::class)
@Signature("{b403ca50-7f8c-4e83-985f-cc45060036d8}")
@Guid("b403ca507f8c4e83985fcc45060036d8")
@WinRTInterface("b403ca507f8c4e83985fcc45060036d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor.ByReference::class)
public interface ICompositor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateColorKeyFrameAnimation(): ColorKeyFrameAnimation?

  @InterfaceMethod(1)
  public fun CreateColorBrush(): CompositionColorBrush?

  @InterfaceMethod(2)
  public fun CreateColorBrush(color: Color?): CompositionColorBrush?

  @InterfaceMethod(3)
  public fun CreateContainerVisual(): ContainerVisual?

  @InterfaceMethod(4)
  public fun CreateCubicBezierEasingFunction(controlPoint1: Vector2?, controlPoint2: Vector2?):
      CubicBezierEasingFunction?

  @InterfaceMethod(5)
  public fun CreateEffectFactory(graphicsEffect: IGraphicsEffect?): CompositionEffectFactory?

  @InterfaceMethod(6)
  public fun CreateEffectFactory(graphicsEffect: IGraphicsEffect?,
      animatableProperties: IIterable<String?>?): CompositionEffectFactory?

  @InterfaceMethod(7)
  public fun CreateExpressionAnimation(): ExpressionAnimation?

  @InterfaceMethod(8)
  public fun CreateExpressionAnimation(expression: String?): ExpressionAnimation?

  @InterfaceMethod(9)
  public fun CreateInsetClip(): InsetClip?

  @InterfaceMethod(10)
  public fun CreateInsetClip(
    leftInset: Float,
    topInset: Float,
    rightInset: Float,
    bottomInset: Float
  ): InsetClip?

  @InterfaceMethod(11)
  public fun CreateLinearEasingFunction(): LinearEasingFunction?

  @InterfaceMethod(12)
  public fun CreatePropertySet(): CompositionPropertySet?

  @InterfaceMethod(13)
  public fun CreateQuaternionKeyFrameAnimation(): QuaternionKeyFrameAnimation?

  @InterfaceMethod(14)
  public fun CreateScalarKeyFrameAnimation(): ScalarKeyFrameAnimation?

  @InterfaceMethod(15)
  public fun CreateScopedBatch(batchType: CompositionBatchTypes?): CompositionScopedBatch?

  @InterfaceMethod(16)
  public fun CreateSpriteVisual(): SpriteVisual?

  @InterfaceMethod(17)
  public fun CreateSurfaceBrush(): CompositionSurfaceBrush?

  @InterfaceMethod(18)
  public fun CreateSurfaceBrush(surface: ICompositionSurface?): CompositionSurfaceBrush?

  @InterfaceMethod(19)
  public fun CreateTargetForCurrentView(): CompositionTarget?

  @InterfaceMethod(20)
  public fun CreateVector2KeyFrameAnimation(): Vector2KeyFrameAnimation?

  @InterfaceMethod(21)
  public fun CreateVector3KeyFrameAnimation(): Vector3KeyFrameAnimation?

  @InterfaceMethod(22)
  public fun CreateVector4KeyFrameAnimation(): Vector4KeyFrameAnimation?

  @InterfaceMethod(23)
  public fun GetCommitBatch(batchType: CompositionBatchTypes?): CompositionCommitBatch?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor> {
    public override fun getValue() = ABI.makeICompositor(pointer.getPointer(0))

    public fun setValue(value: ICompositor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor {
    public val __211191343_Ptr: Pointer?

    public val _211191343_VtblPtr: Pointer?
      get() = __211191343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateColorKeyFrameAnimation(): ColorKeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorKeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorKeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateColorBrush(): CompositionColorBrush? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorBrush>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateColorBrush(color: Color?): CompositionColorBrush? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorBrush>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(color), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateContainerVisual(): ContainerVisual? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContainerVisual>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContainerVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateCubicBezierEasingFunction(controlPoint1: Vector2?,
        controlPoint2: Vector2?): CubicBezierEasingFunction? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CubicBezierEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(controlPoint1),
          marshalToNative(controlPoint2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CubicBezierEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateEffectFactory(graphicsEffect: IGraphicsEffect?):
        CompositionEffectFactory? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectFactory>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(graphicsEffect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateEffectFactory(graphicsEffect: IGraphicsEffect?,
        animatableProperties: IIterable<String?>?): CompositionEffectFactory? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectFactory>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(graphicsEffect),
          marshalToNative(animatableProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateExpressionAnimation(): ExpressionAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateExpressionAnimation(expression: String?): ExpressionAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(expression), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateInsetClip(): InsetClip? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InsetClip>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InsetClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateInsetClip(
      leftInset: Float,
      topInset: Float,
      rightInset: Float,
      bottomInset: Float
    ): InsetClip? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InsetClip>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, leftInset, topInset, rightInset, bottomInset,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InsetClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateLinearEasingFunction(): LinearEasingFunction? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinearEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinearEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreatePropertySet(): CompositionPropertySet? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateQuaternionKeyFrameAnimation(): QuaternionKeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<QuaternionKeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<QuaternionKeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateScalarKeyFrameAnimation(): ScalarKeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarKeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarKeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CreateScopedBatch(batchType: CompositionBatchTypes?):
        CompositionScopedBatch? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionScopedBatch>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(batchType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionScopedBatch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun CreateSpriteVisual(): SpriteVisual? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpriteVisual>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpriteVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CreateSurfaceBrush(): CompositionSurfaceBrush? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionSurfaceBrush>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionSurfaceBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun CreateSurfaceBrush(surface: ICompositionSurface?):
        CompositionSurfaceBrush? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionSurfaceBrush>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionSurfaceBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun CreateTargetForCurrentView(): CompositionTarget? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionTarget>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun CreateVector2KeyFrameAnimation(): Vector2KeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2KeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2KeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun CreateVector3KeyFrameAnimation(): Vector3KeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3KeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3KeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun CreateVector4KeyFrameAnimation(): Vector4KeyFrameAnimation? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector4KeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector4KeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun GetCommitBatch(batchType: CompositionBatchTypes?): CompositionCommitBatch? {
      val fnPtr = _211191343_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionCommitBatch>()
      val hr = fn.invokeHR(arrayOf(__211191343_Ptr, marshalToNative(batchType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionCommitBatch>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __211191343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b403ca507f8c4e83985fcc45060036d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor(ptr: Pointer?): WithDefault = ICompositor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor {
      val address = segment.toRawLongValue()
      return makeICompositor(Pointer(address))
    }

    public override fun toNative(obj: ICompositor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__211191343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor): Array<ICompositor?> = (elements as
        Array<ICompositor?>).castToImpl<ICompositor,ICompositor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor?> =
        arrayOfNulls<ICompositor_Impl>(size) as Array<ICompositor?>
  }
}
