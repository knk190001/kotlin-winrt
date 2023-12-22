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

@ABIMarker(ITextPredictionGeneratorFactory.ABI::class)
@Signature("{7257b416-8ba2-4751-9d30-9d85435653a2}")
@Guid("7257b4168ba247519d309d85435653a2")
@WinRTInterface("7257b4168ba247519d309d85435653a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextPredictionGeneratorFactory.ByReference::class)
public interface ITextPredictionGeneratorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(languageTag: String?): TextPredictionGenerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextPredictionGeneratorFactory> {
    public override fun getValue() = ABI.makeITextPredictionGeneratorFactory(pointer.getPointer(0))

    public fun setValue(value: ITextPredictionGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextPredictionGeneratorFactory {
    public val __1242692810_Ptr: Pointer?

    public val _1242692810_VtblPtr: Pointer?
      get() = __1242692810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(languageTag: String?): TextPredictionGenerator? {
      val fnPtr = _1242692810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPredictionGenerator>()
      val hr = fn.invokeHR(arrayOf(__1242692810_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPredictionGenerator>(result.getValue())
      return resultValue
    }
  }

  public class ITextPredictionGeneratorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1242692810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextPredictionGeneratorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7257b4168ba247519d309d85435653a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextPredictionGeneratorFactory(ptr: Pointer?): WithDefault =
        ITextPredictionGeneratorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextPredictionGeneratorFactory {
      val address = segment.toRawLongValue()
      return makeITextPredictionGeneratorFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextPredictionGeneratorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1242692810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPredictionGeneratorFactory):
        Array<ITextPredictionGeneratorFactory?> = (elements as
        Array<ITextPredictionGeneratorFactory?>).castToImpl<ITextPredictionGeneratorFactory,ITextPredictionGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPredictionGeneratorFactory?> =
        arrayOfNulls<ITextPredictionGeneratorFactory_Impl>(size) as
        Array<ITextPredictionGeneratorFactory?>
  }
}
