package Windows.UI.Xaml.Media

import Windows.UI.Xaml.Media.Media3D.Matrix3D
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMatrix3DProjection.ABI::class)
@Signature("{6f03e149-bfc9-4c01-b578-50338cec97fc}")
@Guid("6f03e149bfc94c01b57850338cec97fc")
@WinRTInterface("6f03e149bfc94c01b57850338cec97fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrix3DProjection.ByReference::class)
public interface IMatrix3DProjection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProjectionMatrix(): Matrix3D?

  @InterfaceMethod(1)
  public fun put_ProjectionMatrix(value: Matrix3D?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrix3DProjection> {
    public override fun getValue() = ABI.makeIMatrix3DProjection(pointer.getPointer(0))

    public fun setValue(value: IMatrix3DProjection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrix3DProjection {
    public val __682630365_Ptr: Pointer?

    public val _682630365_VtblPtr: Pointer?
      get() = __682630365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProjectionMatrix(): Matrix3D? {
      val fnPtr = _682630365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__682630365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProjectionMatrix(value: Matrix3D?): Unit {
      val fnPtr = _682630365_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__682630365_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMatrix3DProjection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __682630365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrix3DProjection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f03e149bfc94c01b57850338cec97fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrix3DProjection(ptr: Pointer?): WithDefault = IMatrix3DProjection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrix3DProjection {
      val address = segment.toRawLongValue()
      return makeIMatrix3DProjection(Pointer(address))
    }

    public override fun toNative(obj: IMatrix3DProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__682630365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrix3DProjection): Array<IMatrix3DProjection?> =
        (elements as
        Array<IMatrix3DProjection?>).castToImpl<IMatrix3DProjection,IMatrix3DProjection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrix3DProjection?> =
        arrayOfNulls<IMatrix3DProjection_Impl>(size) as Array<IMatrix3DProjection?>
  }
}
