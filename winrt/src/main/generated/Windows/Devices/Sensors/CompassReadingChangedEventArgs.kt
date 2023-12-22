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

@ABIMarker(CompassReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.CompassReadingChangedEventArgs;{8f1549b0-e8bc-4c7e-b009-4e41df137072})")
@WinRTByReference(brClass = CompassReadingChangedEventArgs.ByReference::class)
public class CompassReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompassReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __449646697_Interface: ICompassReadingChangedEventArgs.WithDefault by lazy {
    as_449646697()
  }


  public override val __449646697_Ptr: JNAPointer? by lazy {
    __449646697_Interface.__449646697_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__449646697_Interface)

  private fun as_449646697(): ICompassReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICompassReadingChangedEventArgs.ABI.makeICompassReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompassReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompassReadingChangedEventArgs.ABI.makeICompassReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompassReadingChangedEventArgs> {
    public override fun getValue() = CompassReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CompassReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompassReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompassReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return CompassReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CompassReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
