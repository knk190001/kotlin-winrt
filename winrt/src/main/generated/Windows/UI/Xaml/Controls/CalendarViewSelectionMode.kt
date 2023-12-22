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

@ABIMarker(CalendarViewSelectionMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.CalendarViewSelectionMode;i4)")
@WinRTByReference(brClass = CalendarViewSelectionMode.ByReference::class)
public enum class CalendarViewSelectionMode(
  public val value: Int
) : NativeMapped {
  None(0),
  Single(1),
  Multiple(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CalendarViewSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Single
      2 -> Multiple
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CalendarViewSelectionMode>
      {
    public fun setValue(newValue: CalendarViewSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CalendarViewSelectionMode =
        CalendarViewSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CalendarViewSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CalendarViewSelectionMode =
        CalendarViewSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CalendarViewSelectionMode): Int = obj.value
  }
}
