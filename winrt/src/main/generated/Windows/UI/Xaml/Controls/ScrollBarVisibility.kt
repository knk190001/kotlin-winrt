package Windows.UI.Xaml.Controls

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

@ABIMarker(ScrollBarVisibility.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.ScrollBarVisibility;i4)")
@WinRTByReference(brClass = ScrollBarVisibility.ByReference::class)
public enum class ScrollBarVisibility(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  Auto(1),
  Hidden(2),
  Visible(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollBarVisibility {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> Auto
      2 -> Hidden
      3 -> Visible
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollBarVisibility> {
    public fun setValue(newValue: ScrollBarVisibility): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollBarVisibility =
        ScrollBarVisibility.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollBarVisibility, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollBarVisibility =
        ScrollBarVisibility.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollBarVisibility): Int = obj.value
  }
}
