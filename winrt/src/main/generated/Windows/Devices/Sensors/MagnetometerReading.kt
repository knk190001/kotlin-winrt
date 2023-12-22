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

@ABIMarker(MagnetometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.MagnetometerReading;{0c2cc40d-ebfd-4e5c-bb11-afc29b3cae61})")
@WinRTByReference(brClass = MagnetometerReading.ByReference::class)
public class MagnetometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagnetometerReading.WithDefault, IMagnetometerReading2.WithDefault,
    IWinRTObject {
  private val __580852764_Interface: IMagnetometerReading.WithDefault by lazy {
    as_580852764()
  }


  private val __826566550_Interface: IMagnetometerReading2.WithDefault by lazy {
    as_826566550()
  }


  public override val __580852764_Ptr: JNAPointer? by lazy {
    __580852764_Interface.__580852764_Ptr
  }


  public override val __826566550_Ptr: JNAPointer? by lazy {
    __826566550_Interface.__826566550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__580852764_Interface, __826566550_Interface)

  private fun as_580852764(): IMagnetometerReading.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometerReading.ABI.makeIMagnetometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometerReading.ABI.makeIMagnetometerReading(ref.value))
  }

  private fun as_826566550(): IMagnetometerReading2.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometerReading2.ABI.makeIMagnetometerReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometerReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometerReading2.ABI.makeIMagnetometerReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagnetometerReading> {
    public override fun getValue() = MagnetometerReading(pointer.getPointer(0))

    public fun setValue(value: MagnetometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagnetometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MagnetometerReading {
      val address = segment.toRawLongValue()
      return MagnetometerReading(Pointer(address))
    }

    public override fun toNative(obj: MagnetometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
