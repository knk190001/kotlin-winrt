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

@ABIMarker(MagnetometerDataThreshold.ABI::class)
@Signature("rc(Windows.Devices.Sensors.MagnetometerDataThreshold;{d177cb01-9063-5fa5-b596-b445e9dc3401})")
@WinRTByReference(brClass = MagnetometerDataThreshold.ByReference::class)
public class MagnetometerDataThreshold(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagnetometerDataThreshold.WithDefault, IWinRTObject {
  private val __854329999_Interface: IMagnetometerDataThreshold.WithDefault by lazy {
    as_854329999()
  }


  public override val __854329999_Ptr: JNAPointer? by lazy {
    __854329999_Interface.__854329999_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__854329999_Interface)

  private fun as_854329999(): IMagnetometerDataThreshold.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometerDataThreshold.ABI.makeIMagnetometerDataThreshold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometerDataThreshold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometerDataThreshold.ABI.makeIMagnetometerDataThreshold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagnetometerDataThreshold> {
    public override fun getValue() = MagnetometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: MagnetometerDataThreshold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagnetometerDataThreshold, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MagnetometerDataThreshold {
      val address = segment.toRawLongValue()
      return MagnetometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: MagnetometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
