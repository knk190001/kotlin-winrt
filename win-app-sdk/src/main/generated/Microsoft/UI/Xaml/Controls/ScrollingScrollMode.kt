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

@ABIMarker(ScrollingScrollMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingScrollMode;i4)")
@WinRTByReference(brClass = ScrollingScrollMode.ByReference::class)
public enum class ScrollingScrollMode(
  public val value: Int
) : NativeMapped {
  Enabled(0),
  Disabled(1),
  Auto(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingScrollMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Enabled
      1 -> Disabled
      2 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollingScrollMode> {
    public fun setValue(newValue: ScrollingScrollMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingScrollMode =
        ScrollingScrollMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingScrollMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingScrollMode =
        ScrollingScrollMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingScrollMode): Int = obj.value
  }
}
