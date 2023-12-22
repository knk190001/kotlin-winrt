package Windows.Networking.Connectivity

import Windows.Networking.Connectivity.IRoutePolicyFactory.ABI.IID
import Windows.Networking.DomainNameType
import Windows.Networking.HostName
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RoutePolicy.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.RoutePolicy;{11abc4ac-0fc7-42e4-8742-569923b1ca11})")
@WinRTByReference(brClass = RoutePolicy.ByReference::class)
public class RoutePolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRoutePolicy.WithDefault, IWinRTObject {
  private val __930956216_Interface: IRoutePolicy.WithDefault by lazy {
    as_930956216()
  }


  public override val __930956216_Ptr: JNAPointer? by lazy {
    __930956216_Interface.__930956216_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__930956216_Interface)

  public constructor(
    connectionProfile: ConnectionProfile,
    hostName: HostName,
    type: DomainNameType
  ) : this(ABI.activate(connectionProfile, hostName, type))

  private fun as_930956216(): IRoutePolicy.WithDefault {
    if(pointer == NULL) {
      return(IRoutePolicy.ABI.makeIRoutePolicy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRoutePolicy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRoutePolicy.ABI.makeIRoutePolicy(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RoutePolicy> {
    public override fun getValue() = RoutePolicy(pointer.getPointer(0))

    public fun setValue(value: RoutePolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RoutePolicy, MemoryAddress> {
    public val IRoutePolicyFactory_Instance: IRoutePolicyFactory by lazy {
      createIRoutePolicyFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRoutePolicyFactory(): IRoutePolicyFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.RoutePolicy".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRoutePolicyFactory.ABI.makeIRoutePolicyFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      connectionProfile: ConnectionProfile,
      hostName: HostName,
      type: DomainNameType
    ): JNAPointer? = IRoutePolicyFactory_Instance.CreateRoutePolicy(connectionProfile, hostName,
        type)?.pointer

    public override fun fromNative(segment: MemoryAddress): RoutePolicy {
      val address = segment.toRawLongValue()
      return RoutePolicy(Pointer(address))
    }

    public override fun toNative(obj: RoutePolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
