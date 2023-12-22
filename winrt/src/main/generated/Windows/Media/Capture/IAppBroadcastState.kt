package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.WebAuthenticationResult
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastState.ABI::class)
@Signature("{ee08056d-8099-4ddd-922e-c56dac58abfb}")
@Guid("ee08056d80994ddd922ec56dac58abfb")
@WinRTInterface("ee08056d80994ddd922ec56dac58abfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastState.ByReference::class)
public interface IAppBroadcastState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCaptureTargetRunning(): Boolean

  @InterfaceMethod(1)
  public fun get_ViewerCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_ShouldCaptureMicrophone(): Boolean

  @InterfaceMethod(3)
  public fun put_ShouldCaptureMicrophone(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun RestartMicrophoneCapture(): Unit

  @InterfaceMethod(5)
  public fun get_ShouldCaptureCamera(): Boolean

  @InterfaceMethod(6)
  public fun put_ShouldCaptureCamera(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun RestartCameraCapture(): Unit

  @InterfaceMethod(8)
  public fun get_EncodedVideoSize(): Size?

  @InterfaceMethod(9)
  public fun get_MicrophoneCaptureState(): AppBroadcastMicrophoneCaptureState?

  @InterfaceMethod(10)
  public fun get_MicrophoneCaptureError(): WinDef.UINT

  @InterfaceMethod(11)
  public fun get_CameraCaptureState(): AppBroadcastCameraCaptureState?

  @InterfaceMethod(12)
  public fun get_CameraCaptureError(): WinDef.UINT

  @InterfaceMethod(13)
  public fun get_StreamState(): AppBroadcastStreamState?

  @InterfaceMethod(14)
  public fun get_PlugInState(): AppBroadcastPlugInState?

  @InterfaceMethod(15)
  public fun get_OAuthRequestUri(): Uri?

  @InterfaceMethod(16)
  public fun get_OAuthCallbackUri(): Uri?

  @InterfaceMethod(17)
  public fun get_AuthenticationResult(): WebAuthenticationResult?

  @InterfaceMethod(18)
  public fun put_AuthenticationResult(value: WebAuthenticationResult?): Unit

  @InterfaceMethod(19)
  public fun put_SignInState(value: AppBroadcastSignInState?): Unit

  @InterfaceMethod(20)
  public fun get_SignInState(): AppBroadcastSignInState?

  @InterfaceMethod(21)
  public fun get_TerminationReason(): AppBroadcastTerminationReason?

  @InterfaceMethod(22)
  public fun get_TerminationReasonPlugInSpecific(): WinDef.UINT

  @InterfaceMethod(23)
  public fun add_ViewerCountChanged(value: TypedEventHandler<AppBroadcastState?,
      AppBroadcastViewerCountChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_ViewerCountChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_MicrophoneCaptureStateChanged(value: TypedEventHandler<AppBroadcastState?,
      AppBroadcastMicrophoneCaptureStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_MicrophoneCaptureStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_CameraCaptureStateChanged(value: TypedEventHandler<AppBroadcastState?,
      AppBroadcastCameraCaptureStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_CameraCaptureStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_PlugInStateChanged(handler: TypedEventHandler<AppBroadcastState?,
      AppBroadcastPlugInStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_PlugInStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_StreamStateChanged(handler: TypedEventHandler<AppBroadcastState?,
      AppBroadcastStreamStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_StreamStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_CaptureTargetClosed(value: TypedEventHandler<AppBroadcastState?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_CaptureTargetClosed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastState> {
    public override fun getValue() = ABI.makeIAppBroadcastState(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastState {
    public val __1890878471_Ptr: Pointer?

    public val _1890878471_VtblPtr: Pointer?
      get() = __1890878471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCaptureTargetRunning(): Boolean {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ViewerCount(): WinDef.UINT {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ShouldCaptureMicrophone(): Boolean {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ShouldCaptureMicrophone(value: Boolean): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RestartMicrophoneCapture(): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ShouldCaptureCamera(): Boolean {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_ShouldCaptureCamera(value: Boolean): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun RestartCameraCapture(): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_EncodedVideoSize(): Size? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_MicrophoneCaptureState(): AppBroadcastMicrophoneCaptureState? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastMicrophoneCaptureState>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastMicrophoneCaptureState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_MicrophoneCaptureError(): WinDef.UINT {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_CameraCaptureState(): AppBroadcastCameraCaptureState? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastCameraCaptureState>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastCameraCaptureState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CameraCaptureError(): WinDef.UINT {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_StreamState(): AppBroadcastStreamState? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamState>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PlugInState(): AppBroadcastPlugInState? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugInState>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugInState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_OAuthRequestUri(): Uri? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_OAuthCallbackUri(): Uri? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_AuthenticationResult(): WebAuthenticationResult? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAuthenticationResult>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAuthenticationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_AuthenticationResult(value: WebAuthenticationResult?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun put_SignInState(value: AppBroadcastSignInState?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SignInState(): AppBroadcastSignInState? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastSignInState>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastSignInState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_TerminationReason(): AppBroadcastTerminationReason? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastTerminationReason>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastTerminationReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_TerminationReasonPlugInSpecific(): WinDef.UINT {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun add_ViewerCountChanged(value: TypedEventHandler<AppBroadcastState?,
        AppBroadcastViewerCountChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_ViewerCountChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override
        fun add_MicrophoneCaptureStateChanged(value: TypedEventHandler<AppBroadcastState?,
        AppBroadcastMicrophoneCaptureStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_MicrophoneCaptureStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_CameraCaptureStateChanged(value: TypedEventHandler<AppBroadcastState?,
        AppBroadcastCameraCaptureStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_CameraCaptureStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_PlugInStateChanged(handler: TypedEventHandler<AppBroadcastState?,
        AppBroadcastPlugInStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_PlugInStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_StreamStateChanged(handler: TypedEventHandler<AppBroadcastState?,
        AppBroadcastStreamStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_StreamStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_CaptureTargetClosed(value: TypedEventHandler<AppBroadcastState?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_CaptureTargetClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1890878471_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890878471_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1890878471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee08056d80994ddd922ec56dac58abfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastState(ptr: Pointer?): WithDefault = IAppBroadcastState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastState {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastState(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1890878471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastState): Array<IAppBroadcastState?> =
        (elements as
        Array<IAppBroadcastState?>).castToImpl<IAppBroadcastState,IAppBroadcastState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastState?> =
        arrayOfNulls<IAppBroadcastState_Impl>(size) as Array<IAppBroadcastState?>
  }
}
