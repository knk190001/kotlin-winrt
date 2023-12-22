package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
import Windows.Networking.EndpointPair
import Windows.Networking.HostNameSortOptions
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NetworkInformation.ABI::class)
@WinRTByReference(brClass = NetworkInformation.ByReference::class)
public class NetworkInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkInformation> {
    public override fun getValue() = NetworkInformation(pointer.getPointer(0))

    public fun setValue(value: NetworkInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkInformation, MemoryAddress> {
    public val INetworkInformationStatics2_Instance: INetworkInformationStatics2 by lazy {
      createINetworkInformationStatics2()
    }


    public val INetworkInformationStatics_Instance: INetworkInformationStatics by lazy {
      createINetworkInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINetworkInformationStatics2(): INetworkInformationStatics2 {
      val refiid = Guid.REFIID(INetworkInformationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.NetworkInformation".toHandle(),refiid,interfacePtr)
      val result =
          INetworkInformationStatics2.ABI.makeINetworkInformationStatics2(interfacePtr.value)
      return result
    }

    public fun createINetworkInformationStatics(): INetworkInformationStatics {
      val refiid = Guid.REFIID(INetworkInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.NetworkInformation".toHandle(),refiid,interfacePtr)
      val result = INetworkInformationStatics.ABI.makeINetworkInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NetworkInformation {
      val address = segment.toRawLongValue()
      return NetworkInformation(Pointer(address))
    }

    public override fun toNative(obj: NetworkInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindConnectionProfilesAsync(pProfileFilter: ConnectionProfileFilter) =
        ABI.INetworkInformationStatics2_Instance.FindConnectionProfilesAsync(pProfileFilter)

    public fun GetConnectionProfiles() =
        ABI.INetworkInformationStatics_Instance.GetConnectionProfiles()

    public fun GetInternetConnectionProfile() =
        ABI.INetworkInformationStatics_Instance.GetInternetConnectionProfile()

    public fun GetLanIdentifiers() = ABI.INetworkInformationStatics_Instance.GetLanIdentifiers()

    public fun GetHostNames() = ABI.INetworkInformationStatics_Instance.GetHostNames()

    public fun GetProxyConfigurationAsync(uri: Uri) =
        ABI.INetworkInformationStatics_Instance.GetProxyConfigurationAsync(uri)

    public fun GetSortedEndpointPairs(destinationList: IIterable<EndpointPair?>,
        sortOptions: HostNameSortOptions) =
        ABI.INetworkInformationStatics_Instance.GetSortedEndpointPairs(destinationList, sortOptions)

    public fun add_NetworkStatusChanged(networkStatusHandler: NetworkStatusChangedEventHandler) =
        ABI.INetworkInformationStatics_Instance.add_NetworkStatusChanged(networkStatusHandler)

    public fun remove_NetworkStatusChanged(eventCookie: EventRegistrationToken) =
        ABI.INetworkInformationStatics_Instance.remove_NetworkStatusChanged(eventCookie)
  }
}
