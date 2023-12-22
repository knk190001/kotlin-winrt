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

@ABIMarker(MapManeuverNotices.ABI::class)
@Signature("enum(Windows.Services.Maps.MapManeuverNotices;u4)")
@WinRTByReference(brClass = MapManeuverNotices.ByReference::class)
public enum class MapManeuverNotices(
  public val value: Int
) : NativeMapped {
  None(0),
  Toll(1),
  Unpaved(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapManeuverNotices {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Toll
      2 -> Unpaved
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapManeuverNotices> {
    public fun setValue(newValue: MapManeuverNotices): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapManeuverNotices =
        MapManeuverNotices.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapManeuverNotices, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapManeuverNotices =
        MapManeuverNotices.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapManeuverNotices): Int = obj.value
  }
}
