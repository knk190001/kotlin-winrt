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

@ABIMarker(ISpeechContinuousRecognitionCompletedEventArgs.ABI::class)
@Signature("{e3d069bb-e30c-5e18-424b-7fbe81f8fbd0}")
@Guid("e3d069bbe30c5e18424b7fbe81f8fbd0")
@WinRTInterface("e3d069bbe30c5e18424b7fbe81f8fbd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechContinuousRecognitionCompletedEventArgs.ByReference::class)
public interface ISpeechContinuousRecognitionCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SpeechRecognitionResultStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechContinuousRecognitionCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeISpeechContinuousRecognitionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpeechContinuousRecognitionCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechContinuousRecognitionCompletedEventArgs {
    public val __626302487_Ptr: Pointer?

    public val _626302487_VtblPtr: Pointer?
      get() = __626302487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SpeechRecognitionResultStatus? {
      val fnPtr = _626302487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionResultStatus>()
      val hr = fn.invokeHR(arrayOf(__626302487_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionResultStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechContinuousRecognitionCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626302487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechContinuousRecognitionCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3d069bbe30c5e18424b7fbe81f8fbd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechContinuousRecognitionCompletedEventArgs(ptr: Pointer?): WithDefault =
        ISpeechContinuousRecognitionCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechContinuousRecognitionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpeechContinuousRecognitionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpeechContinuousRecognitionCompletedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626302487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechContinuousRecognitionCompletedEventArgs):
        Array<ISpeechContinuousRecognitionCompletedEventArgs?> = (elements as
        Array<ISpeechContinuousRecognitionCompletedEventArgs?>).castToImpl<ISpeechContinuousRecognitionCompletedEventArgs,ISpeechContinuousRecognitionCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechContinuousRecognitionCompletedEventArgs?> =
        arrayOfNulls<ISpeechContinuousRecognitionCompletedEventArgs_Impl>(size) as
        Array<ISpeechContinuousRecognitionCompletedEventArgs?>
  }
}
