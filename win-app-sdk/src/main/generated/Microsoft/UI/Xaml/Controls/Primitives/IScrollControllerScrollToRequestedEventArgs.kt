package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ScrollingScrollOptions
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

@ABIMarker(IScrollControllerScrollToRequestedEventArgs.ABI::class)
@Signature("{73f16b99-7310-5c73-872b-276e5a9d4913}")
@Guid("73f16b9973105c73872b276e5a9d4913")
@WinRTInterface("73f16b9973105c73872b276e5a9d4913")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerScrollToRequestedEventArgs.ByReference::class)
public interface IScrollControllerScrollToRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Offset(): Double

  @InterfaceMethod(1)
  public fun get_Options(): ScrollingScrollOptions?

  @InterfaceMethod(2)
  public fun get_CorrelationId(): Int

  @InterfaceMethod(3)
  public fun put_CorrelationId(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerScrollToRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollControllerScrollToRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerScrollToRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerScrollToRequestedEventArgs {
    public val __511657141_Ptr: Pointer?

    public val _511657141_VtblPtr: Pointer?
      get() = __511657141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Offset(): Double {
      val fnPtr = _511657141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__511657141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Options(): ScrollingScrollOptions? {
      val fnPtr = _511657141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollOptions>()
      val hr = fn.invokeHR(arrayOf(__511657141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _511657141_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__511657141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CorrelationId(value: Int): Unit {
      val fnPtr = _511657141_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__511657141_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollControllerScrollToRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __511657141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerScrollToRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73f16b9973105c73872b276e5a9d4913")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerScrollToRequestedEventArgs(ptr: Pointer?): WithDefault =
        IScrollControllerScrollToRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerScrollToRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollControllerScrollToRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerScrollToRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__511657141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerScrollToRequestedEventArgs):
        Array<IScrollControllerScrollToRequestedEventArgs?> = (elements as
        Array<IScrollControllerScrollToRequestedEventArgs?>).castToImpl<IScrollControllerScrollToRequestedEventArgs,IScrollControllerScrollToRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollControllerScrollToRequestedEventArgs?> =
        arrayOfNulls<IScrollControllerScrollToRequestedEventArgs_Impl>(size) as
        Array<IScrollControllerScrollToRequestedEventArgs?>
  }
}
