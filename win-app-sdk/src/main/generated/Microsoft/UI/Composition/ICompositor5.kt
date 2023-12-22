package Microsoft.UI.Composition

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ICompositor5.ABI::class)
@Signature("{bb52d644-a030-5c19-b883-577ded739ae7}")
@Guid("bb52d644a0305c19b883577ded739ae7")
@WinRTInterface("bb52d644a0305c19b883577ded739ae7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor5.ByReference::class)
public interface ICompositor5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Comment(): String?

  @InterfaceMethod(1)
  public fun put_Comment(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_GlobalPlaybackRate(): Float

  @InterfaceMethod(3)
  public fun put_GlobalPlaybackRate(value: Float): Unit

  @InterfaceMethod(4)
  public fun CreateBounceScalarAnimation(): BounceScalarNaturalMotionAnimation?

  @InterfaceMethod(5)
  public fun CreateBounceVector2Animation(): BounceVector2NaturalMotionAnimation?

  @InterfaceMethod(6)
  public fun CreateBounceVector3Animation(): BounceVector3NaturalMotionAnimation?

  @InterfaceMethod(7)
  public fun CreateContainerShape(): CompositionContainerShape?

  @InterfaceMethod(8)
  public fun CreateEllipseGeometry(): CompositionEllipseGeometry?

  @InterfaceMethod(9)
  public fun CreateLineGeometry(): CompositionLineGeometry?

  @InterfaceMethod(10)
  public fun CreatePathGeometry(): CompositionPathGeometry?

  @InterfaceMethod(11)
  public fun CreatePathGeometry(path: CompositionPath?): CompositionPathGeometry?

  @InterfaceMethod(12)
  public fun CreatePathKeyFrameAnimation(): PathKeyFrameAnimation?

  @InterfaceMethod(13)
  public fun CreateRectangleGeometry(): CompositionRectangleGeometry?

  @InterfaceMethod(14)
  public fun CreateRoundedRectangleGeometry(): CompositionRoundedRectangleGeometry?

  @InterfaceMethod(15)
  public fun CreateShapeVisual(): ShapeVisual?

  @InterfaceMethod(16)
  public fun CreateSpriteShape(): CompositionSpriteShape?

  @InterfaceMethod(17)
  public fun CreateSpriteShape(geometry: CompositionGeometry?): CompositionSpriteShape?

  @InterfaceMethod(18)
  public fun CreateViewBox(): CompositionViewBox?

  @InterfaceMethod(19)
  public fun RequestCommitAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor5> {
    public override fun getValue() = ABI.makeICompositor5(pointer.getPointer(0))

    public fun setValue(value: ICompositor5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor5 {
    public val __359760229_Ptr: Pointer?

    public val _359760229_VtblPtr: Pointer?
      get() = __359760229_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Comment(): String? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Comment(value: String?): Unit {
      val fnPtr = _359760229_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GlobalPlaybackRate(): Float {
      val fnPtr = _359760229_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_GlobalPlaybackRate(value: Float): Unit {
      val fnPtr = _359760229_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun CreateBounceScalarAnimation(): BounceScalarNaturalMotionAnimation? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BounceScalarNaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BounceScalarNaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateBounceVector2Animation(): BounceVector2NaturalMotionAnimation? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BounceVector2NaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BounceVector2NaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateBounceVector3Animation(): BounceVector3NaturalMotionAnimation? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BounceVector3NaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BounceVector3NaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateContainerShape(): CompositionContainerShape? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionContainerShape>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionContainerShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateEllipseGeometry(): CompositionEllipseGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEllipseGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEllipseGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateLineGeometry(): CompositionLineGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionLineGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionLineGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreatePathGeometry(): CompositionPathGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPathGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPathGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreatePathGeometry(path: CompositionPath?): CompositionPathGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPathGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPathGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreatePathKeyFrameAnimation(): PathKeyFrameAnimation? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PathKeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PathKeyFrameAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateRectangleGeometry(): CompositionRectangleGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionRectangleGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionRectangleGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateRoundedRectangleGeometry(): CompositionRoundedRectangleGeometry? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionRoundedRectangleGeometry>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionRoundedRectangleGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CreateShapeVisual(): ShapeVisual? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShapeVisual>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShapeVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun CreateSpriteShape(): CompositionSpriteShape? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionSpriteShape>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionSpriteShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CreateSpriteShape(geometry: CompositionGeometry?): CompositionSpriteShape? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionSpriteShape>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr, marshalToNative(geometry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionSpriteShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun CreateViewBox(): CompositionViewBox? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionViewBox>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionViewBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun RequestCommitAsync(): IAsyncAction? {
      val fnPtr = _359760229_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__359760229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __359760229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb52d644a0305c19b883577ded739ae7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor5(ptr: Pointer?): WithDefault = ICompositor5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor5 {
      val address = segment.toRawLongValue()
      return makeICompositor5(Pointer(address))
    }

    public override fun toNative(obj: ICompositor5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__359760229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor5): Array<ICompositor5?> = (elements as
        Array<ICompositor5?>).castToImpl<ICompositor5,ICompositor5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor5?> =
        arrayOfNulls<ICompositor5_Impl>(size) as Array<ICompositor5?>
  }
}
