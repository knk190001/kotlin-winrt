package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceAudioMeasurementSystem.ABI::class)
@Signature("enum(Windows.Services.Maps.Guidance.GuidanceAudioMeasurementSystem;i4)")
@WinRTByReference(brClass = GuidanceAudioMeasurementSystem.ByReference::class)
public enum class GuidanceAudioMeasurementSystem(
  public val value: Int
) : NativeMapped {
  Meters(0),
  MilesAndYards(1),
  MilesAndFeet(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GuidanceAudioMeasurementSystem {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Meters
      1 -> MilesAndYards
      2 -> MilesAndFeet
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GuidanceAudioMeasurementSystem> {
    public fun setValue(newValue: GuidanceAudioMeasurementSystem): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GuidanceAudioMeasurementSystem =
        GuidanceAudioMeasurementSystem.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GuidanceAudioMeasurementSystem, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GuidanceAudioMeasurementSystem =
        GuidanceAudioMeasurementSystem.values()[0].fromNative(value, null)

    public override fun toNative(obj: GuidanceAudioMeasurementSystem): Int = obj.value
  }
}
