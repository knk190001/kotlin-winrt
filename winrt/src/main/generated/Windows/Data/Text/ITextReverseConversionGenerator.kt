package Windows.Data.Text

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextReverseConversionGenerator.ABI::class)
@Signature("{51e7f514-9c51-4d86-ae1b-b498fbad8313}")
@Guid("51e7f5149c514d86ae1bb498fbad8313")
@WinRTInterface("51e7f5149c514d86ae1bb498fbad8313")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextReverseConversionGenerator.ByReference::class)
public interface ITextReverseConversionGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(1)
  public fun get_LanguageAvailableButNotInstalled(): Boolean

  @InterfaceMethod(2)
  public fun ConvertBackAsync(input: String?): IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextReverseConversionGenerator> {
    public override fun getValue() = ABI.makeITextReverseConversionGenerator(pointer.getPointer(0))

    public fun setValue(value: ITextReverseConversionGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextReverseConversionGenerator {
    public val __1885343211_Ptr: Pointer?

    public val _1885343211_VtblPtr: Pointer?
      get() = __1885343211_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _1885343211_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1885343211_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LanguageAvailableButNotInstalled(): Boolean {
      val fnPtr = _1885343211_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1885343211_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ConvertBackAsync(input: String?): IAsyncOperation<String?>? {
      val fnPtr = _1885343211_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1885343211_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ITextReverseConversionGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885343211_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextReverseConversionGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51e7f5149c514d86ae1bb498fbad8313")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextReverseConversionGenerator(ptr: Pointer?): WithDefault =
        ITextReverseConversionGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextReverseConversionGenerator {
      val address = segment.toRawLongValue()
      return makeITextReverseConversionGenerator(Pointer(address))
    }

    public override fun toNative(obj: ITextReverseConversionGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885343211_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGenerator):
        Array<ITextReverseConversionGenerator?> = (elements as
        Array<ITextReverseConversionGenerator?>).castToImpl<ITextReverseConversionGenerator,ITextReverseConversionGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGenerator?> =
        arrayOfNulls<ITextReverseConversionGenerator_Impl>(size) as
        Array<ITextReverseConversionGenerator?>
  }
}
