package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapStyleSheetEntries.ABI::class)
@WinRTByReference(brClass = MapStyleSheetEntries.ByReference::class)
public class MapStyleSheetEntries(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapStyleSheetEntries> {
    public override fun getValue() = MapStyleSheetEntries(pointer.getPointer(0))

    public fun setValue(value: MapStyleSheetEntries): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapStyleSheetEntries, MemoryAddress> {
    public val IMapStyleSheetEntriesStatics_Instance: IMapStyleSheetEntriesStatics by lazy {
      createIMapStyleSheetEntriesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapStyleSheetEntriesStatics(): IMapStyleSheetEntriesStatics {
      val refiid = Guid.REFIID(IMapStyleSheetEntriesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapStyleSheetEntries".toHandle(),refiid,interfacePtr)
      val result =
          IMapStyleSheetEntriesStatics.ABI.makeIMapStyleSheetEntriesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapStyleSheetEntries {
      val address = segment.toRawLongValue()
      return MapStyleSheetEntries(Pointer(address))
    }

    public override fun toNative(obj: MapStyleSheetEntries): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Area() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Area()

    public fun get_Airport() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Airport()

    public fun get_Cemetery() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Cemetery()

    public fun get_Continent() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Continent()

    public fun get_Education() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Education()

    public fun get_IndigenousPeoplesReserve() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_IndigenousPeoplesReserve()

    public fun get_Island() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Island()

    public fun get_Medical() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Medical()

    public fun get_Military() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Military()

    public fun get_Nautical() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Nautical()

    public fun get_Neighborhood() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Neighborhood()

    public fun get_Runway() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Runway()

    public fun get_Sand() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Sand()

    public fun get_ShoppingCenter() = ABI.IMapStyleSheetEntriesStatics_Instance.get_ShoppingCenter()

    public fun get_Stadium() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Stadium()

    public fun get_Vegetation() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Vegetation()

    public fun get_Forest() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Forest()

    public fun get_GolfCourse() = ABI.IMapStyleSheetEntriesStatics_Instance.get_GolfCourse()

    public fun get_Park() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Park()

    public fun get_PlayingField() = ABI.IMapStyleSheetEntriesStatics_Instance.get_PlayingField()

    public fun get_Reserve() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Reserve()

    public fun get_Point() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Point()

    public fun get_NaturalPoint() = ABI.IMapStyleSheetEntriesStatics_Instance.get_NaturalPoint()

    public fun get_Peak() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Peak()

    public fun get_VolcanicPeak() = ABI.IMapStyleSheetEntriesStatics_Instance.get_VolcanicPeak()

    public fun get_WaterPoint() = ABI.IMapStyleSheetEntriesStatics_Instance.get_WaterPoint()

    public fun get_PointOfInterest() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_PointOfInterest()

    public fun get_Business() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Business()

    public fun get_FoodPoint() = ABI.IMapStyleSheetEntriesStatics_Instance.get_FoodPoint()

    public fun get_PopulatedPlace() = ABI.IMapStyleSheetEntriesStatics_Instance.get_PopulatedPlace()

    public fun get_Capital() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Capital()

    public fun get_AdminDistrictCapital() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_AdminDistrictCapital()

    public fun get_CountryRegionCapital() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_CountryRegionCapital()

    public fun get_RoadShield() = ABI.IMapStyleSheetEntriesStatics_Instance.get_RoadShield()

    public fun get_RoadExit() = ABI.IMapStyleSheetEntriesStatics_Instance.get_RoadExit()

    public fun get_Transit() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Transit()

    public fun get_Political() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Political()

    public fun get_CountryRegion() = ABI.IMapStyleSheetEntriesStatics_Instance.get_CountryRegion()

    public fun get_AdminDistrict() = ABI.IMapStyleSheetEntriesStatics_Instance.get_AdminDistrict()

    public fun get_District() = ABI.IMapStyleSheetEntriesStatics_Instance.get_District()

    public fun get_Structure() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Structure()

    public fun get_Building() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Building()

    public fun get_EducationBuilding() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_EducationBuilding()

    public fun get_MedicalBuilding() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_MedicalBuilding()

    public fun get_TransitBuilding() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_TransitBuilding()

    public fun get_Transportation() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Transportation()

    public fun get_Road() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Road()

    public fun get_ControlledAccessHighway() =
        ABI.IMapStyleSheetEntriesStatics_Instance.get_ControlledAccessHighway()

    public fun get_HighSpeedRamp() = ABI.IMapStyleSheetEntriesStatics_Instance.get_HighSpeedRamp()

    public fun get_Highway() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Highway()

    public fun get_MajorRoad() = ABI.IMapStyleSheetEntriesStatics_Instance.get_MajorRoad()

    public fun get_ArterialRoad() = ABI.IMapStyleSheetEntriesStatics_Instance.get_ArterialRoad()

    public fun get_Street() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Street()

    public fun get_Ramp() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Ramp()

    public fun get_UnpavedStreet() = ABI.IMapStyleSheetEntriesStatics_Instance.get_UnpavedStreet()

    public fun get_TollRoad() = ABI.IMapStyleSheetEntriesStatics_Instance.get_TollRoad()

    public fun get_Railway() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Railway()

    public fun get_Trail() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Trail()

    public fun get_WaterRoute() = ABI.IMapStyleSheetEntriesStatics_Instance.get_WaterRoute()

    public fun get_Water() = ABI.IMapStyleSheetEntriesStatics_Instance.get_Water()

    public fun get_River() = ABI.IMapStyleSheetEntriesStatics_Instance.get_River()

    public fun get_RouteLine() = ABI.IMapStyleSheetEntriesStatics_Instance.get_RouteLine()

    public fun get_WalkingRoute() = ABI.IMapStyleSheetEntriesStatics_Instance.get_WalkingRoute()

    public fun get_DrivingRoute() = ABI.IMapStyleSheetEntriesStatics_Instance.get_DrivingRoute()
  }
}
