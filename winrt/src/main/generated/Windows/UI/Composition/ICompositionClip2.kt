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

@ABIMarker(ICompositionClip2.ABI::class)
@Signature("{5893e069-3516-40e1-89e0-5ba924927235}")
@Guid("5893e069351640e189e05ba924927235")
@WinRTInterface("5893e069351640e189e05ba924927235")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionClip2.ByReference::class)
public interface ICompositionClip2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnchorPoint(): Vector2?

  @InterfaceMethod(1)
  public fun put_AnchorPoint(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_CenterPoint(): Vector2?

  @InterfaceMethod(3)
  public fun put_CenterPoint(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(5)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(6)
  public fun get_RotationAngle(): Float

  @InterfaceMethod(7)
  public fun put_RotationAngle(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_RotationAngleInDegrees(): Float

  @InterfaceMethod(9)
  public fun put_RotationAngleInDegrees(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_Scale(): Vector2?

  @InterfaceMethod(11)
  public fun put_Scale(value: Vector2?): Unit

  @InterfaceMethod(12)
  public fun get_TransformMatrix(): Matrix3x2?

  @InterfaceMethod(13)
  public fun put_TransformMatrix(value: Matrix3x2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionClip2> {
    public override fun getValue() = ABI.makeICompositionClip2(pointer.getPointer(0))

    public fun setValue(value: ICompositionClip2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionClip2 {
    public val __1359146234_Ptr: Pointer?

    public val _1359146234_VtblPtr: Pointer?
      get() = __1359146234_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnchorPoint(): Vector2? {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnchorPoint(value: Vector2?): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterPoint(): Vector2? {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CenterPoint(value: Vector2?): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotationAngle(): Float {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RotationAngle(value: Float): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RotationAngleInDegrees(): Float {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_RotationAngleInDegrees(value: Float): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Scale(): Vector2? {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Scale(value: Vector2?): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TransformMatrix(): Matrix3x2? {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_TransformMatrix(value: Matrix3x2?): Unit {
      val fnPtr = _1359146234_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359146234_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionClip2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359146234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionClip2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5893e069351640e189e05ba924927235")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionClip2(ptr: Pointer?): WithDefault = ICompositionClip2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionClip2 {
      val address = segment.toRawLongValue()
      return makeICompositionClip2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionClip2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359146234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionClip2): Array<ICompositionClip2?> = (elements
        as Array<ICompositionClip2?>).castToImpl<ICompositionClip2,ICompositionClip2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionClip2?> =
        arrayOfNulls<ICompositionClip2_Impl>(size) as Array<ICompositionClip2?>
  }
}
