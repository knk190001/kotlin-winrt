package Windows.UI.Composition

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionRectangleGeometry.ABI::class)
@Signature("{0cd51428-5356-4246-aecf-7a0b76975400}")
@Guid("0cd5142853564246aecf7a0b76975400")
@WinRTInterface("0cd5142853564246aecf7a0b76975400")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionRectangleGeometry.ByReference::class)
public interface ICompositionRectangleGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(1)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_Size(): Vector2?

  @InterfaceMethod(3)
  public fun put_Size(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionRectangleGeometry> {
    public override fun getValue() = ABI.makeICompositionRectangleGeometry(pointer.getPointer(0))

    public fun setValue(value: ICompositionRectangleGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionRectangleGeometry {
    public val __1738109221_Ptr: Pointer?

    public val _1738109221_VtblPtr: Pointer?
      get() = __1738109221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _1738109221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1738109221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _1738109221_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1738109221_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Size(): Vector2? {
      val fnPtr = _1738109221_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1738109221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Size(value: Vector2?): Unit {
      val fnPtr = _1738109221_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1738109221_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionRectangleGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1738109221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionRectangleGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cd5142853564246aecf7a0b76975400")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionRectangleGeometry(ptr: Pointer?): WithDefault =
        ICompositionRectangleGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionRectangleGeometry {
      val address = segment.toRawLongValue()
      return makeICompositionRectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: ICompositionRectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1738109221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionRectangleGeometry):
        Array<ICompositionRectangleGeometry?> = (elements as
        Array<ICompositionRectangleGeometry?>).castToImpl<ICompositionRectangleGeometry,ICompositionRectangleGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionRectangleGeometry?> =
        arrayOfNulls<ICompositionRectangleGeometry_Impl>(size) as
        Array<ICompositionRectangleGeometry?>
  }
}
