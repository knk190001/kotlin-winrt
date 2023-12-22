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

@ABIMarker(MapVisibleRegionKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapVisibleRegionKind;i4)")
@WinRTByReference(brClass = MapVisibleRegionKind.ByReference::class)
public enum class MapVisibleRegionKind(
  public val value: Int
) : NativeMapped {
  Near(0),
  Full(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapVisibleRegionKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Near
      1 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapVisibleRegionKind> {
    public fun setValue(newValue: MapVisibleRegionKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapVisibleRegionKind =
        MapVisibleRegionKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapVisibleRegionKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapVisibleRegionKind =
        MapVisibleRegionKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapVisibleRegionKind): Int = obj.value
  }
}
