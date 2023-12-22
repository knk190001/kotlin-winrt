package Windows.Media.SpeechRecognition

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognizerStatics2.ABI::class)
@Signature("{1d1b0d95-7565-4ef9-a2f3-ba15162a96cf}")
@Guid("1d1b0d9575654ef9a2f3ba15162a96cf")
@WinRTInterface("1d1b0d9575654ef9a2f3ba15162a96cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizerStatics2.ByReference::class)
public interface ISpeechRecognizerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetSystemSpeechLanguageAsync(speechLanguage: Language?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizerStatics2> {
    public override fun getValue() = ABI.makeISpeechRecognizerStatics2(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizerStatics2 {
    public val __899338852_Ptr: Pointer?

    public val _899338852_VtblPtr: Pointer?
      get() = __899338852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetSystemSpeechLanguageAsync(speechLanguage: Language?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _899338852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__899338852_Ptr, marshalToNative(speechLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognizerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __899338852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d1b0d9575654ef9a2f3ba15162a96cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizerStatics2(ptr: Pointer?): WithDefault =
        ISpeechRecognizerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizerStatics2 {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__899338852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizerStatics2):
        Array<ISpeechRecognizerStatics2?> = (elements as
        Array<ISpeechRecognizerStatics2?>).castToImpl<ISpeechRecognizerStatics2,ISpeechRecognizerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizerStatics2?> =
        arrayOfNulls<ISpeechRecognizerStatics2_Impl>(size) as Array<ISpeechRecognizerStatics2?>
  }
}
