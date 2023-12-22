package Windows.Devices.Bluetooth.Background

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

@ABIMarker(RfcommInboundConnectionInformation.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation;{6d3e75a8-5429-4059-92e3-1e8b65528707})")
@WinRTByReference(brClass = RfcommInboundConnectionInformation.ByReference::class)
public class RfcommInboundConnectionInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommInboundConnectionInformation.WithDefault, IWinRTObject {
  private val __1898054188_Interface: IRfcommInboundConnectionInformation.WithDefault by lazy {
    as_1898054188()
  }


  public override val __1898054188_Ptr: JNAPointer? by lazy {
    __1898054188_Interface.__1898054188_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1898054188_Interface)

  private fun as_1898054188(): IRfcommInboundConnectionInformation.WithDefault {
    if(pointer == NULL) {
      return(IRfcommInboundConnectionInformation.ABI.makeIRfcommInboundConnectionInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommInboundConnectionInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommInboundConnectionInformation.ABI.makeIRfcommInboundConnectionInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommInboundConnectionInformation> {
    public override fun getValue() = RfcommInboundConnectionInformation(pointer.getPointer(0))

    public fun setValue(value: RfcommInboundConnectionInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommInboundConnectionInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RfcommInboundConnectionInformation {
      val address = segment.toRawLongValue()
      return RfcommInboundConnectionInformation(Pointer(address))
    }

    public override fun toNative(obj: RfcommInboundConnectionInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
