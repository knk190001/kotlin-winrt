package Windows.UI.Composition

import Windows.Foundation.Numerics.Matrix4x4
import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IVisual.ABI::class)
@Signature("{117e202d-a859-4c89-873b-c2aa566788e3}")
@Guid("117e202da8594c89873bc2aa566788e3")
@WinRTInterface("117e202da8594c89873bc2aa566788e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisual.ByReference::class)
public interface IVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnchorPoint(): Vector2?

  @InterfaceMethod(1)
  public fun put_AnchorPoint(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_BackfaceVisibility(): CompositionBackfaceVisibility?

  @InterfaceMethod(3)
  public fun put_BackfaceVisibility(value: CompositionBackfaceVisibility?): Unit

  @InterfaceMethod(4)
  public fun get_BorderMode(): CompositionBorderMode?

  @InterfaceMethod(5)
  public fun put_BorderMode(value: CompositionBorderMode?): Unit

  @InterfaceMethod(6)
  public fun get_CenterPoint(): Vector3?

  @InterfaceMethod(7)
  public fun put_CenterPoint(value: Vector3?): Unit

  @InterfaceMethod(8)
  public fun get_Clip(): CompositionClip?

  @InterfaceMethod(9)
  public fun put_Clip(value: CompositionClip?): Unit

  @InterfaceMethod(10)
  public fun get_CompositeMode(): CompositionCompositeMode?

  @InterfaceMethod(11)
  public fun put_CompositeMode(value: CompositionCompositeMode?): Unit

  @InterfaceMethod(12)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(13)
  public fun put_IsVisible(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_Offset(): Vector3?

  @InterfaceMethod(15)
  public fun put_Offset(value: Vector3?): Unit

  @InterfaceMethod(16)
  public fun get_Opacity(): Float

  @InterfaceMethod(17)
  public fun put_Opacity(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_Orientation(): Quaternion?

  @InterfaceMethod(19)
  public fun put_Orientation(value: Quaternion?): Unit

  @InterfaceMethod(20)
  public fun get_Parent(): ContainerVisual?

  @InterfaceMethod(21)
  public fun get_RotationAngle(): Float

  @InterfaceMethod(22)
  public fun put_RotationAngle(value: Float): Unit

  @InterfaceMethod(23)
  public fun get_RotationAngleInDegrees(): Float

  @InterfaceMethod(24)
  public fun put_RotationAngleInDegrees(value: Float): Unit

  @InterfaceMethod(25)
  public fun get_RotationAxis(): Vector3?

  @InterfaceMethod(26)
  public fun put_RotationAxis(value: Vector3?): Unit

  @InterfaceMethod(27)
  public fun get_Scale(): Vector3?

  @InterfaceMethod(28)
  public fun put_Scale(value: Vector3?): Unit

  @InterfaceMethod(29)
  public fun get_Size(): Vector2?

  @InterfaceMethod(30)
  public fun put_Size(value: Vector2?): Unit

  @InterfaceMethod(31)
  public fun get_TransformMatrix(): Matrix4x4?

  @InterfaceMethod(32)
  public fun put_TransformMatrix(value: Matrix4x4?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisual> {
    public override fun getValue() = ABI.makeIVisual(pointer.getPointer(0))

    public fun setValue(value: IVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisual {
    public val __1752599442_Ptr: Pointer?

    public val _1752599442_VtblPtr: Pointer?
      get() = __1752599442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnchorPoint(): Vector2? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnchorPoint(value: Vector2?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BackfaceVisibility(): CompositionBackfaceVisibility? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBackfaceVisibility>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBackfaceVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BackfaceVisibility(value: CompositionBackfaceVisibility?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BorderMode(): CompositionBorderMode? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBorderMode>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBorderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BorderMode(value: CompositionBorderMode?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CenterPoint(): Vector3? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CenterPoint(value: Vector3?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Clip(): CompositionClip? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionClip>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Clip(value: CompositionClip?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CompositeMode(): CompositionCompositeMode? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionCompositeMode>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionCompositeMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CompositeMode(value: CompositionCompositeMode?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsVisible(value: Boolean): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Offset(): Vector3? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Offset(value: Vector3?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Opacity(): Float {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_Opacity(value: Float): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Orientation(value: Quaternion?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Parent(): ContainerVisual? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContainerVisual>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContainerVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_RotationAngle(): Float {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_RotationAngle(value: Float): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_RotationAngleInDegrees(): Float {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun put_RotationAngleInDegrees(value: Float): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_RotationAxis(): Vector3? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_RotationAxis(value: Vector3?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_Scale(): Vector3? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_Scale(value: Vector3?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_Size(): Vector2? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun put_Size(value: Vector2?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_TransformMatrix(): Matrix4x4? {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_TransformMatrix(value: Matrix4x4?): Unit {
      val fnPtr = _1752599442_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752599442_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1752599442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("117e202da8594c89873bc2aa566788e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisual(ptr: Pointer?): WithDefault = IVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisual {
      val address = segment.toRawLongValue()
      return makeIVisual(Pointer(address))
    }

    public override fun toNative(obj: IVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1752599442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisual): Array<IVisual?> = (elements as
        Array<IVisual?>).castToImpl<IVisual,IVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisual?> = arrayOfNulls<IVisual_Impl>(size) as
        Array<IVisual?>
  }
}
