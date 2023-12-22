package Microsoft.Windows.Widgets

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

@ABIMarker(WidgetSize.ABI::class)
@Signature("enum(Microsoft.Windows.Widgets.WidgetSize;i4)")
@WinRTByReference(brClass = WidgetSize.ByReference::class)
public enum class WidgetSize(
  public val value: Int
) : NativeMapped {
  Small(0),
  Medium(1),
  Large(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WidgetSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Small
      1 -> Medium
      2 -> Large
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WidgetSize> {
    public fun setValue(newValue: WidgetSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WidgetSize =
        WidgetSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WidgetSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WidgetSize =
        WidgetSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: WidgetSize): Int = obj.value
  }
}
