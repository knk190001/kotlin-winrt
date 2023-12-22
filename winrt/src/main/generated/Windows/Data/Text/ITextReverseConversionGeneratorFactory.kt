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

@ABIMarker(ITextReverseConversionGeneratorFactory.ABI::class)
@Signature("{63bed326-1fda-41f6-89d5-23ddea3c729a}")
@Guid("63bed3261fda41f689d523ddea3c729a")
@WinRTInterface("63bed3261fda41f689d523ddea3c729a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextReverseConversionGeneratorFactory.ByReference::class)
public interface ITextReverseConversionGeneratorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(languageTag: String?): TextReverseConversionGenerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextReverseConversionGeneratorFactory> {
    public override fun getValue() =
        ABI.makeITextReverseConversionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(value: ITextReverseConversionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextReverseConversionGeneratorFactory {
    public val __1354714271_Ptr: Pointer?

    public val _1354714271_VtblPtr: Pointer?
      get() = __1354714271_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(languageTag: String?): TextReverseConversionGenerator? {
      val fnPtr = _1354714271_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReverseConversionGenerator>()
      val hr = fn.invokeHR(arrayOf(__1354714271_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReverseConversionGenerator>(result.getValue())
      return resultValue
    }
  }

  public class ITextReverseConversionGeneratorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1354714271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextReverseConversionGeneratorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63bed3261fda41f689d523ddea3c729a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextReverseConversionGeneratorFactory(ptr: Pointer?): WithDefault =
        ITextReverseConversionGeneratorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextReverseConversionGeneratorFactory {
      val address = segment.toRawLongValue()
      return makeITextReverseConversionGeneratorFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextReverseConversionGeneratorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1354714271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGeneratorFactory):
        Array<ITextReverseConversionGeneratorFactory?> = (elements as
        Array<ITextReverseConversionGeneratorFactory?>).castToImpl<ITextReverseConversionGeneratorFactory,ITextReverseConversionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGeneratorFactory?> =
        arrayOfNulls<ITextReverseConversionGeneratorFactory_Impl>(size) as
        Array<ITextReverseConversionGeneratorFactory?>
  }
}
