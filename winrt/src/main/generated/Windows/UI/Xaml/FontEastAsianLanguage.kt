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

@ABIMarker(FontEastAsianLanguage.ABI::class)
@Signature("enum(Windows.UI.Xaml.FontEastAsianLanguage;i4)")
@WinRTByReference(brClass = FontEastAsianLanguage.ByReference::class)
public enum class FontEastAsianLanguage(
  public val value: Int
) : NativeMapped {
  Normal(0),
  HojoKanji(1),
  Jis04(2),
  Jis78(3),
  Jis83(4),
  Jis90(5),
  NlcKanji(6),
  Simplified(7),
  Traditional(8),
  TraditionalNames(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FontEastAsianLanguage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> HojoKanji
      2 -> Jis04
      3 -> Jis78
      4 -> Jis83
      5 -> Jis90
      6 -> NlcKanji
      7 -> Simplified
      8 -> Traditional
      9 -> TraditionalNames
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FontEastAsianLanguage> {
    public fun setValue(newValue: FontEastAsianLanguage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FontEastAsianLanguage =
        FontEastAsianLanguage.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FontEastAsianLanguage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FontEastAsianLanguage =
        FontEastAsianLanguage.values()[0].fromNative(value, null)

    public override fun toNative(obj: FontEastAsianLanguage): Int = obj.value
  }
}
