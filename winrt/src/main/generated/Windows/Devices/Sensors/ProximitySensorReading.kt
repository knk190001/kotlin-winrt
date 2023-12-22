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

@ABIMarker(ProximitySensorReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ProximitySensorReading;{71228d59-132d-4d5f-8ff9-2f0db8751ced})")
@WinRTByReference(brClass = ProximitySensorReading.ByReference::class)
public class ProximitySensorReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProximitySensorReading.WithDefault, IWinRTObject {
  private val __1414935521_Interface: IProximitySensorReading.WithDefault by lazy {
    as_1414935521()
  }


  public override val __1414935521_Ptr: JNAPointer? by lazy {
    __1414935521_Interface.__1414935521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1414935521_Interface)

  private fun as_1414935521(): IProximitySensorReading.WithDefault {
    if(pointer == NULL) {
      return(IProximitySensorReading.ABI.makeIProximitySensorReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProximitySensorReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProximitySensorReading.ABI.makeIProximitySensorReading(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximitySensorReading> {
    public override fun getValue() = ProximitySensorReading(pointer.getPointer(0))

    public fun setValue(value: ProximitySensorReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximitySensorReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProximitySensorReading {
      val address = segment.toRawLongValue()
      return ProximitySensorReading(Pointer(address))
    }

    public override fun toNative(obj: ProximitySensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
