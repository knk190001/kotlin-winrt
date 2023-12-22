package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceManeuverKind.ABI::class)
@Signature("enum(Windows.Services.Maps.Guidance.GuidanceManeuverKind;i4)")
@WinRTByReference(brClass = GuidanceManeuverKind.ByReference::class)
public enum class GuidanceManeuverKind(
  public val value: Int
) : NativeMapped {
  None(0),
  GoStraight(1),
  UTurnRight(2),
  UTurnLeft(3),
  TurnKeepRight(4),
  TurnLightRight(5),
  TurnRight(6),
  TurnHardRight(7),
  KeepMiddle(8),
  TurnKeepLeft(9),
  TurnLightLeft(10),
  TurnLeft(11),
  TurnHardLeft(12),
  FreewayEnterRight(13),
  FreewayEnterLeft(14),
  FreewayLeaveRight(15),
  FreewayLeaveLeft(16),
  FreewayKeepRight(17),
  FreewayKeepLeft(18),
  TrafficCircleRight1(19),
  TrafficCircleRight2(20),
  TrafficCircleRight3(21),
  TrafficCircleRight4(22),
  TrafficCircleRight5(23),
  TrafficCircleRight6(24),
  TrafficCircleRight7(25),
  TrafficCircleRight8(26),
  TrafficCircleRight9(27),
  TrafficCircleRight10(28),
  TrafficCircleRight11(29),
  TrafficCircleRight12(30),
  TrafficCircleLeft1(31),
  TrafficCircleLeft2(32),
  TrafficCircleLeft3(33),
  TrafficCircleLeft4(34),
  TrafficCircleLeft5(35),
  TrafficCircleLeft6(36),
  TrafficCircleLeft7(37),
  TrafficCircleLeft8(38),
  TrafficCircleLeft9(39),
  TrafficCircleLeft10(40),
  TrafficCircleLeft11(41),
  TrafficCircleLeft12(42),
  Start(43),
  End(44),
  TakeFerry(45),
  PassTransitStation(46),
  LeaveTransitStation(47),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GuidanceManeuverKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> GoStraight
      2 -> UTurnRight
      3 -> UTurnLeft
      4 -> TurnKeepRight
      5 -> TurnLightRight
      6 -> TurnRight
      7 -> TurnHardRight
      8 -> KeepMiddle
      9 -> TurnKeepLeft
      10 -> TurnLightLeft
      11 -> TurnLeft
      12 -> TurnHardLeft
      13 -> FreewayEnterRight
      14 -> FreewayEnterLeft
      15 -> FreewayLeaveRight
      16 -> FreewayLeaveLeft
      17 -> FreewayKeepRight
      18 -> FreewayKeepLeft
      19 -> TrafficCircleRight1
      20 -> TrafficCircleRight2
      21 -> TrafficCircleRight3
      22 -> TrafficCircleRight4
      23 -> TrafficCircleRight5
      24 -> TrafficCircleRight6
      25 -> TrafficCircleRight7
      26 -> TrafficCircleRight8
      27 -> TrafficCircleRight9
      28 -> TrafficCircleRight10
      29 -> TrafficCircleRight11
      30 -> TrafficCircleRight12
      31 -> TrafficCircleLeft1
      32 -> TrafficCircleLeft2
      33 -> TrafficCircleLeft3
      34 -> TrafficCircleLeft4
      35 -> TrafficCircleLeft5
      36 -> TrafficCircleLeft6
      37 -> TrafficCircleLeft7
      38 -> TrafficCircleLeft8
      39 -> TrafficCircleLeft9
      40 -> TrafficCircleLeft10
      41 -> TrafficCircleLeft11
      42 -> TrafficCircleLeft12
      43 -> Start
      44 -> End
      45 -> TakeFerry
      46 -> PassTransitStation
      47 -> LeaveTransitStation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GuidanceManeuverKind> {
    public fun setValue(newValue: GuidanceManeuverKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GuidanceManeuverKind =
        GuidanceManeuverKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GuidanceManeuverKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GuidanceManeuverKind =
        GuidanceManeuverKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: GuidanceManeuverKind): Int = obj.value
  }
}
