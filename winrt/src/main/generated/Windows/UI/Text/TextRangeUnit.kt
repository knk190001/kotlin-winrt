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

@ABIMarker(TextRangeUnit.ABI::class)
@Signature("enum(Windows.UI.Text.TextRangeUnit;i4)")
@WinRTByReference(brClass = TextRangeUnit.ByReference::class)
public enum class TextRangeUnit(
  public val value: Int
) : NativeMapped {
  Character(0),
  Word(1),
  Sentence(2),
  Paragraph(3),
  Line(4),
  Story(5),
  Screen(6),
  Section(7),
  Window(8),
  CharacterFormat(9),
  ParagraphFormat(10),
  Object(11),
  HardParagraph(12),
  Cluster(13),
  Bold(14),
  Italic(15),
  Underline(16),
  Strikethrough(17),
  ProtectedText(18),
  Link(19),
  SmallCaps(20),
  AllCaps(21),
  Hidden(22),
  Outline(23),
  Shadow(24),
  Imprint(25),
  Disabled(26),
  Revised(27),
  Subscript(28),
  Superscript(29),
  FontBound(30),
  LinkProtected(31),
  ContentLink(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextRangeUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Character
      1 -> Word
      2 -> Sentence
      3 -> Paragraph
      4 -> Line
      5 -> Story
      6 -> Screen
      7 -> Section
      8 -> Window
      9 -> CharacterFormat
      10 -> ParagraphFormat
      11 -> Object
      12 -> HardParagraph
      13 -> Cluster
      14 -> Bold
      15 -> Italic
      16 -> Underline
      17 -> Strikethrough
      18 -> ProtectedText
      19 -> Link
      20 -> SmallCaps
      21 -> AllCaps
      22 -> Hidden
      23 -> Outline
      24 -> Shadow
      25 -> Imprint
      26 -> Disabled
      27 -> Revised
      28 -> Subscript
      29 -> Superscript
      30 -> FontBound
      31 -> LinkProtected
      32 -> ContentLink
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextRangeUnit> {
    public fun setValue(newValue: TextRangeUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextRangeUnit =
        TextRangeUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextRangeUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextRangeUnit =
        TextRangeUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextRangeUnit): Int = obj.value
  }
}
