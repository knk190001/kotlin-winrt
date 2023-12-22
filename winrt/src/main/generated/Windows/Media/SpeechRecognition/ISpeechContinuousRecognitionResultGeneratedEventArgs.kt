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

@ABIMarker(ISpeechContinuousRecognitionResultGeneratedEventArgs.ABI::class)
@Signature("{19091e1e-6e7e-5a46-40fb-76594f786504}")
@Guid("19091e1e6e7e5a4640fb76594f786504")
@WinRTInterface("19091e1e6e7e5a4640fb76594f786504")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechContinuousRecognitionResultGeneratedEventArgs.ByReference::class)
public interface ISpeechContinuousRecognitionResultGeneratedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Result(): SpeechRecognitionResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechContinuousRecognitionResultGeneratedEventArgs> {
    public override fun getValue() =
        ABI.makeISpeechContinuousRecognitionResultGeneratedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpeechContinuousRecognitionResultGeneratedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechContinuousRecognitionResultGeneratedEventArgs {
    public val __1673754526_Ptr: Pointer?

    public val _1673754526_VtblPtr: Pointer?
      get() = __1673754526_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): SpeechRecognitionResult? {
      val fnPtr = _1673754526_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionResult>()
      val hr = fn.invokeHR(arrayOf(__1673754526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionResult>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechContinuousRecognitionResultGeneratedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1673754526_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechContinuousRecognitionResultGeneratedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19091e1e6e7e5a4640fb76594f786504")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechContinuousRecognitionResultGeneratedEventArgs(ptr: Pointer?): WithDefault
        = ISpeechContinuousRecognitionResultGeneratedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechContinuousRecognitionResultGeneratedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpeechContinuousRecognitionResultGeneratedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpeechContinuousRecognitionResultGeneratedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1673754526_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechContinuousRecognitionResultGeneratedEventArgs):
        Array<ISpeechContinuousRecognitionResultGeneratedEventArgs?> = (elements as
        Array<ISpeechContinuousRecognitionResultGeneratedEventArgs?>).castToImpl<ISpeechContinuousRecognitionResultGeneratedEventArgs,ISpeechContinuousRecognitionResultGeneratedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISpeechContinuousRecognitionResultGeneratedEventArgs?> =
        arrayOfNulls<ISpeechContinuousRecognitionResultGeneratedEventArgs_Impl>(size) as
        Array<ISpeechContinuousRecognitionResultGeneratedEventArgs?>
  }
}
