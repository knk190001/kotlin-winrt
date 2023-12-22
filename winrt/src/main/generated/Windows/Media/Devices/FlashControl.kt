package Windows.Media.Devices

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

@ABIMarker(FlashControl.ABI::class)
@Signature("rc(Windows.Media.Devices.FlashControl;{def41dbe-7d68-45e3-8c0f-be7bb32837d0})")
@WinRTByReference(brClass = FlashControl.ByReference::class)
public class FlashControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFlashControl.WithDefault, IFlashControl2.WithDefault, IWinRTObject {
  private val __1192543982_Interface: IFlashControl.WithDefault by lazy {
    as_1192543982()
  }


  private val __1685842172_Interface: IFlashControl2.WithDefault by lazy {
    as_1685842172()
  }


  public override val __1192543982_Ptr: JNAPointer? by lazy {
    __1192543982_Interface.__1192543982_Ptr
  }


  public override val __1685842172_Ptr: JNAPointer? by lazy {
    __1685842172_Interface.__1685842172_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1192543982_Interface, __1685842172_Interface)

  private fun as_1192543982(): IFlashControl.WithDefault {
    if(pointer == NULL) {
      return(IFlashControl.ABI.makeIFlashControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlashControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlashControl.ABI.makeIFlashControl(ref.value))
  }

  private fun as_1685842172(): IFlashControl2.WithDefault {
    if(pointer == NULL) {
      return(IFlashControl2.ABI.makeIFlashControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlashControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlashControl2.ABI.makeIFlashControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlashControl> {
    public override fun getValue() = FlashControl(pointer.getPointer(0))

    public fun setValue(value: FlashControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlashControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FlashControl {
      val address = segment.toRawLongValue()
      return FlashControl(Pointer(address))
    }

    public override fun toNative(obj: FlashControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
