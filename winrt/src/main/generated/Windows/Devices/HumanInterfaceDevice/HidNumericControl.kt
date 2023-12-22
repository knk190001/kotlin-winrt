package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidNumericControl.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidNumericControl;{e38a12a5-35a7-4b75-89c8-fb1f28b10823})")
@WinRTByReference(brClass = HidNumericControl.ByReference::class)
public class HidNumericControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidNumericControl.WithDefault, IWinRTObject {
  private val __463523720_Interface: IHidNumericControl.WithDefault by lazy {
    as_463523720()
  }


  public override val __463523720_Ptr: JNAPointer? by lazy {
    __463523720_Interface.__463523720_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__463523720_Interface)

  private fun as_463523720(): IHidNumericControl.WithDefault {
    if(pointer == NULL) {
      return(IHidNumericControl.ABI.makeIHidNumericControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidNumericControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidNumericControl.ABI.makeIHidNumericControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidNumericControl> {
    public override fun getValue() = HidNumericControl(pointer.getPointer(0))

    public fun setValue(value: HidNumericControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidNumericControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidNumericControl {
      val address = segment.toRawLongValue()
      return HidNumericControl(Pointer(address))
    }

    public override fun toNative(obj: HidNumericControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
