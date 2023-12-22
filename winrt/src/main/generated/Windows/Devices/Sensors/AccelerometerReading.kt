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

@ABIMarker(AccelerometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AccelerometerReading;{b9fe7acb-d351-40af-8bb6-7aa9ae641fb7})")
@WinRTByReference(brClass = AccelerometerReading.ByReference::class)
public class AccelerometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccelerometerReading.WithDefault, IAccelerometerReading2.WithDefault,
    IWinRTObject {
  private val __717966551_Interface: IAccelerometerReading.WithDefault by lazy {
    as_717966551()
  }


  private val __782126551_Interface: IAccelerometerReading2.WithDefault by lazy {
    as_782126551()
  }


  public override val __717966551_Ptr: JNAPointer? by lazy {
    __717966551_Interface.__717966551_Ptr
  }


  public override val __782126551_Ptr: JNAPointer? by lazy {
    __782126551_Interface.__782126551_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__717966551_Interface, __782126551_Interface)

  private fun as_717966551(): IAccelerometerReading.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerReading.ABI.makeIAccelerometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerReading.ABI.makeIAccelerometerReading(ref.value))
  }

  private fun as_782126551(): IAccelerometerReading2.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerReading2.ABI.makeIAccelerometerReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerReading2.ABI.makeIAccelerometerReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccelerometerReading> {
    public override fun getValue() = AccelerometerReading(pointer.getPointer(0))

    public fun setValue(value: AccelerometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccelerometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AccelerometerReading {
      val address = segment.toRawLongValue()
      return AccelerometerReading(Pointer(address))
    }

    public override fun toNative(obj: AccelerometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
