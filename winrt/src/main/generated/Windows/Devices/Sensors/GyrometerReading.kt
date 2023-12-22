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

@ABIMarker(GyrometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.GyrometerReading;{b3d6de5c-1ee4-456f-9de7-e2493b5c8e03})")
@WinRTByReference(brClass = GyrometerReading.ByReference::class)
public class GyrometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGyrometerReading.WithDefault, IGyrometerReading2.WithDefault, IWinRTObject {
  private val __1157533474_Interface: IGyrometerReading.WithDefault by lazy {
    as_1157533474()
  }


  private val __1523799276_Interface: IGyrometerReading2.WithDefault by lazy {
    as_1523799276()
  }


  public override val __1157533474_Ptr: JNAPointer? by lazy {
    __1157533474_Interface.__1157533474_Ptr
  }


  public override val __1523799276_Ptr: JNAPointer? by lazy {
    __1523799276_Interface.__1523799276_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1157533474_Interface, __1523799276_Interface)

  private fun as_1157533474(): IGyrometerReading.WithDefault {
    if(pointer == NULL) {
      return(IGyrometerReading.ABI.makeIGyrometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometerReading.ABI.makeIGyrometerReading(ref.value))
  }

  private fun as_1523799276(): IGyrometerReading2.WithDefault {
    if(pointer == NULL) {
      return(IGyrometerReading2.ABI.makeIGyrometerReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometerReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometerReading2.ABI.makeIGyrometerReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GyrometerReading> {
    public override fun getValue() = GyrometerReading(pointer.getPointer(0))

    public fun setValue(value: GyrometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GyrometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GyrometerReading {
      val address = segment.toRawLongValue()
      return GyrometerReading(Pointer(address))
    }

    public override fun toNative(obj: GyrometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
