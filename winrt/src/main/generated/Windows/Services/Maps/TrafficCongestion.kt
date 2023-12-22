package Windows.Services.Maps

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

@ABIMarker(TrafficCongestion.ABI::class)
@Signature("enum(Windows.Services.Maps.TrafficCongestion;i4)")
@WinRTByReference(brClass = TrafficCongestion.ByReference::class)
public enum class TrafficCongestion(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Light(1),
  Mild(2),
  Medium(3),
  Heavy(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TrafficCongestion {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Light
      2 -> Mild
      3 -> Medium
      4 -> Heavy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TrafficCongestion> {
    public fun setValue(newValue: TrafficCongestion): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TrafficCongestion =
        TrafficCongestion.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TrafficCongestion, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TrafficCongestion =
        TrafficCongestion.values()[0].fromNative(value, null)

    public override fun toNative(obj: TrafficCongestion): Int = obj.value
  }
}
