package Windows.Media.SpeechRecognition

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(ISpeechRecognitionResult2.ABI::class)
@Signature("{af7ed1ba-451b-4166-a0c1-1ffe84032d03}")
@Guid("af7ed1ba451b4166a0c11ffe84032d03")
@WinRTInterface("af7ed1ba451b4166a0c11ffe84032d03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionResult2.ByReference::class)
public interface ISpeechRecognitionResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhraseStartTime(): DateTime?

  @InterfaceMethod(1)
  public fun get_PhraseDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionResult2> {
    public override fun getValue() = ABI.makeISpeechRecognitionResult2(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionResult2 {
    public val __1448620745_Ptr: Pointer?

    public val _1448620745_VtblPtr: Pointer?
      get() = __1448620745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhraseStartTime(): DateTime? {
      val fnPtr = _1448620745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1448620745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PhraseDuration(): TimeSpan? {
      val fnPtr = _1448620745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1448620745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1448620745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af7ed1ba451b4166a0c11ffe84032d03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionResult2(ptr: Pointer?): WithDefault =
        ISpeechRecognitionResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognitionResult2 {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionResult2(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1448620745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionResult2):
        Array<ISpeechRecognitionResult2?> = (elements as
        Array<ISpeechRecognitionResult2?>).castToImpl<ISpeechRecognitionResult2,ISpeechRecognitionResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionResult2?> =
        arrayOfNulls<ISpeechRecognitionResult2_Impl>(size) as Array<ISpeechRecognitionResult2?>
  }
}
