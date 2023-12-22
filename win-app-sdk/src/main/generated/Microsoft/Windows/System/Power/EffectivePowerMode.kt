package Microsoft.Windows.System.Power

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

@ABIMarker(EffectivePowerMode.ABI::class)
@Signature("enum(Microsoft.Windows.System.Power.EffectivePowerMode;i4)")
@WinRTByReference(brClass = EffectivePowerMode.ByReference::class)
public enum class EffectivePowerMode(
  public val value: Int
) : NativeMapped {
  BatterySaver(0),
  BetterBattery(1),
  Balanced(2),
  HighPerformance(3),
  MaxPerformance(4),
  GameMode(5),
  MixedReality(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EffectivePowerMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BatterySaver
      1 -> BetterBattery
      2 -> Balanced
      3 -> HighPerformance
      4 -> MaxPerformance
      5 -> GameMode
      6 -> MixedReality
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EffectivePowerMode> {
    public fun setValue(newValue: EffectivePowerMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EffectivePowerMode =
        EffectivePowerMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EffectivePowerMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EffectivePowerMode =
        EffectivePowerMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: EffectivePowerMode): Int = obj.value
  }
}
