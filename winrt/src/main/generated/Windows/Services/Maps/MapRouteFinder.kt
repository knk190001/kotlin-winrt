package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapRouteFinder.ABI::class)
@WinRTByReference(brClass = MapRouteFinder.ByReference::class)
public class MapRouteFinder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapRouteFinder>
      {
    public override fun getValue() = MapRouteFinder(pointer.getPointer(0))

    public fun setValue(value: MapRouteFinder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteFinder, MemoryAddress> {
    public val IMapRouteFinderStatics2_Instance: IMapRouteFinderStatics2 by lazy {
      createIMapRouteFinderStatics2()
    }


    public val IMapRouteFinderStatics3_Instance: IMapRouteFinderStatics3 by lazy {
      createIMapRouteFinderStatics3()
    }


    public val IMapRouteFinderStatics_Instance: IMapRouteFinderStatics by lazy {
      createIMapRouteFinderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapRouteFinderStatics2(): IMapRouteFinderStatics2 {
      val refiid = Guid.REFIID(IMapRouteFinderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapRouteFinder".toHandle(),refiid,interfacePtr)
      val result = IMapRouteFinderStatics2.ABI.makeIMapRouteFinderStatics2(interfacePtr.value)
      return result
    }

    public fun createIMapRouteFinderStatics3(): IMapRouteFinderStatics3 {
      val refiid = Guid.REFIID(IMapRouteFinderStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapRouteFinder".toHandle(),refiid,interfacePtr)
      val result = IMapRouteFinderStatics3.ABI.makeIMapRouteFinderStatics3(interfacePtr.value)
      return result
    }

    public fun createIMapRouteFinderStatics(): IMapRouteFinderStatics {
      val refiid = Guid.REFIID(IMapRouteFinderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapRouteFinder".toHandle(),refiid,interfacePtr)
      val result = IMapRouteFinderStatics.ABI.makeIMapRouteFinderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapRouteFinder {
      val address = segment.toRawLongValue()
      return MapRouteFinder(Pointer(address))
    }

    public override fun toNative(obj: MapRouteFinder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDrivingRouteAsync(
      startPoint: Geopoint,
      endPoint: Geopoint,
      options: MapRouteDrivingOptions
    ) = ABI.IMapRouteFinderStatics2_Instance.GetDrivingRouteAsync(startPoint, endPoint, options)

    public fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>) =
        ABI.IMapRouteFinderStatics3_Instance.GetDrivingRouteFromEnhancedWaypointsAsync(waypoints)

    public fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>,
        options: MapRouteDrivingOptions) =
        ABI.IMapRouteFinderStatics3_Instance.GetDrivingRouteFromEnhancedWaypointsAsync(waypoints,
        options)

    public fun GetDrivingRouteAsync(startPoint: Geopoint, endPoint: Geopoint) =
        ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteAsync(startPoint, endPoint)

    public fun GetDrivingRouteAsync(
      startPoint: Geopoint,
      endPoint: Geopoint,
      optimization: MapRouteOptimization
    ) = ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteAsync(startPoint, endPoint, optimization)

    public fun GetDrivingRouteAsync(
      startPoint: Geopoint,
      endPoint: Geopoint,
      optimization: MapRouteOptimization,
      restrictions: MapRouteRestrictions
    ) = ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteAsync(startPoint, endPoint, optimization,
        restrictions)

    public fun GetDrivingRouteAsync(
      startPoint: Geopoint,
      endPoint: Geopoint,
      optimization: MapRouteOptimization,
      restrictions: MapRouteRestrictions,
      headingInDegrees: Double
    ) = ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteAsync(startPoint, endPoint, optimization,
        restrictions, headingInDegrees)

    public fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>) =
        ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteFromWaypointsAsync(wayPoints)

    public fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>,
        optimization: MapRouteOptimization) =
        ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteFromWaypointsAsync(wayPoints,
        optimization)

    public fun GetDrivingRouteFromWaypointsAsync(
      wayPoints: IIterable<Geopoint?>,
      optimization: MapRouteOptimization,
      restrictions: MapRouteRestrictions
    ) = ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteFromWaypointsAsync(wayPoints,
        optimization, restrictions)

    public fun GetDrivingRouteFromWaypointsAsync(
      wayPoints: IIterable<Geopoint?>,
      optimization: MapRouteOptimization,
      restrictions: MapRouteRestrictions,
      headingInDegrees: Double
    ) = ABI.IMapRouteFinderStatics_Instance.GetDrivingRouteFromWaypointsAsync(wayPoints,
        optimization, restrictions, headingInDegrees)

    public fun GetWalkingRouteAsync(startPoint: Geopoint, endPoint: Geopoint) =
        ABI.IMapRouteFinderStatics_Instance.GetWalkingRouteAsync(startPoint, endPoint)

    public fun GetWalkingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>) =
        ABI.IMapRouteFinderStatics_Instance.GetWalkingRouteFromWaypointsAsync(wayPoints)
  }
}
