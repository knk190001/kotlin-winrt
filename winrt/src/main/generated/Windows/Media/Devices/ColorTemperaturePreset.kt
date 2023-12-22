package Windows.Media.Devices

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

@ABIMarker(ColorTemperaturePreset.ABI::class)
@Signature("enum(Windows.Media.Devices.ColorTemperaturePreset;i4)")
@WinRTByReference(brClass = ColorTemperaturePreset.ByReference::class)
public enum class ColorTemperaturePreset(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Manual(1),
  Cloudy(2),
  Daylight(3),
  Flash(4),
  Fluorescent(5),
  Tungsten(6),
  Candlelight(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorTemperaturePreset {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Manual
      2 -> Cloudy
      3 -> Daylight
      4 -> Flash
      5 -> Fluorescent
      6 -> Tungsten
      7 -> Candlelight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorTemperaturePreset> {
    public fun setValue(newValue: ColorTemperaturePreset): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorTemperaturePreset =
        ColorTemperaturePreset.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorTemperaturePreset, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorTemperaturePreset =
        ColorTemperaturePreset.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorTemperaturePreset): Int = obj.value
  }
}
