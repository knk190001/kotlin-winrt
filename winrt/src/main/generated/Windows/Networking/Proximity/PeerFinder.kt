package Windows.Networking.Proximity

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PeerFinder.ABI::class)
@WinRTByReference(brClass = PeerFinder.ByReference::class)
public class PeerFinder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PeerFinder> {
    public override fun getValue() = PeerFinder(pointer.getPointer(0))

    public fun setValue(value: PeerFinder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PeerFinder, MemoryAddress> {
    public val IPeerFinderStatics2_Instance: IPeerFinderStatics2 by lazy {
      createIPeerFinderStatics2()
    }


    public val IPeerFinderStatics_Instance: IPeerFinderStatics by lazy {
      createIPeerFinderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPeerFinderStatics2(): IPeerFinderStatics2 {
      val refiid = Guid.REFIID(IPeerFinderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Proximity.PeerFinder".toHandle(),refiid,interfacePtr)
      val result = IPeerFinderStatics2.ABI.makeIPeerFinderStatics2(interfacePtr.value)
      return result
    }

    public fun createIPeerFinderStatics(): IPeerFinderStatics {
      val refiid = Guid.REFIID(IPeerFinderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Proximity.PeerFinder".toHandle(),refiid,interfacePtr)
      val result = IPeerFinderStatics.ABI.makeIPeerFinderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PeerFinder {
      val address = segment.toRawLongValue()
      return PeerFinder(Pointer(address))
    }

    public override fun toNative(obj: PeerFinder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Role() = ABI.IPeerFinderStatics2_Instance.get_Role()

    public fun put_Role(value: PeerRole) = ABI.IPeerFinderStatics2_Instance.put_Role(value)

    public fun get_DiscoveryData() = ABI.IPeerFinderStatics2_Instance.get_DiscoveryData()

    public fun put_DiscoveryData(value: IBuffer) =
        ABI.IPeerFinderStatics2_Instance.put_DiscoveryData(value)

    public fun CreateWatcher() = ABI.IPeerFinderStatics2_Instance.CreateWatcher()

    public fun get_AllowBluetooth() = ABI.IPeerFinderStatics_Instance.get_AllowBluetooth()

    public fun put_AllowBluetooth(value: Boolean) =
        ABI.IPeerFinderStatics_Instance.put_AllowBluetooth(value)

    public fun get_AllowInfrastructure() = ABI.IPeerFinderStatics_Instance.get_AllowInfrastructure()

    public fun put_AllowInfrastructure(value: Boolean) =
        ABI.IPeerFinderStatics_Instance.put_AllowInfrastructure(value)

    public fun get_AllowWiFiDirect() = ABI.IPeerFinderStatics_Instance.get_AllowWiFiDirect()

    public fun put_AllowWiFiDirect(value: Boolean) =
        ABI.IPeerFinderStatics_Instance.put_AllowWiFiDirect(value)

    public fun get_DisplayName() = ABI.IPeerFinderStatics_Instance.get_DisplayName()

    public fun put_DisplayName(value: String) =
        ABI.IPeerFinderStatics_Instance.put_DisplayName(value)

    public fun get_SupportedDiscoveryTypes() =
        ABI.IPeerFinderStatics_Instance.get_SupportedDiscoveryTypes()

    public fun get_AlternateIdentities() = ABI.IPeerFinderStatics_Instance.get_AlternateIdentities()

    public fun Start() = ABI.IPeerFinderStatics_Instance.Start()

    public fun Start(peerMessage: String) = ABI.IPeerFinderStatics_Instance.Start(peerMessage)

    public fun Stop() = ABI.IPeerFinderStatics_Instance.Stop()

    public fun add_TriggeredConnectionStateChanged(handler: TypedEventHandler<IUnknown?,
        TriggeredConnectionStateChangedEventArgs?>) =
        ABI.IPeerFinderStatics_Instance.add_TriggeredConnectionStateChanged(handler)

    public fun remove_TriggeredConnectionStateChanged(cookie: EventRegistrationToken) =
        ABI.IPeerFinderStatics_Instance.remove_TriggeredConnectionStateChanged(cookie)

    public fun add_ConnectionRequested(handler: TypedEventHandler<IUnknown?,
        ConnectionRequestedEventArgs?>) =
        ABI.IPeerFinderStatics_Instance.add_ConnectionRequested(handler)

    public fun remove_ConnectionRequested(cookie: EventRegistrationToken) =
        ABI.IPeerFinderStatics_Instance.remove_ConnectionRequested(cookie)

    public fun FindAllPeersAsync() = ABI.IPeerFinderStatics_Instance.FindAllPeersAsync()

    public fun ConnectAsync(peerInformation: PeerInformation) =
        ABI.IPeerFinderStatics_Instance.ConnectAsync(peerInformation)
  }
}
