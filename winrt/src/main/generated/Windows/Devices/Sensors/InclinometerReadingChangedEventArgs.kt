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

@ABIMarker(InclinometerReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.InclinometerReadingChangedEventArgs;{4ae91dc1-e7eb-4938-8511-ae0d6b440438})")
@WinRTByReference(brClass = InclinometerReadingChangedEventArgs.ByReference::class)
public class InclinometerReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInclinometerReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __1964987242_Interface: IInclinometerReadingChangedEventArgs.WithDefault by lazy {
    as_1964987242()
  }


  public override val __1964987242_Ptr: JNAPointer? by lazy {
    __1964987242_Interface.__1964987242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1964987242_Interface)

  private fun as_1964987242(): IInclinometerReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerReadingChangedEventArgs.ABI.makeIInclinometerReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerReadingChangedEventArgs.ABI.makeIInclinometerReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InclinometerReadingChangedEventArgs> {
    public override fun getValue() = InclinometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: InclinometerReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InclinometerReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InclinometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return InclinometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InclinometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
