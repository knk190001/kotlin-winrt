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

@ABIMarker(ICompositionPropertySet.ABI::class)
@Signature("{97f7a17b-97be-5545-9f1c-0b9d44577f57}")
@Guid("97f7a17b97be55459f1c0b9d44577f57")
@WinRTInterface("97f7a17b97be55459f1c0b9d44577f57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionPropertySet.ByReference::class)
public interface ICompositionPropertySet : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertColor(propertyName: String?, value: Color?): Unit

  @InterfaceMethod(1)
  public fun InsertMatrix3x2(propertyName: String?, value: Matrix3x2?): Unit

  @InterfaceMethod(2)
  public fun InsertMatrix4x4(propertyName: String?, value: Matrix4x4?): Unit

  @InterfaceMethod(3)
  public fun InsertQuaternion(propertyName: String?, value: Quaternion?): Unit

  @InterfaceMethod(4)
  public fun InsertScalar(propertyName: String?, value: Float): Unit

  @InterfaceMethod(5)
  public fun InsertVector2(propertyName: String?, value: Vector2?): Unit

  @InterfaceMethod(6)
  public fun InsertVector3(propertyName: String?, value: Vector3?): Unit

  @InterfaceMethod(7)
  public fun InsertVector4(propertyName: String?, value: Vector4?): Unit

  @InterfaceMethod(8)
  public fun TryGetColor(propertyName: String?, value: Windows.UI.Color.ByReference?):
      CompositionGetValueStatus?

  @InterfaceMethod(9)
  public fun TryGetMatrix3x2(propertyName: String?,
      value: Windows.Foundation.Numerics.Matrix3x2.ByReference?): CompositionGetValueStatus?

  @InterfaceMethod(10)
  public fun TryGetMatrix4x4(propertyName: String?,
      value: Windows.Foundation.Numerics.Matrix4x4.ByReference?): CompositionGetValueStatus?

  @InterfaceMethod(11)
  public fun TryGetQuaternion(propertyName: String?,
      value: Windows.Foundation.Numerics.Quaternion.ByReference?): CompositionGetValueStatus?

  @InterfaceMethod(12)
  public fun TryGetScalar(propertyName: String?, value: Float): CompositionGetValueStatus?

  @InterfaceMethod(13)
  public fun TryGetVector2(propertyName: String?,
      value: Windows.Foundation.Numerics.Vector2.ByReference?): CompositionGetValueStatus?

  @InterfaceMethod(14)
  public fun TryGetVector3(propertyName: String?,
      value: Windows.Foundation.Numerics.Vector3.ByReference?): CompositionGetValueStatus?

  @InterfaceMethod(15)
  public fun TryGetVector4(propertyName: String?,
      value: Windows.Foundation.Numerics.Vector4.ByReference?): CompositionGetValueStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionPropertySet> {
    public override fun getValue() = ABI.makeICompositionPropertySet(pointer.getPointer(0))

    public fun setValue(value: ICompositionPropertySet_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionPropertySet {
    public val __53696100_Ptr: Pointer?

    public val _53696100_VtblPtr: Pointer?
      get() = __53696100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertColor(propertyName: String?, value: Color?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertMatrix3x2(propertyName: String?, value: Matrix3x2?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InsertMatrix4x4(propertyName: String?, value: Matrix4x4?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InsertQuaternion(propertyName: String?, value: Quaternion?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun InsertScalar(propertyName: String?, value: Float): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun InsertVector2(propertyName: String?, value: Vector2?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun InsertVector3(propertyName: String?, value: Vector3?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun InsertVector4(propertyName: String?, value: Vector4?): Unit {
      val fnPtr = _53696100_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun TryGetColor(propertyName: String?, value: Windows.UI.Color.ByReference?):
        CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TryGetMatrix3x2(propertyName: String?,
        value: Windows.Foundation.Numerics.Matrix3x2.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TryGetMatrix4x4(propertyName: String?,
        value: Windows.Foundation.Numerics.Matrix4x4.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TryGetQuaternion(propertyName: String?,
        value: Windows.Foundation.Numerics.Quaternion.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun TryGetScalar(propertyName: String?, value: Float):
        CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName), value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun TryGetVector2(propertyName: String?,
        value: Windows.Foundation.Numerics.Vector2.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun TryGetVector3(propertyName: String?,
        value: Windows.Foundation.Numerics.Vector3.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun TryGetVector4(propertyName: String?,
        value: Windows.Foundation.Numerics.Vector4.ByReference?): CompositionGetValueStatus? {
      val fnPtr = _53696100_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__53696100_Ptr, marshalToNative(propertyName),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionPropertySet_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __53696100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionPropertySet, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97f7a17b97be55459f1c0b9d44577f57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionPropertySet(ptr: Pointer?): WithDefault =
        ICompositionPropertySet_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionPropertySet {
      val address = segment.toRawLongValue()
      return makeICompositionPropertySet(Pointer(address))
    }

    public override fun toNative(obj: ICompositionPropertySet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__53696100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionPropertySet): Array<ICompositionPropertySet?>
        = (elements as
        Array<ICompositionPropertySet?>).castToImpl<ICompositionPropertySet,ICompositionPropertySet_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionPropertySet?> =
        arrayOfNulls<ICompositionPropertySet_Impl>(size) as Array<ICompositionPropertySet?>
  }
}
