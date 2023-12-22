package Windows.Devices.WiFi

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Networking.Connectivity.NetworkAdapter
import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IWiFiAdapter.ABI::class)
@Signature("{a6c4e423-3d75-43a4-b9de-11e26b72d9b0}")
@Guid("a6c4e4233d7543a4b9de11e26b72d9b0")
@WinRTInterface("a6c4e4233d7543a4b9de11e26b72d9b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiAdapter.ByReference::class)
public interface IWiFiAdapter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAdapter(): NetworkAdapter?

  @InterfaceMethod(1)
  public fun ScanAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_NetworkReport(): WiFiNetworkReport?

  @InterfaceMethod(3)
  public fun add_AvailableNetworksChanged(args: TypedEventHandler<WiFiAdapter?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_AvailableNetworksChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun ConnectAsync(availableNetwork: WiFiAvailableNetwork?,
      reconnectionKind: WiFiReconnectionKind?): IAsyncOperation<WiFiConnectionResult?>?

  @InterfaceMethod(6)
  public fun ConnectAsync(
    availableNetwork: WiFiAvailableNetwork?,
    reconnectionKind: WiFiReconnectionKind?,
    passwordCredential: PasswordCredential?
  ): IAsyncOperation<WiFiConnectionResult?>?

  @InterfaceMethod(7)
  public fun ConnectAsync(
    availableNetwork: WiFiAvailableNetwork?,
    reconnectionKind: WiFiReconnectionKind?,
    passwordCredential: PasswordCredential?,
    ssid: String?
  ): IAsyncOperation<WiFiConnectionResult?>?

  @InterfaceMethod(8)
  public fun Disconnect(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWiFiAdapter> {
    public override fun getValue() = ABI.makeIWiFiAdapter(pointer.getPointer(0))

    public fun setValue(value: IWiFiAdapter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiAdapter {
    public val __810165346_Ptr: Pointer?

    public val _810165346_VtblPtr: Pointer?
      get() = __810165346_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAdapter(): NetworkAdapter? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAdapter>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ScanAsync(): IAsyncAction? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NetworkReport(): WiFiNetworkReport? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiNetworkReport>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiNetworkReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_AvailableNetworksChanged(args: TypedEventHandler<WiFiAdapter?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, marshalToNative(args), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_AvailableNetworksChanged(eventCookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _810165346_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ConnectAsync(availableNetwork: WiFiAvailableNetwork?,
        reconnectionKind: WiFiReconnectionKind?): IAsyncOperation<WiFiConnectionResult?>? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiConnectionResult?>>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, marshalToNative(availableNetwork),
          marshalToNative(reconnectionKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiConnectionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConnectAsync(
      availableNetwork: WiFiAvailableNetwork?,
      reconnectionKind: WiFiReconnectionKind?,
      passwordCredential: PasswordCredential?
    ): IAsyncOperation<WiFiConnectionResult?>? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiConnectionResult?>>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, marshalToNative(availableNetwork),
          marshalToNative(reconnectionKind), marshalToNative(passwordCredential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiConnectionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ConnectAsync(
      availableNetwork: WiFiAvailableNetwork?,
      reconnectionKind: WiFiReconnectionKind?,
      passwordCredential: PasswordCredential?,
      ssid: String?
    ): IAsyncOperation<WiFiConnectionResult?>? {
      val fnPtr = _810165346_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WiFiConnectionResult?>>()
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, marshalToNative(availableNetwork),
          marshalToNative(reconnectionKind), marshalToNative(passwordCredential),
          marshalToNative(ssid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WiFiConnectionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun Disconnect(): Unit {
      val fnPtr = _810165346_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__810165346_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiAdapter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810165346_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiAdapter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6c4e4233d7543a4b9de11e26b72d9b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiAdapter(ptr: Pointer?): WithDefault = IWiFiAdapter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiAdapter {
      val address = segment.toRawLongValue()
      return makeIWiFiAdapter(Pointer(address))
    }

    public override fun toNative(obj: IWiFiAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810165346_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiAdapter): Array<IWiFiAdapter?> = (elements as
        Array<IWiFiAdapter?>).castToImpl<IWiFiAdapter,IWiFiAdapter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiAdapter?> =
        arrayOfNulls<IWiFiAdapter_Impl>(size) as Array<IWiFiAdapter?>
  }
}
