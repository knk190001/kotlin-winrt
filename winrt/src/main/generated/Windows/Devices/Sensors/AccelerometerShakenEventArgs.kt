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

@ABIMarker(AccelerometerShakenEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AccelerometerShakenEventArgs;{95ff01d1-4a28-4f35-98e8-8178aae4084a})")
@WinRTByReference(brClass = AccelerometerShakenEventArgs.ByReference::class)
public class AccelerometerShakenEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccelerometerShakenEventArgs.WithDefault, IWinRTObject {
  private val __1387967252_Interface: IAccelerometerShakenEventArgs.WithDefault by lazy {
    as_1387967252()
  }


  public override val __1387967252_Ptr: JNAPointer? by lazy {
    __1387967252_Interface.__1387967252_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1387967252_Interface)

  private fun as_1387967252(): IAccelerometerShakenEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerShakenEventArgs.ABI.makeIAccelerometerShakenEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerShakenEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerShakenEventArgs.ABI.makeIAccelerometerShakenEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccelerometerShakenEventArgs> {
    public override fun getValue() = AccelerometerShakenEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccelerometerShakenEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccelerometerShakenEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AccelerometerShakenEventArgs {
      val address = segment.toRawLongValue()
      return AccelerometerShakenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccelerometerShakenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
