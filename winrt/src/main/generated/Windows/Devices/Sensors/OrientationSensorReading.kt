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

@ABIMarker(OrientationSensorReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.OrientationSensorReading;{4756c993-6595-4897-bcc6-d537ee757564})")
@WinRTByReference(brClass = OrientationSensorReading.ByReference::class)
public class OrientationSensorReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOrientationSensorReading.WithDefault,
    IOrientationSensorReadingYawAccuracy.WithDefault, IOrientationSensorReading2.WithDefault,
    IWinRTObject {
  private val __928528530_Interface: IOrientationSensorReading.WithDefault by lazy {
    as_928528530()
  }


  private val __1120641082_Interface: IOrientationSensorReadingYawAccuracy.WithDefault by lazy {
    as_1120641082()
  }


  private val __1280386692_Interface: IOrientationSensorReading2.WithDefault by lazy {
    as_1280386692()
  }


  public override val __928528530_Ptr: JNAPointer? by lazy {
    __928528530_Interface.__928528530_Ptr
  }


  public override val __1120641082_Ptr: JNAPointer? by lazy {
    __1120641082_Interface.__1120641082_Ptr
  }


  public override val __1280386692_Ptr: JNAPointer? by lazy {
    __1280386692_Interface.__1280386692_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__928528530_Interface, __1120641082_Interface, __1280386692_Interface)

  private fun as_928528530(): IOrientationSensorReading.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensorReading.ABI.makeIOrientationSensorReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensorReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensorReading.ABI.makeIOrientationSensorReading(ref.value))
  }

  private fun as_1120641082(): IOrientationSensorReadingYawAccuracy.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensorReadingYawAccuracy.ABI.makeIOrientationSensorReadingYawAccuracy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensorReadingYawAccuracy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensorReadingYawAccuracy.ABI.makeIOrientationSensorReadingYawAccuracy(ref.value))
  }

  private fun as_1280386692(): IOrientationSensorReading2.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensorReading2.ABI.makeIOrientationSensorReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensorReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensorReading2.ABI.makeIOrientationSensorReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OrientationSensorReading> {
    public override fun getValue() = OrientationSensorReading(pointer.getPointer(0))

    public fun setValue(value: OrientationSensorReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OrientationSensorReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OrientationSensorReading {
      val address = segment.toRawLongValue()
      return OrientationSensorReading(Pointer(address))
    }

    public override fun toNative(obj: OrientationSensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
