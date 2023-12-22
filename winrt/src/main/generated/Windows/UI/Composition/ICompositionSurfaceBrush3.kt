package Windows.UI.Composition

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionSurfaceBrush3.ABI::class)
@Signature("{550bb289-1fe0-42e5-8195-1eefa87ff08e}")
@Guid("550bb2891fe042e581951eefa87ff08e")
@WinRTInterface("550bb2891fe042e581951eefa87ff08e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSurfaceBrush3.ByReference::class)
public interface ICompositionSurfaceBrush3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SnapToPixels(): Boolean

  @InterfaceMethod(1)
  public fun put_SnapToPixels(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSurfaceBrush3> {
    public override fun getValue() = ABI.makeICompositionSurfaceBrush3(pointer.getPointer(0))

    public fun setValue(value: ICompositionSurfaceBrush3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSurfaceBrush3 {
    public val __1996022934_Ptr: Pointer?

    public val _1996022934_VtblPtr: Pointer?
      get() = __1996022934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SnapToPixels(): Boolean {
      val fnPtr = _1996022934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1996022934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SnapToPixels(value: Boolean): Unit {
      val fnPtr = _1996022934_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996022934_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionSurfaceBrush3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1996022934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSurfaceBrush3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("550bb2891fe042e581951eefa87ff08e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSurfaceBrush3(ptr: Pointer?): WithDefault =
        ICompositionSurfaceBrush3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSurfaceBrush3 {
      val address = segment.toRawLongValue()
      return makeICompositionSurfaceBrush3(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSurfaceBrush3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996022934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSurfaceBrush3):
        Array<ICompositionSurfaceBrush3?> = (elements as
        Array<ICompositionSurfaceBrush3?>).castToImpl<ICompositionSurfaceBrush3,ICompositionSurfaceBrush3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSurfaceBrush3?> =
        arrayOfNulls<ICompositionSurfaceBrush3_Impl>(size) as Array<ICompositionSurfaceBrush3?>
  }
}
