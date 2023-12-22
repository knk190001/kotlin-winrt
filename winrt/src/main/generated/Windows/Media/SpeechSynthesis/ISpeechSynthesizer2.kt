package Windows.Media.SpeechSynthesis

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

@ABIMarker(ISpeechSynthesizer2.ABI::class)
@Signature("{a7c5ecb2-4339-4d6a-bbf8-c7a4f1544c2e}")
@Guid("a7c5ecb243394d6abbf8c7a4f1544c2e")
@WinRTInterface("a7c5ecb243394d6abbf8c7a4f1544c2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechSynthesizer2.ByReference::class)
public interface ISpeechSynthesizer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Options(): SpeechSynthesizerOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechSynthesizer2> {
    public override fun getValue() = ABI.makeISpeechSynthesizer2(pointer.getPointer(0))

    public fun setValue(value: ISpeechSynthesizer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechSynthesizer2 {
    public val __11303288_Ptr: Pointer?

    public val _11303288_VtblPtr: Pointer?
      get() = __11303288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Options(): SpeechSynthesizerOptions? {
      val fnPtr = _11303288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechSynthesizerOptions>()
      val hr = fn.invokeHR(arrayOf(__11303288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechSynthesizerOptions>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechSynthesizer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __11303288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechSynthesizer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7c5ecb243394d6abbf8c7a4f1544c2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechSynthesizer2(ptr: Pointer?): WithDefault = ISpeechSynthesizer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechSynthesizer2 {
      val address = segment.toRawLongValue()
      return makeISpeechSynthesizer2(Pointer(address))
    }

    public override fun toNative(obj: ISpeechSynthesizer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__11303288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechSynthesizer2): Array<ISpeechSynthesizer2?> =
        (elements as
        Array<ISpeechSynthesizer2?>).castToImpl<ISpeechSynthesizer2,ISpeechSynthesizer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechSynthesizer2?> =
        arrayOfNulls<ISpeechSynthesizer2_Impl>(size) as Array<ISpeechSynthesizer2?>
  }
}
