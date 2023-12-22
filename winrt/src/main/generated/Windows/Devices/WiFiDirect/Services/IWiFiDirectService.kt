package Windows.Devices.WiFiDirect.Services

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IWiFiDirectService.ABI::class)
@Signature("{50aabbb8-5f71-45ec-84f1-a1e4fc7879a3}")
@Guid("50aabbb85f7145ec84f1a1e4fc7879a3")
@WinRTInterface("50aabbb85f7145ec84f1a1e4fc7879a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectService.ByReference::class)
public interface IWiFiDirectService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteServiceInfo(): IBuffer?

  @InterfaceMethod(1)
  public fun get_SupportedConfigurationMethods():
      IVectorView<WiFiDirectServiceConfigurationMethod?>?

  @InterfaceMethod(2)
  public fun get_PreferGroupOwnerMode(): Boolean

  @InterfaceMethod(3)
  public fun put_PreferGroupOwnerMode(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_SessionInfo(): IBuffer?

  @InterfaceMethod(5)
  public fun put_SessionInfo(value: IBuffer?): Unit

  @InterfaceMethod(6)
  public fun get_ServiceError(): WiFiDirectServiceError?

  @InterfaceMethod(7)
  public fun add_SessionDeferred(handler: TypedEventHandler<WiFiDirectService?,
      WiFiDirectServiceSessionDeferredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_SessionDeferred(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public
      fun GetProvisioningInfoAsync(selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod?):
      IAsyncOperation<WiFiDirectServiceProvisioningInfo?>?

  @InterfaceMethod(10)
  public fun ConnectAsync(): IAsyncOperation<WiFiDirectServiceSession?>?

  @InterfaceMethod(11)
  public fun ConnectAsync(pin: String?): IAsyncOperation<WiFiDirectServiceSession?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectService> {
    public override fun getValue() = ABI.makeIWiFiDirectService(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectService {
    public val __1491717984_Ptr: Pointer?

    public val _1491717984_VtblPtr: Pointer?
      get() = __1491717984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteServiceInfo(): IBuffer? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedConfigurationMethods():
        IVectorView<WiFiDirectServiceConfigurationMethod?>? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WiFiDirectServiceConfigurationMethod?>>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<WiFiDirectServiceConfigurationMethod?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PreferGroupOwnerMode(): Boolean {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_PreferGroupOwnerMode(value: Boolean): Unit {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SessionInfo(): IBuffer? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SessionInfo(value: IBuffer?): Unit {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ServiceError(): WiFiDirectServiceError? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceError>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_SessionDeferred(handler: TypedEventHandler<WiFiDirectService?,
        WiFiDirectServiceSessionDeferredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_SessionDeferred(token: EventRegistrationToken?): Unit {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun GetProvisioningInfoAsync(selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod?):
        IAsyncOperation<WiFiDirectServiceProvisioningInfo?>? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectServiceProvisioningInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, marshalToNative(selectedConfigurationMethod),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiDirectServiceProvisioningInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ConnectAsync(): IAsyncOperation<WiFiDirectServiceSession?>? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectServiceSession?>>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiDirectServiceSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun ConnectAsync(pin: String?): IAsyncOperation<WiFiDirectServiceSession?>? {
      val fnPtr = _1491717984_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiDirectServiceSession?>>()
      val hr = fn.invokeHR(arrayOf(__1491717984_Ptr, marshalToNative(pin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WiFiDirectServiceSession?>>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491717984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50aabbb85f7145ec84f1a1e4fc7879a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectService(ptr: Pointer?): WithDefault = IWiFiDirectService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectService {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectService(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491717984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectService): Array<IWiFiDirectService?> =
        (elements as
        Array<IWiFiDirectService?>).castToImpl<IWiFiDirectService,IWiFiDirectService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectService?> =
        arrayOfNulls<IWiFiDirectService_Impl>(size) as Array<IWiFiDirectService?>
  }
}
