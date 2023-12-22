package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector2
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CompositionEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionEasingFunction;{8e1ecd0d-57d8-5bc9-9bcd-e43d0dd733c4})")
@WinRTByReference(brClass = CompositionEasingFunction.ByReference::class)
public open class CompositionEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionEasingFunction.WithDefault, IWinRTObject {
  private val __173689740_Interface: ICompositionEasingFunction.WithDefault by lazy {
    as_173689740()
  }


  public override val __173689740_Ptr: JNAPointer? by lazy {
    __173689740_Interface.__173689740_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__173689740_Interface)

  private fun as_173689740(): ICompositionEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(ICompositionEasingFunction.ABI.makeICompositionEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionEasingFunction.ABI.makeICompositionEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionEasingFunction> {
    public override fun getValue() = CompositionEasingFunction(pointer.getPointer(0))

    public fun setValue(value: CompositionEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionEasingFunction, MemoryAddress> {
    public val ICompositionEasingFunctionStatics_Instance: ICompositionEasingFunctionStatics by
        lazy {
      createICompositionEasingFunctionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionEasingFunctionStatics(): ICompositionEasingFunctionStatics {
      val refiid = Guid.REFIID(ICompositionEasingFunctionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.CompositionEasingFunction".toHandle(),refiid,interfacePtr)
      val result =
          ICompositionEasingFunctionStatics.ABI.makeICompositionEasingFunctionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositionEasingFunction {
      val address = segment.toRawLongValue()
      return CompositionEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: CompositionEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateCubicBezierEasingFunction(
      owner: Compositor,
      controlPoint1: Vector2,
      controlPoint2: Vector2
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreateCubicBezierEasingFunction(owner,
        controlPoint1, controlPoint2)

    public fun CreateLinearEasingFunction(owner: Compositor) =
        ABI.ICompositionEasingFunctionStatics_Instance.CreateLinearEasingFunction(owner)

    public fun CreateStepEasingFunction(owner: Compositor) =
        ABI.ICompositionEasingFunctionStatics_Instance.CreateStepEasingFunction(owner)

    public fun CreateStepEasingFunction(owner: Compositor, stepCount: Int) =
        ABI.ICompositionEasingFunctionStatics_Instance.CreateStepEasingFunction(owner, stepCount)

    public fun CreateBackEasingFunction(
      owner: Compositor,
      mode: CompositionEasingFunctionMode,
      amplitude: Float
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreateBackEasingFunction(owner, mode,
        amplitude)

    public fun CreateBounceEasingFunction(
      owner: Compositor,
      mode: CompositionEasingFunctionMode,
      bounces: Int,
      bounciness: Float
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreateBounceEasingFunction(owner, mode,
        bounces, bounciness)

    public fun CreateCircleEasingFunction(owner: Compositor, mode: CompositionEasingFunctionMode) =
        ABI.ICompositionEasingFunctionStatics_Instance.CreateCircleEasingFunction(owner, mode)

    public fun CreateElasticEasingFunction(
      owner: Compositor,
      mode: CompositionEasingFunctionMode,
      oscillations: Int,
      springiness: Float
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreateElasticEasingFunction(owner, mode,
        oscillations, springiness)

    public fun CreateExponentialEasingFunction(
      owner: Compositor,
      mode: CompositionEasingFunctionMode,
      exponent: Float
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreateExponentialEasingFunction(owner, mode,
        exponent)

    public fun CreatePowerEasingFunction(
      owner: Compositor,
      mode: CompositionEasingFunctionMode,
      power: Float
    ) = ABI.ICompositionEasingFunctionStatics_Instance.CreatePowerEasingFunction(owner, mode, power)

    public fun CreateSineEasingFunction(owner: Compositor, mode: CompositionEasingFunctionMode) =
        ABI.ICompositionEasingFunctionStatics_Instance.CreateSineEasingFunction(owner, mode)
  }
}
