package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector3
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpotLight.ABI::class)
@Signature("{5935496a-0586-5f77-bd03-d5a6bb9e8fa0}")
@Guid("5935496a05865f77bd03d5a6bb9e8fa0")
@WinRTInterface("5935496a05865f77bd03d5a6bb9e8fa0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpotLight.ByReference::class)
public interface ISpotLight : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConstantAttenuation(): Float

  @InterfaceMethod(1)
  public fun put_ConstantAttenuation(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_CoordinateSpace(): Visual?

  @InterfaceMethod(3)
  public fun put_CoordinateSpace(value: Visual?): Unit

  @InterfaceMethod(4)
  public fun get_Direction(): Vector3?

  @InterfaceMethod(5)
  public fun put_Direction(value: Vector3?): Unit

  @InterfaceMethod(6)
  public fun get_InnerConeAngle(): Float

  @InterfaceMethod(7)
  public fun put_InnerConeAngle(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_InnerConeAngleInDegrees(): Float

  @InterfaceMethod(9)
  public fun put_InnerConeAngleInDegrees(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_InnerConeColor(): Color?

  @InterfaceMethod(11)
  public fun put_InnerConeColor(value: Color?): Unit

  @InterfaceMethod(12)
  public fun get_LinearAttenuation(): Float

  @InterfaceMethod(13)
  public fun put_LinearAttenuation(value: Float): Unit

  @InterfaceMethod(14)
  public fun get_Offset(): Vector3?

  @InterfaceMethod(15)
  public fun put_Offset(value: Vector3?): Unit

  @InterfaceMethod(16)
  public fun get_OuterConeAngle(): Float

  @InterfaceMethod(17)
  public fun put_OuterConeAngle(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_OuterConeAngleInDegrees(): Float

  @InterfaceMethod(19)
  public fun put_OuterConeAngleInDegrees(value: Float): Unit

  @InterfaceMethod(20)
  public fun get_OuterConeColor(): Color?

  @InterfaceMethod(21)
  public fun put_OuterConeColor(value: Color?): Unit

  @InterfaceMethod(22)
  public fun get_QuadraticAttenuation(): Float

  @InterfaceMethod(23)
  public fun put_QuadraticAttenuation(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpotLight> {
    public override fun getValue() = ABI.makeISpotLight(pointer.getPointer(0))

    public fun setValue(value: ISpotLight_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpotLight {
    public val __2030575301_Ptr: Pointer?

    public val _2030575301_VtblPtr: Pointer?
      get() = __2030575301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConstantAttenuation(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ConstantAttenuation(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CoordinateSpace(): Visual? {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CoordinateSpace(value: Visual?): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Direction(): Vector3? {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Direction(value: Vector3?): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_InnerConeAngle(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_InnerConeAngle(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_InnerConeAngleInDegrees(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_InnerConeAngleInDegrees(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_InnerConeColor(): Color? {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_InnerConeColor(value: Color?): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_LinearAttenuation(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_LinearAttenuation(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Offset(): Vector3? {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Offset(value: Vector3?): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_OuterConeAngle(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_OuterConeAngle(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_OuterConeAngleInDegrees(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_OuterConeAngleInDegrees(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_OuterConeColor(): Color? {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_OuterConeColor(value: Color?): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_QuadraticAttenuation(): Float {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_QuadraticAttenuation(value: Float): Unit {
      val fnPtr = _2030575301_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2030575301_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpotLight_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030575301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpotLight, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5935496a05865f77bd03d5a6bb9e8fa0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpotLight(ptr: Pointer?): WithDefault = ISpotLight_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpotLight {
      val address = segment.toRawLongValue()
      return makeISpotLight(Pointer(address))
    }

    public override fun toNative(obj: ISpotLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030575301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpotLight): Array<ISpotLight?> = (elements as
        Array<ISpotLight?>).castToImpl<ISpotLight,ISpotLight_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpotLight?> = arrayOfNulls<ISpotLight_Impl>(size)
        as Array<ISpotLight?>
  }
}
