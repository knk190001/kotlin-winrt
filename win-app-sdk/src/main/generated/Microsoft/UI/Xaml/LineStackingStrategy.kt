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

@ABIMarker(LineStackingStrategy.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.LineStackingStrategy;i4)")
@WinRTByReference(brClass = LineStackingStrategy.ByReference::class)
public enum class LineStackingStrategy(
  public val value: Int
) : NativeMapped {
  MaxHeight(0),
  BlockLineHeight(1),
  BaselineToBaseline(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LineStackingStrategy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> MaxHeight
      1 -> BlockLineHeight
      2 -> BaselineToBaseline
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LineStackingStrategy> {
    public fun setValue(newValue: LineStackingStrategy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LineStackingStrategy =
        LineStackingStrategy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LineStackingStrategy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LineStackingStrategy =
        LineStackingStrategy.values()[0].fromNative(value, null)

    public override fun toNative(obj: LineStackingStrategy): Int = obj.value
  }
}
