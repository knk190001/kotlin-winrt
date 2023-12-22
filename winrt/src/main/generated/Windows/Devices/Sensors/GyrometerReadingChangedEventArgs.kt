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

@ABIMarker(GyrometerReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.GyrometerReadingChangedEventArgs;{0fdf1895-6f9e-42ce-8d58-388c0ab8356d})")
@WinRTByReference(brClass = GyrometerReadingChangedEventArgs.ByReference::class)
public class GyrometerReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGyrometerReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __902011713_Interface: IGyrometerReadingChangedEventArgs.WithDefault by lazy {
    as_902011713()
  }


  public override val __902011713_Ptr: JNAPointer? by lazy {
    __902011713_Interface.__902011713_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__902011713_Interface)

  private fun as_902011713(): IGyrometerReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGyrometerReadingChangedEventArgs.ABI.makeIGyrometerReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometerReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometerReadingChangedEventArgs.ABI.makeIGyrometerReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GyrometerReadingChangedEventArgs> {
    public override fun getValue() = GyrometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GyrometerReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GyrometerReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GyrometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return GyrometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GyrometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
