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

@ABIMarker(ScrollMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollMode;i4)")
@WinRTByReference(brClass = ScrollMode.ByReference::class)
public enum class ScrollMode(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  Enabled(1),
  Auto(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> Enabled
      2 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollMode> {
    public fun setValue(newValue: ScrollMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollMode =
        ScrollMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollMode =
        ScrollMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollMode): Int = obj.value
  }
}
