package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnInterfaceIdFactory.ABI.IID
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

@ABIMarker(VpnInterfaceId.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnInterfaceId;{9e2ddca2-1712-4ce4-b179-8c652c6d1011})")
@WinRTByReference(brClass = VpnInterfaceId.ByReference::class)
public class VpnInterfaceId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnInterfaceId.WithDefault, IWinRTObject {
  private val __926695740_Interface: IVpnInterfaceId.WithDefault by lazy {
    as_926695740()
  }


  public override val __926695740_Ptr: JNAPointer? by lazy {
    __926695740_Interface.__926695740_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__926695740_Interface)

  public constructor(address: Array<Byte>) : this(ABI.activate(address))

  private fun as_926695740(): IVpnInterfaceId.WithDefault {
    if(pointer == NULL) {
      return(IVpnInterfaceId.ABI.makeIVpnInterfaceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnInterfaceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnInterfaceId.ABI.makeIVpnInterfaceId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VpnInterfaceId>
      {
    public override fun getValue() = VpnInterfaceId(pointer.getPointer(0))

    public fun setValue(value: VpnInterfaceId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnInterfaceId, MemoryAddress> {
    public val IVpnInterfaceIdFactory_Instance: IVpnInterfaceIdFactory by lazy {
      createIVpnInterfaceIdFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnInterfaceIdFactory(): IVpnInterfaceIdFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnInterfaceId".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnInterfaceIdFactory.ABI.makeIVpnInterfaceIdFactory(factoryActivatorPtr.value))
    }

    public fun activate(address: Array<Byte>): JNAPointer? =
        IVpnInterfaceIdFactory_Instance.CreateVpnInterfaceId(address)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnInterfaceId {
      val address = segment.toRawLongValue()
      return VpnInterfaceId(Pointer(address))
    }

    public override fun toNative(obj: VpnInterfaceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
