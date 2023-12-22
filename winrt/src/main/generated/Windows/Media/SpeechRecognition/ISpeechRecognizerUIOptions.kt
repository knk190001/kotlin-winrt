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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognizerUIOptions.ABI::class)
@Signature("{7888d641-b92b-44ba-a25f-d1864630641f}")
@Guid("7888d641b92b44baa25fd1864630641f")
@WinRTInterface("7888d641b92b44baa25fd1864630641f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizerUIOptions.ByReference::class)
public interface ISpeechRecognizerUIOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExampleText(): String?

  @InterfaceMethod(1)
  public fun put_ExampleText(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AudiblePrompt(): String?

  @InterfaceMethod(3)
  public fun put_AudiblePrompt(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsReadBackEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsReadBackEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_ShowConfirmation(): Boolean

  @InterfaceMethod(7)
  public fun put_ShowConfirmation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizerUIOptions> {
    public override fun getValue() = ABI.makeISpeechRecognizerUIOptions(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizerUIOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizerUIOptions {
    public val __2039546587_Ptr: Pointer?

    public val _2039546587_VtblPtr: Pointer?
      get() = __2039546587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExampleText(): String? {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExampleText(value: String?): Unit {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AudiblePrompt(): String? {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AudiblePrompt(value: String?): Unit {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsReadBackEnabled(): Boolean {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsReadBackEnabled(value: Boolean): Unit {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ShowConfirmation(): Boolean {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ShowConfirmation(value: Boolean): Unit {
      val fnPtr = _2039546587_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039546587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechRecognizerUIOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039546587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizerUIOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7888d641b92b44baa25fd1864630641f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizerUIOptions(ptr: Pointer?): WithDefault =
        ISpeechRecognizerUIOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizerUIOptions {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizerUIOptions(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizerUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039546587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizerUIOptions):
        Array<ISpeechRecognizerUIOptions?> = (elements as
        Array<ISpeechRecognizerUIOptions?>).castToImpl<ISpeechRecognizerUIOptions,ISpeechRecognizerUIOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizerUIOptions?> =
        arrayOfNulls<ISpeechRecognizerUIOptions_Impl>(size) as Array<ISpeechRecognizerUIOptions?>
  }
}
