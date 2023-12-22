package Windows.ApplicationModel.VoiceCommands

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoiceCommandServiceConnection.ABI::class)
@Signature("{d894bb9f-21da-44a4-98a2-fb131920a9cc}")
@Guid("d894bb9f21da44a498a2fb131920a9cc")
@WinRTInterface("d894bb9f21da44a498a2fb131920a9cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandServiceConnection.ByReference::class)
public interface IVoiceCommandServiceConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetVoiceCommandAsync(): IAsyncOperation<VoiceCommand?>?

  @InterfaceMethod(1)
  public fun RequestConfirmationAsync(response: VoiceCommandResponse?):
      IAsyncOperation<VoiceCommandConfirmationResult?>?

  @InterfaceMethod(2)
  public fun RequestDisambiguationAsync(response: VoiceCommandResponse?):
      IAsyncOperation<VoiceCommandDisambiguationResult?>?

  @InterfaceMethod(3)
  public fun ReportProgressAsync(response: VoiceCommandResponse?): IAsyncAction?

  @InterfaceMethod(4)
  public fun ReportSuccessAsync(response: VoiceCommandResponse?): IAsyncAction?

  @InterfaceMethod(5)
  public fun ReportFailureAsync(response: VoiceCommandResponse?): IAsyncAction?

  @InterfaceMethod(6)
  public fun RequestAppLaunchAsync(response: VoiceCommandResponse?): IAsyncAction?

  @InterfaceMethod(7)
  public fun get_Language(): Language?

  @InterfaceMethod(8)
  public fun add_VoiceCommandCompleted(handler: TypedEventHandler<VoiceCommandServiceConnection?,
      VoiceCommandCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_VoiceCommandCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandServiceConnection> {
    public override fun getValue() = ABI.makeIVoiceCommandServiceConnection(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandServiceConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandServiceConnection {
    public val __257863615_Ptr: Pointer?

    public val _257863615_VtblPtr: Pointer?
      get() = __257863615_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetVoiceCommandAsync(): IAsyncOperation<VoiceCommand?>? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VoiceCommand?>>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VoiceCommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestConfirmationAsync(response: VoiceCommandResponse?):
        IAsyncOperation<VoiceCommandConfirmationResult?>? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VoiceCommandConfirmationResult?>>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VoiceCommandConfirmationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestDisambiguationAsync(response: VoiceCommandResponse?):
        IAsyncOperation<VoiceCommandDisambiguationResult?>? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VoiceCommandDisambiguationResult?>>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VoiceCommandDisambiguationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportProgressAsync(response: VoiceCommandResponse?): IAsyncAction? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ReportSuccessAsync(response: VoiceCommandResponse?): IAsyncAction? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ReportFailureAsync(response: VoiceCommandResponse?): IAsyncAction? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RequestAppLaunchAsync(response: VoiceCommandResponse?): IAsyncAction? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Language(): Language? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun add_VoiceCommandCompleted(handler: TypedEventHandler<VoiceCommandServiceConnection?,
        VoiceCommandCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _257863615_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_VoiceCommandCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _257863615_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__257863615_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoiceCommandServiceConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __257863615_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandServiceConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d894bb9f21da44a498a2fb131920a9cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandServiceConnection(ptr: Pointer?): WithDefault =
        IVoiceCommandServiceConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandServiceConnection {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__257863615_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandServiceConnection):
        Array<IVoiceCommandServiceConnection?> = (elements as
        Array<IVoiceCommandServiceConnection?>).castToImpl<IVoiceCommandServiceConnection,IVoiceCommandServiceConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandServiceConnection?> =
        arrayOfNulls<IVoiceCommandServiceConnection_Impl>(size) as
        Array<IVoiceCommandServiceConnection?>
  }
}
