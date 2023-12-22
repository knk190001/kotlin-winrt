package Windows.Devices.WiFiDirect.Services

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWiFiDirectServiceAdvertiser.ABI::class)
@Signature("{a4aa1ee1-9d8f-4f4f-93ee-7ddea2e37f46}")
@Guid("a4aa1ee19d8f4f4f93ee7ddea2e37f46")
@WinRTInterface("a4aa1ee19d8f4f4f93ee7ddea2e37f46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceAdvertiser.ByReference::class)
public interface IWiFiDirectServiceAdvertiser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServiceName(): String?

  @InterfaceMethod(1)
  public fun get_ServiceNamePrefixes(): IVector<String?>?

  @InterfaceMethod(2)
  public fun get_ServiceInfo(): IBuffer?

  @InterfaceMethod(3)
  public fun put_ServiceInfo(value: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun get_AutoAcceptSession(): Boolean

  @InterfaceMethod(5)
  public fun put_AutoAcceptSession(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_PreferGroupOwnerMode(): Boolean

  @InterfaceMethod(7)
  public fun put_PreferGroupOwnerMode(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_PreferredConfigurationMethods(): IVector<WiFiDirectServiceConfigurationMethod?>?

  @InterfaceMethod(9)
  public fun get_ServiceStatus(): WiFiDirectServiceStatus?

  @InterfaceMethod(10)
  public fun put_ServiceStatus(value: WiFiDirectServiceStatus?): Unit

  @InterfaceMethod(11)
  public fun get_CustomServiceStatusCode(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_CustomServiceStatusCode(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_DeferredSessionInfo(): IBuffer?

  @InterfaceMethod(14)
  public fun put_DeferredSessionInfo(value: IBuffer?): Unit

  @InterfaceMethod(15)
  public fun get_AdvertisementStatus(): WiFiDirectServiceAdvertisementStatus?

  @InterfaceMethod(16)
  public fun get_ServiceError(): WiFiDirectServiceError?

  @InterfaceMethod(17)
  public fun add_SessionRequested(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
      WiFiDirectServiceSessionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_SessionRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_AutoAcceptSessionConnected(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
      WiFiDirectServiceAutoAcceptSessionConnectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_AutoAcceptSessionConnected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_AdvertisementStatusChanged(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_AdvertisementStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun ConnectAsync(deviceInfo: DeviceInformation?):
      IAsyncOperation<WiFiDirectServiceSession?>?

  @InterfaceMethod(24)
  public fun ConnectAsync(deviceInfo: DeviceInformation?, pin: String?):
      IAsyncOperation<WiFiDirectServiceSession?>?

  @InterfaceMethod(25)
  public fun Start(): Unit

  @InterfaceMethod(26)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceAdvertiser> {
    public override fun getValue() = ABI.makeIWiFiDirectServiceAdvertiser(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceAdvertiser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceAdvertiser {
    public val __1356357141_Ptr: Pointer?

    public val _1356357141_VtblPtr: Pointer?
      get() = __1356357141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceName(): String? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceNamePrefixes(): IVector<String?>? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServiceInfo(): IBuffer? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ServiceInfo(value: IBuffer?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AutoAcceptSession(): Boolean {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AutoAcceptSession(value: Boolean): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PreferGroupOwnerMode(): Boolean {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_PreferGroupOwnerMode(value: Boolean): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PreferredConfigurationMethods():
        IVector<WiFiDirectServiceConfigurationMethod?>? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WiFiDirectServiceConfigurationMethod?>>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<WiFiDirectServiceConfigurationMethod?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ServiceStatus(): WiFiDirectServiceStatus? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceStatus>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ServiceStatus(value: WiFiDirectServiceStatus?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CustomServiceStatusCode(): WinDef.UINT {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_CustomServiceStatusCode(value: WinDef.UINT): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_DeferredSessionInfo(): IBuffer? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_DeferredSessionInfo(value: IBuffer?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AdvertisementStatus(): WiFiDirectServiceAdvertisementStatus? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceAdvertisementStatus>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceAdvertisementStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ServiceError(): WiFiDirectServiceError? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceError>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override
        fun add_SessionRequested(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
        WiFiDirectServiceSessionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_SessionRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override
        fun add_AutoAcceptSessionConnected(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
        WiFiDirectServiceAutoAcceptSessionConnectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_AutoAcceptSessionConnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override
        fun add_AdvertisementStatusChanged(handler: TypedEventHandler<WiFiDirectServiceAdvertiser?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_AdvertisementStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun ConnectAsync(deviceInfo: DeviceInformation?):
        IAsyncOperation<WiFiDirectServiceSession?>? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectServiceSession?>>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(deviceInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiDirectServiceSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun ConnectAsync(deviceInfo: DeviceInformation?, pin: String?):
        IAsyncOperation<WiFiDirectServiceSession?>? {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectServiceSession?>>()
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, marshalToNative(deviceInfo),
          marshalToNative(pin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiDirectServiceSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun Start(): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun Stop(): Unit {
      val fnPtr = _1356357141_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1356357141_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectServiceAdvertiser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1356357141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceAdvertiser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4aa1ee19d8f4f4f93ee7ddea2e37f46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceAdvertiser(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceAdvertiser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectServiceAdvertiser {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceAdvertiser(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceAdvertiser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1356357141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceAdvertiser):
        Array<IWiFiDirectServiceAdvertiser?> = (elements as
        Array<IWiFiDirectServiceAdvertiser?>).castToImpl<IWiFiDirectServiceAdvertiser,IWiFiDirectServiceAdvertiser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceAdvertiser?> =
        arrayOfNulls<IWiFiDirectServiceAdvertiser_Impl>(size) as
        Array<IWiFiDirectServiceAdvertiser?>
  }
}
