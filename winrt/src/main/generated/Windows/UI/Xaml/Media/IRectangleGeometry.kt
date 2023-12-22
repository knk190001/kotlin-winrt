package Windows.UI.Xaml.Media

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
@Signature("{a25a1f58-c575-4196-91cf-9fdfb10445c3}")
@Guid("a25a1f58c575419691cf9fdfb10445c3")
@WinRTInterface("a25a1f58c575419691cf9fdfb10445c3")
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
    public val __887037819_Ptr: Pointer?

    public val _887037819_VtblPtr: Pointer?
      get() = __887037819_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rect(): Rect? {
      val fnPtr = _887037819_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__887037819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Rect(value: Rect?): Unit {
      val fnPtr = _887037819_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887037819_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRectangleGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __887037819_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangleGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a25a1f58c575419691cf9fdfb10445c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangleGeometry(ptr: Pointer?): WithDefault = IRectangleGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangleGeometry {
      val address = segment.toRawLongValue()
      return makeIRectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: IRectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__887037819_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangleGeometry): Array<IRectangleGeometry?> =
        (elements as
        Array<IRectangleGeometry?>).castToImpl<IRectangleGeometry,IRectangleGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangleGeometry?> =
        arrayOfNulls<IRectangleGeometry_Impl>(size) as Array<IRectangleGeometry?>
  }
}
