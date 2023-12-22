package Windows.UI.Composition.Scenes

import Windows.Foundation.Numerics.Quaternion
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISceneModelTransform.ABI::class)
@Signature("{c05576c2-32b1-4269-980d-b98537100ae4}")
@Guid("c05576c232b14269980db98537100ae4")
@WinRTInterface("c05576c232b14269980db98537100ae4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneModelTransform.ByReference::class)
public interface ISceneModelTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): Quaternion?

  @InterfaceMethod(1)
  public fun put_Orientation(value: Quaternion?): Unit

  @InterfaceMethod(2)
  public fun get_RotationAngle(): Float

  @InterfaceMethod(3)
  public fun put_RotationAngle(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_RotationAngleInDegrees(): Float

  @InterfaceMethod(5)
  public fun put_RotationAngleInDegrees(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_RotationAxis(): Vector3?

  @InterfaceMethod(7)
  public fun put_RotationAxis(value: Vector3?): Unit

  @InterfaceMethod(8)
  public fun get_Scale(): Vector3?

  @InterfaceMethod(9)
  public fun put_Scale(value: Vector3?): Unit

  @InterfaceMethod(10)
  public fun get_Translation(): Vector3?

  @InterfaceMethod(11)
  public fun put_Translation(value: Vector3?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneModelTransform> {
    public override fun getValue() = ABI.makeISceneModelTransform(pointer.getPointer(0))

    public fun setValue(value: ISceneModelTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneModelTransform {
    public val __2096954528_Ptr: Pointer?

    public val _2096954528_VtblPtr: Pointer?
      get() = __2096954528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: Quaternion?): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RotationAngle(): Float {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RotationAngle(value: Float): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RotationAngleInDegrees(): Float {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RotationAngleInDegrees(value: Float): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotationAxis(): Vector3? {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RotationAxis(value: Vector3?): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Scale(): Vector3? {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Scale(value: Vector3?): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Translation(): Vector3? {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Translation(value: Vector3?): Unit {
      val fnPtr = _2096954528_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096954528_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneModelTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2096954528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneModelTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c05576c232b14269980db98537100ae4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneModelTransform(ptr: Pointer?): WithDefault = ISceneModelTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneModelTransform {
      val address = segment.toRawLongValue()
      return makeISceneModelTransform(Pointer(address))
    }

    public override fun toNative(obj: ISceneModelTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2096954528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneModelTransform): Array<ISceneModelTransform?> =
        (elements as
        Array<ISceneModelTransform?>).castToImpl<ISceneModelTransform,ISceneModelTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneModelTransform?> =
        arrayOfNulls<ISceneModelTransform_Impl>(size) as Array<ISceneModelTransform?>
  }
}
