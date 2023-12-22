package Microsoft.UI.Xaml

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

@ABIMarker(TextAlignment.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.TextAlignment;i4)")
@WinRTByReference(brClass = TextAlignment.ByReference::class)
public enum class TextAlignment(
  public val value: Int
) : NativeMapped {
  Center(0),
  Left(1),
  Start(1),
  Right(2),
  End(2),
  Justify(3),
  DetectFromContent(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Center
      1 -> Left
      1 -> Start
      2 -> Right
      2 -> End
      3 -> Justify
      4 -> DetectFromContent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextAlignment> {
    public fun setValue(newValue: TextAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextAlignment =
        TextAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextAlignment =
        TextAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextAlignment): Int = obj.value
  }
}
