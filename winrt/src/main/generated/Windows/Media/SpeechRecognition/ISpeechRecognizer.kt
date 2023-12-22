package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.Language
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISpeechRecognizer.ABI::class)
@Signature("{0bc3c9cb-c26a-40f2-aeb5-8096b2e48073}")
@Guid("0bc3c9cbc26a40f2aeb58096b2e48073")
@WinRTInterface("0bc3c9cbc26a40f2aeb58096b2e48073")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognizer.ByReference::class)
public interface ISpeechRecognizer : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_CurrentLanguage(): Language?

  @InterfaceMethod(1)
  public fun get_Constraints(): IVector<ISpeechRecognitionConstraint?>?

  @InterfaceMethod(2)
  public fun get_Timeouts(): SpeechRecognizerTimeouts?

  @InterfaceMethod(3)
  public fun get_UIOptions(): SpeechRecognizerUIOptions?

  @InterfaceMethod(4)
  public fun CompileConstraintsAsync(): IAsyncOperation<SpeechRecognitionCompilationResult?>?

  @InterfaceMethod(5)
  public fun RecognizeAsync(): IAsyncOperation<SpeechRecognitionResult?>?

  @InterfaceMethod(6)
  public fun RecognizeWithUIAsync(): IAsyncOperation<SpeechRecognitionResult?>?

  @InterfaceMethod(7)
  public
      fun add_RecognitionQualityDegrading(speechRecognitionQualityDegradingHandler: TypedEventHandler<SpeechRecognizer?,
      SpeechRecognitionQualityDegradingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_RecognitionQualityDegrading(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_StateChanged(stateChangedHandler: TypedEventHandler<SpeechRecognizer?,
      SpeechRecognizerStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_StateChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognizer> {
    public override fun getValue() = ABI.makeISpeechRecognizer(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognizer, IClosable.WithDefault {
    public val __546721937_Ptr: Pointer?

    public val _546721937_VtblPtr: Pointer?
      get() = __546721937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentLanguage(): Language? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Constraints(): IVector<ISpeechRecognitionConstraint?>? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ISpeechRecognitionConstraint?>>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ISpeechRecognitionConstraint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Timeouts(): SpeechRecognizerTimeouts? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognizerTimeouts>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognizerTimeouts>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UIOptions(): SpeechRecognizerUIOptions? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognizerUIOptions>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognizerUIOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CompileConstraintsAsync():
        IAsyncOperation<SpeechRecognitionCompilationResult?>? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpeechRecognitionCompilationResult?>>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpeechRecognitionCompilationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RecognizeAsync(): IAsyncOperation<SpeechRecognitionResult?>? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpeechRecognitionResult?>>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpeechRecognitionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RecognizeWithUIAsync(): IAsyncOperation<SpeechRecognitionResult?>? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpeechRecognitionResult?>>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpeechRecognitionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun add_RecognitionQualityDegrading(speechRecognitionQualityDegradingHandler: TypedEventHandler<SpeechRecognizer?,
        SpeechRecognitionQualityDegradingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr,
          marshalToNative(speechRecognitionQualityDegradingHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_RecognitionQualityDegrading(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _546721937_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_StateChanged(stateChangedHandler: TypedEventHandler<SpeechRecognizer?,
        SpeechRecognizerStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _546721937_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr, marshalToNative(stateChangedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_StateChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _546721937_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546721937_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechRecognizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_546721937_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __546721937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bc3c9cbc26a40f2aeb58096b2e48073")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognizer(ptr: Pointer?): WithDefault = ISpeechRecognizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognizer {
      val address = segment.toRawLongValue()
      return makeISpeechRecognizer(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__546721937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognizer): Array<ISpeechRecognizer?> = (elements
        as Array<ISpeechRecognizer?>).castToImpl<ISpeechRecognizer,ISpeechRecognizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognizer?> =
        arrayOfNulls<ISpeechRecognizer_Impl>(size) as Array<ISpeechRecognizer?>
  }
}
