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

@ABIMarker(MapRouteOptimization.ABI::class)
@Signature("enum(Windows.Services.Maps.MapRouteOptimization;i4)")
@WinRTByReference(brClass = MapRouteOptimization.ByReference::class)
public enum class MapRouteOptimization(
  public val value: Int
) : NativeMapped {
  Time(0),
  Distance(1),
  TimeWithTraffic(2),
  Scenic(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapRouteOptimization {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Time
      1 -> Distance
      2 -> TimeWithTraffic
      3 -> Scenic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapRouteOptimization> {
    public fun setValue(newValue: MapRouteOptimization): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapRouteOptimization =
        MapRouteOptimization.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapRouteOptimization, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapRouteOptimization =
        MapRouteOptimization.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapRouteOptimization): Int = obj.value
  }
}
