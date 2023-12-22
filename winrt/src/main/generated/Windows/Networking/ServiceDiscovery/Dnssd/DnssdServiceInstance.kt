package Windows.Networking.ServiceDiscovery.Dnssd

import Windows.Foundation.IStringable
import Windows.Networking.HostName
import Windows.Networking.ServiceDiscovery.Dnssd.IDnssdServiceInstanceFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DnssdServiceInstance.ABI::class)
@Signature("rc(Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance;{e246db7e-98a5-4ca1-b9e4-c253d33c35ff})")
@WinRTByReference(brClass = DnssdServiceInstance.ByReference::class)
public class DnssdServiceInstance(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDnssdServiceInstance.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __1822759459_Interface: IDnssdServiceInstance.WithDefault by lazy {
    as_1822759459()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1822759459_Ptr: JNAPointer? by lazy {
    __1822759459_Interface.__1822759459_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1822759459_Interface, __328683030_Interface)

  public constructor(
    dnssdServiceInstanceName: String,
    hostName: HostName,
    port: WinDef.USHORT
  ) : this(ABI.activate(dnssdServiceInstanceName, hostName, port))

  private fun as_1822759459(): IDnssdServiceInstance.WithDefault {
    if(pointer == NULL) {
      return(IDnssdServiceInstance.ABI.makeIDnssdServiceInstance(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDnssdServiceInstance>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDnssdServiceInstance.ABI.makeIDnssdServiceInstance(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DnssdServiceInstance> {
    public override fun getValue() = DnssdServiceInstance(pointer.getPointer(0))

    public fun setValue(value: DnssdServiceInstance): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DnssdServiceInstance, MemoryAddress> {
    public val IDnssdServiceInstanceFactory_Instance: IDnssdServiceInstanceFactory by lazy {
      createIDnssdServiceInstanceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDnssdServiceInstanceFactory(): IDnssdServiceInstanceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDnssdServiceInstanceFactory.ABI.makeIDnssdServiceInstanceFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      dnssdServiceInstanceName: String,
      hostName: HostName,
      port: WinDef.USHORT
    ): JNAPointer? = IDnssdServiceInstanceFactory_Instance.Create(dnssdServiceInstanceName,
        hostName, port)?.pointer

    public override fun fromNative(segment: MemoryAddress): DnssdServiceInstance {
      val address = segment.toRawLongValue()
      return DnssdServiceInstance(Pointer(address))
    }

    public override fun toNative(obj: DnssdServiceInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
