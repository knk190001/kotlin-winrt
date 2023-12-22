package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Networking.HostName
import Windows.Networking.Vpn.IVpnNamespaceInfoFactory.ABI.IID
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

@ABIMarker(VpnNamespaceInfo.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnNamespaceInfo;{30edfb43-444f-44c5-8167-a35a91f1af94})")
@WinRTByReference(brClass = VpnNamespaceInfo.ByReference::class)
public class VpnNamespaceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnNamespaceInfo.WithDefault, IWinRTObject {
  private val __2083018553_Interface: IVpnNamespaceInfo.WithDefault by lazy {
    as_2083018553()
  }


  public override val __2083018553_Ptr: JNAPointer? by lazy {
    __2083018553_Interface.__2083018553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2083018553_Interface)

  public constructor(
    name: String,
    dnsServerList: IVector<HostName?>,
    proxyServerList: IVector<HostName?>
  ) : this(ABI.activate(name, dnsServerList, proxyServerList))

  private fun as_2083018553(): IVpnNamespaceInfo.WithDefault {
    if(pointer == NULL) {
      return(IVpnNamespaceInfo.ABI.makeIVpnNamespaceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnNamespaceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnNamespaceInfo.ABI.makeIVpnNamespaceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnNamespaceInfo> {
    public override fun getValue() = VpnNamespaceInfo(pointer.getPointer(0))

    public fun setValue(value: VpnNamespaceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnNamespaceInfo, MemoryAddress> {
    public val IVpnNamespaceInfoFactory_Instance: IVpnNamespaceInfoFactory by lazy {
      createIVpnNamespaceInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnNamespaceInfoFactory(): IVpnNamespaceInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnNamespaceInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnNamespaceInfoFactory.ABI.makeIVpnNamespaceInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      name: String,
      dnsServerList: IVector<HostName?>,
      proxyServerList: IVector<HostName?>
    ): JNAPointer? = IVpnNamespaceInfoFactory_Instance.CreateVpnNamespaceInfo(name, dnsServerList,
        proxyServerList)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnNamespaceInfo {
      val address = segment.toRawLongValue()
      return VpnNamespaceInfo(Pointer(address))
    }

    public override fun toNative(obj: VpnNamespaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
