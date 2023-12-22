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

@ABIMarker(MapColorScheme.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapColorScheme;i4)")
@WinRTByReference(brClass = MapColorScheme.ByReference::class)
public enum class MapColorScheme(
  public val value: Int
) : NativeMapped {
  Light(0),
  Dark(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapColorScheme {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Light
      1 -> Dark
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapColorScheme> {
    public fun setValue(newValue: MapColorScheme): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapColorScheme =
        MapColorScheme.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapColorScheme, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapColorScheme =
        MapColorScheme.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapColorScheme): Int = obj.value
  }
}
