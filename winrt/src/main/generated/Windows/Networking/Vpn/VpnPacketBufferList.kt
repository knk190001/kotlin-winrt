package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(VpnPacketBufferList.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnPacketBufferList;{c2f891fc-4d5c-4a63-b70d-4e307eacce77})")
@WinRTByReference(brClass = VpnPacketBufferList.ByReference::class)
public class VpnPacketBufferList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnPacketBufferList.WithDefault, IIterable<VpnPacketBuffer?>, IWinRTObject {
  private val __117039338_Interface: IVpnPacketBufferList.WithDefault by lazy {
    as_117039338()
  }


  private val __1449643190_Interface: IIterable<VpnPacketBuffer?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<VpnPacketBuffer?>>()

  public override val __117039338_Ptr: JNAPointer? by lazy {
    __117039338_Interface.__117039338_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__117039338_Interface, __1449643190_Interface)

  private fun as_117039338(): IVpnPacketBufferList.WithDefault {
    if(pointer == NULL) {
      return(IVpnPacketBufferList.ABI.makeIVpnPacketBufferList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPacketBufferList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPacketBufferList.ABI.makeIVpnPacketBufferList(ref.value))
  }

  private fun as_1449643190(): IIterable<VpnPacketBuffer?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<VpnPacketBuffer?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<VpnPacketBuffer?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<VpnPacketBuffer?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnPacketBufferList> {
    public override fun getValue() = VpnPacketBufferList(pointer.getPointer(0))

    public fun setValue(value: VpnPacketBufferList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnPacketBufferList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnPacketBufferList {
      val address = segment.toRawLongValue()
      return VpnPacketBufferList(Pointer(address))
    }

    public override fun toNative(obj: VpnPacketBufferList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
