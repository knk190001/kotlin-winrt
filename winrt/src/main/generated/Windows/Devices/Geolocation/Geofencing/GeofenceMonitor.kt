package Windows.Devices.Geolocation.Geofencing

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

@ABIMarker(GeofenceMonitor.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geofencing.GeofenceMonitor;{4c0f5f78-1c1f-4621-bbbd-833b92247226})")
@WinRTByReference(brClass = GeofenceMonitor.ByReference::class)
public class GeofenceMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeofenceMonitor.WithDefault, IWinRTObject {
  private val __1666853586_Interface: IGeofenceMonitor.WithDefault by lazy {
    as_1666853586()
  }


  public override val __1666853586_Ptr: JNAPointer? by lazy {
    __1666853586_Interface.__1666853586_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1666853586_Interface)

  private fun as_1666853586(): IGeofenceMonitor.WithDefault {
    if(pointer == NULL) {
      return(IGeofenceMonitor.ABI.makeIGeofenceMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeofenceMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeofenceMonitor.ABI.makeIGeofenceMonitor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeofenceMonitor> {
    public override fun getValue() = GeofenceMonitor(pointer.getPointer(0))

    public fun setValue(value: GeofenceMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeofenceMonitor, MemoryAddress> {
    public val IGeofenceMonitorStatics_Instance: IGeofenceMonitorStatics by lazy {
      createIGeofenceMonitorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeofenceMonitorStatics(): IGeofenceMonitorStatics {
      val refiid = Guid.REFIID(IGeofenceMonitorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor".toHandle(),refiid,interfacePtr)
      val result = IGeofenceMonitorStatics.ABI.makeIGeofenceMonitorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GeofenceMonitor {
      val address = segment.toRawLongValue()
      return GeofenceMonitor(Pointer(address))
    }

    public override fun toNative(obj: GeofenceMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IGeofenceMonitorStatics_Instance.get_Current()
  }
}
