package Windows.Devices.Geolocation.Geofencing

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

@ABIMarker(GeofenceStateChangeReport.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport;{9a243c18-2464-4c89-be05-b3ffff5babc5})")
@WinRTByReference(brClass = GeofenceStateChangeReport.ByReference::class)
public class GeofenceStateChangeReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeofenceStateChangeReport.WithDefault, IWinRTObject {
  private val __130642003_Interface: IGeofenceStateChangeReport.WithDefault by lazy {
    as_130642003()
  }


  public override val __130642003_Ptr: JNAPointer? by lazy {
    __130642003_Interface.__130642003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__130642003_Interface)

  private fun as_130642003(): IGeofenceStateChangeReport.WithDefault {
    if(pointer == NULL) {
      return(IGeofenceStateChangeReport.ABI.makeIGeofenceStateChangeReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeofenceStateChangeReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeofenceStateChangeReport.ABI.makeIGeofenceStateChangeReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeofenceStateChangeReport> {
    public override fun getValue() = GeofenceStateChangeReport(pointer.getPointer(0))

    public fun setValue(value: GeofenceStateChangeReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeofenceStateChangeReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GeofenceStateChangeReport {
      val address = segment.toRawLongValue()
      return GeofenceStateChangeReport(Pointer(address))
    }

    public override fun toNative(obj: GeofenceStateChangeReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
