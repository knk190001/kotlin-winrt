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

@ABIMarker(GyrometerDataThreshold.ABI::class)
@Signature("rc(Windows.Devices.Sensors.GyrometerDataThreshold;{8648b31e-6e52-5259-bbad-242a69dc38c8})")
@WinRTByReference(brClass = GyrometerDataThreshold.ByReference::class)
public class GyrometerDataThreshold(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGyrometerDataThreshold.WithDefault, IWinRTObject {
  private val __1243598669_Interface: IGyrometerDataThreshold.WithDefault by lazy {
    as_1243598669()
  }


  public override val __1243598669_Ptr: JNAPointer? by lazy {
    __1243598669_Interface.__1243598669_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1243598669_Interface)

  private fun as_1243598669(): IGyrometerDataThreshold.WithDefault {
    if(pointer == NULL) {
      return(IGyrometerDataThreshold.ABI.makeIGyrometerDataThreshold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometerDataThreshold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometerDataThreshold.ABI.makeIGyrometerDataThreshold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GyrometerDataThreshold> {
    public override fun getValue() = GyrometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: GyrometerDataThreshold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GyrometerDataThreshold, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GyrometerDataThreshold {
      val address = segment.toRawLongValue()
      return GyrometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: GyrometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
