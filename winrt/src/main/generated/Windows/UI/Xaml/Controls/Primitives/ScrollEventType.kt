package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(ScrollEventType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.ScrollEventType;i4)")
@WinRTByReference(brClass = ScrollEventType.ByReference::class)
public enum class ScrollEventType(
  public val value: Int
) : NativeMapped {
  SmallDecrement(0),
  SmallIncrement(1),
  LargeDecrement(2),
  LargeIncrement(3),
  ThumbPosition(4),
  ThumbTrack(5),
  First(6),
  Last(7),
  EndScroll(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollEventType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SmallDecrement
      1 -> SmallIncrement
      2 -> LargeDecrement
      3 -> LargeIncrement
      4 -> ThumbPosition
      5 -> ThumbTrack
      6 -> First
      7 -> Last
      8 -> EndScroll
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollEventType> {
    public fun setValue(newValue: ScrollEventType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollEventType =
        ScrollEventType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollEventType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollEventType =
        ScrollEventType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollEventType): Int = obj.value
  }
}
