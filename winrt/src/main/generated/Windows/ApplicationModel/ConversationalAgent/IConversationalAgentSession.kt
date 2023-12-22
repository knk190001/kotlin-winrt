package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.Audio.AudioDeviceInputNode
import Windows.Media.Audio.AudioGraph
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IConversationalAgentSession.ABI::class)
@Signature("{daaae09a-b7ba-57e5-ad13-df520f9b6fa7}")
@Guid("daaae09ab7ba57e5ad13df520f9b6fa7")
@WinRTInterface("daaae09ab7ba57e5ad13df520f9b6fa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSession.ByReference::class)
public interface IConversationalAgentSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SessionInterrupted(handler: TypedEventHandler<ConversationalAgentSession?,
      ConversationalAgentSessionInterruptedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SessionInterrupted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SignalDetected(handler: TypedEventHandler<ConversationalAgentSession?,
      ConversationalAgentSignalDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SignalDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SystemStateChanged(handler: TypedEventHandler<ConversationalAgentSession?,
      ConversationalAgentSystemStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SystemStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_AgentState(): ConversationalAgentState?

  @InterfaceMethod(7)
  public fun get_Signal(): ConversationalAgentSignal?

  @InterfaceMethod(8)
  public fun get_IsIndicatorLightAvailable(): Boolean

  @InterfaceMethod(9)
  public fun get_IsScreenAvailable(): Boolean

  @InterfaceMethod(10)
  public fun get_IsUserAuthenticated(): Boolean

  @InterfaceMethod(11)
  public fun get_IsVoiceActivationAvailable(): Boolean

  @InterfaceMethod(12)
  public fun get_IsInterruptible(): Boolean

  @InterfaceMethod(13)
  public fun get_IsInterrupted(): Boolean

  @InterfaceMethod(14)
  public fun RequestInterruptibleAsync(interruptible: Boolean):
      IAsyncOperation<ConversationalAgentSessionUpdateResponse?>?

  @InterfaceMethod(15)
  public fun RequestInterruptible(interruptible: Boolean): ConversationalAgentSessionUpdateResponse?

  @InterfaceMethod(16)
  public fun RequestAgentStateChangeAsync(state: ConversationalAgentState?):
      IAsyncOperation<ConversationalAgentSessionUpdateResponse?>?

  @InterfaceMethod(17)
  public fun RequestAgentStateChange(state: ConversationalAgentState?):
      ConversationalAgentSessionUpdateResponse?

  @InterfaceMethod(18)
  public fun RequestForegroundActivationAsync():
      IAsyncOperation<ConversationalAgentSessionUpdateResponse?>?

  @InterfaceMethod(19)
  public fun RequestForegroundActivation(): ConversationalAgentSessionUpdateResponse?

  @InterfaceMethod(20)
  public fun GetAudioClientAsync(): IAsyncOperation<IUnknown?>?

  @InterfaceMethod(21)
  public fun GetAudioClient(): IUnknown?

  @InterfaceMethod(22)
  public fun CreateAudioDeviceInputNodeAsync(graph: AudioGraph?):
      IAsyncOperation<AudioDeviceInputNode?>?

  @InterfaceMethod(23)
  public fun CreateAudioDeviceInputNode(graph: AudioGraph?): AudioDeviceInputNode?

  @InterfaceMethod(24)
  public fun GetAudioCaptureDeviceIdAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(25)
  public fun GetAudioCaptureDeviceId(): String?

  @InterfaceMethod(26)
  public fun GetAudioRenderDeviceIdAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(27)
  public fun GetAudioRenderDeviceId(): String?

  @InterfaceMethod(28)
  public fun GetSignalModelIdAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(29)
  public fun GetSignalModelId(): WinDef.UINT

  @InterfaceMethod(30)
  public fun SetSignalModelIdAsync(signalModelId: WinDef.UINT): IAsyncOperation<Boolean>?

  @InterfaceMethod(31)
  public fun SetSignalModelId(signalModelId: WinDef.UINT): Boolean

  @InterfaceMethod(32)
  public fun GetSupportedSignalModelIdsAsync(): IAsyncOperation<IVectorView<WinDef.UINT>?>?

  @InterfaceMethod(33)
  public fun GetSupportedSignalModelIds(): IVectorView<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSession> {
    public override fun getValue() = ABI.makeIConversationalAgentSession(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSession {
    public val __945048379_Ptr: Pointer?

    public val _945048379_VtblPtr: Pointer?
      get() = __945048379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SessionInterrupted(handler: TypedEventHandler<ConversationalAgentSession?,
        ConversationalAgentSessionInterruptedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SessionInterrupted(token: EventRegistrationToken?): Unit {
      val fnPtr = _945048379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SignalDetected(handler: TypedEventHandler<ConversationalAgentSession?,
        ConversationalAgentSignalDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SignalDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _945048379_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_SystemStateChanged(handler: TypedEventHandler<ConversationalAgentSession?,
        ConversationalAgentSystemStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SystemStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _945048379_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AgentState(): ConversationalAgentState? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentState>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConversationalAgentState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Signal(): ConversationalAgentSignal? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSignal>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConversationalAgentSignal>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsIndicatorLightAvailable(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsScreenAvailable(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_IsUserAuthenticated(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_IsVoiceActivationAvailable(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_IsInterruptible(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsInterrupted(): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun RequestInterruptibleAsync(interruptible: Boolean):
        IAsyncOperation<ConversationalAgentSessionUpdateResponse?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, interruptible, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RequestInterruptible(interruptible: Boolean):
        ConversationalAgentSessionUpdateResponse? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSessionUpdateResponse>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, interruptible, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ConversationalAgentSessionUpdateResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun RequestAgentStateChangeAsync(state: ConversationalAgentState?):
        IAsyncOperation<ConversationalAgentSessionUpdateResponse?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(state), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun RequestAgentStateChange(state: ConversationalAgentState?):
        ConversationalAgentSessionUpdateResponse? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSessionUpdateResponse>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(state), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ConversationalAgentSessionUpdateResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun RequestForegroundActivationAsync():
        IAsyncOperation<ConversationalAgentSessionUpdateResponse?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConversationalAgentSessionUpdateResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun RequestForegroundActivation(): ConversationalAgentSessionUpdateResponse? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentSessionUpdateResponse>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ConversationalAgentSessionUpdateResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetAudioClientAsync(): IAsyncOperation<IUnknown?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun GetAudioClient(): IUnknown? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun CreateAudioDeviceInputNodeAsync(graph: AudioGraph?):
        IAsyncOperation<AudioDeviceInputNode?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AudioDeviceInputNode?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(graph), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AudioDeviceInputNode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun CreateAudioDeviceInputNode(graph: AudioGraph?): AudioDeviceInputNode? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceInputNode>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, marshalToNative(graph), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceInputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun GetAudioCaptureDeviceIdAsync(): IAsyncOperation<String?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetAudioCaptureDeviceId(): String? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun GetAudioRenderDeviceIdAsync(): IAsyncOperation<String?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun GetAudioRenderDeviceId(): String? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetSignalModelIdAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun GetSignalModelId(): WinDef.UINT {
      val fnPtr = _945048379_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun SetSignalModelIdAsync(signalModelId: WinDef.UINT):
        IAsyncOperation<Boolean>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, signalModelId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun SetSignalModelId(signalModelId: WinDef.UINT): Boolean {
      val fnPtr = _945048379_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr, signalModelId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun GetSupportedSignalModelIdsAsync():
        IAsyncOperation<IVectorView<WinDef.UINT>?>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WinDef.UINT>?>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WinDef.UINT>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun GetSupportedSignalModelIds(): IVectorView<WinDef.UINT>? {
      val fnPtr = _945048379_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__945048379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945048379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daaae09ab7ba57e5ad13df520f9b6fa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSession(ptr: Pointer?): WithDefault =
        IConversationalAgentSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentSession {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSession(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945048379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSession):
        Array<IConversationalAgentSession?> = (elements as
        Array<IConversationalAgentSession?>).castToImpl<IConversationalAgentSession,IConversationalAgentSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSession?> =
        arrayOfNulls<IConversationalAgentSession_Impl>(size) as Array<IConversationalAgentSession?>
  }
}
