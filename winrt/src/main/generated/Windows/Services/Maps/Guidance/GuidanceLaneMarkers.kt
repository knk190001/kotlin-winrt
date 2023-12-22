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

@ABIMarker(GuidanceLaneMarkers.ABI::class)
@Signature("enum(Windows.Services.Maps.Guidance.GuidanceLaneMarkers;u4)")
@WinRTByReference(brClass = GuidanceLaneMarkers.ByReference::class)
public enum class GuidanceLaneMarkers(
  public val value: Int
) : NativeMapped {
  None(0),
  LightRight(1),
  Right(2),
  HardRight(4),
  Straight(8),
  UTurnLeft(16),
  HardLeft(32),
  Left(64),
  LightLeft(128),
  UTurnRight(256),
  Unknown(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GuidanceLaneMarkers {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LightRight
      2 -> Right
      4 -> HardRight
      8 -> Straight
      16 -> UTurnLeft
      32 -> HardLeft
      64 -> Left
      128 -> LightLeft
      256 -> UTurnRight
      -1 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GuidanceLaneMarkers> {
    public fun setValue(newValue: GuidanceLaneMarkers): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GuidanceLaneMarkers =
        GuidanceLaneMarkers.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GuidanceLaneMarkers, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GuidanceLaneMarkers =
        GuidanceLaneMarkers.values()[0].fromNative(value, null)

    public override fun toNative(obj: GuidanceLaneMarkers): Int = obj.value
  }
}
