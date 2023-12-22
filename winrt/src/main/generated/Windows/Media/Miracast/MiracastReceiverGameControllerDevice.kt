package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverGameControllerDevice.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverGameControllerDevice;{2d7171e8-bed4-5118-a058-e2477eb5888d})")
@WinRTByReference(brClass = MiracastReceiverGameControllerDevice.ByReference::class)
public class MiracastReceiverGameControllerDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverGameControllerDevice.WithDefault, IWinRTObject {
  private val __1939210201_Interface: IMiracastReceiverGameControllerDevice.WithDefault by lazy {
    as_1939210201()
  }


  public override val __1939210201_Ptr: JNAPointer? by lazy {
    __1939210201_Interface.__1939210201_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939210201_Interface)

  private fun as_1939210201(): IMiracastReceiverGameControllerDevice.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverGameControllerDevice.ABI.makeIMiracastReceiverGameControllerDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverGameControllerDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverGameControllerDevice.ABI.makeIMiracastReceiverGameControllerDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverGameControllerDevice> {
    public override fun getValue() = MiracastReceiverGameControllerDevice(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverGameControllerDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverGameControllerDevice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverGameControllerDevice {
      val address = segment.toRawLongValue()
      return MiracastReceiverGameControllerDevice(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverGameControllerDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
