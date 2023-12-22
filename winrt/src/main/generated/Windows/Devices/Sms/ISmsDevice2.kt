package Windows.Devices.Sms

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsDevice2.ABI::class)
@Signature("{bd8a5c13-e522-46cb-b8d5-9ead30fb6c47}")
@Guid("bd8a5c13e52246cbb8d59ead30fb6c47")
@WinRTInterface("bd8a5c13e52246cbb8d59ead30fb6c47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsDevice2.ByReference::class)
public interface ISmsDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmscAddress(): String?

  @InterfaceMethod(1)
  public fun put_SmscAddress(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  @InterfaceMethod(3)
  public fun get_ParentDeviceId(): String?

  @InterfaceMethod(4)
  public fun get_AccountPhoneNumber(): String?

  @InterfaceMethod(5)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(6)
  public fun get_DeviceStatus(): SmsDeviceStatus?

  @InterfaceMethod(7)
  public fun CalculateLength(message: ISmsMessageBase?): SmsEncodedLength?

  @InterfaceMethod(8)
  public fun SendMessageAndGetResultAsync(message: ISmsMessageBase?):
      IAsyncOperation<SmsSendMessageResult?>?

  @InterfaceMethod(9)
  public fun add_DeviceStatusChanged(eventHandler: TypedEventHandler<SmsDevice2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_DeviceStatusChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmsDevice2> {
    public override fun getValue() = ABI.makeISmsDevice2(pointer.getPointer(0))

    public fun setValue(value: ISmsDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsDevice2 {
    public val __1777874063_Ptr: Pointer?

    public val _1777874063_VtblPtr: Pointer?
      get() = __1777874063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmscAddress(): String? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SmscAddress(value: String?): Unit {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ParentDeviceId(): String? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AccountPhoneNumber(): String? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DeviceStatus(): SmsDeviceStatus? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDeviceStatus>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDeviceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CalculateLength(message: ISmsMessageBase?): SmsEncodedLength? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsEncodedLength>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsEncodedLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SendMessageAndGetResultAsync(message: ISmsMessageBase?):
        IAsyncOperation<SmsSendMessageResult?>? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmsSendMessageResult?>>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SmsSendMessageResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_DeviceStatusChanged(eventHandler: TypedEventHandler<SmsDevice2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_DeviceStatusChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1777874063_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777874063_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmsDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1777874063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd8a5c13e52246cbb8d59ead30fb6c47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsDevice2(ptr: Pointer?): WithDefault = ISmsDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsDevice2 {
      val address = segment.toRawLongValue()
      return makeISmsDevice2(Pointer(address))
    }

    public override fun toNative(obj: ISmsDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1777874063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsDevice2): Array<ISmsDevice2?> = (elements as
        Array<ISmsDevice2?>).castToImpl<ISmsDevice2,ISmsDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsDevice2?> =
        arrayOfNulls<ISmsDevice2_Impl>(size) as Array<ISmsDevice2?>
  }
}
