package Windows.UI.StartScreen

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

@ABIMarker(IVisualElementsRequestedEventArgs.ABI::class)
@Signature("{7b6fc982-3a0d-4ece-af96-cd17e1b00b2d}")
@Guid("7b6fc9823a0d4eceaf96cd17e1b00b2d")
@WinRTInterface("7b6fc9823a0d4eceaf96cd17e1b00b2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualElementsRequestedEventArgs.ByReference::class)
public interface IVisualElementsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): VisualElementsRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualElementsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIVisualElementsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVisualElementsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualElementsRequestedEventArgs {
    public val __829709846_Ptr: Pointer?

    public val _829709846_VtblPtr: Pointer?
      get() = __829709846_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): VisualElementsRequest? {
      val fnPtr = _829709846_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualElementsRequest>()
      val hr = fn.invokeHR(arrayOf(__829709846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualElementsRequest>(result.getValue())
      return resultValue
    }
  }

  public class IVisualElementsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829709846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualElementsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b6fc9823a0d4eceaf96cd17e1b00b2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualElementsRequestedEventArgs(ptr: Pointer?): WithDefault =
        IVisualElementsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualElementsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVisualElementsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVisualElementsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829709846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualElementsRequestedEventArgs):
        Array<IVisualElementsRequestedEventArgs?> = (elements as
        Array<IVisualElementsRequestedEventArgs?>).castToImpl<IVisualElementsRequestedEventArgs,IVisualElementsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualElementsRequestedEventArgs?> =
        arrayOfNulls<IVisualElementsRequestedEventArgs_Impl>(size) as
        Array<IVisualElementsRequestedEventArgs?>
  }
}
