package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IZoomSnapPoint.ABI::class)
@Signature("{8101d353-8db3-5ac6-a7f8-b18eb9c123ac}")
@Guid("8101d3538db35ac6a7f8b18eb9c123ac")
@WinRTInterface("8101d3538db35ac6a7f8b18eb9c123ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IZoomSnapPoint.ByReference::class)
public interface IZoomSnapPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IZoomSnapPoint>
      {
    public override fun getValue() = ABI.makeIZoomSnapPoint(pointer.getPointer(0))

    public fun setValue(value: IZoomSnapPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IZoomSnapPoint {
    public val __794560350_Ptr: Pointer?

    public val _794560350_VtblPtr: Pointer?
      get() = __794560350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Double {
      val fnPtr = _794560350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__794560350_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IZoomSnapPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794560350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IZoomSnapPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8101d3538db35ac6a7f8b18eb9c123ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIZoomSnapPoint(ptr: Pointer?): WithDefault = IZoomSnapPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IZoomSnapPoint {
      val address = segment.toRawLongValue()
      return makeIZoomSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: IZoomSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794560350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IZoomSnapPoint): Array<IZoomSnapPoint?> = (elements as
        Array<IZoomSnapPoint?>).castToImpl<IZoomSnapPoint,IZoomSnapPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IZoomSnapPoint?> =
        arrayOfNulls<IZoomSnapPoint_Impl>(size) as Array<IZoomSnapPoint?>
  }
}
