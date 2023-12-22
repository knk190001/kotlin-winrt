package Microsoft.UI.Xaml.Shapes

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRectangle.ABI::class)
@Signature("{bf7d30b9-152c-556e-9f10-d0b7eba4e52f}")
@Guid("bf7d30b9152c556e9f10d0b7eba4e52f")
@WinRTInterface("bf7d30b9152c556e9f10d0b7eba4e52f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectangle.ByReference::class)
public interface IRectangle : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RadiusX(): Double

  @InterfaceMethod(1)
  public fun put_RadiusX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_RadiusY(): Double

  @InterfaceMethod(3)
  public fun put_RadiusY(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRectangle> {
    public override fun getValue() = ABI.makeIRectangle(pointer.getPointer(0))

    public fun setValue(value: IRectangle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectangle {
    public val __1539404348_Ptr: Pointer?

    public val _1539404348_VtblPtr: Pointer?
      get() = __1539404348_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RadiusX(): Double {
      val fnPtr = _1539404348_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1539404348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RadiusX(value: Double): Unit {
      val fnPtr = _1539404348_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539404348_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RadiusY(): Double {
      val fnPtr = _1539404348_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1539404348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RadiusY(value: Double): Unit {
      val fnPtr = _1539404348_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539404348_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRectangle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539404348_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf7d30b9152c556e9f10d0b7eba4e52f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangle(ptr: Pointer?): WithDefault = IRectangle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangle {
      val address = segment.toRawLongValue()
      return makeIRectangle(Pointer(address))
    }

    public override fun toNative(obj: IRectangle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539404348_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangle): Array<IRectangle?> = (elements as
        Array<IRectangle?>).castToImpl<IRectangle,IRectangle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangle?> = arrayOfNulls<IRectangle_Impl>(size)
        as Array<IRectangle?>
  }
}
