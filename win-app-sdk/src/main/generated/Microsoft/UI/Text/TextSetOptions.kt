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

@ABIMarker(TextSetOptions.ABI::class)
@Signature("enum(Microsoft.UI.Text.TextSetOptions;u4)")
@WinRTByReference(brClass = TextSetOptions.ByReference::class)
public enum class TextSetOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  UnicodeBidi(1),
  Unlink(8),
  Unhide(16),
  CheckTextLimit(32),
  FormatRtf(8192),
  ApplyRtfDocumentDefaults(16384),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextSetOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> UnicodeBidi
      8 -> Unlink
      16 -> Unhide
      32 -> CheckTextLimit
      8192 -> FormatRtf
      16384 -> ApplyRtfDocumentDefaults
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextSetOptions> {
    public fun setValue(newValue: TextSetOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextSetOptions =
        TextSetOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextSetOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextSetOptions =
        TextSetOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextSetOptions): Int = obj.value
  }
}
