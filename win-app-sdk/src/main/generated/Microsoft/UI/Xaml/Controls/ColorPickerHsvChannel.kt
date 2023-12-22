package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ColorPickerHsvChannel.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ColorPickerHsvChannel;i4)")
@WinRTByReference(brClass = ColorPickerHsvChannel.ByReference::class)
public enum class ColorPickerHsvChannel(
  public val value: Int
) : NativeMapped {
  Hue(0),
  Saturation(1),
  Value(2),
  Alpha(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorPickerHsvChannel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Hue
      1 -> Saturation
      2 -> Value
      3 -> Alpha
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorPickerHsvChannel> {
    public fun setValue(newValue: ColorPickerHsvChannel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorPickerHsvChannel =
        ColorPickerHsvChannel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorPickerHsvChannel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorPickerHsvChannel =
        ColorPickerHsvChannel.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorPickerHsvChannel): Int = obj.value
  }
}
