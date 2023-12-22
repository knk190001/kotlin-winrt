package Microsoft.UI.Xaml.Automation

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

@ABIMarker(ScrollAmount.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.ScrollAmount;i4)")
@WinRTByReference(brClass = ScrollAmount.ByReference::class)
public enum class ScrollAmount(
  public val value: Int
) : NativeMapped {
  LargeDecrement(0),
  SmallDecrement(1),
  NoAmount(2),
  LargeIncrement(3),
  SmallIncrement(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollAmount {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LargeDecrement
      1 -> SmallDecrement
      2 -> NoAmount
      3 -> LargeIncrement
      4 -> SmallIncrement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollAmount> {
    public fun setValue(newValue: ScrollAmount): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollAmount =
        ScrollAmount.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollAmount, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollAmount =
        ScrollAmount.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollAmount): Int = obj.value
  }
}
