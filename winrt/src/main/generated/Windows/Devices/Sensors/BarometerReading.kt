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

@ABIMarker(BarometerReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.BarometerReading;{f5b9d2e6-1df6-4a1a-a7ad-321d4f5db247})")
@WinRTByReference(brClass = BarometerReading.ByReference::class)
public class BarometerReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarometerReading.WithDefault, IBarometerReading2.WithDefault, IWinRTObject {
  private val __426367637_Interface: IBarometerReading.WithDefault by lazy {
    as_426367637()
  }


  private val __332494809_Interface: IBarometerReading2.WithDefault by lazy {
    as_332494809()
  }


  public override val __426367637_Ptr: JNAPointer? by lazy {
    __426367637_Interface.__426367637_Ptr
  }


  public override val __332494809_Ptr: JNAPointer? by lazy {
    __332494809_Interface.__332494809_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__426367637_Interface, __332494809_Interface)

  private fun as_426367637(): IBarometerReading.WithDefault {
    if(pointer == NULL) {
      return(IBarometerReading.ABI.makeIBarometerReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometerReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometerReading.ABI.makeIBarometerReading(ref.value))
  }

  private fun as_332494809(): IBarometerReading2.WithDefault {
    if(pointer == NULL) {
      return(IBarometerReading2.ABI.makeIBarometerReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometerReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometerReading2.ABI.makeIBarometerReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarometerReading> {
    public override fun getValue() = BarometerReading(pointer.getPointer(0))

    public fun setValue(value: BarometerReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarometerReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarometerReading {
      val address = segment.toRawLongValue()
      return BarometerReading(Pointer(address))
    }

    public override fun toNative(obj: BarometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
