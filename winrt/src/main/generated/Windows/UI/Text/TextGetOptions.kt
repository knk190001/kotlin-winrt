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

@ABIMarker(TextGetOptions.ABI::class)
@Signature("enum(Windows.UI.Text.TextGetOptions;u4)")
@WinRTByReference(brClass = TextGetOptions.ByReference::class)
public enum class TextGetOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  AdjustCrlf(1),
  UseCrlf(2),
  UseObjectText(4),
  AllowFinalEop(8),
  NoHidden(32),
  IncludeNumbering(64),
  FormatRtf(8192),
  UseLf(16777216),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextGetOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AdjustCrlf
      2 -> UseCrlf
      4 -> UseObjectText
      8 -> AllowFinalEop
      32 -> NoHidden
      64 -> IncludeNumbering
      8192 -> FormatRtf
      16777216 -> UseLf
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextGetOptions> {
    public fun setValue(newValue: TextGetOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextGetOptions =
        TextGetOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextGetOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextGetOptions =
        TextGetOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextGetOptions): Int = obj.value
  }
}
