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

@ABIMarker(ISpeechSynthesizerOptions3.ABI::class)
@Signature("{401ed877-902c-4814-a582-a5d0c0769fa8}")
@Guid("401ed877902c4814a582a5d0c0769fa8")
@WinRTInterface("401ed877902c4814a582a5d0c0769fa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechSynthesizerOptions3.ByReference::class)
public interface ISpeechSynthesizerOptions3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppendedSilence(): SpeechAppendedSilence?

  @InterfaceMethod(1)
  public fun put_AppendedSilence(value: SpeechAppendedSilence?): Unit

  @InterfaceMethod(2)
  public fun get_PunctuationSilence(): SpeechPunctuationSilence?

  @InterfaceMethod(3)
  public fun put_PunctuationSilence(value: SpeechPunctuationSilence?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechSynthesizerOptions3> {
    public override fun getValue() = ABI.makeISpeechSynthesizerOptions3(pointer.getPointer(0))

    public fun setValue(value: ISpeechSynthesizerOptions3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechSynthesizerOptions3 {
    public val __88056465_Ptr: Pointer?

    public val _88056465_VtblPtr: Pointer?
      get() = __88056465_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppendedSilence(): SpeechAppendedSilence? {
      val fnPtr = _88056465_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechAppendedSilence>()
      val hr = fn.invokeHR(arrayOf(__88056465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechAppendedSilence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AppendedSilence(value: SpeechAppendedSilence?): Unit {
      val fnPtr = _88056465_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88056465_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PunctuationSilence(): SpeechPunctuationSilence? {
      val fnPtr = _88056465_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechPunctuationSilence>()
      val hr = fn.invokeHR(arrayOf(__88056465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechPunctuationSilence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PunctuationSilence(value: SpeechPunctuationSilence?): Unit {
      val fnPtr = _88056465_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88056465_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechSynthesizerOptions3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __88056465_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechSynthesizerOptions3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("401ed877902c4814a582a5d0c0769fa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechSynthesizerOptions3(ptr: Pointer?): WithDefault =
        ISpeechSynthesizerOptions3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechSynthesizerOptions3 {
      val address = segment.toRawLongValue()
      return makeISpeechSynthesizerOptions3(Pointer(address))
    }

    public override fun toNative(obj: ISpeechSynthesizerOptions3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__88056465_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechSynthesizerOptions3):
        Array<ISpeechSynthesizerOptions3?> = (elements as
        Array<ISpeechSynthesizerOptions3?>).castToImpl<ISpeechSynthesizerOptions3,ISpeechSynthesizerOptions3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechSynthesizerOptions3?> =
        arrayOfNulls<ISpeechSynthesizerOptions3_Impl>(size) as Array<ISpeechSynthesizerOptions3?>
  }
}
