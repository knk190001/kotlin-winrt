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

@ABIMarker(InfraredTorchControl.ABI::class)
@Signature("rc(Windows.Media.Devices.InfraredTorchControl;{1cba2c83-6cb6-5a04-a6fc-3be7b33ff056})")
@WinRTByReference(brClass = InfraredTorchControl.ByReference::class)
public class InfraredTorchControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInfraredTorchControl.WithDefault, IWinRTObject {
  private val __2106131517_Interface: IInfraredTorchControl.WithDefault by lazy {
    as_2106131517()
  }


  public override val __2106131517_Ptr: JNAPointer? by lazy {
    __2106131517_Interface.__2106131517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2106131517_Interface)

  private fun as_2106131517(): IInfraredTorchControl.WithDefault {
    if(pointer == NULL) {
      return(IInfraredTorchControl.ABI.makeIInfraredTorchControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfraredTorchControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfraredTorchControl.ABI.makeIInfraredTorchControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InfraredTorchControl> {
    public override fun getValue() = InfraredTorchControl(pointer.getPointer(0))

    public fun setValue(value: InfraredTorchControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfraredTorchControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InfraredTorchControl {
      val address = segment.toRawLongValue()
      return InfraredTorchControl(Pointer(address))
    }

    public override fun toNative(obj: InfraredTorchControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
