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

@ABIMarker(AccelerometerReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AccelerometerReadingChangedEventArgs;{0095c65b-b6ac-475a-9f44-8b32d35a3f25})")
@WinRTByReference(brClass = AccelerometerReadingChangedEventArgs.ByReference::class)
public class AccelerometerReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccelerometerReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __151591028_Interface: IAccelerometerReadingChangedEventArgs.WithDefault by lazy {
    as_151591028()
  }


  public override val __151591028_Ptr: JNAPointer? by lazy {
    __151591028_Interface.__151591028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__151591028_Interface)

  private fun as_151591028(): IAccelerometerReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerReadingChangedEventArgs.ABI.makeIAccelerometerReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerReadingChangedEventArgs.ABI.makeIAccelerometerReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccelerometerReadingChangedEventArgs> {
    public override fun getValue() = AccelerometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccelerometerReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccelerometerReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AccelerometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return AccelerometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccelerometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
