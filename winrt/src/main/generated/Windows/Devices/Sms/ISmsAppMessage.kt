package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessageBase.ABI.IID
import Windows.Foundation.DateTime
import Windows.Storage.Streams.IBuffer
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsAppMessage.ABI::class)
@Signature("{e8bb8494-d3a0-4a0a-86d7-291033a8cf54}")
@Guid("e8bb8494d3a04a0a86d7291033a8cf54")
@WinRTInterface("e8bb8494d3a04a0a86d7291033a8cf54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsAppMessage.ByReference::class)
public interface ISmsAppMessage : NativeMapped, IWinRTInterface, ISmsMessageBase {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_To(): String?

  @InterfaceMethod(2)
  public fun put_To(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_From(): String?

  @InterfaceMethod(4)
  public fun get_Body(): String?

  @InterfaceMethod(5)
  public fun put_Body(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_CallbackNumber(): String?

  @InterfaceMethod(7)
  public fun put_CallbackNumber(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_IsDeliveryNotificationEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsDeliveryNotificationEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_RetryAttemptCount(): Int

  @InterfaceMethod(11)
  public fun put_RetryAttemptCount(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_Encoding(): SmsEncoding?

  @InterfaceMethod(13)
  public fun put_Encoding(value: SmsEncoding?): Unit

  @InterfaceMethod(14)
  public fun get_PortNumber(): Int

  @InterfaceMethod(15)
  public fun put_PortNumber(value: Int): Unit

  @InterfaceMethod(16)
  public fun get_TeleserviceId(): Int

  @InterfaceMethod(17)
  public fun put_TeleserviceId(value: Int): Unit

  @InterfaceMethod(18)
  public fun get_ProtocolId(): Int

  @InterfaceMethod(19)
  public fun put_ProtocolId(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_BinaryBody(): IBuffer?

  @InterfaceMethod(21)
  public fun put_BinaryBody(value: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmsAppMessage>
      {
    public override fun getValue() = ABI.makeISmsAppMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsAppMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsAppMessage, ISmsMessageBase.WithDefault {
    public val __416888275_Ptr: Pointer?

    public val _416888275_VtblPtr: Pointer?
      get() = __416888275_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_To(): String? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_To(value: String?): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_From(): String? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Body(): String? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Body(value: String?): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CallbackNumber(): String? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CallbackNumber(value: String?): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsDeliveryNotificationEnabled(): Boolean {
      val fnPtr = _416888275_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsDeliveryNotificationEnabled(value: Boolean): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RetryAttemptCount(): Int {
      val fnPtr = _416888275_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_RetryAttemptCount(value: Int): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Encoding(): SmsEncoding? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsEncoding>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Encoding(value: SmsEncoding?): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PortNumber(): Int {
      val fnPtr = _416888275_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_PortNumber(value: Int): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TeleserviceId(): Int {
      val fnPtr = _416888275_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_TeleserviceId(value: Int): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ProtocolId(): Int {
      val fnPtr = _416888275_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_ProtocolId(value: Int): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_BinaryBody(): IBuffer? {
      val fnPtr = _416888275_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_BinaryBody(value: IBuffer?): Unit {
      val fnPtr = _416888275_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416888275_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmsAppMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessageBase {
    public override val __1120832021_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_416888275_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __416888275_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsAppMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8bb8494d3a04a0a86d7291033a8cf54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsAppMessage(ptr: Pointer?): WithDefault = ISmsAppMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsAppMessage {
      val address = segment.toRawLongValue()
      return makeISmsAppMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsAppMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__416888275_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsAppMessage): Array<ISmsAppMessage?> = (elements as
        Array<ISmsAppMessage?>).castToImpl<ISmsAppMessage,ISmsAppMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsAppMessage?> =
        arrayOfNulls<ISmsAppMessage_Impl>(size) as Array<ISmsAppMessage?>
  }
}
