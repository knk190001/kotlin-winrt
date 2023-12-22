package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IVectorView
import Windows.Globalization.Language
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

@ABIMarker(ISpeechRecognizerStatics.ABI::class)
@Signature("{87a35eac-a7dc-4b0b-bcc9-24f47c0b7ebf}")
@Guid("87a35eaca7dc4b0bbcc924f47c0b7ebf")
@WinRTInterface("87a35eaca7dc4b0bbcc924f47c0b7ebf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizerStatics.ByReference::class)
public interface ISpeechRecognizerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemSpeechLanguage(): Language?

  @InterfaceMethod(1)
  public fun get_SupportedTopicLanguages(): IVectorView<Language?>?

  @InterfaceMethod(2)
  public fun get_SupportedGrammarLanguages(): IVectorView<Language?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizerStatics> {
    public override fun getValue() = ABI.makeISpeechRecognizerStatics(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizerStatics {
    public val __1830126250_Ptr: Pointer?

    public val _1830126250_VtblPtr: Pointer?
      get() = __1830126250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemSpeechLanguage(): Language? {
      val fnPtr = _1830126250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__1830126250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedTopicLanguages(): IVectorView<Language?>? {
      val fnPtr = _1830126250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Language?>>()
      val hr = fn.invokeHR(arrayOf(__1830126250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Language?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedGrammarLanguages(): IVectorView<Language?>? {
      val fnPtr = _1830126250_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Language?>>()
      val hr = fn.invokeHR(arrayOf(__1830126250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Language?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognizerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1830126250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87a35eaca7dc4b0bbcc924f47c0b7ebf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizerStatics(ptr: Pointer?): WithDefault =
        ISpeechRecognizerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizerStatics {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830126250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizerStatics):
        Array<ISpeechRecognizerStatics?> = (elements as
        Array<ISpeechRecognizerStatics?>).castToImpl<ISpeechRecognizerStatics,ISpeechRecognizerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizerStatics?> =
        arrayOfNulls<ISpeechRecognizerStatics_Impl>(size) as Array<ISpeechRecognizerStatics?>
  }
}
