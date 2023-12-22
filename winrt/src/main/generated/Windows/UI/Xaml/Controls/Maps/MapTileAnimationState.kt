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

@ABIMarker(MapTileAnimationState.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapTileAnimationState;i4)")
@WinRTByReference(brClass = MapTileAnimationState.ByReference::class)
public enum class MapTileAnimationState(
  public val value: Int
) : NativeMapped {
  Stopped(0),
  Paused(1),
  Playing(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapTileAnimationState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Stopped
      1 -> Paused
      2 -> Playing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapTileAnimationState> {
    public fun setValue(newValue: MapTileAnimationState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapTileAnimationState =
        MapTileAnimationState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapTileAnimationState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapTileAnimationState =
        MapTileAnimationState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapTileAnimationState): Int = obj.value
  }
}
