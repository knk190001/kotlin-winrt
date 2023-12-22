package Windows.Media.SpeechSynthesis

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ISpeechSynthesizer.ABI::class)
@Signature("{ce9f7c76-97f4-4ced-ad68-d51c458e45c6}")
@Guid("ce9f7c7697f44cedad68d51c458e45c6")
@WinRTInterface("ce9f7c7697f44cedad68d51c458e45c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechSynthesizer.ByReference::class)
public interface ISpeechSynthesizer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SynthesizeTextToStreamAsync(text: String?): IAsyncOperation<SpeechSynthesisStream?>?

  @InterfaceMethod(1)
  public fun SynthesizeSsmlToStreamAsync(Ssml: String?): IAsyncOperation<SpeechSynthesisStream?>?

  @InterfaceMethod(2)
  public fun put_Voice(value: VoiceInformation?): Unit

  @InterfaceMethod(3)
  public fun get_Voice(): VoiceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechSynthesizer> {
    public override fun getValue() = ABI.makeISpeechSynthesizer(pointer.getPointer(0))

    public fun setValue(value: ISpeechSynthesizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechSynthesizer {
    public val __1524385274_Ptr: Pointer?

    public val _1524385274_VtblPtr: Pointer?
      get() = __1524385274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SynthesizeTextToStreamAsync(text: String?):
        IAsyncOperation<SpeechSynthesisStream?>? {
      val fnPtr = _1524385274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpeechSynthesisStream?>>()
      val hr = fn.invokeHR(arrayOf(__1524385274_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpeechSynthesisStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SynthesizeSsmlToStreamAsync(Ssml: String?):
        IAsyncOperation<SpeechSynthesisStream?>? {
      val fnPtr = _1524385274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpeechSynthesisStream?>>()
      val hr = fn.invokeHR(arrayOf(__1524385274_Ptr, marshalToNative(Ssml), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpeechSynthesisStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Voice(value: VoiceInformation?): Unit {
      val fnPtr = _1524385274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1524385274_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Voice(): VoiceInformation? {
      val fnPtr = _1524385274_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceInformation>()
      val hr = fn.invokeHR(arrayOf(__1524385274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceInformation>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechSynthesizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1524385274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechSynthesizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce9f7c7697f44cedad68d51c458e45c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechSynthesizer(ptr: Pointer?): WithDefault = ISpeechSynthesizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechSynthesizer {
      val address = segment.toRawLongValue()
      return makeISpeechSynthesizer(Pointer(address))
    }

    public override fun toNative(obj: ISpeechSynthesizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1524385274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechSynthesizer): Array<ISpeechSynthesizer?> =
        (elements as
        Array<ISpeechSynthesizer?>).castToImpl<ISpeechSynthesizer,ISpeechSynthesizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechSynthesizer?> =
        arrayOfNulls<ISpeechSynthesizer_Impl>(size) as Array<ISpeechSynthesizer?>
  }
}
