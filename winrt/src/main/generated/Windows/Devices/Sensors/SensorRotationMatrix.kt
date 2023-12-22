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

@ABIMarker(SensorRotationMatrix.ABI::class)
@Signature("rc(Windows.Devices.Sensors.SensorRotationMatrix;{0a3d5a67-22f4-4392-9538-65d0bd064aa6})")
@WinRTByReference(brClass = SensorRotationMatrix.ByReference::class)
public class SensorRotationMatrix(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISensorRotationMatrix.WithDefault, IWinRTObject {
  private val __714257189_Interface: ISensorRotationMatrix.WithDefault by lazy {
    as_714257189()
  }


  public override val __714257189_Ptr: JNAPointer? by lazy {
    __714257189_Interface.__714257189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__714257189_Interface)

  private fun as_714257189(): ISensorRotationMatrix.WithDefault {
    if(pointer == NULL) {
      return(ISensorRotationMatrix.ABI.makeISensorRotationMatrix(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISensorRotationMatrix>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISensorRotationMatrix.ABI.makeISensorRotationMatrix(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SensorRotationMatrix> {
    public override fun getValue() = SensorRotationMatrix(pointer.getPointer(0))

    public fun setValue(value: SensorRotationMatrix): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SensorRotationMatrix, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SensorRotationMatrix {
      val address = segment.toRawLongValue()
      return SensorRotationMatrix(Pointer(address))
    }

    public override fun toNative(obj: SensorRotationMatrix): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
