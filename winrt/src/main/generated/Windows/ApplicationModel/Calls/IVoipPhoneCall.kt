package Windows.ApplicationModel.Calls

import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoipPhoneCall.ABI::class)
@Signature("{6cf1f19a-7794-4a5a-8c68-ae87947a6990}")
@Guid("6cf1f19a77944a5a8c68ae87947a6990")
@WinRTInterface("6cf1f19a77944a5a8c68ae87947a6990")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipPhoneCall.ByReference::class)
public interface IVoipPhoneCall : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_EndRequested(handler: TypedEventHandler<VoipPhoneCall?,
      CallStateChangeEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_EndRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_HoldRequested(handler: TypedEventHandler<VoipPhoneCall?,
      CallStateChangeEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_HoldRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ResumeRequested(handler: TypedEventHandler<VoipPhoneCall?,
      CallStateChangeEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ResumeRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_AnswerRequested(acceptHandler: TypedEventHandler<VoipPhoneCall?,
      CallAnswerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_AnswerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_RejectRequested(rejectHandler: TypedEventHandler<VoipPhoneCall?,
      CallRejectEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_RejectRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun NotifyCallHeld(): Unit

  @InterfaceMethod(11)
  public fun NotifyCallActive(): Unit

  @InterfaceMethod(12)
  public fun NotifyCallEnded(): Unit

  @InterfaceMethod(13)
  public fun get_ContactName(): String?

  @InterfaceMethod(14)
  public fun put_ContactName(value: String?): Unit

  @InterfaceMethod(15)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(16)
  public fun put_StartTime(value: DateTime?): Unit

  @InterfaceMethod(17)
  public fun get_CallMedia(): VoipPhoneCallMedia?

  @InterfaceMethod(18)
  public fun put_CallMedia(value: VoipPhoneCallMedia?): Unit

  @InterfaceMethod(19)
  public fun NotifyCallReady(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVoipPhoneCall>
      {
    public override fun getValue() = ABI.makeIVoipPhoneCall(pointer.getPointer(0))

    public fun setValue(value: IVoipPhoneCall_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipPhoneCall {
    public val __1934567790_Ptr: Pointer?

    public val _1934567790_VtblPtr: Pointer?
      get() = __1934567790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_EndRequested(handler: TypedEventHandler<VoipPhoneCall?,
        CallStateChangeEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_EndRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_HoldRequested(handler: TypedEventHandler<VoipPhoneCall?,
        CallStateChangeEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_HoldRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ResumeRequested(handler: TypedEventHandler<VoipPhoneCall?,
        CallStateChangeEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ResumeRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_AnswerRequested(acceptHandler: TypedEventHandler<VoipPhoneCall?,
        CallAnswerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(acceptHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_AnswerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_RejectRequested(rejectHandler: TypedEventHandler<VoipPhoneCall?,
        CallRejectEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(rejectHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_RejectRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun NotifyCallHeld(): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun NotifyCallActive(): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun NotifyCallEnded(): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ContactName(): String? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ContactName(value: String?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_StartTime(value: DateTime?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_CallMedia(): VoipPhoneCallMedia? {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCallMedia>()
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCallMedia>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_CallMedia(value: VoipPhoneCallMedia?): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun NotifyCallReady(): Unit {
      val fnPtr = _1934567790_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934567790_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoipPhoneCall_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1934567790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipPhoneCall, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cf1f19a77944a5a8c68ae87947a6990")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipPhoneCall(ptr: Pointer?): WithDefault = IVoipPhoneCall_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipPhoneCall {
      val address = segment.toRawLongValue()
      return makeIVoipPhoneCall(Pointer(address))
    }

    public override fun toNative(obj: IVoipPhoneCall): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1934567790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipPhoneCall): Array<IVoipPhoneCall?> = (elements as
        Array<IVoipPhoneCall?>).castToImpl<IVoipPhoneCall,IVoipPhoneCall_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipPhoneCall?> =
        arrayOfNulls<IVoipPhoneCall_Impl>(size) as Array<IVoipPhoneCall?>
  }
}
