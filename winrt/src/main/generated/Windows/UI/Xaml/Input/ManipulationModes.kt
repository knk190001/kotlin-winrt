package Windows.UI.Xaml.Input

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

@ABIMarker(ManipulationModes.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.ManipulationModes;u4)")
@WinRTByReference(brClass = ManipulationModes.ByReference::class)
public enum class ManipulationModes(
  public val value: Int
) : NativeMapped {
  None(0),
  TranslateX(1),
  TranslateY(2),
  TranslateRailsX(4),
  TranslateRailsY(8),
  Rotate(16),
  Scale(32),
  TranslateInertia(64),
  RotateInertia(128),
  ScaleInertia(256),
  All(65535),
  System(65536),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ManipulationModes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TranslateX
      2 -> TranslateY
      4 -> TranslateRailsX
      8 -> TranslateRailsY
      16 -> Rotate
      32 -> Scale
      64 -> TranslateInertia
      128 -> RotateInertia
      256 -> ScaleInertia
      65535 -> All
      65536 -> System
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ManipulationModes> {
    public fun setValue(newValue: ManipulationModes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ManipulationModes =
        ManipulationModes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ManipulationModes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ManipulationModes =
        ManipulationModes.values()[0].fromNative(value, null)

    public override fun toNative(obj: ManipulationModes): Int = obj.value
  }
}
