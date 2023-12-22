package Microsoft.UI.Input

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

@ABIMarker(GestureSettings.ABI::class)
@Signature("enum(Microsoft.UI.Input.GestureSettings;u4)")
@WinRTByReference(brClass = GestureSettings.ByReference::class)
public enum class GestureSettings(
  public val value: Int
) : NativeMapped {
  None(0),
  Tap(1),
  DoubleTap(2),
  Hold(4),
  HoldWithMouse(8),
  RightTap(16),
  Drag(32),
  ManipulationTranslateX(64),
  ManipulationTranslateY(128),
  ManipulationTranslateRailsX(256),
  ManipulationTranslateRailsY(512),
  ManipulationRotate(1024),
  ManipulationScale(2048),
  ManipulationTranslateInertia(4096),
  ManipulationRotateInertia(8192),
  ManipulationScaleInertia(16384),
  CrossSlide(32768),
  ManipulationMultipleFingerPanning(65536),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GestureSettings {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Tap
      2 -> DoubleTap
      4 -> Hold
      8 -> HoldWithMouse
      16 -> RightTap
      32 -> Drag
      64 -> ManipulationTranslateX
      128 -> ManipulationTranslateY
      256 -> ManipulationTranslateRailsX
      512 -> ManipulationTranslateRailsY
      1024 -> ManipulationRotate
      2048 -> ManipulationScale
      4096 -> ManipulationTranslateInertia
      8192 -> ManipulationRotateInertia
      16384 -> ManipulationScaleInertia
      32768 -> CrossSlide
      65536 -> ManipulationMultipleFingerPanning
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GestureSettings> {
    public fun setValue(newValue: GestureSettings): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GestureSettings =
        GestureSettings.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GestureSettings, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GestureSettings =
        GestureSettings.values()[0].fromNative(value, null)

    public override fun toNative(obj: GestureSettings): Int = obj.value
  }
}
