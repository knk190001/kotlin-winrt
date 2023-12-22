package Windows.Media.SpeechRecognition

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ISpeechContinuousRecognitionSession.ABI::class)
@Signature("{6a213c04-6614-49f8-99a2-b5e9b3a085c8}")
@Guid("6a213c04661449f899a2b5e9b3a085c8")
@WinRTInterface("6a213c04661449f899a2b5e9b3a085c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechContinuousRecognitionSession.ByReference::class)
public interface ISpeechContinuousRecognitionSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoStopSilenceTimeout(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_AutoStopSilenceTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun StartAsync(mode: SpeechContinuousRecognitionMode?): IAsyncAction?

  @InterfaceMethod(4)
  public fun StopAsync(): IAsyncAction?

  @InterfaceMethod(5)
  public fun CancelAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun PauseAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun Resume(): Unit

  @InterfaceMethod(8)
  public fun add_Completed(value: TypedEventHandler<SpeechContinuousRecognitionSession?,
      SpeechContinuousRecognitionCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Completed(value: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_ResultGenerated(value: TypedEventHandler<SpeechContinuousRecognitionSession?,
      SpeechContinuousRecognitionResultGeneratedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ResultGenerated(value: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechContinuousRecognitionSession> {
    public override fun getValue() =
        ABI.makeISpeechContinuousRecognitionSession(pointer.getPointer(0))

    public fun setValue(value: ISpeechContinuousRecognitionSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechContinuousRecognitionSession {
    public val __1712045735_Ptr: Pointer?

    public val _1712045735_VtblPtr: Pointer?
      get() = __1712045735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoStopSilenceTimeout(): TimeSpan? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AutoStopSilenceTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StartAsync(mode: SpeechContinuousRecognitionMode?): IAsyncAction? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun StopAsync(): IAsyncAction? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CancelAsync(): IAsyncAction? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun PauseAsync(): IAsyncAction? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Resume(): Unit {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Completed(value: TypedEventHandler<SpeechContinuousRecognitionSession?,
        SpeechContinuousRecognitionCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Completed(value: EventRegistrationToken?): Unit {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_ResultGenerated(value: TypedEventHandler<SpeechContinuousRecognitionSession?,
        SpeechContinuousRecognitionResultGeneratedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ResultGenerated(value: EventRegistrationToken?): Unit {
      val fnPtr = _1712045735_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1712045735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechContinuousRecognitionSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1712045735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechContinuousRecognitionSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a213c04661449f899a2b5e9b3a085c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechContinuousRecognitionSession(ptr: Pointer?): WithDefault =
        ISpeechContinuousRecognitionSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechContinuousRecognitionSession {
      val address = segment.toRawLongValue()
      return makeISpeechContinuousRecognitionSession(Pointer(address))
    }

    public override fun toNative(obj: ISpeechContinuousRecognitionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1712045735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechContinuousRecognitionSession):
        Array<ISpeechContinuousRecognitionSession?> = (elements as
        Array<ISpeechContinuousRecognitionSession?>).castToImpl<ISpeechContinuousRecognitionSession,ISpeechContinuousRecognitionSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechContinuousRecognitionSession?> =
        arrayOfNulls<ISpeechContinuousRecognitionSession_Impl>(size) as
        Array<ISpeechContinuousRecognitionSession?>
  }
}
