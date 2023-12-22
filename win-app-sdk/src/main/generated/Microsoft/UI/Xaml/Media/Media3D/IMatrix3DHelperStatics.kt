package Microsoft.UI.Xaml.Media.Media3D

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMatrix3DHelperStatics.ABI::class)
@Signature("{930e447b-265c-5ded-9e64-57b8933c55c3}")
@Guid("930e447b265c5ded9e6457b8933c55c3")
@WinRTInterface("930e447b265c5ded9e6457b8933c55c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrix3DHelperStatics.ByReference::class)
public interface IMatrix3DHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identity(): Matrix3D?

  @InterfaceMethod(1)
  public fun Multiply(matrix1: Matrix3D?, matrix2: Matrix3D?): Matrix3D?

  @InterfaceMethod(2)
  public fun FromElements(
    m11: Double,
    m12: Double,
    m13: Double,
    m14: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m24: Double,
    m31: Double,
    m32: Double,
    m33: Double,
    m34: Double,
    offsetX: Double,
    offsetY: Double,
    offsetZ: Double,
    m44: Double
  ): Matrix3D?

  @InterfaceMethod(3)
  public fun GetHasInverse(target: Matrix3D?): Boolean

  @InterfaceMethod(4)
  public fun GetIsIdentity(target: Matrix3D?): Boolean

  @InterfaceMethod(5)
  public fun Invert(target: Matrix3D?): Matrix3D?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrix3DHelperStatics> {
    public override fun getValue() = ABI.makeIMatrix3DHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IMatrix3DHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrix3DHelperStatics {
    public val __2100256219_Ptr: Pointer?

    public val _2100256219_VtblPtr: Pointer?
      get() = __2100256219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identity(): Matrix3D? {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Multiply(matrix1: Matrix3D?, matrix2: Matrix3D?): Matrix3D? {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr, marshalToNative(matrix1),
          marshalToNative(matrix2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromElements(
      m11: Double,
      m12: Double,
      m13: Double,
      m14: Double,
      m21: Double,
      m22: Double,
      m23: Double,
      m24: Double,
      m31: Double,
      m32: Double,
      m33: Double,
      m34: Double,
      offsetX: Double,
      offsetY: Double,
      offsetZ: Double,
      m44: Double
    ): Matrix3D? {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr, m11, m12, m13, m14, m21, m22, m23, m24, m31,
          m32, m33, m34, offsetX, offsetY, offsetZ, m44, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetHasInverse(target: Matrix3D?): Boolean {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetIsIdentity(target: Matrix3D?): Boolean {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Invert(target: Matrix3D?): Matrix3D? {
      val fnPtr = _2100256219_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__2100256219_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }
  }

  public class IMatrix3DHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2100256219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrix3DHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("930e447b265c5ded9e6457b8933c55c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrix3DHelperStatics(ptr: Pointer?): WithDefault =
        IMatrix3DHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrix3DHelperStatics {
      val address = segment.toRawLongValue()
      return makeIMatrix3DHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IMatrix3DHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100256219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrix3DHelperStatics): Array<IMatrix3DHelperStatics?> =
        (elements as
        Array<IMatrix3DHelperStatics?>).castToImpl<IMatrix3DHelperStatics,IMatrix3DHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrix3DHelperStatics?> =
        arrayOfNulls<IMatrix3DHelperStatics_Impl>(size) as Array<IMatrix3DHelperStatics?>
  }
}
