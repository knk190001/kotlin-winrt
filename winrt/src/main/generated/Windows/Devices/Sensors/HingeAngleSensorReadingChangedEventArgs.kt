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

@ABIMarker(HingeAngleSensorReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.HingeAngleSensorReadingChangedEventArgs;{24d9558b-fad0-42b8-a854-78923049a1ba})")
@WinRTByReference(brClass = HingeAngleSensorReadingChangedEventArgs.ByReference::class)
public class HingeAngleSensorReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHingeAngleSensorReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __2046280991_Interface: IHingeAngleSensorReadingChangedEventArgs.WithDefault by lazy {
    as_2046280991()
  }


  public override val __2046280991_Ptr: JNAPointer? by lazy {
    __2046280991_Interface.__2046280991_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2046280991_Interface)

  private fun as_2046280991(): IHingeAngleSensorReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHingeAngleSensorReadingChangedEventArgs.ABI.makeIHingeAngleSensorReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHingeAngleSensorReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHingeAngleSensorReadingChangedEventArgs.ABI.makeIHingeAngleSensorReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HingeAngleSensorReadingChangedEventArgs> {
    public override fun getValue() = HingeAngleSensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HingeAngleSensorReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HingeAngleSensorReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HingeAngleSensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return HingeAngleSensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HingeAngleSensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
