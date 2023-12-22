package Windows.Devices.Sms

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

@ABIMarker(ISmsMessageReceivedTriggerDetails.ABI::class)
@Signature("{2bcfcbd4-2657-4128-ad5f-e3877132bdb1}")
@Guid("2bcfcbd426574128ad5fe3877132bdb1")
@WinRTInterface("2bcfcbd426574128ad5fe3877132bdb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessageReceivedTriggerDetails.ByReference::class)
public interface ISmsMessageReceivedTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): SmsMessageType?

  @InterfaceMethod(1)
  public fun get_TextMessage(): SmsTextMessage2?

  @InterfaceMethod(2)
  public fun get_WapMessage(): SmsWapMessage?

  @InterfaceMethod(3)
  public fun get_AppMessage(): SmsAppMessage?

  @InterfaceMethod(4)
  public fun get_BroadcastMessage(): SmsBroadcastMessage?

  @InterfaceMethod(5)
  public fun get_VoicemailMessage(): SmsVoicemailMessage?

  @InterfaceMethod(6)
  public fun get_StatusMessage(): SmsStatusMessage?

  @InterfaceMethod(7)
  public fun Drop(): Unit

  @InterfaceMethod(8)
  public fun Accept(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsMessageReceivedTriggerDetails> {
    public override fun getValue() =
        ABI.makeISmsMessageReceivedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ISmsMessageReceivedTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessageReceivedTriggerDetails {
    public val __300927557_Ptr: Pointer?

    public val _300927557_VtblPtr: Pointer?
      get() = __300927557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): SmsMessageType? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageType>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextMessage(): SmsTextMessage2? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsTextMessage2>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsTextMessage2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WapMessage(): SmsWapMessage? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsWapMessage>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsWapMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AppMessage(): SmsAppMessage? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsAppMessage>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsAppMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BroadcastMessage(): SmsBroadcastMessage? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsBroadcastMessage>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsBroadcastMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VoicemailMessage(): SmsVoicemailMessage? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsVoicemailMessage>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsVoicemailMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_StatusMessage(): SmsStatusMessage? {
      val fnPtr = _300927557_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsStatusMessage>()
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsStatusMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Drop(): Unit {
      val fnPtr = _300927557_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Accept(): Unit {
      val fnPtr = _300927557_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__300927557_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmsMessageReceivedTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __300927557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessageReceivedTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bcfcbd426574128ad5fe3877132bdb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessageReceivedTriggerDetails(ptr: Pointer?): WithDefault =
        ISmsMessageReceivedTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessageReceivedTriggerDetails {
      val address = segment.toRawLongValue()
      return makeISmsMessageReceivedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessageReceivedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__300927557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessageReceivedTriggerDetails):
        Array<ISmsMessageReceivedTriggerDetails?> = (elements as
        Array<ISmsMessageReceivedTriggerDetails?>).castToImpl<ISmsMessageReceivedTriggerDetails,ISmsMessageReceivedTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessageReceivedTriggerDetails?> =
        arrayOfNulls<ISmsMessageReceivedTriggerDetails_Impl>(size) as
        Array<ISmsMessageReceivedTriggerDetails?>
  }
}
