package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ScrollingContentOrientation.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingContentOrientation;i4)")
@WinRTByReference(brClass = ScrollingContentOrientation.ByReference::class)
public enum class ScrollingContentOrientation(
  public val value: Int
) : NativeMapped {
  Vertical(0),
  Horizontal(1),
  None(2),
  Both(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingContentOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Vertical
      1 -> Horizontal
      2 -> None
      3 -> Both
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ScrollingContentOrientation> {
    public fun setValue(newValue: ScrollingContentOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingContentOrientation =
        ScrollingContentOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingContentOrientation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingContentOrientation =
        ScrollingContentOrientation.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingContentOrientation): Int = obj.value
  }
}
