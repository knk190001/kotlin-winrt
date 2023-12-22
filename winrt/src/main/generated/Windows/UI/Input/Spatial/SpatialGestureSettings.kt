package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialGestureSettings.ABI::class)
@Signature("enum(Windows.UI.Input.Spatial.SpatialGestureSettings;u4)")
@WinRTByReference(brClass = SpatialGestureSettings.ByReference::class)
public enum class SpatialGestureSettings(
  public val value: Int
) : NativeMapped {
  None(0),
  Tap(1),
  DoubleTap(2),
  Hold(4),
  ManipulationTranslate(8),
  NavigationX(16),
  NavigationY(32),
  NavigationZ(64),
  NavigationRailsX(128),
  NavigationRailsY(256),
  NavigationRailsZ(512),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpatialGestureSettings {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Tap
      2 -> DoubleTap
      4 -> Hold
      8 -> ManipulationTranslate
      16 -> NavigationX
      32 -> NavigationY
      64 -> NavigationZ
      128 -> NavigationRailsX
      256 -> NavigationRailsY
      512 -> NavigationRailsZ
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SpatialGestureSettings> {
    public fun setValue(newValue: SpatialGestureSettings): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpatialGestureSettings =
        SpatialGestureSettings.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpatialGestureSettings, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpatialGestureSettings =
        SpatialGestureSettings.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpatialGestureSettings): Int = obj.value
  }
}
