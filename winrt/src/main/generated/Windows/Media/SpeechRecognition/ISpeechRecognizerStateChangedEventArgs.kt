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

@ABIMarker(ISpeechRecognizerStateChangedEventArgs.ABI::class)
@Signature("{563d4f09-ba03-4bad-ad81-ddc6c4dab0c3}")
@Guid("563d4f09ba034badad81ddc6c4dab0c3")
@WinRTInterface("563d4f09ba034badad81ddc6c4dab0c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizerStateChangedEventArgs.ByReference::class)
public interface ISpeechRecognizerStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): SpeechRecognizerState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizerStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISpeechRecognizerStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizerStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizerStateChangedEventArgs {
    public val __11801797_Ptr: Pointer?

    public val _11801797_VtblPtr: Pointer?
      get() = __11801797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): SpeechRecognizerState? {
      val fnPtr = _11801797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognizerState>()
      val hr = fn.invokeHR(arrayOf(__11801797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognizerState>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognizerStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __11801797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizerStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("563d4f09ba034badad81ddc6c4dab0c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizerStateChangedEventArgs(ptr: Pointer?): WithDefault =
        ISpeechRecognizerStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizerStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizerStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizerStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__11801797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizerStateChangedEventArgs):
        Array<ISpeechRecognizerStateChangedEventArgs?> = (elements as
        Array<ISpeechRecognizerStateChangedEventArgs?>).castToImpl<ISpeechRecognizerStateChangedEventArgs,ISpeechRecognizerStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizerStateChangedEventArgs?> =
        arrayOfNulls<ISpeechRecognizerStateChangedEventArgs_Impl>(size) as
        Array<ISpeechRecognizerStateChangedEventArgs?>
  }
}
