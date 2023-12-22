package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(SliderSnapsTo.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Primitives.SliderSnapsTo;i4)")
@WinRTByReference(brClass = SliderSnapsTo.ByReference::class)
public enum class SliderSnapsTo(
  public val value: Int
) : NativeMapped {
  StepValues(0),
  Ticks(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SliderSnapsTo {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> StepValues
      1 -> Ticks
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SliderSnapsTo> {
    public fun setValue(newValue: SliderSnapsTo): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SliderSnapsTo =
        SliderSnapsTo.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SliderSnapsTo, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SliderSnapsTo =
        SliderSnapsTo.values()[0].fromNative(value, null)

    public override fun toNative(obj: SliderSnapsTo): Int = obj.value
  }
}
