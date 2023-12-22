package Windows.UI.Text

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

@ABIMarker(FontStyle.ABI::class)
@Signature("enum(Windows.UI.Text.FontStyle;i4)")
@WinRTByReference(brClass = FontStyle.ByReference::class)
public enum class FontStyle(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Oblique(1),
  Italic(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): FontStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Oblique
      2 -> Italic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FontStyle> {
    public fun setValue(newValue: FontStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FontStyle =
        FontStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FontStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FontStyle =
        FontStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: FontStyle): Int = obj.value
  }
}
