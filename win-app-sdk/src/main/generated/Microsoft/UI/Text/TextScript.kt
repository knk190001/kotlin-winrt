package Microsoft.UI.Text

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

@ABIMarker(TextScript.ABI::class)
@Signature("enum(Microsoft.UI.Text.TextScript;i4)")
@WinRTByReference(brClass = TextScript.ByReference::class)
public enum class TextScript(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Ansi(1),
  EastEurope(2),
  Cyrillic(3),
  Greek(4),
  Turkish(5),
  Hebrew(6),
  Arabic(7),
  Baltic(8),
  Vietnamese(9),
  Default(10),
  Symbol(11),
  Thai(12),
  ShiftJis(13),
  GB2312(14),
  Hangul(15),
  Big5(16),
  PC437(17),
  Oem(18),
  Mac(19),
  Armenian(20),
  Syriac(21),
  Thaana(22),
  Devanagari(23),
  Bengali(24),
  Gurmukhi(25),
  Gujarati(26),
  Oriya(27),
  Tamil(28),
  Telugu(29),
  Kannada(30),
  Malayalam(31),
  Sinhala(32),
  Lao(33),
  Tibetan(34),
  Myanmar(35),
  Georgian(36),
  Jamo(37),
  Ethiopic(38),
  Cherokee(39),
  Aboriginal(40),
  Ogham(41),
  Runic(42),
  Khmer(43),
  Mongolian(44),
  Braille(45),
  Yi(46),
  Limbu(47),
  TaiLe(48),
  NewTaiLue(49),
  SylotiNagri(50),
  Kharoshthi(51),
  Kayahli(52),
  UnicodeSymbol(53),
  Emoji(54),
  Glagolitic(55),
  Lisu(56),
  Vai(57),
  NKo(58),
  Osmanya(59),
  PhagsPa(60),
  Gothic(61),
  Deseret(62),
  Tifinagh(63),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextScript {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Ansi
      2 -> EastEurope
      3 -> Cyrillic
      4 -> Greek
      5 -> Turkish
      6 -> Hebrew
      7 -> Arabic
      8 -> Baltic
      9 -> Vietnamese
      10 -> Default
      11 -> Symbol
      12 -> Thai
      13 -> ShiftJis
      14 -> GB2312
      15 -> Hangul
      16 -> Big5
      17 -> PC437
      18 -> Oem
      19 -> Mac
      20 -> Armenian
      21 -> Syriac
      22 -> Thaana
      23 -> Devanagari
      24 -> Bengali
      25 -> Gurmukhi
      26 -> Gujarati
      27 -> Oriya
      28 -> Tamil
      29 -> Telugu
      30 -> Kannada
      31 -> Malayalam
      32 -> Sinhala
      33 -> Lao
      34 -> Tibetan
      35 -> Myanmar
      36 -> Georgian
      37 -> Jamo
      38 -> Ethiopic
      39 -> Cherokee
      40 -> Aboriginal
      41 -> Ogham
      42 -> Runic
      43 -> Khmer
      44 -> Mongolian
      45 -> Braille
      46 -> Yi
      47 -> Limbu
      48 -> TaiLe
      49 -> NewTaiLue
      50 -> SylotiNagri
      51 -> Kharoshthi
      52 -> Kayahli
      53 -> UnicodeSymbol
      54 -> Emoji
      55 -> Glagolitic
      56 -> Lisu
      57 -> Vai
      58 -> NKo
      59 -> Osmanya
      60 -> PhagsPa
      61 -> Gothic
      62 -> Deseret
      63 -> Tifinagh
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextScript> {
    public fun setValue(newValue: TextScript): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextScript =
        TextScript.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextScript, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextScript =
        TextScript.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextScript): Int = obj.value
  }
}
