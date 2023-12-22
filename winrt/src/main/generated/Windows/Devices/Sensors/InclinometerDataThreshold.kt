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

@ABIMarker(InclinometerDataThreshold.ABI::class)
@Signature("rc(Windows.Devices.Sensors.InclinometerDataThreshold;{f80a4783-7bfe-545e-bb60-a0ebc47bd2fb})")
@WinRTByReference(brClass = InclinometerDataThreshold.ByReference::class)
public class InclinometerDataThreshold(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInclinometerDataThreshold.WithDefault, IWinRTObject {
  private val __388888648_Interface: IInclinometerDataThreshold.WithDefault by lazy {
    as_388888648()
  }


  public override val __388888648_Ptr: JNAPointer? by lazy {
    __388888648_Interface.__388888648_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__388888648_Interface)

  private fun as_388888648(): IInclinometerDataThreshold.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerDataThreshold.ABI.makeIInclinometerDataThreshold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerDataThreshold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerDataThreshold.ABI.makeIInclinometerDataThreshold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InclinometerDataThreshold> {
    public override fun getValue() = InclinometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: InclinometerDataThreshold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InclinometerDataThreshold, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InclinometerDataThreshold {
      val address = segment.toRawLongValue()
      return InclinometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: InclinometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
