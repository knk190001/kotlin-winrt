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

@ABIMarker(ParagraphStyle.ABI::class)
@Signature("enum(Windows.UI.Text.ParagraphStyle;i4)")
@WinRTByReference(brClass = ParagraphStyle.ByReference::class)
public enum class ParagraphStyle(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  None(1),
  Normal(2),
  Heading1(3),
  Heading2(4),
  Heading3(5),
  Heading4(6),
  Heading5(7),
  Heading6(8),
  Heading7(9),
  Heading8(10),
  Heading9(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ParagraphStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> None
      2 -> Normal
      3 -> Heading1
      4 -> Heading2
      5 -> Heading3
      6 -> Heading4
      7 -> Heading5
      8 -> Heading6
      9 -> Heading7
      10 -> Heading8
      11 -> Heading9
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ParagraphStyle> {
    public fun setValue(newValue: ParagraphStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ParagraphStyle =
        ParagraphStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ParagraphStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ParagraphStyle =
        ParagraphStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: ParagraphStyle): Int = obj.value
  }
}
