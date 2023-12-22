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

@ABIMarker(ScrollingChainMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingChainMode;i4)")
@WinRTByReference(brClass = ScrollingChainMode.ByReference::class)
public enum class ScrollingChainMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Always(1),
  Never(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingChainMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Always
      2 -> Never
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollingChainMode> {
    public fun setValue(newValue: ScrollingChainMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingChainMode =
        ScrollingChainMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingChainMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingChainMode =
        ScrollingChainMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingChainMode): Int = obj.value
  }
}
