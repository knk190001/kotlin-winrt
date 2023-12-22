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

@ABIMarker(SimpleOrientationSensorOrientationChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs;{bcd5c660-23d4-4b4c-a22e-ba81ade0c601})")
@WinRTByReference(brClass = SimpleOrientationSensorOrientationChangedEventArgs.ByReference::class)
public class SimpleOrientationSensorOrientationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISimpleOrientationSensorOrientationChangedEventArgs.WithDefault, IWinRTObject
    {
  private val __2026384921_Interface:
      ISimpleOrientationSensorOrientationChangedEventArgs.WithDefault by lazy {
    as_2026384921()
  }


  public override val __2026384921_Ptr: JNAPointer? by lazy {
    __2026384921_Interface.__2026384921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2026384921_Interface)

  private fun as_2026384921(): ISimpleOrientationSensorOrientationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISimpleOrientationSensorOrientationChangedEventArgs.ABI.makeISimpleOrientationSensorOrientationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleOrientationSensorOrientationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleOrientationSensorOrientationChangedEventArgs.ABI.makeISimpleOrientationSensorOrientationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SimpleOrientationSensorOrientationChangedEventArgs> {
    public override fun getValue() =
        SimpleOrientationSensorOrientationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SimpleOrientationSensorOrientationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SimpleOrientationSensorOrientationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SimpleOrientationSensorOrientationChangedEventArgs {
      val address = segment.toRawLongValue()
      return SimpleOrientationSensorOrientationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SimpleOrientationSensorOrientationChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
