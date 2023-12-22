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

@ABIMarker(MarkerType.ABI::class)
@Signature("enum(Microsoft.UI.Text.MarkerType;i4)")
@WinRTByReference(brClass = MarkerType.ByReference::class)
public enum class MarkerType(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  None(1),
  Bullet(2),
  Arabic(3),
  LowercaseEnglishLetter(4),
  UppercaseEnglishLetter(5),
  LowercaseRoman(6),
  UppercaseRoman(7),
  UnicodeSequence(8),
  CircledNumber(9),
  BlackCircleWingding(10),
  WhiteCircleWingding(11),
  ArabicWide(12),
  SimplifiedChinese(13),
  TraditionalChinese(14),
  JapanSimplifiedChinese(15),
  JapanKorea(16),
  ArabicDictionary(17),
  ArabicAbjad(18),
  Hebrew(19),
  ThaiAlphabetic(20),
  ThaiNumeric(21),
  DevanagariVowel(22),
  DevanagariConsonant(23),
  DevanagariNumeric(24),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MarkerType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> None
      2 -> Bullet
      3 -> Arabic
      4 -> LowercaseEnglishLetter
      5 -> UppercaseEnglishLetter
      6 -> LowercaseRoman
      7 -> UppercaseRoman
      8 -> UnicodeSequence
      9 -> CircledNumber
      10 -> BlackCircleWingding
      11 -> WhiteCircleWingding
      12 -> ArabicWide
      13 -> SimplifiedChinese
      14 -> TraditionalChinese
      15 -> JapanSimplifiedChinese
      16 -> JapanKorea
      17 -> ArabicDictionary
      18 -> ArabicAbjad
      19 -> Hebrew
      20 -> ThaiAlphabetic
      21 -> ThaiNumeric
      22 -> DevanagariVowel
      23 -> DevanagariConsonant
      24 -> DevanagariNumeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MarkerType> {
    public fun setValue(newValue: MarkerType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MarkerType =
        MarkerType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MarkerType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MarkerType =
        MarkerType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MarkerType): Int = obj.value
  }
}
