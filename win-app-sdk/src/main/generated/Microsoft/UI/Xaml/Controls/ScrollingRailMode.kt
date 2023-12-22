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

@ABIMarker(ScrollingRailMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingRailMode;i4)")
@WinRTByReference(brClass = ScrollingRailMode.ByReference::class)
public enum class ScrollingRailMode(
  public val value: Int
) : NativeMapped {
  Enabled(0),
  Disabled(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingRailMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Enabled
      1 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollingRailMode> {
    public fun setValue(newValue: ScrollingRailMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingRailMode =
        ScrollingRailMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingRailMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingRailMode =
        ScrollingRailMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingRailMode): Int = obj.value
  }
}
