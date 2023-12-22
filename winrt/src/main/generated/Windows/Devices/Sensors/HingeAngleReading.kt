package Windows.Devices.Sensors

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

@ABIMarker(HingeAngleReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.HingeAngleReading;{a3cd45b9-1bf1-4f65-a704-e2da04f182c0})")
@WinRTByReference(brClass = HingeAngleReading.ByReference::class)
public class HingeAngleReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHingeAngleReading.WithDefault, IWinRTObject {
  private val __1641280872_Interface: IHingeAngleReading.WithDefault by lazy {
    as_1641280872()
  }


  public override val __1641280872_Ptr: JNAPointer? by lazy {
    __1641280872_Interface.__1641280872_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1641280872_Interface)

  private fun as_1641280872(): IHingeAngleReading.WithDefault {
    if(pointer == NULL) {
      return(IHingeAngleReading.ABI.makeIHingeAngleReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHingeAngleReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHingeAngleReading.ABI.makeIHingeAngleReading(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HingeAngleReading> {
    public override fun getValue() = HingeAngleReading(pointer.getPointer(0))

    public fun setValue(value: HingeAngleReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HingeAngleReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HingeAngleReading {
      val address = segment.toRawLongValue()
      return HingeAngleReading(Pointer(address))
    }

    public override fun toNative(obj: HingeAngleReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
