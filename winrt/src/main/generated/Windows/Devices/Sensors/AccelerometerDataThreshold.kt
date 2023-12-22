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

@ABIMarker(AccelerometerDataThreshold.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AccelerometerDataThreshold;{f92c1b68-6320-5577-879e-9942621c3dd9})")
@WinRTByReference(brClass = AccelerometerDataThreshold.ByReference::class)
public class AccelerometerDataThreshold(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccelerometerDataThreshold.WithDefault, IWinRTObject {
  private val __124956994_Interface: IAccelerometerDataThreshold.WithDefault by lazy {
    as_124956994()
  }


  public override val __124956994_Ptr: JNAPointer? by lazy {
    __124956994_Interface.__124956994_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__124956994_Interface)

  private fun as_124956994(): IAccelerometerDataThreshold.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerDataThreshold.ABI.makeIAccelerometerDataThreshold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerDataThreshold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerDataThreshold.ABI.makeIAccelerometerDataThreshold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccelerometerDataThreshold> {
    public override fun getValue() = AccelerometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: AccelerometerDataThreshold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccelerometerDataThreshold, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AccelerometerDataThreshold {
      val address = segment.toRawLongValue()
      return AccelerometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: AccelerometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
