package Windows.ApplicationModel.Calls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IPhoneCall.ABI::class)
@Signature("{c14ed0f8-c17d-59d2-9628-66e545b6cd21}")
@Guid("c14ed0f8c17d59d2962866e545b6cd21")
@WinRTInterface("c14ed0f8c17d59d2962866e545b6cd21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCall.ByReference::class)
public interface IPhoneCall : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_StatusChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_AudioDeviceChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AudioDeviceChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_IsMutedChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_IsMutedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_CallId(): String?

  @InterfaceMethod(7)
  public fun get_IsMuted(): Boolean

  @InterfaceMethod(8)
  public fun get_Status(): PhoneCallStatus?

  @InterfaceMethod(9)
  public fun get_AudioDevice(): PhoneCallAudioDevice?

  @InterfaceMethod(10)
  public fun GetPhoneCallInfo(): PhoneCallInfo?

  @InterfaceMethod(11)
  public fun GetPhoneCallInfoAsync(): IAsyncOperation<PhoneCallInfo?>?

  @InterfaceMethod(12)
  public fun End(): PhoneCallOperationStatus?

  @InterfaceMethod(13)
  public fun EndAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(14)
  public fun SendDtmfKey(key: DtmfKey?, dtmfToneAudioPlayback: DtmfToneAudioPlayback?):
      PhoneCallOperationStatus?

  @InterfaceMethod(15)
  public fun SendDtmfKeyAsync(key: DtmfKey?, dtmfToneAudioPlayback: DtmfToneAudioPlayback?):
      IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(16)
  public fun AcceptIncoming(): PhoneCallOperationStatus?

  @InterfaceMethod(17)
  public fun AcceptIncomingAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(18)
  public fun Hold(): PhoneCallOperationStatus?

  @InterfaceMethod(19)
  public fun HoldAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(20)
  public fun ResumeFromHold(): PhoneCallOperationStatus?

  @InterfaceMethod(21)
  public fun ResumeFromHoldAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(22)
  public fun Mute(): PhoneCallOperationStatus?

  @InterfaceMethod(23)
  public fun MuteAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(24)
  public fun Unmute(): PhoneCallOperationStatus?

  @InterfaceMethod(25)
  public fun UnmuteAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(26)
  public fun RejectIncoming(): PhoneCallOperationStatus?

  @InterfaceMethod(27)
  public fun RejectIncomingAsync(): IAsyncOperation<PhoneCallOperationStatus?>?

  @InterfaceMethod(28)
  public fun ChangeAudioDevice(endpoint: PhoneCallAudioDevice?): PhoneCallOperationStatus?

  @InterfaceMethod(29)
  public fun ChangeAudioDeviceAsync(endpoint: PhoneCallAudioDevice?):
      IAsyncOperation<PhoneCallOperationStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneCall> {
    public override fun getValue() = ABI.makeIPhoneCall(pointer.getPointer(0))

    public fun setValue(value: IPhoneCall_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCall {
    public val __1867384786_Ptr: Pointer?

    public val _1867384786_VtblPtr: Pointer?
      get() = __1867384786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_StatusChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_AudioDeviceChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AudioDeviceChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_IsMutedChanged(handler: TypedEventHandler<PhoneCall?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_IsMutedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CallId(): String? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsMuted(): Boolean {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Status(): PhoneCallStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_AudioDevice(): PhoneCallAudioDevice? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallAudioDevice>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallAudioDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetPhoneCallInfo(): PhoneCallInfo? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallInfo>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetPhoneCallInfoAsync(): IAsyncOperation<PhoneCallInfo?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhoneCallInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun End(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun EndAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SendDtmfKey(key: DtmfKey?, dtmfToneAudioPlayback: DtmfToneAudioPlayback?):
        PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(key),
          marshalToNative(dtmfToneAudioPlayback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun SendDtmfKeyAsync(key: DtmfKey?,
        dtmfToneAudioPlayback: DtmfToneAudioPlayback?):
        IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(key),
          marshalToNative(dtmfToneAudioPlayback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun AcceptIncoming(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun AcceptIncomingAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun Hold(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun HoldAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun ResumeFromHold(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun ResumeFromHoldAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun Mute(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun MuteAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun Unmute(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun UnmuteAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun RejectIncoming(): PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun RejectIncomingAsync(): IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun ChangeAudioDevice(endpoint: PhoneCallAudioDevice?):
        PhoneCallOperationStatus? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(endpoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun ChangeAudioDeviceAsync(endpoint: PhoneCallAudioDevice?):
        IAsyncOperation<PhoneCallOperationStatus?>? {
      val fnPtr = _1867384786_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1867384786_Ptr, marshalToNative(endpoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallOperationStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCall_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1867384786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCall, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c14ed0f8c17d59d2962866e545b6cd21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCall(ptr: Pointer?): WithDefault = IPhoneCall_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCall {
      val address = segment.toRawLongValue()
      return makeIPhoneCall(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCall): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1867384786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCall): Array<IPhoneCall?> = (elements as
        Array<IPhoneCall?>).castToImpl<IPhoneCall,IPhoneCall_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCall?> = arrayOfNulls<IPhoneCall_Impl>(size)
        as Array<IPhoneCall?>
  }
}
