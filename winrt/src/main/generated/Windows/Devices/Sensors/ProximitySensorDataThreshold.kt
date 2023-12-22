package Windows.Devices.Sensors

import Windows.Devices.Sensors.IProximitySensorDataThresholdFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(ProximitySensorDataThreshold.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ProximitySensorDataThreshold;{54daec61-fe4b-4e07-b260-3a4cdfbe396e})")
@WinRTByReference(brClass = ProximitySensorDataThreshold.ByReference::class)
public class ProximitySensorDataThreshold(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISensorDataThreshold.WithDefault, IWinRTObject {
  private val __1145502939_Interface: ISensorDataThreshold.WithDefault by lazy {
    as_1145502939()
  }


  public override val __1145502939_Ptr: JNAPointer? by lazy {
    __1145502939_Interface.__1145502939_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1145502939_Interface)

  public constructor(sensor: ProximitySensor) : this(ABI.activate(sensor))

  private fun as_1145502939(): ISensorDataThreshold.WithDefault {
    if(pointer == NULL) {
      return(ISensorDataThreshold.ABI.makeISensorDataThreshold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISensorDataThreshold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISensorDataThreshold.ABI.makeISensorDataThreshold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximitySensorDataThreshold> {
    public override fun getValue() = ProximitySensorDataThreshold(pointer.getPointer(0))

    public fun setValue(value: ProximitySensorDataThreshold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximitySensorDataThreshold, MemoryAddress> {
    public val IProximitySensorDataThresholdFactory_Instance: IProximitySensorDataThresholdFactory
        by lazy {
      createIProximitySensorDataThresholdFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProximitySensorDataThresholdFactory(): IProximitySensorDataThresholdFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.ProximitySensorDataThreshold".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProximitySensorDataThresholdFactory.ABI.makeIProximitySensorDataThresholdFactory(factoryActivatorPtr.value))
    }

    public fun activate(sensor: ProximitySensor): JNAPointer? =
        IProximitySensorDataThresholdFactory_Instance.Create(sensor)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProximitySensorDataThreshold {
      val address = segment.toRawLongValue()
      return ProximitySensorDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: ProximitySensorDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
