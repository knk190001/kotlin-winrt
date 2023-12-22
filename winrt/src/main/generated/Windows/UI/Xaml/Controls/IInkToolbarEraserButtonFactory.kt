package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IInkToolbarEraserButtonFactory.ABI::class)
@Signature("{fd40611d-d1ba-4d67-af00-148036ad492c}")
@Guid("fd40611dd1ba4d67af00148036ad492c")
@WinRTInterface("fd40611dd1ba4d67af00148036ad492c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarEraserButtonFactory.ByReference::class)
public interface IInkToolbarEraserButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarEraserButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarEraserButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarEraserButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarEraserButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarEraserButtonFactory {
    public val __803814587_Ptr: Pointer?

    public val _803814587_VtblPtr: Pointer?
      get() = __803814587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarEraserButton? {
      val fnPtr = _803814587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarEraserButton>()
      val hr = fn.invokeHR(arrayOf(__803814587_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarEraserButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarEraserButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803814587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarEraserButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd40611dd1ba4d67af00148036ad492c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarEraserButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarEraserButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarEraserButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarEraserButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarEraserButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803814587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarEraserButtonFactory):
        Array<IInkToolbarEraserButtonFactory?> = (elements as
        Array<IInkToolbarEraserButtonFactory?>).castToImpl<IInkToolbarEraserButtonFactory,IInkToolbarEraserButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarEraserButtonFactory?> =
        arrayOfNulls<IInkToolbarEraserButtonFactory_Impl>(size) as
        Array<IInkToolbarEraserButtonFactory?>
  }
}
