package Microsoft.UI.Composition

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

@ABIMarker(IVisual4.ABI::class)
@Signature("{27cb223f-c431-57ac-b61e-d6b7515d579f}")
@Guid("27cb223fc43157acb61ed6b7515d579f")
@WinRTInterface("27cb223fc43157acb61ed6b7515d579f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisual4.ByReference::class)
public interface IVisual4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPixelSnappingEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPixelSnappingEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisual4> {
    public override fun getValue() = ABI.makeIVisual4(pointer.getPointer(0))

    public fun setValue(value: IVisual4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisual4 {
    public val __521733445_Ptr: Pointer?

    public val _521733445_VtblPtr: Pointer?
      get() = __521733445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPixelSnappingEnabled(): Boolean {
      val fnPtr = _521733445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__521733445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPixelSnappingEnabled(value: Boolean): Unit {
      val fnPtr = _521733445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__521733445_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisual4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __521733445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisual4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27cb223fc43157acb61ed6b7515d579f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisual4(ptr: Pointer?): WithDefault = IVisual4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisual4 {
      val address = segment.toRawLongValue()
      return makeIVisual4(Pointer(address))
    }

    public override fun toNative(obj: IVisual4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__521733445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisual4): Array<IVisual4?> = (elements as
        Array<IVisual4?>).castToImpl<IVisual4,IVisual4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisual4?> = arrayOfNulls<IVisual4_Impl>(size) as
        Array<IVisual4?>
  }
}
