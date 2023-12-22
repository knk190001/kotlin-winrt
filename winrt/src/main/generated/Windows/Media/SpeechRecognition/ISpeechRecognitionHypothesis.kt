package Windows.Media.SpeechRecognition

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

@ABIMarker(ISpeechRecognitionHypothesis.ABI::class)
@Signature("{7a7b25b0-99c5-4f7d-bf84-10aa1302b634}")
@Guid("7a7b25b099c54f7dbf8410aa1302b634")
@WinRTInterface("7a7b25b099c54f7dbf8410aa1302b634")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionHypothesis.ByReference::class)
public interface ISpeechRecognitionHypothesis : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionHypothesis> {
    public override fun getValue() = ABI.makeISpeechRecognitionHypothesis(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionHypothesis_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionHypothesis {
    public val __1538926072_Ptr: Pointer?

    public val _1538926072_VtblPtr: Pointer?
      get() = __1538926072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _1538926072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1538926072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionHypothesis_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1538926072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionHypothesis, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a7b25b099c54f7dbf8410aa1302b634")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionHypothesis(ptr: Pointer?): WithDefault =
        ISpeechRecognitionHypothesis_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognitionHypothesis {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionHypothesis(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionHypothesis): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1538926072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionHypothesis):
        Array<ISpeechRecognitionHypothesis?> = (elements as
        Array<ISpeechRecognitionHypothesis?>).castToImpl<ISpeechRecognitionHypothesis,ISpeechRecognitionHypothesis_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionHypothesis?> =
        arrayOfNulls<ISpeechRecognitionHypothesis_Impl>(size) as
        Array<ISpeechRecognitionHypothesis?>
  }
}
