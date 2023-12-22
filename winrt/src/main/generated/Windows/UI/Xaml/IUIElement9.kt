package Windows.UI.Xaml

import Windows.Foundation.Numerics.Matrix4x4
import Windows.Foundation.Numerics.Vector3
import Windows.UI.Composition.ICompositionAnimationBase
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

@ABIMarker(IUIElement9.ABI::class)
@Signature("{b4a04776-4e88-50ca-8f2b-08940d6c5f94}")
@Guid("b4a047764e8850ca8f2b08940d6c5f94")
@WinRTInterface("b4a047764e8850ca8f2b08940d6c5f94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement9.ByReference::class)
public interface IUIElement9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanBeScrollAnchor(): Boolean

  @InterfaceMethod(1)
  public fun put_CanBeScrollAnchor(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_OpacityTransition(): ScalarTransition?

  @InterfaceMethod(3)
  public fun put_OpacityTransition(value: ScalarTransition?): Unit

  @InterfaceMethod(4)
  public fun get_Translation(): Vector3?

  @InterfaceMethod(5)
  public fun put_Translation(value: Vector3?): Unit

  @InterfaceMethod(6)
  public fun get_TranslationTransition(): Vector3Transition?

  @InterfaceMethod(7)
  public fun put_TranslationTransition(value: Vector3Transition?): Unit

  @InterfaceMethod(8)
  public fun get_Rotation(): Float

  @InterfaceMethod(9)
  public fun put_Rotation(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_RotationTransition(): ScalarTransition?

  @InterfaceMethod(11)
  public fun put_RotationTransition(value: ScalarTransition?): Unit

  @InterfaceMethod(12)
  public fun get_Scale(): Vector3?

  @InterfaceMethod(13)
  public fun put_Scale(value: Vector3?): Unit

  @InterfaceMethod(14)
  public fun get_ScaleTransition(): Vector3Transition?

  @InterfaceMethod(15)
  public fun put_ScaleTransition(value: Vector3Transition?): Unit

  @InterfaceMethod(16)
  public fun get_TransformMatrix(): Matrix4x4?

  @InterfaceMethod(17)
  public fun put_TransformMatrix(value: Matrix4x4?): Unit

  @InterfaceMethod(18)
  public fun get_CenterPoint(): Vector3?

  @InterfaceMethod(19)
  public fun put_CenterPoint(value: Vector3?): Unit

  @InterfaceMethod(20)
  public fun get_RotationAxis(): Vector3?

  @InterfaceMethod(21)
  public fun put_RotationAxis(value: Vector3?): Unit

  @InterfaceMethod(22)
  public fun StartAnimation(animation: ICompositionAnimationBase?): Unit

  @InterfaceMethod(23)
  public fun StopAnimation(animation: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement9> {
    public override fun getValue() = ABI.makeIUIElement9(pointer.getPointer(0))

    public fun setValue(value: IUIElement9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement9 {
    public val __1021118243_Ptr: Pointer?

    public val _1021118243_VtblPtr: Pointer?
      get() = __1021118243_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanBeScrollAnchor(): Boolean {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanBeScrollAnchor(value: Boolean): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OpacityTransition(): ScalarTransition? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarTransition>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OpacityTransition(value: ScalarTransition?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Translation(): Vector3? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Translation(value: Vector3?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TranslationTransition(): Vector3Transition? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3Transition>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3Transition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TranslationTransition(value: Vector3Transition?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Rotation(): Float {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Rotation(value: Float): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RotationTransition(): ScalarTransition? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarTransition>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_RotationTransition(value: ScalarTransition?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Scale(): Vector3? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Scale(value: Vector3?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ScaleTransition(): Vector3Transition? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3Transition>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3Transition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ScaleTransition(value: Vector3Transition?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TransformMatrix(): Matrix4x4? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TransformMatrix(value: Matrix4x4?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CenterPoint(): Vector3? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_CenterPoint(value: Vector3?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_RotationAxis(): Vector3? {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_RotationAxis(value: Vector3?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun StartAnimation(animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun StopAnimation(animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _1021118243_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118243_Ptr, marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118243_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4a047764e8850ca8f2b08940d6c5f94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement9(ptr: Pointer?): WithDefault = IUIElement9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement9 {
      val address = segment.toRawLongValue()
      return makeIUIElement9(Pointer(address))
    }

    public override fun toNative(obj: IUIElement9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118243_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement9): Array<IUIElement9?> = (elements as
        Array<IUIElement9?>).castToImpl<IUIElement9,IUIElement9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement9?> =
        arrayOfNulls<IUIElement9_Impl>(size) as Array<IUIElement9?>
  }
}
