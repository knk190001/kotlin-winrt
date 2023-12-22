package Windows.Services.Maps

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(ManeuverWarningKind.ABI::class)
@Signature("enum(Windows.Services.Maps.ManeuverWarningKind;i4)")
@WinRTByReference(brClass = ManeuverWarningKind.ByReference::class)
public enum class ManeuverWarningKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Accident(1),
  AdministrativeDivisionChange(2),
  Alert(3),
  BlockedRoad(4),
  CheckTimetable(5),
  Congestion(6),
  Construction(7),
  CountryChange(8),
  DisabledVehicle(9),
  GateAccess(10),
  GetOffTransit(11),
  GetOnTransit(12),
  IllegalUTurn(13),
  MassTransit(14),
  Miscellaneous(15),
  NoIncident(16),
  Other(17),
  OtherNews(18),
  OtherTrafficIncidents(19),
  PlannedEvent(20),
  PrivateRoad(21),
  RestrictedTurn(22),
  RoadClosures(23),
  RoadHazard(24),
  ScheduledConstruction(25),
  SeasonalClosures(26),
  Tollbooth(27),
  TollRoad(28),
  TollZoneEnter(29),
  TollZoneExit(30),
  TrafficFlow(31),
  TransitLineChange(32),
  UnpavedRoad(33),
  UnscheduledConstruction(34),
  Weather(35),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ManeuverWarningKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Accident
      2 -> AdministrativeDivisionChange
      3 -> Alert
      4 -> BlockedRoad
      5 -> CheckTimetable
      6 -> Congestion
      7 -> Construction
      8 -> CountryChange
      9 -> DisabledVehicle
      10 -> GateAccess
      11 -> GetOffTransit
      12 -> GetOnTransit
      13 -> IllegalUTurn
      14 -> MassTransit
      15 -> Miscellaneous
      16 -> NoIncident
      17 -> Other
      18 -> OtherNews
      19 -> OtherTrafficIncidents
      20 -> PlannedEvent
      21 -> PrivateRoad
      22 -> RestrictedTurn
      23 -> RoadClosures
      24 -> RoadHazard
      25 -> ScheduledConstruction
      26 -> SeasonalClosures
      27 -> Tollbooth
      28 -> TollRoad
      29 -> TollZoneEnter
      30 -> TollZoneExit
      31 -> TrafficFlow
      32 -> TransitLineChange
      33 -> UnpavedRoad
      34 -> UnscheduledConstruction
      35 -> Weather
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ManeuverWarningKind> {
    public fun setValue(newValue: ManeuverWarningKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ManeuverWarningKind =
        ManeuverWarningKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ManeuverWarningKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ManeuverWarningKind =
        ManeuverWarningKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ManeuverWarningKind): Int = obj.value
  }
}
