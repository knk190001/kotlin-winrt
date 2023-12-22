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

@ABIMarker(IScrollControllerScrollToRequestedEventArgsFactory.ABI::class)
@Signature("{01675dc4-1074-54e8-bebb-66b03a33da0d}")
@Guid("01675dc4107454e8bebb66b03a33da0d")
@WinRTInterface("01675dc4107454e8bebb66b03a33da0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerScrollToRequestedEventArgsFactory.ByReference::class)
public interface IScrollControllerScrollToRequestedEventArgsFactory : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun CreateInstance(offset: Double, options: ScrollingScrollOptions?):
      ScrollControllerScrollToRequestedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerScrollToRequestedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIScrollControllerScrollToRequestedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerScrollToRequestedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerScrollToRequestedEventArgsFactory {
    public val __2070074175_Ptr: Pointer?

    public val _2070074175_VtblPtr: Pointer?
      get() = __2070074175_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(offset: Double, options: ScrollingScrollOptions?):
        ScrollControllerScrollToRequestedEventArgs? {
      val fnPtr = _2070074175_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollControllerScrollToRequestedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__2070074175_Ptr, offset, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ScrollControllerScrollToRequestedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IScrollControllerScrollToRequestedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2070074175_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerScrollToRequestedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01675dc4107454e8bebb66b03a33da0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerScrollToRequestedEventArgsFactory(ptr: Pointer?): WithDefault =
        IScrollControllerScrollToRequestedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerScrollToRequestedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollControllerScrollToRequestedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerScrollToRequestedEventArgsFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2070074175_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerScrollToRequestedEventArgsFactory):
        Array<IScrollControllerScrollToRequestedEventArgsFactory?> = (elements as
        Array<IScrollControllerScrollToRequestedEventArgsFactory?>).castToImpl<IScrollControllerScrollToRequestedEventArgsFactory,IScrollControllerScrollToRequestedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IScrollControllerScrollToRequestedEventArgsFactory?> =
        arrayOfNulls<IScrollControllerScrollToRequestedEventArgsFactory_Impl>(size) as
        Array<IScrollControllerScrollToRequestedEventArgsFactory?>
  }
}
