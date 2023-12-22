package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextHighlighterFactory.ABI::class)
@Signature("{70125461-9a8f-4fa0-b235-8ffaa507bef2}")
@Guid("701254619a8f4fa0b2358ffaa507bef2")
@WinRTInterface("701254619a8f4fa0b2358ffaa507bef2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextHighlighterFactory.ByReference::class)
public interface ITextHighlighterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TextHighlighter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextHighlighterFactory> {
    public override fun getValue() = ABI.makeITextHighlighterFactory(pointer.getPointer(0))

    public fun setValue(value: ITextHighlighterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextHighlighterFactory {
    public val __1312119394_Ptr: Pointer?

    public val _1312119394_VtblPtr: Pointer?
      get() = __1312119394_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TextHighlighter? {
      val fnPtr = _1312119394_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextHighlighter>()
      val hr = fn.invokeHR(arrayOf(__1312119394_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextHighlighter>(result.getValue())
      return resultValue
    }
  }

  public class ITextHighlighterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1312119394_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextHighlighterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("701254619a8f4fa0b2358ffaa507bef2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextHighlighterFactory(ptr: Pointer?): WithDefault =
        ITextHighlighterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextHighlighterFactory {
      val address = segment.toRawLongValue()
      return makeITextHighlighterFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextHighlighterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1312119394_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextHighlighterFactory): Array<ITextHighlighterFactory?>
        = (elements as
        Array<ITextHighlighterFactory?>).castToImpl<ITextHighlighterFactory,ITextHighlighterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextHighlighterFactory?> =
        arrayOfNulls<ITextHighlighterFactory_Impl>(size) as Array<ITextHighlighterFactory?>
  }
}
