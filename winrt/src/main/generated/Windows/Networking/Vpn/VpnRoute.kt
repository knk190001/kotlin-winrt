package Windows.Networking.Vpn

import Windows.Networking.HostName
import Windows.Networking.Vpn.IVpnRouteFactory.ABI.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VpnRoute.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnRoute;{b5731b83-0969-4699-938e-7776db29cfb3})")
@WinRTByReference(brClass = VpnRoute.ByReference::class)
public class VpnRoute(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnRoute.WithDefault, IWinRTObject {
  private val __1328770855_Interface: IVpnRoute.WithDefault by lazy {
    as_1328770855()
  }


  public override val __1328770855_Ptr: JNAPointer? by lazy {
    __1328770855_Interface.__1328770855_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1328770855_Interface)

  public constructor(address: HostName, prefixSize: Byte) : this(ABI.activate(address, prefixSize))

  private fun as_1328770855(): IVpnRoute.WithDefault {
    if(pointer == NULL) {
      return(IVpnRoute.ABI.makeIVpnRoute(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnRoute>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnRoute.ABI.makeIVpnRoute(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VpnRoute> {
    public override fun getValue() = VpnRoute(pointer.getPointer(0))

    public fun setValue(value: VpnRoute): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnRoute, MemoryAddress> {
    public val IVpnRouteFactory_Instance: IVpnRouteFactory by lazy {
      createIVpnRouteFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnRouteFactory(): IVpnRouteFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnRoute".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnRouteFactory.ABI.makeIVpnRouteFactory(factoryActivatorPtr.value))
    }

    public fun activate(address: HostName, prefixSize: Byte): JNAPointer? =
        IVpnRouteFactory_Instance.CreateVpnRoute(address, prefixSize)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnRoute {
      val address = segment.toRawLongValue()
      return VpnRoute(Pointer(address))
    }

    public override fun toNative(obj: VpnRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
