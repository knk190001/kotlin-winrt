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

@ABIMarker(InclinometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.InclinometerReading;{9f44f055-b6f6-497f-b127-1a775e501458})")
@WinRTByReference(brClass = InclinometerReading.ByReference::class)
public class InclinometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInclinometerReading.WithDefault, IInclinometerReadingYawAccuracy.WithDefault,
    IInclinometerReading2.WithDefault, IWinRTObject {
  private val __36844493_Interface: IInclinometerReading.WithDefault by lazy {
    as_36844493()
  }


  private val __741301845_Interface: IInclinometerReadingYawAccuracy.WithDefault by lazy {
    as_741301845()
  }


  private val __1142179233_Interface: IInclinometerReading2.WithDefault by lazy {
    as_1142179233()
  }


  public override val __36844493_Ptr: JNAPointer? by lazy {
    __36844493_Interface.__36844493_Ptr
  }


  public override val __741301845_Ptr: JNAPointer? by lazy {
    __741301845_Interface.__741301845_Ptr
  }


  public override val __1142179233_Ptr: JNAPointer? by lazy {
    __1142179233_Interface.__1142179233_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__36844493_Interface, __741301845_Interface, __1142179233_Interface)

  private fun as_36844493(): IInclinometerReading.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerReading.ABI.makeIInclinometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerReading.ABI.makeIInclinometerReading(ref.value))
  }

  private fun as_741301845(): IInclinometerReadingYawAccuracy.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerReadingYawAccuracy.ABI.makeIInclinometerReadingYawAccuracy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerReadingYawAccuracy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerReadingYawAccuracy.ABI.makeIInclinometerReadingYawAccuracy(ref.value))
  }

  private fun as_1142179233(): IInclinometerReading2.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerReading2.ABI.makeIInclinometerReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerReading2.ABI.makeIInclinometerReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InclinometerReading> {
    public override fun getValue() = InclinometerReading(pointer.getPointer(0))

    public fun setValue(value: InclinometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InclinometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InclinometerReading {
      val address = segment.toRawLongValue()
      return InclinometerReading(Pointer(address))
    }

    public override fun toNative(obj: InclinometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
