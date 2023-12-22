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

@ABIMarker(MapRouteManeuverKind.ABI::class)
@Signature("enum(Windows.Services.Maps.MapRouteManeuverKind;i4)")
@WinRTByReference(brClass = MapRouteManeuverKind.ByReference::class)
public enum class MapRouteManeuverKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Start(1),
  Stopover(2),
  StopoverResume(3),
  End(4),
  GoStraight(5),
  UTurnLeft(6),
  UTurnRight(7),
  TurnKeepLeft(8),
  TurnKeepRight(9),
  TurnLightLeft(10),
  TurnLightRight(11),
  TurnLeft(12),
  TurnRight(13),
  TurnHardLeft(14),
  TurnHardRight(15),
  FreewayEnterLeft(16),
  FreewayEnterRight(17),
  FreewayLeaveLeft(18),
  FreewayLeaveRight(19),
  FreewayContinueLeft(20),
  FreewayContinueRight(21),
  TrafficCircleLeft(22),
  TrafficCircleRight(23),
  TakeFerry(24),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapRouteManeuverKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Start
      2 -> Stopover
      3 -> StopoverResume
      4 -> End
      5 -> GoStraight
      6 -> UTurnLeft
      7 -> UTurnRight
      8 -> TurnKeepLeft
      9 -> TurnKeepRight
      10 -> TurnLightLeft
      11 -> TurnLightRight
      12 -> TurnLeft
      13 -> TurnRight
      14 -> TurnHardLeft
      15 -> TurnHardRight
      16 -> FreewayEnterLeft
      17 -> FreewayEnterRight
      18 -> FreewayLeaveLeft
      19 -> FreewayLeaveRight
      20 -> FreewayContinueLeft
      21 -> FreewayContinueRight
      22 -> TrafficCircleLeft
      23 -> TrafficCircleRight
      24 -> TakeFerry
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapRouteManeuverKind> {
    public fun setValue(newValue: MapRouteManeuverKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapRouteManeuverKind =
        MapRouteManeuverKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapRouteManeuverKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapRouteManeuverKind =
        MapRouteManeuverKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapRouteManeuverKind): Int = obj.value
  }
}
