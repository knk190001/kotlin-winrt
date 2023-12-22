package Windows.Devices.Sensors

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

@ABIMarker(MagnetometerAccuracy.ABI::class)
@Signature("enum(Windows.Devices.Sensors.MagnetometerAccuracy;i4)")
@WinRTByReference(brClass = MagnetometerAccuracy.ByReference::class)
public enum class MagnetometerAccuracy(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Unreliable(1),
  Approximate(2),
  High(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MagnetometerAccuracy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Unreliable
      2 -> Approximate
      3 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MagnetometerAccuracy> {
    public fun setValue(newValue: MagnetometerAccuracy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MagnetometerAccuracy =
        MagnetometerAccuracy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MagnetometerAccuracy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MagnetometerAccuracy =
        MagnetometerAccuracy.values()[0].fromNative(value, null)

    public override fun toNative(obj: MagnetometerAccuracy): Int = obj.value
  }
}
