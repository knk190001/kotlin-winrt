package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapTileLayer.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapTileLayer;i4)")
@WinRTByReference(brClass = MapTileLayer.ByReference::class)
public enum class MapTileLayer(
  public val value: Int
) : NativeMapped {
  LabelOverlay(0),
  RoadOverlay(1),
  AreaOverlay(2),
  BackgroundOverlay(3),
  BackgroundReplacement(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapTileLayer {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LabelOverlay
      1 -> RoadOverlay
      2 -> AreaOverlay
      3 -> BackgroundOverlay
      4 -> BackgroundReplacement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapTileLayer> {
    public fun setValue(newValue: MapTileLayer): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapTileLayer =
        MapTileLayer.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapTileLayer, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapTileLayer =
        MapTileLayer.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapTileLayer): Int = obj.value
  }
}
