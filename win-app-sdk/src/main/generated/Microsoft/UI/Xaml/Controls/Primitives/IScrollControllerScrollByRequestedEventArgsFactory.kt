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

@ABIMarker(IScrollControllerScrollByRequestedEventArgsFactory.ABI::class)
@Signature("{7ecf01a7-ef3f-5af9-93b4-38bc1bafd335}")
@Guid("7ecf01a7ef3f5af993b438bc1bafd335")
@WinRTInterface("7ecf01a7ef3f5af993b438bc1bafd335")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerScrollByRequestedEventArgsFactory.ByReference::class)
public interface IScrollControllerScrollByRequestedEventArgsFactory : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun CreateInstance(offsetDelta: Double, options: ScrollingScrollOptions?):
      ScrollControllerScrollByRequestedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerScrollByRequestedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIScrollControllerScrollByRequestedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerScrollByRequestedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerScrollByRequestedEventArgsFactory {
    public val __2043878173_Ptr: Pointer?

    public val _2043878173_VtblPtr: Pointer?
      get() = __2043878173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(offsetDelta: Double, options: ScrollingScrollOptions?):
        ScrollControllerScrollByRequestedEventArgs? {
      val fnPtr = _2043878173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollControllerScrollByRequestedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__2043878173_Ptr, offsetDelta, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ScrollControllerScrollByRequestedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IScrollControllerScrollByRequestedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2043878173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerScrollByRequestedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ecf01a7ef3f5af993b438bc1bafd335")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerScrollByRequestedEventArgsFactory(ptr: Pointer?): WithDefault =
        IScrollControllerScrollByRequestedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerScrollByRequestedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollControllerScrollByRequestedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerScrollByRequestedEventArgsFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2043878173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerScrollByRequestedEventArgsFactory):
        Array<IScrollControllerScrollByRequestedEventArgsFactory?> = (elements as
        Array<IScrollControllerScrollByRequestedEventArgsFactory?>).castToImpl<IScrollControllerScrollByRequestedEventArgsFactory,IScrollControllerScrollByRequestedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IScrollControllerScrollByRequestedEventArgsFactory?> =
        arrayOfNulls<IScrollControllerScrollByRequestedEventArgsFactory_Impl>(size) as
        Array<IScrollControllerScrollByRequestedEventArgsFactory?>
  }
}
