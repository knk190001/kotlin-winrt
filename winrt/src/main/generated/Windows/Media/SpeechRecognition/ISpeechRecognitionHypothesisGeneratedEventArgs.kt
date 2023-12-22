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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionHypothesisGeneratedEventArgs.ABI::class)
@Signature("{55161a7a-8023-5866-411d-1213bb271476}")
@Guid("55161a7a80235866411d1213bb271476")
@WinRTInterface("55161a7a80235866411d1213bb271476")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionHypothesisGeneratedEventArgs.ByReference::class)
public interface ISpeechRecognitionHypothesisGeneratedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Hypothesis(): SpeechRecognitionHypothesis?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionHypothesisGeneratedEventArgs> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionHypothesisGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionHypothesisGeneratedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionHypothesisGeneratedEventArgs {
    public val __1315624432_Ptr: Pointer?

    public val _1315624432_VtblPtr: Pointer?
      get() = __1315624432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Hypothesis(): SpeechRecognitionHypothesis? {
      val fnPtr = _1315624432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionHypothesis>()
      val hr = fn.invokeHR(arrayOf(__1315624432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionHypothesis>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionHypothesisGeneratedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1315624432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionHypothesisGeneratedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55161a7a80235866411d1213bb271476")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionHypothesisGeneratedEventArgs(ptr: Pointer?): WithDefault =
        ISpeechRecognitionHypothesisGeneratedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionHypothesisGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionHypothesisGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionHypothesisGeneratedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1315624432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionHypothesisGeneratedEventArgs):
        Array<ISpeechRecognitionHypothesisGeneratedEventArgs?> = (elements as
        Array<ISpeechRecognitionHypothesisGeneratedEventArgs?>).castToImpl<ISpeechRecognitionHypothesisGeneratedEventArgs,ISpeechRecognitionHypothesisGeneratedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionHypothesisGeneratedEventArgs?> =
        arrayOfNulls<ISpeechRecognitionHypothesisGeneratedEventArgs_Impl>(size) as
        Array<ISpeechRecognitionHypothesisGeneratedEventArgs?>
  }
}
