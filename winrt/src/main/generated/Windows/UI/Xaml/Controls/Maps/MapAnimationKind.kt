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

@ABIMarker(MapAnimationKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapAnimationKind;i4)")
@WinRTByReference(brClass = MapAnimationKind.ByReference::class)
public enum class MapAnimationKind(
  public val value: Int
) : NativeMapped {
  Default(0),
  None(1),
  Linear(2),
  Bow(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapAnimationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> None
      2 -> Linear
      3 -> Bow
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapAnimationKind> {
    public fun setValue(newValue: MapAnimationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapAnimationKind =
        MapAnimationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapAnimationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapAnimationKind =
        MapAnimationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapAnimationKind): Int = obj.value
  }
}
