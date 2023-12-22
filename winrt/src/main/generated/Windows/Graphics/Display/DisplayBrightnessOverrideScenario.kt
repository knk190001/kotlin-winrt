package Windows.Graphics.Display

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

@ABIMarker(DisplayBrightnessOverrideScenario.ABI::class)
@Signature("enum(Windows.Graphics.Display.DisplayBrightnessOverrideScenario;i4)")
@WinRTByReference(brClass = DisplayBrightnessOverrideScenario.ByReference::class)
public enum class DisplayBrightnessOverrideScenario(
  public val value: Int
) : NativeMapped {
  IdleBrightness(0),
  BarcodeReadingBrightness(1),
  FullBrightness(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayBrightnessOverrideScenario {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> IdleBrightness
      1 -> BarcodeReadingBrightness
      2 -> FullBrightness
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayBrightnessOverrideScenario> {
    public fun setValue(newValue: DisplayBrightnessOverrideScenario): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayBrightnessOverrideScenario =
        DisplayBrightnessOverrideScenario.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayBrightnessOverrideScenario, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayBrightnessOverrideScenario =
        DisplayBrightnessOverrideScenario.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayBrightnessOverrideScenario): Int = obj.value
  }
}
