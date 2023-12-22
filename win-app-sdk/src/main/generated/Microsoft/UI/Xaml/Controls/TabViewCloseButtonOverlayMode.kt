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

@ABIMarker(TabViewCloseButtonOverlayMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TabViewCloseButtonOverlayMode;i4)")
@WinRTByReference(brClass = TabViewCloseButtonOverlayMode.ByReference::class)
public enum class TabViewCloseButtonOverlayMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  OnPointerOver(1),
  Always(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TabViewCloseButtonOverlayMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> OnPointerOver
      2 -> Always
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<TabViewCloseButtonOverlayMode> {
    public fun setValue(newValue: TabViewCloseButtonOverlayMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TabViewCloseButtonOverlayMode =
        TabViewCloseButtonOverlayMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TabViewCloseButtonOverlayMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TabViewCloseButtonOverlayMode =
        TabViewCloseButtonOverlayMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TabViewCloseButtonOverlayMode): Int = obj.value
  }
}
