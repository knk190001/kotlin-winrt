package Windows.Devices.Geolocation.Geofencing

import Windows.Devices.Geolocation.Geofencing.IGeofenceFactory.ABI.IID
import Windows.Devices.Geolocation.IGeoshape
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Geofence.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geofencing.Geofence;{9c090823-edb8-47e0-8245-5bf61d321f2d})")
@WinRTByReference(brClass = Geofence.ByReference::class)
public class Geofence(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeofence.WithDefault, IWinRTObject {
  private val __863094120_Interface: IGeofence.WithDefault by lazy {
    as_863094120()
  }


  public override val __863094120_Ptr: JNAPointer? by lazy {
    __863094120_Interface.__863094120_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__863094120_Interface)

  public constructor(id: String, geoshape: IGeoshape) : this(ABI.activate(id, geoshape))

  public constructor(
    id: String,
    geoshape: IGeoshape,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean
  ) : this(ABI.activate(id, geoshape, monitoredStates, singleUse))

  public constructor(
    id: String,
    geoshape: IGeoshape,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean,
    dwellTime: TimeSpan
  ) : this(ABI.activate(id, geoshape, monitoredStates, singleUse, dwellTime))

  public constructor(
    id: String,
    geoshape: IGeoshape,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean,
    dwellTime: TimeSpan,
    startTime: DateTime,
    duration: TimeSpan
  ) : this(ABI.activate(id, geoshape, monitoredStates, singleUse, dwellTime, startTime, duration))

  private fun as_863094120(): IGeofence.WithDefault {
    if(pointer == NULL) {
      return(IGeofence.ABI.makeIGeofence(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeofence>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeofence.ABI.makeIGeofence(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geofence> {
    public override fun getValue() = Geofence(pointer.getPointer(0))

    public fun setValue(value: Geofence): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geofence, MemoryAddress> {
    public val IGeofenceFactory_Instance: IGeofenceFactory by lazy {
      createIGeofenceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeofenceFactory(): IGeofenceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geofencing.Geofence".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeofenceFactory.ABI.makeIGeofenceFactory(factoryActivatorPtr.value))
    }

    public fun activate(id: String, geoshape: IGeoshape): JNAPointer? =
        IGeofenceFactory_Instance.Create(id, geoshape)?.pointer

    public fun activate(
      id: String,
      geoshape: IGeoshape,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean
    ): JNAPointer? = IGeofenceFactory_Instance.CreateWithMonitorStates(id, geoshape,
        monitoredStates, singleUse)?.pointer

    public fun activate(
      id: String,
      geoshape: IGeoshape,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean,
      dwellTime: TimeSpan
    ): JNAPointer? = IGeofenceFactory_Instance.CreateWithMonitorStatesAndDwellTime(id, geoshape,
        monitoredStates, singleUse, dwellTime)?.pointer

    public fun activate(
      id: String,
      geoshape: IGeoshape,
      monitoredStates: MonitoredGeofenceStates,
      singleUse: Boolean,
      dwellTime: TimeSpan,
      startTime: DateTime,
      duration: TimeSpan
    ): JNAPointer? =
        IGeofenceFactory_Instance.CreateWithMonitorStatesDwellTimeStartTimeAndDuration(id, geoshape,
        monitoredStates, singleUse, dwellTime, startTime, duration)?.pointer

    public override fun fromNative(segment: MemoryAddress): Geofence {
      val address = segment.toRawLongValue()
      return Geofence(Pointer(address))
    }

    public override fun toNative(obj: Geofence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
