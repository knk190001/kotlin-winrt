package Microsoft.UI.Xaml.Automation.Text

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

@ABIMarker(TextUnit.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Text.TextUnit;i4)")
@WinRTByReference(brClass = TextUnit.ByReference::class)
public enum class TextUnit(
  public val value: Int
) : NativeMapped {
  Character(0),
  Format(1),
  Word(2),
  Line(3),
  Paragraph(4),
  Page(5),
  Document(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): TextUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Character
      1 -> Format
      2 -> Word
      3 -> Line
      4 -> Paragraph
      5 -> Page
      6 -> Document
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextUnit> {
    public fun setValue(newValue: TextUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextUnit =
        TextUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextUnit =
        TextUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextUnit): Int = obj.value
  }
}
