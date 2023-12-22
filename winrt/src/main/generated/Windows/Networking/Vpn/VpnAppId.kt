package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnAppIdFactory.ABI.IID
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

@ABIMarker(VpnAppId.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnAppId;{7b06a635-5c58-41d9-94a7-bfbcf1d8ca54})")
@WinRTByReference(brClass = VpnAppId.ByReference::class)
public class VpnAppId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnAppId.WithDefault, IWinRTObject {
  private val __1344447060_Interface: IVpnAppId.WithDefault by lazy {
    as_1344447060()
  }


  public override val __1344447060_Ptr: JNAPointer? by lazy {
    __1344447060_Interface.__1344447060_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1344447060_Interface)

  public constructor(type: VpnAppIdType, value: String) : this(ABI.activate(type, value))

  private fun as_1344447060(): IVpnAppId.WithDefault {
    if(pointer == NULL) {
      return(IVpnAppId.ABI.makeIVpnAppId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnAppId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnAppId.ABI.makeIVpnAppId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VpnAppId> {
    public override fun getValue() = VpnAppId(pointer.getPointer(0))

    public fun setValue(value: VpnAppId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnAppId, MemoryAddress> {
    public val IVpnAppIdFactory_Instance: IVpnAppIdFactory by lazy {
      createIVpnAppIdFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnAppIdFactory(): IVpnAppIdFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnAppId".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnAppIdFactory.ABI.makeIVpnAppIdFactory(factoryActivatorPtr.value))
    }

    public fun activate(type: VpnAppIdType, value: String): JNAPointer? =
        IVpnAppIdFactory_Instance.Create(type, value)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnAppId {
      val address = segment.toRawLongValue()
      return VpnAppId(Pointer(address))
    }

    public override fun toNative(obj: VpnAppId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
