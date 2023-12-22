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

@ABIMarker(ICompositionRoundedRectangleGeometry.ABI::class)
@Signature("{8770c822-1d50-4b8b-b013-7c9a0e46935f}")
@Guid("8770c8221d504b8bb0137c9a0e46935f")
@WinRTInterface("8770c8221d504b8bb0137c9a0e46935f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionRoundedRectangleGeometry.ByReference::class)
public interface ICompositionRoundedRectangleGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CornerRadius(): Vector2?

  @InterfaceMethod(1)
  public fun put_CornerRadius(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(3)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_Size(): Vector2?

  @InterfaceMethod(5)
  public fun put_Size(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionRoundedRectangleGeometry> {
    public override fun getValue() =
        ABI.makeICompositionRoundedRectangleGeometry(pointer.getPointer(0))

    public fun setValue(value: ICompositionRoundedRectangleGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionRoundedRectangleGeometry {
    public val __1683116336_Ptr: Pointer?

    public val _1683116336_VtblPtr: Pointer?
      get() = __1683116336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CornerRadius(): Vector2? {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CornerRadius(value: Vector2?): Unit {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Size(): Vector2? {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Size(value: Vector2?): Unit {
      val fnPtr = _1683116336_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683116336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionRoundedRectangleGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683116336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionRoundedRectangleGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8770c8221d504b8bb0137c9a0e46935f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionRoundedRectangleGeometry(ptr: Pointer?): WithDefault =
        ICompositionRoundedRectangleGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionRoundedRectangleGeometry {
      val address = segment.toRawLongValue()
      return makeICompositionRoundedRectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: ICompositionRoundedRectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1683116336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionRoundedRectangleGeometry):
        Array<ICompositionRoundedRectangleGeometry?> = (elements as
        Array<ICompositionRoundedRectangleGeometry?>).castToImpl<ICompositionRoundedRectangleGeometry,ICompositionRoundedRectangleGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionRoundedRectangleGeometry?> =
        arrayOfNulls<ICompositionRoundedRectangleGeometry_Impl>(size) as
        Array<ICompositionRoundedRectangleGeometry?>
  }
}
