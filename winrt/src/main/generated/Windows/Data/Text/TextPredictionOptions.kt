package Windows.Data.Text

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

@ABIMarker(TextPredictionOptions.ABI::class)
@Signature("enum(Windows.Data.Text.TextPredictionOptions;u4)")
@WinRTByReference(brClass = TextPredictionOptions.ByReference::class)
public enum class TextPredictionOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  Predictions(1),
  Corrections(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextPredictionOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Predictions
      2 -> Corrections
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextPredictionOptions> {
    public fun setValue(newValue: TextPredictionOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextPredictionOptions =
        TextPredictionOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextPredictionOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextPredictionOptions =
        TextPredictionOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextPredictionOptions): Int = obj.value
  }
}
