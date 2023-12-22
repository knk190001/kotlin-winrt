package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnTrafficFilterFactory.ABI.IID
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

@ABIMarker(VpnTrafficFilter.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnTrafficFilter;{2f691b60-6c9f-47f5-ac36-bb1b042e2c50})")
@WinRTByReference(brClass = VpnTrafficFilter.ByReference::class)
public class VpnTrafficFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnTrafficFilter.WithDefault, IWinRTObject {
  private val __1770911333_Interface: IVpnTrafficFilter.WithDefault by lazy {
    as_1770911333()
  }


  public override val __1770911333_Ptr: JNAPointer? by lazy {
    __1770911333_Interface.__1770911333_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1770911333_Interface)

  public constructor(appId: VpnAppId) : this(ABI.activate(appId))

  private fun as_1770911333(): IVpnTrafficFilter.WithDefault {
    if(pointer == NULL) {
      return(IVpnTrafficFilter.ABI.makeIVpnTrafficFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnTrafficFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnTrafficFilter.ABI.makeIVpnTrafficFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnTrafficFilter> {
    public override fun getValue() = VpnTrafficFilter(pointer.getPointer(0))

    public fun setValue(value: VpnTrafficFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnTrafficFilter, MemoryAddress> {
    public val IVpnTrafficFilterFactory_Instance: IVpnTrafficFilterFactory by lazy {
      createIVpnTrafficFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnTrafficFilterFactory(): IVpnTrafficFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnTrafficFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnTrafficFilterFactory.ABI.makeIVpnTrafficFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(appId: VpnAppId): JNAPointer? =
        IVpnTrafficFilterFactory_Instance.Create(appId)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnTrafficFilter {
      val address = segment.toRawLongValue()
      return VpnTrafficFilter(Pointer(address))
    }

    public override fun toNative(obj: VpnTrafficFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
