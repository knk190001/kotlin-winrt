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

@ABIMarker(PedometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.PedometerReading;{2245dcf4-a8e1-432f-896a-be0dd9b02d24})")
@WinRTByReference(brClass = PedometerReading.ByReference::class)
public class PedometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPedometerReading.WithDefault, IWinRTObject {
  private val __1239214575_Interface: IPedometerReading.WithDefault by lazy {
    as_1239214575()
  }


  public override val __1239214575_Ptr: JNAPointer? by lazy {
    __1239214575_Interface.__1239214575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1239214575_Interface)

  private fun as_1239214575(): IPedometerReading.WithDefault {
    if(pointer == NULL) {
      return(IPedometerReading.ABI.makeIPedometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPedometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPedometerReading.ABI.makeIPedometerReading(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PedometerReading> {
    public override fun getValue() = PedometerReading(pointer.getPointer(0))

    public fun setValue(value: PedometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PedometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PedometerReading {
      val address = segment.toRawLongValue()
      return PedometerReading(Pointer(address))
    }

    public override fun toNative(obj: PedometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
