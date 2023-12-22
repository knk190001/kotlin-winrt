package Microsoft.UI.Composition

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

@ABIMarker(ICompositionEasingFunctionStatics.ABI::class)
@Signature("{9d4b87ff-6dca-5ce2-b69c-e52705b0fef4}")
@Guid("9d4b87ff6dca5ce2b69ce52705b0fef4")
@WinRTInterface("9d4b87ff6dca5ce2b69ce52705b0fef4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEasingFunctionStatics.ByReference::class)
public interface ICompositionEasingFunctionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCubicBezierEasingFunction(
    owner: Compositor?,
    controlPoint1: Vector2?,
    controlPoint2: Vector2?
  ): CubicBezierEasingFunction?

  @InterfaceMethod(1)
  public fun CreateLinearEasingFunction(owner: Compositor?): LinearEasingFunction?

  @InterfaceMethod(2)
  public fun CreateStepEasingFunction(owner: Compositor?): StepEasingFunction?

  @InterfaceMethod(3)
  public fun CreateStepEasingFunction(owner: Compositor?, stepCount: Int): StepEasingFunction?

  @InterfaceMethod(4)
  public fun CreateBackEasingFunction(
    owner: Compositor?,
    mode: CompositionEasingFunctionMode?,
    amplitude: Float
  ): BackEasingFunction?

  @InterfaceMethod(5)
  public fun CreateBounceEasingFunction(
    owner: Compositor?,
    mode: CompositionEasingFunctionMode?,
    bounces: Int,
    bounciness: Float
  ): BounceEasingFunction?

  @InterfaceMethod(6)
  public fun CreateCircleEasingFunction(owner: Compositor?, mode: CompositionEasingFunctionMode?):
      CircleEasingFunction?

  @InterfaceMethod(7)
  public fun CreateElasticEasingFunction(
    owner: Compositor?,
    mode: CompositionEasingFunctionMode?,
    oscillations: Int,
    springiness: Float
  ): ElasticEasingFunction?

  @InterfaceMethod(8)
  public fun CreateExponentialEasingFunction(
    owner: Compositor?,
    mode: CompositionEasingFunctionMode?,
    exponent: Float
  ): ExponentialEasingFunction?

  @InterfaceMethod(9)
  public fun CreatePowerEasingFunction(
    owner: Compositor?,
    mode: CompositionEasingFunctionMode?,
    power: Float
  ): PowerEasingFunction?

  @InterfaceMethod(10)
  public fun CreateSineEasingFunction(owner: Compositor?, mode: CompositionEasingFunctionMode?):
      SineEasingFunction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEasingFunctionStatics> {
    public override fun getValue() =
        ABI.makeICompositionEasingFunctionStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionEasingFunctionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEasingFunctionStatics {
    public val __1368082255_Ptr: Pointer?

    public val _1368082255_VtblPtr: Pointer?
      get() = __1368082255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCubicBezierEasingFunction(
      owner: Compositor?,
      controlPoint1: Vector2?,
      controlPoint2: Vector2?
    ): CubicBezierEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CubicBezierEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner),
          marshalToNative(controlPoint1), marshalToNative(controlPoint2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CubicBezierEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateLinearEasingFunction(owner: Compositor?): LinearEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinearEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinearEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateStepEasingFunction(owner: Compositor?): StepEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StepEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StepEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateStepEasingFunction(owner: Compositor?, stepCount: Int):
        StepEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StepEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), stepCount, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StepEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateBackEasingFunction(
      owner: Compositor?,
      mode: CompositionEasingFunctionMode?,
      amplitude: Float
    ): BackEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          amplitude, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateBounceEasingFunction(
      owner: Compositor?,
      mode: CompositionEasingFunctionMode?,
      bounces: Int,
      bounciness: Float
    ): BounceEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BounceEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          bounces, bounciness, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BounceEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateCircleEasingFunction(owner: Compositor?,
        mode: CompositionEasingFunctionMode?): CircleEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CircleEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CircleEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateElasticEasingFunction(
      owner: Compositor?,
      mode: CompositionEasingFunctionMode?,
      oscillations: Int,
      springiness: Float
    ): ElasticEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElasticEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          oscillations, springiness, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElasticEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateExponentialEasingFunction(
      owner: Compositor?,
      mode: CompositionEasingFunctionMode?,
      exponent: Float
    ): ExponentialEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExponentialEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          exponent, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExponentialEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreatePowerEasingFunction(
      owner: Compositor?,
      mode: CompositionEasingFunctionMode?,
      power: Float
    ): PowerEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PowerEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          power, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PowerEasingFunction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateSineEasingFunction(owner: Compositor?,
        mode: CompositionEasingFunctionMode?): SineEasingFunction? {
      val fnPtr = _1368082255_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SineEasingFunction>()
      val hr = fn.invokeHR(arrayOf(__1368082255_Ptr, marshalToNative(owner), marshalToNative(mode),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SineEasingFunction>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionEasingFunctionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1368082255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEasingFunctionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d4b87ff6dca5ce2b69ce52705b0fef4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEasingFunctionStatics(ptr: Pointer?): WithDefault =
        ICompositionEasingFunctionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEasingFunctionStatics {
      val address = segment.toRawLongValue()
      return makeICompositionEasingFunctionStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEasingFunctionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1368082255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEasingFunctionStatics):
        Array<ICompositionEasingFunctionStatics?> = (elements as
        Array<ICompositionEasingFunctionStatics?>).castToImpl<ICompositionEasingFunctionStatics,ICompositionEasingFunctionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEasingFunctionStatics?> =
        arrayOfNulls<ICompositionEasingFunctionStatics_Impl>(size) as
        Array<ICompositionEasingFunctionStatics?>
  }
}
