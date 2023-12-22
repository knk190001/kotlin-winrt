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

@ABIMarker(PanelBasedOptimizationControl.ABI::class)
@Signature("rc(Windows.Media.Devices.PanelBasedOptimizationControl;{33323223-6247-5419-a5a4-3d808645d917})")
@WinRTByReference(brClass = PanelBasedOptimizationControl.ByReference::class)
public class PanelBasedOptimizationControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPanelBasedOptimizationControl.WithDefault, IWinRTObject {
  private val __1177506080_Interface: IPanelBasedOptimizationControl.WithDefault by lazy {
    as_1177506080()
  }


  public override val __1177506080_Ptr: JNAPointer? by lazy {
    __1177506080_Interface.__1177506080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1177506080_Interface)

  private fun as_1177506080(): IPanelBasedOptimizationControl.WithDefault {
    if(pointer == NULL) {
      return(IPanelBasedOptimizationControl.ABI.makeIPanelBasedOptimizationControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPanelBasedOptimizationControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPanelBasedOptimizationControl.ABI.makeIPanelBasedOptimizationControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PanelBasedOptimizationControl> {
    public override fun getValue() = PanelBasedOptimizationControl(pointer.getPointer(0))

    public fun setValue(value: PanelBasedOptimizationControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PanelBasedOptimizationControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PanelBasedOptimizationControl {
      val address = segment.toRawLongValue()
      return PanelBasedOptimizationControl(Pointer(address))
    }

    public override fun toNative(obj: PanelBasedOptimizationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
