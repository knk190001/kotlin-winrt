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

@ABIMarker(MapRouteRestrictions.ABI::class)
@Signature("enum(Windows.Services.Maps.MapRouteRestrictions;u4)")
@WinRTByReference(brClass = MapRouteRestrictions.ByReference::class)
public enum class MapRouteRestrictions(
  public val value: Int
) : NativeMapped {
  None(0),
  Highways(1),
  TollRoads(2),
  Ferries(4),
  Tunnels(8),
  DirtRoads(16),
  Motorail(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapRouteRestrictions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Highways
      2 -> TollRoads
      4 -> Ferries
      8 -> Tunnels
      16 -> DirtRoads
      32 -> Motorail
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapRouteRestrictions> {
    public fun setValue(newValue: MapRouteRestrictions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapRouteRestrictions =
        MapRouteRestrictions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapRouteRestrictions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapRouteRestrictions =
        MapRouteRestrictions.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapRouteRestrictions): Int = obj.value
  }
}
