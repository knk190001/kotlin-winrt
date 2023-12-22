package Microsoft.UI.Xaml.Media

import Windows.Foundation.TimeSpan
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

@ABIMarker(IRenderingEventArgs.ABI::class)
@Signature("{a67c8f8d-1885-5fc9-975c-901224f79b1e}")
@Guid("a67c8f8d18855fc9975c901224f79b1e")
@WinRTInterface("a67c8f8d18855fc9975c901224f79b1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRenderingEventArgs.ByReference::class)
public interface IRenderingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RenderingTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRenderingEventArgs> {
    public override fun getValue() = ABI.makeIRenderingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRenderingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRenderingEventArgs {
    public val __1122017444_Ptr: Pointer?

    public val _1122017444_VtblPtr: Pointer?
      get() = __1122017444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RenderingTime(): TimeSpan? {
      val fnPtr = _1122017444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1122017444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IRenderingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1122017444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRenderingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a67c8f8d18855fc9975c901224f79b1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRenderingEventArgs(ptr: Pointer?): WithDefault = IRenderingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRenderingEventArgs {
      val address = segment.toRawLongValue()
      return makeIRenderingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRenderingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1122017444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRenderingEventArgs): Array<IRenderingEventArgs?> =
        (elements as
        Array<IRenderingEventArgs?>).castToImpl<IRenderingEventArgs,IRenderingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRenderingEventArgs?> =
        arrayOfNulls<IRenderingEventArgs_Impl>(size) as Array<IRenderingEventArgs?>
  }
}
