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

@ABIMarker(ColorSpectrumShape.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.ColorSpectrumShape;i4)")
@WinRTByReference(brClass = ColorSpectrumShape.ByReference::class)
public enum class ColorSpectrumShape(
  public val value: Int
) : NativeMapped {
  Box(0),
  Ring(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorSpectrumShape {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Box
      1 -> Ring
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorSpectrumShape> {
    public fun setValue(newValue: ColorSpectrumShape): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorSpectrumShape =
        ColorSpectrumShape.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorSpectrumShape, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorSpectrumShape =
        ColorSpectrumShape.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorSpectrumShape): Int = obj.value
  }
}
