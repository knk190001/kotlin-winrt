package Windows.Devices.Sms

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ISmsDevice.ABI::class)
@Signature("{091791ed-872b-4eec-9c72-ab11627b34ec}")
@Guid("091791ed872b4eec9c72ab11627b34ec")
@WinRTInterface("091791ed872b4eec9c72ab11627b34ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsDevice.ByReference::class)
public interface ISmsDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendMessageAsync(message: ISmsMessage?): SendSmsMessageOperation?

  @InterfaceMethod(1)
  public fun CalculateLength(message: SmsTextMessage?): SmsEncodedLength?

  @InterfaceMethod(2)
  public fun get_AccountPhoneNumber(): String?

  @InterfaceMethod(3)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(4)
  public fun get_MessageStore(): SmsDeviceMessageStore?

  @InterfaceMethod(5)
  public fun get_DeviceStatus(): SmsDeviceStatus?

  @InterfaceMethod(6)
  public fun add_SmsMessageReceived(eventHandler: SmsMessageReceivedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SmsMessageReceived(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_SmsDeviceStatusChanged(eventHandler: SmsDeviceStatusChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SmsDeviceStatusChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmsDevice> {
    public override fun getValue() = ABI.makeISmsDevice(pointer.getPointer(0))

    public fun setValue(value: ISmsDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsDevice {
    public val __472992771_Ptr: Pointer?

    public val _472992771_VtblPtr: Pointer?
      get() = __472992771_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendMessageAsync(message: ISmsMessage?): SendSmsMessageOperation? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SendSmsMessageOperation>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SendSmsMessageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CalculateLength(message: SmsTextMessage?): SmsEncodedLength? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsEncodedLength>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsEncodedLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AccountPhoneNumber(): String? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MessageStore(): SmsDeviceMessageStore? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDeviceMessageStore>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDeviceMessageStore>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DeviceStatus(): SmsDeviceStatus? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDeviceStatus>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDeviceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_SmsMessageReceived(eventHandler: SmsMessageReceivedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SmsMessageReceived(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _472992771_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_SmsDeviceStatusChanged(eventHandler: SmsDeviceStatusChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _472992771_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SmsDeviceStatusChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _472992771_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__472992771_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmsDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __472992771_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("091791ed872b4eec9c72ab11627b34ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsDevice(ptr: Pointer?): WithDefault = ISmsDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsDevice {
      val address = segment.toRawLongValue()
      return makeISmsDevice(Pointer(address))
    }

    public override fun toNative(obj: ISmsDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__472992771_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsDevice): Array<ISmsDevice?> = (elements as
        Array<ISmsDevice?>).castToImpl<ISmsDevice,ISmsDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsDevice?> = arrayOfNulls<ISmsDevice_Impl>(size)
        as Array<ISmsDevice?>
  }
}
