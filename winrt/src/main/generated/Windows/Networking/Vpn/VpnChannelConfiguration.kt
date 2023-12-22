package Windows.Networking.Vpn

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

@ABIMarker(VpnChannelConfiguration.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnChannelConfiguration;{0e2ddca2-2012-4fe4-b179-8c652c6d107e})")
@WinRTByReference(brClass = VpnChannelConfiguration.ByReference::class)
public class VpnChannelConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnChannelConfiguration.WithDefault, IVpnChannelConfiguration2.WithDefault,
    IWinRTObject {
  private val __1001837603_Interface: IVpnChannelConfiguration.WithDefault by lazy {
    as_1001837603()
  }


  private val __992194671_Interface: IVpnChannelConfiguration2.WithDefault by lazy {
    as_992194671()
  }


  public override val __1001837603_Ptr: JNAPointer? by lazy {
    __1001837603_Interface.__1001837603_Ptr
  }


  public override val __992194671_Ptr: JNAPointer? by lazy {
    __992194671_Interface.__992194671_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1001837603_Interface, __992194671_Interface)

  private fun as_1001837603(): IVpnChannelConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannelConfiguration.ABI.makeIVpnChannelConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannelConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannelConfiguration.ABI.makeIVpnChannelConfiguration(ref.value))
  }

  private fun as_992194671(): IVpnChannelConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannelConfiguration2.ABI.makeIVpnChannelConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannelConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannelConfiguration2.ABI.makeIVpnChannelConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnChannelConfiguration> {
    public override fun getValue() = VpnChannelConfiguration(pointer.getPointer(0))

    public fun setValue(value: VpnChannelConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnChannelConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnChannelConfiguration {
      val address = segment.toRawLongValue()
      return VpnChannelConfiguration(Pointer(address))
    }

    public override fun toNative(obj: VpnChannelConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
