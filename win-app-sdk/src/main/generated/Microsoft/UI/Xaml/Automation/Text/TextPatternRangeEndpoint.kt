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

@ABIMarker(TextPatternRangeEndpoint.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Text.TextPatternRangeEndpoint;i4)")
@WinRTByReference(brClass = TextPatternRangeEndpoint.ByReference::class)
public enum class TextPatternRangeEndpoint(
  public val value: Int
) : NativeMapped {
  Start(0),
  End(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextPatternRangeEndpoint {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Start
      1 -> End
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextPatternRangeEndpoint>
      {
    public fun setValue(newValue: TextPatternRangeEndpoint): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextPatternRangeEndpoint =
        TextPatternRangeEndpoint.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextPatternRangeEndpoint, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextPatternRangeEndpoint =
        TextPatternRangeEndpoint.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextPatternRangeEndpoint): Int = obj.value
  }
}
