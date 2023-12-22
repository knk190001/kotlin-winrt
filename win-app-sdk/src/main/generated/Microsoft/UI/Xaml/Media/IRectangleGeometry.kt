package Microsoft.UI.Xaml.Media

import Windows.Foundation.Rect
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

@ABIMarker(IRectangleGeometry.ABI::class)
@Signature("{b6143890-a5f5-54e0-ab42-d88bab451f04}")
@Guid("b6143890a5f554e0ab42d88bab451f04")
@WinRTInterface("b6143890a5f554e0ab42d88bab451f04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectangleGeometry.ByReference::class)
public interface IRectangleGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Rect(): Rect?

  @InterfaceMethod(1)
  public fun put_Rect(value: Rect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRectangleGeometry> {
    public override fun getValue() = ABI.makeIRectangleGeometry(pointer.getPointer(0))

    public fun setValue(value: IRectangleGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectangleGeometry {
    public val __56587536_Ptr: Pointer?

    public val _56587536_VtblPtr: Pointer?
      get() = __56587536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rect(): Rect? {
      val fnPtr = _56587536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__56587536_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Rect(value: Rect?): Unit {
      val fnPtr = _56587536_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56587536_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRectangleGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __56587536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangleGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6143890a5f554e0ab42d88bab451f04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangleGeometry(ptr: Pointer?): WithDefault = IRectangleGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangleGeometry {
      val address = segment.toRawLongValue()
      return makeIRectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: IRectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__56587536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangleGeometry): Array<IRectangleGeometry?> =
        (elements as
        Array<IRectangleGeometry?>).castToImpl<IRectangleGeometry,IRectangleGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangleGeometry?> =
        arrayOfNulls<IRectangleGeometry_Impl>(size) as Array<IRectangleGeometry?>
  }
}
