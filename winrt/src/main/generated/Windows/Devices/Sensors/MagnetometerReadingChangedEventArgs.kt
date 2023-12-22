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

@ABIMarker(MagnetometerReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.MagnetometerReadingChangedEventArgs;{17eae872-2eb9-4ee7-8ad0-3127537d949b})")
@WinRTByReference(brClass = MagnetometerReadingChangedEventArgs.ByReference::class)
public class MagnetometerReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagnetometerReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __1009841537_Interface: IMagnetometerReadingChangedEventArgs.WithDefault by lazy {
    as_1009841537()
  }


  public override val __1009841537_Ptr: JNAPointer? by lazy {
    __1009841537_Interface.__1009841537_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1009841537_Interface)

  private fun as_1009841537(): IMagnetometerReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometerReadingChangedEventArgs.ABI.makeIMagnetometerReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometerReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometerReadingChangedEventArgs.ABI.makeIMagnetometerReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagnetometerReadingChangedEventArgs> {
    public override fun getValue() = MagnetometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagnetometerReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagnetometerReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MagnetometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return MagnetometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagnetometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
