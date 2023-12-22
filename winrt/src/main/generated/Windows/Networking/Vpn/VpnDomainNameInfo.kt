package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
import Windows.Networking.HostName
import Windows.Networking.Vpn.IVpnDomainNameInfoFactory.ABI.IID
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

@ABIMarker(VpnDomainNameInfo.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnDomainNameInfo;{ad2eb82f-ea8e-4f7a-843e-1a87e32e1b9a})")
@WinRTByReference(brClass = VpnDomainNameInfo.ByReference::class)
public class VpnDomainNameInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnDomainNameInfo.WithDefault, IVpnDomainNameInfo2.WithDefault, IWinRTObject
    {
  private val __705089069_Interface: IVpnDomainNameInfo.WithDefault by lazy {
    as_705089069()
  }


  private val __382924709_Interface: IVpnDomainNameInfo2.WithDefault by lazy {
    as_382924709()
  }


  public override val __705089069_Ptr: JNAPointer? by lazy {
    __705089069_Interface.__705089069_Ptr
  }


  public override val __382924709_Ptr: JNAPointer? by lazy {
    __382924709_Interface.__382924709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__705089069_Interface, __382924709_Interface)

  public constructor(
    name: String,
    nameType: VpnDomainNameType,
    dnsServerList: IIterable<HostName?>,
    proxyServerList: IIterable<HostName?>
  ) : this(ABI.activate(name, nameType, dnsServerList, proxyServerList))

  private fun as_705089069(): IVpnDomainNameInfo.WithDefault {
    if(pointer == NULL) {
      return(IVpnDomainNameInfo.ABI.makeIVpnDomainNameInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnDomainNameInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnDomainNameInfo.ABI.makeIVpnDomainNameInfo(ref.value))
  }

  private fun as_382924709(): IVpnDomainNameInfo2.WithDefault {
    if(pointer == NULL) {
      return(IVpnDomainNameInfo2.ABI.makeIVpnDomainNameInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnDomainNameInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnDomainNameInfo2.ABI.makeIVpnDomainNameInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnDomainNameInfo> {
    public override fun getValue() = VpnDomainNameInfo(pointer.getPointer(0))

    public fun setValue(value: VpnDomainNameInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnDomainNameInfo, MemoryAddress> {
    public val IVpnDomainNameInfoFactory_Instance: IVpnDomainNameInfoFactory by lazy {
      createIVpnDomainNameInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnDomainNameInfoFactory(): IVpnDomainNameInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnDomainNameInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnDomainNameInfoFactory.ABI.makeIVpnDomainNameInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      name: String,
      nameType: VpnDomainNameType,
      dnsServerList: IIterable<HostName?>,
      proxyServerList: IIterable<HostName?>
    ): JNAPointer? = IVpnDomainNameInfoFactory_Instance.CreateVpnDomainNameInfo(name, nameType,
        dnsServerList, proxyServerList)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnDomainNameInfo {
      val address = segment.toRawLongValue()
      return VpnDomainNameInfo(Pointer(address))
    }

    public override fun toNative(obj: VpnDomainNameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
