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

@ABIMarker(SensorDataThresholdTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Sensors.SensorDataThresholdTriggerDetails;{9106f1b7-e88d-48b1-bc90-619c7b349391})")
@WinRTByReference(brClass = SensorDataThresholdTriggerDetails.ByReference::class)
public class SensorDataThresholdTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISensorDataThresholdTriggerDetails.WithDefault, IWinRTObject {
  private val __1526039333_Interface: ISensorDataThresholdTriggerDetails.WithDefault by lazy {
    as_1526039333()
  }


  public override val __1526039333_Ptr: JNAPointer? by lazy {
    __1526039333_Interface.__1526039333_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1526039333_Interface)

  private fun as_1526039333(): ISensorDataThresholdTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ISensorDataThresholdTriggerDetails.ABI.makeISensorDataThresholdTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISensorDataThresholdTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISensorDataThresholdTriggerDetails.ABI.makeISensorDataThresholdTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SensorDataThresholdTriggerDetails> {
    public override fun getValue() = SensorDataThresholdTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: SensorDataThresholdTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SensorDataThresholdTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SensorDataThresholdTriggerDetails {
      val address = segment.toRawLongValue()
      return SensorDataThresholdTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: SensorDataThresholdTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
