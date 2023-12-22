package Windows.Media.Capture

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

@ABIMarker(PowerlineFrequency.ABI::class)
@Signature("enum(Windows.Media.Capture.PowerlineFrequency;i4)")
@WinRTByReference(brClass = PowerlineFrequency.ByReference::class)
public enum class PowerlineFrequency(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  FiftyHertz(1),
  SixtyHertz(2),
  Auto(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PowerlineFrequency {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> FiftyHertz
      2 -> SixtyHertz
      3 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PowerlineFrequency> {
    public fun setValue(newValue: PowerlineFrequency): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PowerlineFrequency =
        PowerlineFrequency.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PowerlineFrequency, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PowerlineFrequency =
        PowerlineFrequency.values()[0].fromNative(value, null)

    public override fun toNative(obj: PowerlineFrequency): Int = obj.value
  }
}
