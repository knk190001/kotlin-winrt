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

@ABIMarker(MiracastReceiverKeyboardDevice.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverKeyboardDevice;{beb67272-06c0-54ff-ac96-217464ff2501})")
@WinRTByReference(brClass = MiracastReceiverKeyboardDevice.ByReference::class)
public class MiracastReceiverKeyboardDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverKeyboardDevice.WithDefault, IWinRTObject {
  private val __166707616_Interface: IMiracastReceiverKeyboardDevice.WithDefault by lazy {
    as_166707616()
  }


  public override val __166707616_Ptr: JNAPointer? by lazy {
    __166707616_Interface.__166707616_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__166707616_Interface)

  private fun as_166707616(): IMiracastReceiverKeyboardDevice.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverKeyboardDevice.ABI.makeIMiracastReceiverKeyboardDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverKeyboardDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverKeyboardDevice.ABI.makeIMiracastReceiverKeyboardDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverKeyboardDevice> {
    public override fun getValue() = MiracastReceiverKeyboardDevice(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverKeyboardDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverKeyboardDevice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverKeyboardDevice {
      val address = segment.toRawLongValue()
      return MiracastReceiverKeyboardDevice(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverKeyboardDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
