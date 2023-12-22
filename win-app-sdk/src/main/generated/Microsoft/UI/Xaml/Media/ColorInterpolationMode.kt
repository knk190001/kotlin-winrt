package Microsoft.UI.Xaml.Media

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

@ABIMarker(ColorInterpolationMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.ColorInterpolationMode;i4)")
@WinRTByReference(brClass = ColorInterpolationMode.ByReference::class)
public enum class ColorInterpolationMode(
  public val value: Int
) : NativeMapped {
  ScRgbLinearInterpolation(0),
  SRgbLinearInterpolation(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorInterpolationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ScRgbLinearInterpolation
      1 -> SRgbLinearInterpolation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorInterpolationMode> {
    public fun setValue(newValue: ColorInterpolationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorInterpolationMode =
        ColorInterpolationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorInterpolationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorInterpolationMode =
        ColorInterpolationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorInterpolationMode): Int = obj.value
  }
}
