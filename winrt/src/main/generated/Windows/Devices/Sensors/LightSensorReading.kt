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

@ABIMarker(LightSensorReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.LightSensorReading;{ffdf6300-227c-4d2b-b302-fc0142485c68})")
@WinRTByReference(brClass = LightSensorReading.ByReference::class)
public class LightSensorReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILightSensorReading.WithDefault, ILightSensorReading2.WithDefault,
    IWinRTObject {
  private val __988353816_Interface: ILightSensorReading.WithDefault by lazy {
    as_988353816()
  }


  private val __574197174_Interface: ILightSensorReading2.WithDefault by lazy {
    as_574197174()
  }


  public override val __988353816_Ptr: JNAPointer? by lazy {
    __988353816_Interface.__988353816_Ptr
  }


  public override val __574197174_Ptr: JNAPointer? by lazy {
    __574197174_Interface.__574197174_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__988353816_Interface, __574197174_Interface)

  private fun as_988353816(): ILightSensorReading.WithDefault {
    if(pointer == NULL) {
      return(ILightSensorReading.ABI.makeILightSensorReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensorReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensorReading.ABI.makeILightSensorReading(ref.value))
  }

  private fun as_574197174(): ILightSensorReading2.WithDefault {
    if(pointer == NULL) {
      return(ILightSensorReading2.ABI.makeILightSensorReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensorReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensorReading2.ABI.makeILightSensorReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LightSensorReading> {
    public override fun getValue() = LightSensorReading(pointer.getPointer(0))

    public fun setValue(value: LightSensorReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LightSensorReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LightSensorReading {
      val address = segment.toRawLongValue()
      return LightSensorReading(Pointer(address))
    }

    public override fun toNative(obj: LightSensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
