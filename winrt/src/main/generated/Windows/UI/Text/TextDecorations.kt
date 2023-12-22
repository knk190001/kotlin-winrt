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

@ABIMarker(TextDecorations.ABI::class)
@Signature("enum(Windows.UI.Text.TextDecorations;u4)")
@WinRTByReference(brClass = TextDecorations.ByReference::class)
public enum class TextDecorations(
  public val value: Int
) : NativeMapped {
  None(0),
  Underline(1),
  Strikethrough(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextDecorations {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Underline
      2 -> Strikethrough
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextDecorations> {
    public fun setValue(newValue: TextDecorations): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextDecorations =
        TextDecorations.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextDecorations, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextDecorations =
        TextDecorations.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextDecorations): Int = obj.value
  }
}
