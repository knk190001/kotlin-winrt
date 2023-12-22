package Windows.UI.Xaml.Controls

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

@ABIMarker(ColorSpectrumComponents.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.ColorSpectrumComponents;i4)")
@WinRTByReference(brClass = ColorSpectrumComponents.ByReference::class)
public enum class ColorSpectrumComponents(
  public val value: Int
) : NativeMapped {
  HueValue(0),
  ValueHue(1),
  HueSaturation(2),
  SaturationHue(3),
  SaturationValue(4),
  ValueSaturation(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorSpectrumComponents {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HueValue
      1 -> ValueHue
      2 -> HueSaturation
      3 -> SaturationHue
      4 -> SaturationValue
      5 -> ValueSaturation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorSpectrumComponents> {
    public fun setValue(newValue: ColorSpectrumComponents): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorSpectrumComponents =
        ColorSpectrumComponents.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorSpectrumComponents, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorSpectrumComponents =
        ColorSpectrumComponents.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorSpectrumComponents): Int = obj.value
  }
}
