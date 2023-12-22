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

@ABIMarker(SplitViewDisplayMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.SplitViewDisplayMode;i4)")
@WinRTByReference(brClass = SplitViewDisplayMode.ByReference::class)
public enum class SplitViewDisplayMode(
  public val value: Int
) : NativeMapped {
  Overlay(0),
  Inline(1),
  CompactOverlay(2),
  CompactInline(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SplitViewDisplayMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Overlay
      1 -> Inline
      2 -> CompactOverlay
      3 -> CompactInline
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SplitViewDisplayMode> {
    public fun setValue(newValue: SplitViewDisplayMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SplitViewDisplayMode =
        SplitViewDisplayMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SplitViewDisplayMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SplitViewDisplayMode =
        SplitViewDisplayMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SplitViewDisplayMode): Int = obj.value
  }
}
