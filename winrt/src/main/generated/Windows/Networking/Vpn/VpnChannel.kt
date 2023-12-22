package Windows.Networking.Vpn

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(VpnChannel.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnChannel;{4ac78d07-d1a8-4303-a091-c8d2e0915bc3})")
@WinRTByReference(brClass = VpnChannel.ByReference::class)
public class VpnChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnChannel.WithDefault, IVpnChannel2.WithDefault, IVpnChannel4.WithDefault,
    IVpnChannel5.WithDefault, IVpnChannel6.WithDefault, IWinRTObject {
  private val __1990199405_Interface: IVpnChannel.WithDefault by lazy {
    as_1990199405()
  }


  private val __1566639361_Interface: IVpnChannel2.WithDefault by lazy {
    as_1566639361()
  }


  private val __1566639359_Interface: IVpnChannel4.WithDefault by lazy {
    as_1566639359()
  }


  private val __1566639358_Interface: IVpnChannel5.WithDefault by lazy {
    as_1566639358()
  }


  private val __1566639357_Interface: IVpnChannel6.WithDefault by lazy {
    as_1566639357()
  }


  public override val __1990199405_Ptr: JNAPointer? by lazy {
    __1990199405_Interface.__1990199405_Ptr
  }


  public override val __1566639361_Ptr: JNAPointer? by lazy {
    __1566639361_Interface.__1566639361_Ptr
  }


  public override val __1566639359_Ptr: JNAPointer? by lazy {
    __1566639359_Interface.__1566639359_Ptr
  }


  public override val __1566639358_Ptr: JNAPointer? by lazy {
    __1566639358_Interface.__1566639358_Ptr
  }


  public override val __1566639357_Ptr: JNAPointer? by lazy {
    __1566639357_Interface.__1566639357_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1990199405_Interface, __1566639361_Interface, __1566639359_Interface,
        __1566639358_Interface, __1566639357_Interface)

  private fun as_1990199405(): IVpnChannel.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannel.ABI.makeIVpnChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannel.ABI.makeIVpnChannel(ref.value))
  }

  private fun as_1566639361(): IVpnChannel2.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannel2.ABI.makeIVpnChannel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannel2.ABI.makeIVpnChannel2(ref.value))
  }

  private fun as_1566639359(): IVpnChannel4.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannel4.ABI.makeIVpnChannel4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannel4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannel4.ABI.makeIVpnChannel4(ref.value))
  }

  private fun as_1566639358(): IVpnChannel5.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannel5.ABI.makeIVpnChannel5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannel5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannel5.ABI.makeIVpnChannel5(ref.value))
  }

  private fun as_1566639357(): IVpnChannel6.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannel6.ABI.makeIVpnChannel6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannel6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannel6.ABI.makeIVpnChannel6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VpnChannel> {
    public override fun getValue() = VpnChannel(pointer.getPointer(0))

    public fun setValue(value: VpnChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnChannel, MemoryAddress> {
    public val IVpnChannelStatics_Instance: IVpnChannelStatics by lazy {
      createIVpnChannelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnChannelStatics(): IVpnChannelStatics {
      val refiid = Guid.REFIID(IVpnChannelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnChannel".toHandle(),refiid,interfacePtr)
      val result = IVpnChannelStatics.ABI.makeIVpnChannelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VpnChannel {
      val address = segment.toRawLongValue()
      return VpnChannel(Pointer(address))
    }

    public override fun toNative(obj: VpnChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ProcessEventAsync(thirdPartyPlugIn: IUnknown, event: IUnknown) =
        ABI.IVpnChannelStatics_Instance.ProcessEventAsync(thirdPartyPlugIn, event)
  }
}
