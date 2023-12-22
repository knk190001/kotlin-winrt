package Windows.Networking.NetworkOperators

import Windows.Networking.Connectivity.ConnectionProfile
import Windows.Networking.Connectivity.NetworkAdapter
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NetworkOperatorTetheringManager.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager;{d45a8da0-0e86-4d98-8ba4-dd70d4b764d3})")
@WinRTByReference(brClass = NetworkOperatorTetheringManager.ByReference::class)
public class NetworkOperatorTetheringManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorTetheringManager.WithDefault,
    INetworkOperatorTetheringClientManager.WithDefault, IWinRTObject {
  private val __853466378_Interface: INetworkOperatorTetheringManager.WithDefault by lazy {
    as_853466378()
  }


  private val __809148907_Interface: INetworkOperatorTetheringClientManager.WithDefault by lazy {
    as_809148907()
  }


  public override val __853466378_Ptr: JNAPointer? by lazy {
    __853466378_Interface.__853466378_Ptr
  }


  public override val __809148907_Ptr: JNAPointer? by lazy {
    __809148907_Interface.__809148907_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__853466378_Interface, __809148907_Interface)

  private fun as_853466378(): INetworkOperatorTetheringManager.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringManager.ABI.makeINetworkOperatorTetheringManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringManager.ABI.makeINetworkOperatorTetheringManager(ref.value))
  }

  private fun as_809148907(): INetworkOperatorTetheringClientManager.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringClientManager.ABI.makeINetworkOperatorTetheringClientManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringClientManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringClientManager.ABI.makeINetworkOperatorTetheringClientManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorTetheringManager> {
    public override fun getValue() = NetworkOperatorTetheringManager(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorTetheringManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorTetheringManager, MemoryAddress> {
    public val INetworkOperatorTetheringManagerStatics2_Instance:
        INetworkOperatorTetheringManagerStatics2 by lazy {
      createINetworkOperatorTetheringManagerStatics2()
    }


    public val INetworkOperatorTetheringManagerStatics3_Instance:
        INetworkOperatorTetheringManagerStatics3 by lazy {
      createINetworkOperatorTetheringManagerStatics3()
    }


    public val INetworkOperatorTetheringManagerStatics4_Instance:
        INetworkOperatorTetheringManagerStatics4 by lazy {
      createINetworkOperatorTetheringManagerStatics4()
    }


    public val INetworkOperatorTetheringManagerStatics_Instance:
        INetworkOperatorTetheringManagerStatics by lazy {
      createINetworkOperatorTetheringManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINetworkOperatorTetheringManagerStatics2():
        INetworkOperatorTetheringManagerStatics2 {
      val refiid = Guid.REFIID(INetworkOperatorTetheringManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager".toHandle(),refiid,interfacePtr)
      val result =
          INetworkOperatorTetheringManagerStatics2.ABI.makeINetworkOperatorTetheringManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createINetworkOperatorTetheringManagerStatics3():
        INetworkOperatorTetheringManagerStatics3 {
      val refiid = Guid.REFIID(INetworkOperatorTetheringManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager".toHandle(),refiid,interfacePtr)
      val result =
          INetworkOperatorTetheringManagerStatics3.ABI.makeINetworkOperatorTetheringManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createINetworkOperatorTetheringManagerStatics4():
        INetworkOperatorTetheringManagerStatics4 {
      val refiid = Guid.REFIID(INetworkOperatorTetheringManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager".toHandle(),refiid,interfacePtr)
      val result =
          INetworkOperatorTetheringManagerStatics4.ABI.makeINetworkOperatorTetheringManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createINetworkOperatorTetheringManagerStatics():
        INetworkOperatorTetheringManagerStatics {
      val refiid = Guid.REFIID(INetworkOperatorTetheringManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager".toHandle(),refiid,interfacePtr)
      val result =
          INetworkOperatorTetheringManagerStatics.ABI.makeINetworkOperatorTetheringManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NetworkOperatorTetheringManager {
      val address = segment.toRawLongValue()
      return NetworkOperatorTetheringManager(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorTetheringManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetTetheringCapabilityFromConnectionProfile(profile: ConnectionProfile) =
        ABI.INetworkOperatorTetheringManagerStatics2_Instance.GetTetheringCapabilityFromConnectionProfile(profile)

    public fun CreateFromConnectionProfile(profile: ConnectionProfile) =
        ABI.INetworkOperatorTetheringManagerStatics2_Instance.CreateFromConnectionProfile(profile)

    public fun CreateFromConnectionProfile(profile: ConnectionProfile, adapter: NetworkAdapter) =
        ABI.INetworkOperatorTetheringManagerStatics3_Instance.CreateFromConnectionProfile(profile,
        adapter)

    public fun IsNoConnectionsTimeoutEnabled() =
        ABI.INetworkOperatorTetheringManagerStatics4_Instance.IsNoConnectionsTimeoutEnabled()

    public fun EnableNoConnectionsTimeout() =
        ABI.INetworkOperatorTetheringManagerStatics4_Instance.EnableNoConnectionsTimeout()

    public fun EnableNoConnectionsTimeoutAsync() =
        ABI.INetworkOperatorTetheringManagerStatics4_Instance.EnableNoConnectionsTimeoutAsync()

    public fun DisableNoConnectionsTimeout() =
        ABI.INetworkOperatorTetheringManagerStatics4_Instance.DisableNoConnectionsTimeout()

    public fun DisableNoConnectionsTimeoutAsync() =
        ABI.INetworkOperatorTetheringManagerStatics4_Instance.DisableNoConnectionsTimeoutAsync()

    public fun GetTetheringCapability(networkAccountId: String) =
        ABI.INetworkOperatorTetheringManagerStatics_Instance.GetTetheringCapability(networkAccountId)

    public fun CreateFromNetworkAccountId(networkAccountId: String) =
        ABI.INetworkOperatorTetheringManagerStatics_Instance.CreateFromNetworkAccountId(networkAccountId)
  }
}
