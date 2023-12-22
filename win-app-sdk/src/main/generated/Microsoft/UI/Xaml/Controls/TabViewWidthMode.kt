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

@ABIMarker(TabViewWidthMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TabViewWidthMode;i4)")
@WinRTByReference(brClass = TabViewWidthMode.ByReference::class)
public enum class TabViewWidthMode(
  public val value: Int
) : NativeMapped {
  Equal(0),
  SizeToContent(1),
  Compact(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TabViewWidthMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Equal
      1 -> SizeToContent
      2 -> Compact
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TabViewWidthMode> {
    public fun setValue(newValue: TabViewWidthMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TabViewWidthMode =
        TabViewWidthMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TabViewWidthMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TabViewWidthMode =
        TabViewWidthMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TabViewWidthMode): Int = obj.value
  }
}
