package Windows.UI.Xaml

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

@ABIMarker(FontEastAsianWidths.ABI::class)
@Signature("enum(Windows.UI.Xaml.FontEastAsianWidths;i4)")
@WinRTByReference(brClass = FontEastAsianWidths.ByReference::class)
public enum class FontEastAsianWidths(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Full(1),
  Half(2),
  Proportional(3),
  Quarter(4),
  Third(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FontEastAsianWidths {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Full
      2 -> Half
      3 -> Proportional
      4 -> Quarter
      5 -> Third
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FontEastAsianWidths> {
    public fun setValue(newValue: FontEastAsianWidths): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FontEastAsianWidths =
        FontEastAsianWidths.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FontEastAsianWidths, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FontEastAsianWidths =
        FontEastAsianWidths.values()[0].fromNative(value, null)

    public override fun toNative(obj: FontEastAsianWidths): Int = obj.value
  }
}
