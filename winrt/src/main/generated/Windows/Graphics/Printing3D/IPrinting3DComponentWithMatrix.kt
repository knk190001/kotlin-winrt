package Windows.Graphics.Printing3D

import Windows.Foundation.Numerics.Matrix4x4
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

@ABIMarker(IPrinting3DComponentWithMatrix.ABI::class)
@Signature("{3279f335-0ef0-456b-9a21-49bebe8b51c2}")
@Guid("3279f3350ef0456b9a2149bebe8b51c2")
@WinRTInterface("3279f3350ef0456b9a2149bebe8b51c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DComponentWithMatrix.ByReference::class)
public interface IPrinting3DComponentWithMatrix : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Component(): Printing3DComponent?

  @InterfaceMethod(1)
  public fun put_Component(value: Printing3DComponent?): Unit

  @InterfaceMethod(2)
  public fun get_Matrix(): Matrix4x4?

  @InterfaceMethod(3)
  public fun put_Matrix(value: Matrix4x4?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DComponentWithMatrix> {
    public override fun getValue() = ABI.makeIPrinting3DComponentWithMatrix(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DComponentWithMatrix_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DComponentWithMatrix {
    public val __861565459_Ptr: Pointer?

    public val _861565459_VtblPtr: Pointer?
      get() = __861565459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Component(): Printing3DComponent? {
      val fnPtr = _861565459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DComponent>()
      val hr = fn.invokeHR(arrayOf(__861565459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DComponent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Component(value: Printing3DComponent?): Unit {
      val fnPtr = _861565459_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861565459_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Matrix(): Matrix4x4? {
      val fnPtr = _861565459_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__861565459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Matrix(value: Matrix4x4?): Unit {
      val fnPtr = _861565459_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861565459_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DComponentWithMatrix_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __861565459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DComponentWithMatrix, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3279f3350ef0456b9a2149bebe8b51c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DComponentWithMatrix(ptr: Pointer?): WithDefault =
        IPrinting3DComponentWithMatrix_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DComponentWithMatrix {
      val address = segment.toRawLongValue()
      return makeIPrinting3DComponentWithMatrix(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DComponentWithMatrix): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__861565459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DComponentWithMatrix):
        Array<IPrinting3DComponentWithMatrix?> = (elements as
        Array<IPrinting3DComponentWithMatrix?>).castToImpl<IPrinting3DComponentWithMatrix,IPrinting3DComponentWithMatrix_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DComponentWithMatrix?> =
        arrayOfNulls<IPrinting3DComponentWithMatrix_Impl>(size) as
        Array<IPrinting3DComponentWithMatrix?>
  }
}
