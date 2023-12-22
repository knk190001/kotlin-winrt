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

@ABIMarker(BarometerReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.BarometerReadingChangedEventArgs;{3d84945f-037b-404f-9bbb-6232d69543c3})")
@WinRTByReference(brClass = BarometerReadingChangedEventArgs.ByReference::class)
public class BarometerReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarometerReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __1761634866_Interface: IBarometerReadingChangedEventArgs.WithDefault by lazy {
    as_1761634866()
  }


  public override val __1761634866_Ptr: JNAPointer? by lazy {
    __1761634866_Interface.__1761634866_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1761634866_Interface)

  private fun as_1761634866(): IBarometerReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarometerReadingChangedEventArgs.ABI.makeIBarometerReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometerReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometerReadingChangedEventArgs.ABI.makeIBarometerReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarometerReadingChangedEventArgs> {
    public override fun getValue() = BarometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarometerReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarometerReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return BarometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
