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

@ABIMarker(ICompositionShape.ABI::class)
@Signature("{b47ce2f7-9a88-42c4-9e87-2e500ca8688c}")
@Guid("b47ce2f79a8842c49e872e500ca8688c")
@WinRTInterface("b47ce2f79a8842c49e872e500ca8688c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionShape.ByReference::class)
public interface ICompositionShape : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterPoint(): Vector2?

  @InterfaceMethod(1)
  public fun put_CenterPoint(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(3)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_RotationAngle(): Float

  @InterfaceMethod(5)
  public fun put_RotationAngle(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_RotationAngleInDegrees(): Float

  @InterfaceMethod(7)
  public fun put_RotationAngleInDegrees(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_Scale(): Vector2?

  @InterfaceMethod(9)
  public fun put_Scale(value: Vector2?): Unit

  @InterfaceMethod(10)
  public fun get_TransformMatrix(): Matrix3x2?

  @InterfaceMethod(11)
  public fun put_TransformMatrix(value: Matrix3x2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionShape> {
    public override fun getValue() = ABI.makeICompositionShape(pointer.getPointer(0))

    public fun setValue(value: ICompositionShape_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionShape {
    public val __1344496699_Ptr: Pointer?

    public val _1344496699_VtblPtr: Pointer?
      get() = __1344496699_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterPoint(): Vector2? {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CenterPoint(value: Vector2?): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RotationAngle(): Float {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RotationAngle(value: Float): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotationAngleInDegrees(): Float {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RotationAngleInDegrees(value: Float): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Scale(): Vector2? {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Scale(value: Vector2?): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TransformMatrix(): Matrix3x2? {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_TransformMatrix(value: Matrix3x2?): Unit {
      val fnPtr = _1344496699_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344496699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionShape_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344496699_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionShape, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b47ce2f79a8842c49e872e500ca8688c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionShape(ptr: Pointer?): WithDefault = ICompositionShape_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionShape {
      val address = segment.toRawLongValue()
      return makeICompositionShape(Pointer(address))
    }

    public override fun toNative(obj: ICompositionShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344496699_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionShape): Array<ICompositionShape?> = (elements
        as Array<ICompositionShape?>).castToImpl<ICompositionShape,ICompositionShape_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionShape?> =
        arrayOfNulls<ICompositionShape_Impl>(size) as Array<ICompositionShape?>
  }
}
