package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IStyleSelectorFactory.ABI::class)
@Signature("{2a033206-a4fb-5f11-8c2d-61e1df78fbc3}")
@Guid("2a033206a4fb5f118c2d61e1df78fbc3")
@WinRTInterface("2a033206a4fb5f118c2d61e1df78fbc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStyleSelectorFactory.ByReference::class)
public interface IStyleSelectorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): StyleSelector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStyleSelectorFactory> {
    public override fun getValue() = ABI.makeIStyleSelectorFactory(pointer.getPointer(0))

    public fun setValue(value: IStyleSelectorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStyleSelectorFactory {
    public val __30993791_Ptr: Pointer?

    public val _30993791_VtblPtr: Pointer?
      get() = __30993791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        StyleSelector? {
      val fnPtr = _30993791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSelector>()
      val hr = fn.invokeHR(arrayOf(__30993791_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSelector>(result.getValue())
      return resultValue
    }
  }

  public class IStyleSelectorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __30993791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStyleSelectorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a033206a4fb5f118c2d61e1df78fbc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStyleSelectorFactory(ptr: Pointer?): WithDefault =
        IStyleSelectorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStyleSelectorFactory {
      val address = segment.toRawLongValue()
      return makeIStyleSelectorFactory(Pointer(address))
    }

    public override fun toNative(obj: IStyleSelectorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__30993791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStyleSelectorFactory): Array<IStyleSelectorFactory?> =
        (elements as
        Array<IStyleSelectorFactory?>).castToImpl<IStyleSelectorFactory,IStyleSelectorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStyleSelectorFactory?> =
        arrayOfNulls<IStyleSelectorFactory_Impl>(size) as Array<IStyleSelectorFactory?>
  }
}
