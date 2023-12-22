package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Networking.EndpointPair
import Windows.Networking.HostName
import Windows.Networking.HostNameSortOptions
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

@ABIMarker(INetworkInformationStatics.ABI::class)
@Signature("{5074f851-950d-4165-9c15-365619481eea}")
@Guid("5074f851950d41659c15365619481eea")
@WinRTInterface("5074f851950d41659c15365619481eea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkInformationStatics.ByReference::class)
public interface INetworkInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConnectionProfiles(): IVectorView<ConnectionProfile?>?

  @InterfaceMethod(1)
  public fun GetInternetConnectionProfile(): ConnectionProfile?

  @InterfaceMethod(2)
  public fun GetLanIdentifiers(): IVectorView<LanIdentifier?>?

  @InterfaceMethod(3)
  public fun GetHostNames(): IVectorView<HostName?>?

  @InterfaceMethod(4)
  public fun GetProxyConfigurationAsync(uri: Uri?): IAsyncOperation<ProxyConfiguration?>?

  @InterfaceMethod(5)
  public fun GetSortedEndpointPairs(destinationList: IIterable<EndpointPair?>?,
      sortOptions: HostNameSortOptions?): IVectorView<EndpointPair?>?

  @InterfaceMethod(6)
  public fun add_NetworkStatusChanged(networkStatusHandler: NetworkStatusChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_NetworkStatusChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkInformationStatics> {
    public override fun getValue() = ABI.makeINetworkInformationStatics(pointer.getPointer(0))

    public fun setValue(value: INetworkInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkInformationStatics {
    public val __1320143900_Ptr: Pointer?

    public val _1320143900_VtblPtr: Pointer?
      get() = __1320143900_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConnectionProfiles(): IVectorView<ConnectionProfile?>? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ConnectionProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ConnectionProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetInternetConnectionProfile(): ConnectionProfile? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectionProfile>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectionProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetLanIdentifiers(): IVectorView<LanIdentifier?>? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LanIdentifier?>>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LanIdentifier?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetHostNames(): IVectorView<HostName?>? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HostName?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetProxyConfigurationAsync(uri: Uri?):
        IAsyncOperation<ProxyConfiguration?>? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProxyConfiguration?>>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ProxyConfiguration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetSortedEndpointPairs(destinationList: IIterable<EndpointPair?>?,
        sortOptions: HostNameSortOptions?): IVectorView<EndpointPair?>? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EndpointPair?>>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr, marshalToNative(destinationList),
          marshalToNative(sortOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EndpointPair?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun add_NetworkStatusChanged(networkStatusHandler: NetworkStatusChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr, marshalToNative(networkStatusHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_NetworkStatusChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1320143900_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1320143900_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INetworkInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1320143900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5074f851950d41659c15365619481eea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkInformationStatics(ptr: Pointer?): WithDefault =
        INetworkInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkInformationStatics {
      val address = segment.toRawLongValue()
      return makeINetworkInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: INetworkInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1320143900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkInformationStatics):
        Array<INetworkInformationStatics?> = (elements as
        Array<INetworkInformationStatics?>).castToImpl<INetworkInformationStatics,INetworkInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkInformationStatics?> =
        arrayOfNulls<INetworkInformationStatics_Impl>(size) as Array<INetworkInformationStatics?>
  }
}
