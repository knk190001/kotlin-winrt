package Windows.Data.Text

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWordsSegmenterFactory.ABI::class)
@Signature("{e6977274-fc35-455c-8bfb-6d7f4653ca97}")
@Guid("e6977274fc35455c8bfb6d7f4653ca97")
@WinRTInterface("e6977274fc35455c8bfb6d7f4653ca97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWordsSegmenterFactory.ByReference::class)
public interface IWordsSegmenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithLanguage(language: String?): WordsSegmenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWordsSegmenterFactory> {
    public override fun getValue() = ABI.makeIWordsSegmenterFactory(pointer.getPointer(0))

    public fun setValue(value: IWordsSegmenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWordsSegmenterFactory {
    public val __158869392_Ptr: Pointer?

    public val _158869392_VtblPtr: Pointer?
      get() = __158869392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithLanguage(language: String?): WordsSegmenter? {
      val fnPtr = _158869392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WordsSegmenter>()
      val hr = fn.invokeHR(arrayOf(__158869392_Ptr, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WordsSegmenter>(result.getValue())
      return resultValue
    }
  }

  public class IWordsSegmenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __158869392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWordsSegmenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6977274fc35455c8bfb6d7f4653ca97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWordsSegmenterFactory(ptr: Pointer?): WithDefault =
        IWordsSegmenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWordsSegmenterFactory {
      val address = segment.toRawLongValue()
      return makeIWordsSegmenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IWordsSegmenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__158869392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWordsSegmenterFactory): Array<IWordsSegmenterFactory?> =
        (elements as
        Array<IWordsSegmenterFactory?>).castToImpl<IWordsSegmenterFactory,IWordsSegmenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWordsSegmenterFactory?> =
        arrayOfNulls<IWordsSegmenterFactory_Impl>(size) as Array<IWordsSegmenterFactory?>
  }
}
