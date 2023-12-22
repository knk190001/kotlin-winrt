package Windows.Media.ClosedCaptioning

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

@ABIMarker(ClosedCaptionColor.ABI::class)
@Signature("enum(Windows.Media.ClosedCaptioning.ClosedCaptionColor;i4)")
@WinRTByReference(brClass = ClosedCaptionColor.ByReference::class)
public enum class ClosedCaptionColor(
  public val value: Int
) : NativeMapped {
  Default(0),
  White(1),
  Black(2),
  Red(3),
  Green(4),
  Blue(5),
  Yellow(6),
  Magenta(7),
  Cyan(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ClosedCaptionColor {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> White
      2 -> Black
      3 -> Red
      4 -> Green
      5 -> Blue
      6 -> Yellow
      7 -> Magenta
      8 -> Cyan
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ClosedCaptionColor> {
    public fun setValue(newValue: ClosedCaptionColor): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ClosedCaptionColor =
        ClosedCaptionColor.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ClosedCaptionColor, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ClosedCaptionColor =
        ClosedCaptionColor.values()[0].fromNative(value, null)

    public override fun toNative(obj: ClosedCaptionColor): Int = obj.value
  }
}
