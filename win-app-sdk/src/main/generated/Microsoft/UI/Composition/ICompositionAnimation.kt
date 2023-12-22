package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Matrix3x2
import Windows.Foundation.Numerics.Matrix4x4
import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Numerics.Vector4
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionAnimation.ABI::class)
@Signature("{a829ccc8-6fde-5b90-ad37-efd307e1b631}")
@Guid("a829ccc86fde5b90ad37efd307e1b631")
@WinRTInterface("a829ccc86fde5b90ad37efd307e1b631")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimation.ByReference::class)
public interface ICompositionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClearAllParameters(): Unit

  @InterfaceMethod(1)
  public fun ClearParameter(key: String?): Unit

  @InterfaceMethod(2)
  public fun SetColorParameter(key: String?, value: Color?): Unit

  @InterfaceMethod(3)
  public fun SetMatrix3x2Parameter(key: String?, value: Matrix3x2?): Unit

  @InterfaceMethod(4)
  public fun SetMatrix4x4Parameter(key: String?, value: Matrix4x4?): Unit

  @InterfaceMethod(5)
  public fun SetQuaternionParameter(key: String?, value: Quaternion?): Unit

  @InterfaceMethod(6)
  public fun SetReferenceParameter(key: String?, compositionObject: CompositionObject?): Unit

  @InterfaceMethod(7)
  public fun SetScalarParameter(key: String?, value: Float): Unit

  @InterfaceMethod(8)
  public fun SetVector2Parameter(key: String?, value: Vector2?): Unit

  @InterfaceMethod(9)
  public fun SetVector3Parameter(key: String?, value: Vector3?): Unit

  @InterfaceMethod(10)
  public fun SetVector4Parameter(key: String?, value: Vector4?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimation> {
    public override fun getValue() = ABI.makeICompositionAnimation(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimation {
    public val __1425420947_Ptr: Pointer?

    public val _1425420947_VtblPtr: Pointer?
      get() = __1425420947_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClearAllParameters(): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ClearParameter(key: String?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetColorParameter(key: String?, value: Color?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetMatrix3x2Parameter(key: String?, value: Matrix3x2?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetMatrix4x4Parameter(key: String?, value: Matrix4x4?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetQuaternionParameter(key: String?, value: Quaternion?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetReferenceParameter(key: String?, compositionObject: CompositionObject?):
        Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key),
          marshalToNative(compositionObject),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetScalarParameter(key: String?, value: Float): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetVector2Parameter(key: String?, value: Vector2?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetVector3Parameter(key: String?, value: Vector3?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetVector4Parameter(key: String?, value: Vector4?): Unit {
      val fnPtr = _1425420947_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425420947_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1425420947_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a829ccc86fde5b90ad37efd307e1b631")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimation(ptr: Pointer?): WithDefault =
        ICompositionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimation {
      val address = segment.toRawLongValue()
      return makeICompositionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1425420947_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimation): Array<ICompositionAnimation?> =
        (elements as
        Array<ICompositionAnimation?>).castToImpl<ICompositionAnimation,ICompositionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimation?> =
        arrayOfNulls<ICompositionAnimation_Impl>(size) as Array<ICompositionAnimation?>
  }
}
